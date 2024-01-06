package the_lift;

import java.util.*;

public class Manager {

    private final List<Integer> visitedFloors;
    private final List<List<User>> building;
    private final Lift lift;

    public Manager(int[][] queues, int capacity) {

        this.visitedFloors = new ArrayList<>();
        this.building = new ArrayList<>(queues.length);
        for (int[] floor : queues) {
            List<User> list = new ArrayList<>(floor.length);
            for (int i : floor) list.add(new User(i));
            building.add(list);
        }
        lift = new Lift(capacity);
    }

    public int[] run() {
        // initialize the visitList:
        this.visitedFloors.add(lift.currentFloor);

        while (!isFinished()) {
            TransferUpdate();
            Move();
            visitedFloors.add(lift.currentFloor);
        }
        return this.visitedFloors.stream().mapToInt(Integer::intValue).toArray();
    }

    private void TransferUpdate() {
        gettingOff();
        gettingOn();
    }

    private void Move() {
        if (lift.isNextMoveToTop()) {
            goToTop();
            return;
        }
        if (lift.isNextMoveToGround()) {
            gotToGround();
            return;
        }
        if (lift.isNextUpper()) {
            goUpper();
            return;
        }
        if (lift.isNextDowner()) {
            goDowner();
        }
    }

    private void gettingOff() {
        lift.list.removeIf(User::isUserGettingOff);
    }

    private void gettingOn() {
        for (User user : building.get(lift.currentFloor)) {
            if (user.canGetIn()) {
                lift.list.add(user);
                building.get(lift.currentFloor).remove(user);
            }
        }
    }

    private void goToTop() {
        lift.currentFloor = building.size() - 1;
        lift.direction = Lift.DOWN;
    }

    private void gotToGround() {
        lift.currentFloor = 0;
        lift.direction = Lift.UP;
    }

    private void goUpper() {
        int lowestProper = building.size() - 1;
        for (int i = 0; i < building.size(); i++) {
            if (building.get(i).size() > 0 && i < lift.currentFloor && i < lowestProper)
                lowestProper = i;
        }
        lift.currentFloor = lowestProper;
        lift.direction = lift.currentFloor == building.size() - 1 ? Lift.DOWN : Lift.UP;
    }

    private void goDowner() {
        int highestProper = 0;
        for (int i = 0; i < building.size(); i++) {
            if (building.get(i).size() > 0 && i < lift.currentFloor && i > highestProper)
                highestProper = i;
        }
        lift.currentFloor = highestProper;
        lift.direction = lift.currentFloor == 0 ? Lift.UP : Lift.DOWN;
    }

    private boolean isFinished() {
        return lift.currentFloor == 0 && lift.list.isEmpty() && noReq();
    }

    private boolean noReq() {
        return !isThereReqFromDowner() && !isThereReqFromUpper();
    }

    private boolean isThereReqFromUpper() {
        return building.stream()
                .anyMatch(floorReqList -> floorReqList.size() > 0 && building.indexOf(floorReqList) > lift.currentFloor);
    }

    private boolean isThereReqFromDowner() {
        return building.stream()
                .anyMatch(floorReqList -> floorReqList.size() > 0 && building.indexOf(floorReqList) < lift.currentFloor);
    }

    private class User {
        final int req;

        User(int i) {
            this.req = i;
        }

        private boolean isUserGettingOff() {
            return this.req == lift.currentFloor;
        }

        private boolean isSameDirection() {
            return (lift.direction.equals(Lift.UP) && this.req > lift.currentFloor) || (lift.direction.equals(Lift.DOWN) && this.req < lift.currentFloor);
        }

        private boolean canGetIn() {
            return isSameDirection() && !lift.isFull();
        }
    }

    private class Lift {
        final static String UP = "UP";
        final static String DOWN = "DOWN";
        private final int capacity;
        private final List<User> list;
        private String direction;
        private int currentFloor;

        public Lift(int capacity) {
            this.capacity = capacity;
            this.direction = Lift.UP;
            this.currentFloor = 0;
            this.list = new ArrayList<>(capacity);
        }

        boolean isFull() {
            return this.capacity <= this.list.size();
        }

        boolean isNextMoveToTop() {
            return this.list.isEmpty() && this.direction.equals(Lift.UP);
        }

        boolean isNextMoveToGround() {
            return this.list.isEmpty() && this.direction.equals(Lift.DOWN);
        }

        boolean isNextUpper() {
            return (this.direction.equals(Lift.UP)
                    && (isThereReqFromUpper() || this.isThereReqForUpper())) || (this.direction.equals(Lift.DOWN)
                    && !isThereReqFromDowner() && !this.isThereReqForDowner() && (isThereReqFromUpper() || this.isThereReqForUpper()));
        }

        boolean isNextDowner() {
            return (this.direction.equals(Lift.DOWN)
                    && (isThereReqFromDowner() || this.isThereReqForDowner())) || (this.direction.equals(Lift.UP)
                    && !isThereReqFromUpper() && !this.isThereReqForUpper() && (isThereReqFromDowner() || this.isThereReqForDowner()));
        }

        boolean isThereReqForUpper() {
            return this.list.stream().anyMatch(user -> user.req > this.currentFloor);
        }

        boolean isThereReqForDowner() {
            return this.list.stream().anyMatch(user -> user.req < this.currentFloor);
        }
    }
}
