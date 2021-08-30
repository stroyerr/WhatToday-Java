package com.stroyer.WhatToday.Methods.Initialise;

import com.stroyer.WhatToday.Properties;

import javax.swing.*;
import java.awt.*;

public class Initialise {

    public static void start(){

        if(!Properties.isLoggedIn){
            LoginPage.open();
        }
        else
        {
            LoginPage.open();
        }

    }

}
