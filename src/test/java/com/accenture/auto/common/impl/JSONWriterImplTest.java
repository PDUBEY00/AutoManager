package com.accenture.auto.common.impl;

import org.testng.annotations.Test;

import com.accenture.auto.common.JSONWriter;

public class JSONWriterImplTest {

  @Test
  public void writeFile() {
    JSONWriter jsonWriter = new JSONWriterImpl();
    jsonWriter.writeFile("dsfsd");
  }
}
