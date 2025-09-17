package iuh.fit.se.ltwww_java_05092025_tuan03_hoviet.model;

public class Student {
        private String firstName, lastName, email, mobile, gender, address, city, pincode, state, country, course;
        private String day, month, year;

        // Getters and setters
        public String getFirstName() { return firstName; }
        public void setFirstName(String firstName) { this.firstName = firstName; }

        public String getLastName() { return lastName; }
        public void setLastName(String lastName) { this.lastName = lastName; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }

        public String getMobile() { return mobile; }
        public void setMobile(String mobile) { this.mobile = mobile; }

        public String getGender() { return gender; }
        public void setGender(String gender) { this.gender = gender; }

        public String getAddress() { return address; }
        public void setAddress(String address) { this.address = address; }

        public String getCity() { return city; }
        public void setCity(String city) { this.city = city; }

        public String getPincode() { return pincode; }
        public void setPincode(String pincode) { this.pincode = pincode; }

        public String getState() { return state; }
        public void setState(String state) { this.state = state; }

        public String getCountry() { return country; }
        public void setCountry(String country) { this.country = country; }

        public String getCourse() { return course; }
        public void setCourse(String course) { this.course = course; }

        public String getDay() { return day; }
        public void setDay(String day) { this.day = day; }

        public String getMonth() { return month; }
        public void setMonth(String month) { this.month = month; }

        public String getYear() { return year; }
        public void setYear(String year) { this.year = year; }

        public String getDob() {
            return day + "/" + month + "/" + year;
        }
}
