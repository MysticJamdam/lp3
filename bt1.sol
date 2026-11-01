// SPDX-License-Identifier: MIT
pragma solidity ^0.8.38;

contract Bank {

    uint balance;

    function deposit() public payable {
        balance += msg.value;
    }

    function withdraw(uint amount) public {
        require(amount <= balance);

        balance -= amount;
        payable(msg.sender).transfer(amount);
    }

    function getBalance() public view returns (uint) {
        return balance;
    }
}