package de.brunokrams.solver.kidssudoku;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class KidsSudokuTest {

    @Test
    void createFromMatrix_throwsIllegaleArgumentException_whenCalledWithMatrixOfWrongSize() {
        // given
        Integer[][] testMatrix = new Integer[2][2];
        testMatrix[1][0] = 2;

        // when/then
        assertThrows(IllegalArgumentException.class, () -> KidsSudoku.createFromMatrix(testMatrix));
    }

    @Test
    void isValid_returnsTrue_whenSudokuIsCreatedWithValidMatrix() {
        // given
        KidsSudoku kidsSudoku = KidsSudoku.createFromMatrix(TestDataProvider.validSudoku());

        // when
        boolean isValid = kidsSudoku.isValid();

        // then
        assertThat(isValid).isTrue();
    }

    @Test
    void isValid_returnsFalse_whenSudokuIsCreatedWithInvalidMatrix() {
        // given
        KidsSudoku kidsSudoku = KidsSudoku.createFromMatrix(TestDataProvider.invalidSudoku());

        // when
        boolean isValid = kidsSudoku.isValid();

        // then
        assertThat(isValid).isFalse();
    }



}