package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class CensusAnalyserTest {
    CensusAnalyser censusAnalyser;

    @Before
    public void setUp() {
        censusAnalyser = new CensusAnalyser();
    }

    @Test
    public void givenCsvFileNumberOfRecordsMatchesShouldReturnTrue() throws IOException, CensusIOException {
        censusAnalyser.loadingTheDataFromCsvFile("src/files/CensusData.csv");
        Assert.assertTrue(censusAnalyser.checkNumberOfRecords());
    }

    @Test
    public void givenCsvFileIncorrect_ShouldReturnCustomException() throws IOException {
        try {
            censusAnalyser.loadingTheDataFromCsvFile("src/files/stateCensusData.csv");
        } catch (CensusIOException e) {
            e.printStackTrace();

        }
    }

    @Test
    public void givenCsvFileIsCorrectBut_TypeIncorrect_ShouldReturnCustomException() throws IOException {
        try {
            censusAnalyser.loadingTheDataFromCsvFile("src/files/censusWrongDataType.csv");
        } catch (CensusIOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenCsvFileIsCorrectBut_DelimiterIsInCorrect_ShouldReturnCustomException() throws IOException {
        try {
            censusAnalyser.loadingTheDataFromCsvFile("src/files/censusDelimeter.csv");
        } catch (CensusIOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenCsvFileIsCorrectBut_HeaderIsInCorrect_ShouldReturnCustomException() throws IOException {
        try {
            censusAnalyser.loadingTheDataFromCsvFile("src/files/censusWrongHeader.csv");
        } catch (CensusIOException e) {
            e.printStackTrace();
        }
    }
}
