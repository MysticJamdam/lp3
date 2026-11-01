// SPDX-License-Identifier: MIT
pragma solidity ^0.8.38;

contract Student {

    struct StudentData {
        uint id;
        string name;
        uint age;
    }

    StudentData[] students;

    function add(
        uint id,
        string memory name,
        uint age
    ) public {
        students.push(
            StudentData(id, name, age)
        );
    }

    function get(uint i)
        public
        view
        returns(uint, string memory, uint)
    {
        return (
            students[i].id,
            students[i].name,
            students[i].age
        );
    }

    fallback() external {
    }
}