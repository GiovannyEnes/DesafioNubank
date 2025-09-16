package com.giovannyenes.service;

import com.giovannyenes.model.Operation;
import com.giovannyenes.model.OperationType;

import java.util.ArrayList;
import java.util.List;

public class OperationService {
    private List<Operation> operationsBuy = new ArrayList<>();
    private List<Operation> operationsSell = new ArrayList<>();
    private OperationType op;

    public List<Operation> OperationBuy(Operation operation, Enum op){
        if (op == OperationType.BUY){
            operationsBuy.add(operation);
        }
        return operationsBuy;
    }

    public List<Operation> OperationSell(Operation operation, Enum op){
        if (op == OperationType.SELL){
            operationsSell.add(operation);
        }
        return operationsSell;
    }

}
