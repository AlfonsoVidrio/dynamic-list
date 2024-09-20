package ed;

import java.util.Arrays;

public class Vector {
    private Student[] students = new Student[100];
    private int totalStudents = 0;

    public void add(Student student) {
        increaseCapacity();
        students[totalStudents] = student;
        totalStudents++;
    }

    public void add(int index, Student student) {
        increaseCapacity();
        if (!indexIsValid(index)) {
            throw new IllegalArgumentException("Invalid position");
        }

        for(int i = totalStudents -1; i >= index; i--) {
            students[i + 1] = students[i];
        }
        students[index] = student;
        totalStudents++;
    }

    public Student get(int index) {
        if (!positionIsValid(index)) {
            throw new IllegalArgumentException("Invalid position");
        }
        return students[index];
    }

    public void remove(int index) {
        for(int i = index; i < totalStudents; i++) {
            students[i] = students[i + 1];
        }
        totalStudents--;
    }

    private boolean indexIsValid(int index) {
        return index >= 0 && index <= totalStudents;
    }

    private boolean positionIsValid(int position) {
        return position >= 0 && position < totalStudents;
    }

    public boolean contains(Student student) {
        for (int i = 0; i < totalStudents; i++) {
            if (student.equals(students[i])) {
                return true;
            }
        }
        return false;
    }

    private void increaseCapacity() {
        if(totalStudents == students.length) {
            Student[] newStudents = new Student[students.length + 100];
            for(int i = 0; i < students.length; i++) {
                newStudents[i] = students[i];
            }
            students = newStudents;
        }
    }

    public int size() {
        return totalStudents;
    }

    public String toString() {
        return Arrays.toString(students);
    }
}
