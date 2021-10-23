package com.syntax.class20;

public class TeacherTester {
    public static void main(String[] args) {

        MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.name="Sally";
        mathTeacher.eats="Vegeterian";
        mathTeacher.teaches="Algebra";
        mathTeacher.teachesMath();
        mathTeacher.eat();
        mathTeacher.sleeps();

        ChemestryTeacher chemestryTeacher=new ChemestryTeacher();
        chemestryTeacher.name="Tom";
        chemestryTeacher.eats="Dounuts";
        chemestryTeacher.teaches="anatomy";
        chemestryTeacher.teachesChemistry();
        chemestryTeacher.eat();
        chemestryTeacher.sleeps();

        PianoTeacher pianoTeacher=new PianoTeacher();
        pianoTeacher.name="kim";
        pianoTeacher.eats="sushie";
        pianoTeacher.teaches="Music";
        pianoTeacher.teachesMusic();
        pianoTeacher.eat();
        pianoTeacher.sleeps();
    }
}
