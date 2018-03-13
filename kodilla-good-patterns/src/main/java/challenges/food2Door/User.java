package challenges.food2Door;

import java.util.Objects;

public class User {

        private String name;
        private String surname;
        private String nickName;
        private int age;

        public User(String name, String surname, String nickName, int age) {
            this.name = name;
            this.surname = surname;
            this.nickName = nickName;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getUserName() {
            return surname;
        }

        public String getNickName() {
            return nickName;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Surname: " + surname + ", Nick: " + nickName +  ", Age: " + age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof User)) return false;
            User user = (User) o;
            return age == user.age &&
                    Objects.equals(name, user.name) &&
                    Objects.equals(surname, user.surname) &&
                    Objects.equals(nickName, user.nickName);
        }

        @Override
        public int hashCode() {

            return Objects.hash(name, surname, nickName, age);
        }
    }


