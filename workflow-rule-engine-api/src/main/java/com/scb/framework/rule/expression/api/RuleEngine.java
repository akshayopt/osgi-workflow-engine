package com.scb.framework.rule.expression.api;


public interface RuleEngine {

	<T> String evaluateRules(String flowId, T payload, String resolverType);
}
