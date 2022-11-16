package br.looplex.calculadora;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class DivisaoDelegate implements JavaDelegate {

        @Override
        public void execute(DelegateExecution delegateExecution) throws Exception {
            Long primeiroArg = (Long) delegateExecution.getVariable("primeiroArg");
            Long segundoArg = (Long) delegateExecution.getVariable("segundoArg");

            delegateExecution.setVariable("resultado", primeiroArg / segundoArg);

        }
}
