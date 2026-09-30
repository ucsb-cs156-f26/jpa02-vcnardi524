

package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;
    Team team1;
    Team team22;
    Team team2;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");
        team1 = new Team("test-team");
        team2 = new Team("test-team2");
        team22 = new Team("test-team2");
        team2.addMember("Some cool guy");
    }


    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void test1(){
      assert(team.equals(team));
    }

    @Test
    public void test2(){
      assert(!team.equals("Random"));
    }


    @Test
    public void test3(){
      assert(!team.equals(team2));
    }

    @Test
    public void test4(){
      assert(!team22.equals(team2));
    }

    @Test
    public void test5(){
      assert(team1.equals(team));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void hashCode_returns_correct_hashCode() {
        assertEquals(
            "test-team".hashCode() | team.getMembers().hashCode(),
            team.hashCode()
        );
    }

    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
