package com.basic.myspringboot.repository;

import com.basic.myspringboot.entitiy.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AccountRepositoryTest {
    @Autowired
    AccountRepository accountRepository;

    @Test // ctrl shift f10
    public void crud() throws Exception{
        // 1.insert
        // Account 객체 생성
        Account account = new Account();
        // 값을 저장
        account.setUsername("Spring2");
        account.setPassword("1234");
        // 등록요청
        Account savedAccount = accountRepository.save(account);
        System.out.println("ID =" + savedAccount.getId());
        System.out.println("username =" + savedAccount.getUsername());

    }
}
