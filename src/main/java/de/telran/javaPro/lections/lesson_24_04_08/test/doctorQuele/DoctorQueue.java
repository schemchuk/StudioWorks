package de.telran.javaPro.lections.lesson_24_04_08.test.doctorQuele;

import java.util.PriorityQueue;
import java.util.Queue;

public class DoctorQueue {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Opanas", 9.00);
        Patient patient6 = new Patient("Hryz", 10.40);
        Patient patient5 = new Patient("Herasym", 11.55);
        Patient patient4 = new Patient("Mumu", 13.00);
        Patient patient3 = new Patient("Salomon", 14.30);
        Patient patient2 = new Patient("Izia", 16.05);

        Queue<Patient> patientQueue = new PriorityQueue<>();
        patientQueue.add(patient2);
        patientQueue.add(patient4);
        patientQueue.add(patient3);
        patientQueue.add(patient1);
        patientQueue.add(patient5);
        patientQueue.add(patient6);
        System.out.println(patientQueue);

      if (!patientQueue.isEmpty()){
          while (!patientQueue.isEmpty()){
              System.out.println(patientQueue.poll());
          }
      }else {
          System.out.println("Очередь пуста");
      }
    }
}
