// Generated from C:/Users/jetbrains/custom-projects/lisp-machine/src/main/antlr\Scheme.g4 by ANTLR 4.9.1
package ru.nsu.sdt.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SchemeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ELSE=9, 
		ARROW=10, DEFINE=11, UNQUOTE_SPLICING=12, UNQUOTE=13, QUOTE=14, LAMBDA=15, 
		IF=16, SET=17, BEGIN=18, COND=19, AND=20, OR=21, CASE=22, LET=23, LETSTAR=24, 
		LETREC=25, DO=26, DELAY=27, QUASIQUOTE=28, NUM_2=29, NUM_8=30, NUM_10=31, 
		NUM_16=32, ELLIPSIS=33, VARIABLE=34, STRING=35, CHARACTER=36, TRUE=37, 
		FALSE=38, SPACE=39, COMMENT=40;
	public static final int
		RULE_parse = 0, RULE_commandOrDefinition = 1, RULE_definition = 2, RULE_defFormals = 3, 
		RULE_command = 4, RULE_identifier = 5, RULE_syntacticKeyword = 6, RULE_expressionKeyword = 7, 
		RULE_expression = 8, RULE_variable = 9, RULE_literal = 10, RULE_quotation = 11, 
		RULE_selfEvaluating = 12, RULE_lambdaExpression = 13, RULE_formals = 14, 
		RULE_conditional = 15, RULE_test = 16, RULE_consequent = 17, RULE_alternate = 18, 
		RULE_assignment = 19, RULE_derivedExpression = 20, RULE_condClause = 21, 
		RULE_recipient = 22, RULE_caseClause = 23, RULE_bindingSpec = 24, RULE_iterationSpec = 25, 
		RULE_init = 26, RULE_step = 27, RULE_doResult = 28, RULE_procedureCall = 29, 
		RULE_operator = 30, RULE_operand = 31, RULE_body = 32, RULE_sequence = 33, 
		RULE_datum = 34, RULE_simpleDatum = 35, RULE_compoundDatum = 36, RULE_list = 37, 
		RULE_abbreviation = 38, RULE_abbrevPrefix = 39, RULE_vector = 40, RULE_number = 41, 
		RULE_bool = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "commandOrDefinition", "definition", "defFormals", "command", 
			"identifier", "syntacticKeyword", "expressionKeyword", "expression", 
			"variable", "literal", "quotation", "selfEvaluating", "lambdaExpression", 
			"formals", "conditional", "test", "consequent", "alternate", "assignment", 
			"derivedExpression", "condClause", "recipient", "caseClause", "bindingSpec", 
			"iterationSpec", "init", "step", "doResult", "procedureCall", "operator", 
			"operand", "body", "sequence", "datum", "simpleDatum", "compoundDatum", 
			"list", "abbreviation", "abbrevPrefix", "vector", "number", "bool"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'.'", "'''", "'`'", "',@'", "','", "'#('", "'else'", 
			"'=>'", "'define'", "'unquote-splicing'", "'unquote'", "'quote'", "'lambda'", 
			"'if'", "'set!'", "'begin'", "'cond'", "'and'", "'or'", "'case'", "'let'", 
			"'let*'", "'letrec'", "'do'", "'delay'", "'quasiquote'", null, null, 
			null, null, "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "ELSE", "ARROW", 
			"DEFINE", "UNQUOTE_SPLICING", "UNQUOTE", "QUOTE", "LAMBDA", "IF", "SET", 
			"BEGIN", "COND", "AND", "OR", "CASE", "LET", "LETSTAR", "LETREC", "DO", 
			"DELAY", "QUASIQUOTE", "NUM_2", "NUM_8", "NUM_10", "NUM_16", "ELLIPSIS", 
			"VARIABLE", "STRING", "CHARACTER", "TRUE", "FALSE", "SPACE", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Scheme.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SchemeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SchemeParser.EOF, 0); }
		public List<CommandOrDefinitionContext> commandOrDefinition() {
			return getRuleContexts(CommandOrDefinitionContext.class);
		}
		public CommandOrDefinitionContext commandOrDefinition(int i) {
			return getRuleContext(CommandOrDefinitionContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << NUM_2) | (1L << NUM_8) | (1L << NUM_10) | (1L << NUM_16) | (1L << ELLIPSIS) | (1L << VARIABLE) | (1L << STRING) | (1L << CHARACTER) | (1L << TRUE) | (1L << FALSE))) != 0)) {
				{
				{
				setState(86);
				commandOrDefinition();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandOrDefinitionContext extends ParserRuleContext {
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public CommandOrDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandOrDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitCommandOrDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandOrDefinitionContext commandOrDefinition() throws RecognitionException {
		CommandOrDefinitionContext _localctx = new CommandOrDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_commandOrDefinition);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				command();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(SchemeParser.DEFINE, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefFormalsContext defFormals() {
			return getRuleContext(DefFormalsContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(SchemeParser.BEGIN, 0); }
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definition);
		int _la;
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(T__0);
				setState(99);
				match(DEFINE);
				setState(111);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELLIPSIS:
				case VARIABLE:
					{
					setState(100);
					variable();
					setState(101);
					expression();
					setState(102);
					match(T__1);
					}
					break;
				case T__0:
					{
					setState(104);
					match(T__0);
					setState(105);
					variable();
					setState(106);
					defFormals();
					setState(107);
					match(T__1);
					setState(108);
					body();
					setState(109);
					match(T__1);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(T__0);
				setState(114);
				match(BEGIN);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(115);
					definition();
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefFormalsContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public DefFormalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defFormals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitDefFormals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefFormalsContext defFormals() throws RecognitionException {
		DefFormalsContext _localctx = new DefFormalsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_defFormals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELLIPSIS || _la==VARIABLE) {
				{
				{
				setState(124);
				variable();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(130);
				match(T__2);
				setState(131);
				variable();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public SyntacticKeywordContext syntacticKeyword() {
			return getRuleContext(SyntacticKeywordContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identifier);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
			case ARROW:
			case DEFINE:
			case UNQUOTE_SPLICING:
			case UNQUOTE:
			case QUOTE:
			case LAMBDA:
			case IF:
			case SET:
			case BEGIN:
			case COND:
			case AND:
			case OR:
			case CASE:
			case LET:
			case LETSTAR:
			case LETREC:
			case DO:
			case DELAY:
			case QUASIQUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				syntacticKeyword();
				}
				break;
			case ELLIPSIS:
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SyntacticKeywordContext extends ParserRuleContext {
		public ExpressionKeywordContext expressionKeyword() {
			return getRuleContext(ExpressionKeywordContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(SchemeParser.ELSE, 0); }
		public TerminalNode ARROW() { return getToken(SchemeParser.ARROW, 0); }
		public TerminalNode DEFINE() { return getToken(SchemeParser.DEFINE, 0); }
		public TerminalNode UNQUOTE() { return getToken(SchemeParser.UNQUOTE, 0); }
		public TerminalNode UNQUOTE_SPLICING() { return getToken(SchemeParser.UNQUOTE_SPLICING, 0); }
		public SyntacticKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntacticKeyword; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitSyntacticKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SyntacticKeywordContext syntacticKeyword() throws RecognitionException {
		SyntacticKeywordContext _localctx = new SyntacticKeywordContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_syntacticKeyword);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE:
			case LAMBDA:
			case IF:
			case SET:
			case BEGIN:
			case COND:
			case AND:
			case OR:
			case CASE:
			case LET:
			case LETSTAR:
			case LETREC:
			case DO:
			case DELAY:
			case QUASIQUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				expressionKeyword();
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(ELSE);
				}
				break;
			case ARROW:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(ARROW);
				}
				break;
			case DEFINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				match(DEFINE);
				}
				break;
			case UNQUOTE:
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				match(UNQUOTE);
				}
				break;
			case UNQUOTE_SPLICING:
				enterOuterAlt(_localctx, 6);
				{
				setState(145);
				match(UNQUOTE_SPLICING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionKeywordContext extends ParserRuleContext {
		public TerminalNode QUOTE() { return getToken(SchemeParser.QUOTE, 0); }
		public TerminalNode LAMBDA() { return getToken(SchemeParser.LAMBDA, 0); }
		public TerminalNode IF() { return getToken(SchemeParser.IF, 0); }
		public TerminalNode SET() { return getToken(SchemeParser.SET, 0); }
		public TerminalNode BEGIN() { return getToken(SchemeParser.BEGIN, 0); }
		public TerminalNode COND() { return getToken(SchemeParser.COND, 0); }
		public TerminalNode AND() { return getToken(SchemeParser.AND, 0); }
		public TerminalNode OR() { return getToken(SchemeParser.OR, 0); }
		public TerminalNode CASE() { return getToken(SchemeParser.CASE, 0); }
		public TerminalNode LET() { return getToken(SchemeParser.LET, 0); }
		public TerminalNode LETSTAR() { return getToken(SchemeParser.LETSTAR, 0); }
		public TerminalNode LETREC() { return getToken(SchemeParser.LETREC, 0); }
		public TerminalNode DO() { return getToken(SchemeParser.DO, 0); }
		public TerminalNode DELAY() { return getToken(SchemeParser.DELAY, 0); }
		public TerminalNode QUASIQUOTE() { return getToken(SchemeParser.QUASIQUOTE, 0); }
		public ExpressionKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionKeyword; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitExpressionKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionKeywordContext expressionKeyword() throws RecognitionException {
		ExpressionKeywordContext _localctx = new ExpressionKeywordContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expressionKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUOTE) | (1L << LAMBDA) | (1L << IF) | (1L << SET) | (1L << BEGIN) | (1L << COND) | (1L << AND) | (1L << OR) | (1L << CASE) | (1L << LET) | (1L << LETSTAR) | (1L << LETREC) | (1L << DO) | (1L << DELAY) | (1L << QUASIQUOTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DerivedExpressionContext derivedExpression() {
			return getRuleContext(DerivedExpressionContext.class,0);
		}
		public ProcedureCallContext procedureCall() {
			return getRuleContext(ProcedureCallContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				lambdaExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				conditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
				assignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(155);
				derivedExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(156);
				procedureCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(SchemeParser.VARIABLE, 0); }
		public TerminalNode ELLIPSIS() { return getToken(SchemeParser.ELLIPSIS, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !(_la==ELLIPSIS || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public QuotationContext quotation() {
			return getRuleContext(QuotationContext.class,0);
		}
		public SelfEvaluatingContext selfEvaluating() {
			return getRuleContext(SelfEvaluatingContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_literal);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				quotation();
				}
				break;
			case NUM_2:
			case NUM_8:
			case NUM_10:
			case NUM_16:
			case STRING:
			case CHARACTER:
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				selfEvaluating();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuotationContext extends ParserRuleContext {
		public DatumContext datum() {
			return getRuleContext(DatumContext.class,0);
		}
		public TerminalNode QUOTE() { return getToken(SchemeParser.QUOTE, 0); }
		public QuotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitQuotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotationContext quotation() throws RecognitionException {
		QuotationContext _localctx = new QuotationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_quotation);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(T__3);
				setState(166);
				datum();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(T__0);
				setState(168);
				match(QUOTE);
				setState(169);
				datum();
				setState(170);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelfEvaluatingContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode CHARACTER() { return getToken(SchemeParser.CHARACTER, 0); }
		public TerminalNode STRING() { return getToken(SchemeParser.STRING, 0); }
		public SelfEvaluatingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfEvaluating; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitSelfEvaluating(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfEvaluatingContext selfEvaluating() throws RecognitionException {
		SelfEvaluatingContext _localctx = new SelfEvaluatingContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_selfEvaluating);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				bool();
				}
				break;
			case NUM_2:
			case NUM_8:
			case NUM_10:
			case NUM_16:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				number();
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(CHARACTER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public TerminalNode LAMBDA() { return getToken(SchemeParser.LAMBDA, 0); }
		public FormalsContext formals() {
			return getRuleContext(FormalsContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__0);
			setState(181);
			match(LAMBDA);
			setState(182);
			formals();
			setState(183);
			body();
			setState(184);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalsContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public FormalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitFormals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalsContext formals() throws RecognitionException {
		FormalsContext _localctx = new FormalsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_formals);
		int _la;
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(T__0);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELLIPSIS || _la==VARIABLE) {
					{
					setState(188); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(187);
						variable();
						}
						}
						setState(190); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==ELLIPSIS || _la==VARIABLE );
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(192);
						match(T__2);
						setState(193);
						variable();
						}
					}

					}
				}

				setState(198);
				match(T__1);
				}
				break;
			case ELLIPSIS:
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SchemeParser.IF, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public ConsequentContext consequent() {
			return getRuleContext(ConsequentContext.class,0);
		}
		public AlternateContext alternate() {
			return getRuleContext(AlternateContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__0);
			setState(203);
			match(IF);
			setState(204);
			test();
			setState(205);
			consequent();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << NUM_2) | (1L << NUM_8) | (1L << NUM_10) | (1L << NUM_16) | (1L << ELLIPSIS) | (1L << VARIABLE) | (1L << STRING) | (1L << CHARACTER) | (1L << TRUE) | (1L << FALSE))) != 0)) {
				{
				setState(206);
				alternate();
				}
			}

			setState(209);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TestContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConsequentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConsequentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consequent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitConsequent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsequentContext consequent() throws RecognitionException {
		ConsequentContext _localctx = new ConsequentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_consequent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlternateContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AlternateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitAlternate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternateContext alternate() throws RecognitionException {
		AlternateContext _localctx = new AlternateContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_alternate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SchemeParser.SET, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__0);
			setState(218);
			match(SET);
			setState(219);
			variable();
			setState(220);
			expression();
			setState(221);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DerivedExpressionContext extends ParserRuleContext {
		public TerminalNode COND() { return getToken(SchemeParser.COND, 0); }
		public TerminalNode CASE() { return getToken(SchemeParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SchemeParser.AND, 0); }
		public TerminalNode OR() { return getToken(SchemeParser.OR, 0); }
		public TerminalNode LET() { return getToken(SchemeParser.LET, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode LETSTAR() { return getToken(SchemeParser.LETSTAR, 0); }
		public TerminalNode LETREC() { return getToken(SchemeParser.LETREC, 0); }
		public TerminalNode BEGIN() { return getToken(SchemeParser.BEGIN, 0); }
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public TerminalNode DO() { return getToken(SchemeParser.DO, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TerminalNode DELAY() { return getToken(SchemeParser.DELAY, 0); }
		public TerminalNode ELSE() { return getToken(SchemeParser.ELSE, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<BindingSpecContext> bindingSpec() {
			return getRuleContexts(BindingSpecContext.class);
		}
		public BindingSpecContext bindingSpec(int i) {
			return getRuleContext(BindingSpecContext.class,i);
		}
		public List<IterationSpecContext> iterationSpec() {
			return getRuleContexts(IterationSpecContext.class);
		}
		public IterationSpecContext iterationSpec(int i) {
			return getRuleContext(IterationSpecContext.class,i);
		}
		public DoResultContext doResult() {
			return getRuleContext(DoResultContext.class,0);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public List<CondClauseContext> condClause() {
			return getRuleContexts(CondClauseContext.class);
		}
		public CondClauseContext condClause(int i) {
			return getRuleContext(CondClauseContext.class,i);
		}
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public DerivedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derivedExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitDerivedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DerivedExpressionContext derivedExpression() throws RecognitionException {
		DerivedExpressionContext _localctx = new DerivedExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_derivedExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__0);
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COND:
				{
				setState(224);
				match(COND);
				setState(242);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(225);
					match(T__0);
					setState(226);
					match(ELSE);
					setState(227);
					sequence();
					setState(228);
					match(T__1);
					}
					break;
				case 2:
					{
					setState(231); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(230);
							condClause();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(233); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(235);
						match(T__0);
						setState(236);
						match(ELSE);
						setState(237);
						sequence();
						setState(238);
						match(T__1);
						}
					}

					}
					break;
				}
				}
				break;
			case CASE:
				{
				setState(244);
				match(CASE);
				setState(245);
				expression();
				setState(263);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(246);
					match(T__0);
					setState(247);
					match(ELSE);
					setState(248);
					sequence();
					setState(249);
					match(T__1);
					}
					break;
				case 2:
					{
					setState(252); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(251);
							caseClause();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(254); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(256);
						match(T__0);
						setState(257);
						match(ELSE);
						setState(258);
						sequence();
						setState(259);
						match(T__1);
						}
					}

					}
					break;
				}
				}
				break;
			case AND:
				{
				setState(265);
				match(AND);
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << NUM_2) | (1L << NUM_8) | (1L << NUM_10) | (1L << NUM_16) | (1L << ELLIPSIS) | (1L << VARIABLE) | (1L << STRING) | (1L << CHARACTER) | (1L << TRUE) | (1L << FALSE))) != 0)) {
					{
					{
					setState(266);
					test();
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case OR:
				{
				setState(272);
				match(OR);
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << NUM_2) | (1L << NUM_8) | (1L << NUM_10) | (1L << NUM_16) | (1L << ELLIPSIS) | (1L << VARIABLE) | (1L << STRING) | (1L << CHARACTER) | (1L << TRUE) | (1L << FALSE))) != 0)) {
					{
					{
					setState(273);
					test();
					}
					}
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case LET:
				{
				setState(279);
				match(LET);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELLIPSIS || _la==VARIABLE) {
					{
					setState(280);
					variable();
					}
				}

				setState(283);
				match(T__0);
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(284);
					bindingSpec();
					}
					}
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(290);
				match(T__1);
				setState(291);
				body();
				}
				break;
			case LETSTAR:
				{
				setState(292);
				match(LETSTAR);
				setState(293);
				match(T__0);
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(294);
					bindingSpec();
					}
					}
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(300);
				match(T__1);
				setState(301);
				body();
				}
				break;
			case LETREC:
				{
				setState(302);
				match(LETREC);
				setState(303);
				match(T__0);
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(304);
					bindingSpec();
					}
					}
					setState(309);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(310);
				match(T__1);
				setState(311);
				body();
				}
				break;
			case BEGIN:
				{
				setState(312);
				match(BEGIN);
				setState(313);
				sequence();
				}
				break;
			case DO:
				{
				setState(314);
				match(DO);
				setState(315);
				match(T__0);
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(316);
					iterationSpec();
					}
					}
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(322);
				match(T__1);
				setState(323);
				match(T__0);
				setState(324);
				test();
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << NUM_2) | (1L << NUM_8) | (1L << NUM_10) | (1L << NUM_16) | (1L << ELLIPSIS) | (1L << VARIABLE) | (1L << STRING) | (1L << CHARACTER) | (1L << TRUE) | (1L << FALSE))) != 0)) {
					{
					setState(325);
					doResult();
					}
				}

				setState(328);
				match(T__1);
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << NUM_2) | (1L << NUM_8) | (1L << NUM_10) | (1L << NUM_16) | (1L << ELLIPSIS) | (1L << VARIABLE) | (1L << STRING) | (1L << CHARACTER) | (1L << TRUE) | (1L << FALSE))) != 0)) {
					{
					{
					setState(329);
					command();
					}
					}
					setState(334);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DELAY:
				{
				setState(335);
				match(DELAY);
				setState(336);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(339);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondClauseContext extends ParserRuleContext {
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(SchemeParser.ARROW, 0); }
		public RecipientContext recipient() {
			return getRuleContext(RecipientContext.class,0);
		}
		public CondClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitCondClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondClauseContext condClause() throws RecognitionException {
		CondClauseContext _localctx = new CondClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_condClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(T__0);
			setState(342);
			test();
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case NUM_2:
			case NUM_8:
			case NUM_10:
			case NUM_16:
			case ELLIPSIS:
			case VARIABLE:
			case STRING:
			case CHARACTER:
			case TRUE:
			case FALSE:
				{
				setState(343);
				sequence();
				}
				break;
			case ARROW:
				{
				setState(344);
				match(ARROW);
				setState(345);
				recipient();
				}
				break;
			case T__1:
				break;
			default:
				break;
			}
			setState(348);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecipientContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RecipientContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recipient; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitRecipient(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecipientContext recipient() throws RecognitionException {
		RecipientContext _localctx = new RecipientContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_recipient);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseClauseContext extends ParserRuleContext {
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public List<DatumContext> datum() {
			return getRuleContexts(DatumContext.class);
		}
		public DatumContext datum(int i) {
			return getRuleContext(DatumContext.class,i);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitCaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_caseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(T__0);
			setState(353);
			match(T__0);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << ELSE) | (1L << ARROW) | (1L << DEFINE) | (1L << UNQUOTE_SPLICING) | (1L << UNQUOTE) | (1L << QUOTE) | (1L << LAMBDA) | (1L << IF) | (1L << SET) | (1L << BEGIN) | (1L << COND) | (1L << AND) | (1L << OR) | (1L << CASE) | (1L << LET) | (1L << LETSTAR) | (1L << LETREC) | (1L << DO) | (1L << DELAY) | (1L << QUASIQUOTE) | (1L << NUM_2) | (1L << NUM_8) | (1L << NUM_10) | (1L << NUM_16) | (1L << ELLIPSIS) | (1L << VARIABLE) | (1L << STRING) | (1L << CHARACTER) | (1L << TRUE) | (1L << FALSE))) != 0)) {
				{
				{
				setState(354);
				datum();
				}
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(360);
			match(T__1);
			setState(361);
			sequence();
			setState(362);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindingSpecContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BindingSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingSpec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitBindingSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingSpecContext bindingSpec() throws RecognitionException {
		BindingSpecContext _localctx = new BindingSpecContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_bindingSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(T__0);
			setState(365);
			variable();
			setState(366);
			expression();
			setState(367);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationSpecContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public StepContext step() {
			return getRuleContext(StepContext.class,0);
		}
		public IterationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationSpec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitIterationSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationSpecContext iterationSpec() throws RecognitionException {
		IterationSpecContext _localctx = new IterationSpecContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_iterationSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(T__0);
			setState(370);
			variable();
			setState(371);
			init();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << NUM_2) | (1L << NUM_8) | (1L << NUM_10) | (1L << NUM_16) | (1L << ELLIPSIS) | (1L << VARIABLE) | (1L << STRING) | (1L << CHARACTER) | (1L << TRUE) | (1L << FALSE))) != 0)) {
				{
				setState(372);
				step();
				}
			}

			setState(375);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StepContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoResultContext extends ParserRuleContext {
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public DoResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doResult; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitDoResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoResultContext doResult() throws RecognitionException {
		DoResultContext _localctx = new DoResultContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_doResult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			sequence();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureCallContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public ProcedureCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitProcedureCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureCallContext procedureCall() throws RecognitionException {
		ProcedureCallContext _localctx = new ProcedureCallContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_procedureCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(T__0);
			setState(384);
			operator();
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << NUM_2) | (1L << NUM_8) | (1L << NUM_10) | (1L << NUM_16) | (1L << ELLIPSIS) | (1L << VARIABLE) | (1L << STRING) | (1L << CHARACTER) | (1L << TRUE) | (1L << FALSE))) != 0)) {
				{
				{
				setState(385);
				operand();
				}
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(391);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_operand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(397);
					definition();
					}
					} 
				}
				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(403);
			sequence();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequenceContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_sequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(405);
				expression();
				}
				}
				setState(408); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << NUM_2) | (1L << NUM_8) | (1L << NUM_10) | (1L << NUM_16) | (1L << ELLIPSIS) | (1L << VARIABLE) | (1L << STRING) | (1L << CHARACTER) | (1L << TRUE) | (1L << FALSE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatumContext extends ParserRuleContext {
		public SimpleDatumContext simpleDatum() {
			return getRuleContext(SimpleDatumContext.class,0);
		}
		public CompoundDatumContext compoundDatum() {
			return getRuleContext(CompoundDatumContext.class,0);
		}
		public DatumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datum; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitDatum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatumContext datum() throws RecognitionException {
		DatumContext _localctx = new DatumContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_datum);
		try {
			setState(412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
			case ARROW:
			case DEFINE:
			case UNQUOTE_SPLICING:
			case UNQUOTE:
			case QUOTE:
			case LAMBDA:
			case IF:
			case SET:
			case BEGIN:
			case COND:
			case AND:
			case OR:
			case CASE:
			case LET:
			case LETSTAR:
			case LETREC:
			case DO:
			case DELAY:
			case QUASIQUOTE:
			case NUM_2:
			case NUM_8:
			case NUM_10:
			case NUM_16:
			case ELLIPSIS:
			case VARIABLE:
			case STRING:
			case CHARACTER:
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				simpleDatum();
				}
				break;
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				compoundDatum();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleDatumContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode CHARACTER() { return getToken(SchemeParser.CHARACTER, 0); }
		public TerminalNode STRING() { return getToken(SchemeParser.STRING, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SimpleDatumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleDatum; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitSimpleDatum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleDatumContext simpleDatum() throws RecognitionException {
		SimpleDatumContext _localctx = new SimpleDatumContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_simpleDatum);
		try {
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				bool();
				}
				break;
			case NUM_2:
			case NUM_8:
			case NUM_10:
			case NUM_16:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				number();
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(416);
				match(CHARACTER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(417);
				match(STRING);
				}
				break;
			case ELSE:
			case ARROW:
			case DEFINE:
			case UNQUOTE_SPLICING:
			case UNQUOTE:
			case QUOTE:
			case LAMBDA:
			case IF:
			case SET:
			case BEGIN:
			case COND:
			case AND:
			case OR:
			case CASE:
			case LET:
			case LETSTAR:
			case LETREC:
			case DO:
			case DELAY:
			case QUASIQUOTE:
			case ELLIPSIS:
			case VARIABLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(418);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundDatumContext extends ParserRuleContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public CompoundDatumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundDatum; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitCompoundDatum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundDatumContext compoundDatum() throws RecognitionException {
		CompoundDatumContext _localctx = new CompoundDatumContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_compoundDatum);
		try {
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				list();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				vector();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public List<DatumContext> datum() {
			return getRuleContexts(DatumContext.class);
		}
		public DatumContext datum(int i) {
			return getRuleContext(DatumContext.class,i);
		}
		public AbbreviationContext abbreviation() {
			return getRuleContext(AbbreviationContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_list);
		int _la;
		try {
			setState(439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				match(T__0);
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << ELSE) | (1L << ARROW) | (1L << DEFINE) | (1L << UNQUOTE_SPLICING) | (1L << UNQUOTE) | (1L << QUOTE) | (1L << LAMBDA) | (1L << IF) | (1L << SET) | (1L << BEGIN) | (1L << COND) | (1L << AND) | (1L << OR) | (1L << CASE) | (1L << LET) | (1L << LETSTAR) | (1L << LETREC) | (1L << DO) | (1L << DELAY) | (1L << QUASIQUOTE) | (1L << NUM_2) | (1L << NUM_8) | (1L << NUM_10) | (1L << NUM_16) | (1L << ELLIPSIS) | (1L << VARIABLE) | (1L << STRING) | (1L << CHARACTER) | (1L << TRUE) | (1L << FALSE))) != 0)) {
					{
					setState(427); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(426);
						datum();
						}
						}
						setState(429); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << ELSE) | (1L << ARROW) | (1L << DEFINE) | (1L << UNQUOTE_SPLICING) | (1L << UNQUOTE) | (1L << QUOTE) | (1L << LAMBDA) | (1L << IF) | (1L << SET) | (1L << BEGIN) | (1L << COND) | (1L << AND) | (1L << OR) | (1L << CASE) | (1L << LET) | (1L << LETSTAR) | (1L << LETREC) | (1L << DO) | (1L << DELAY) | (1L << QUASIQUOTE) | (1L << NUM_2) | (1L << NUM_8) | (1L << NUM_10) | (1L << NUM_16) | (1L << ELLIPSIS) | (1L << VARIABLE) | (1L << STRING) | (1L << CHARACTER) | (1L << TRUE) | (1L << FALSE))) != 0) );
					setState(433);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(431);
						match(T__2);
						setState(432);
						datum();
						}
					}

					}
				}

				setState(437);
				match(T__1);
				}
				break;
			case T__3:
			case T__4:
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				abbreviation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbbreviationContext extends ParserRuleContext {
		public AbbrevPrefixContext abbrevPrefix() {
			return getRuleContext(AbbrevPrefixContext.class,0);
		}
		public DatumContext datum() {
			return getRuleContext(DatumContext.class,0);
		}
		public AbbreviationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abbreviation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitAbbreviation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbbreviationContext abbreviation() throws RecognitionException {
		AbbreviationContext _localctx = new AbbreviationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_abbreviation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			abbrevPrefix();
			setState(442);
			datum();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbbrevPrefixContext extends ParserRuleContext {
		public AbbrevPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abbrevPrefix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitAbbrevPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbbrevPrefixContext abbrevPrefix() throws RecognitionException {
		AbbrevPrefixContext _localctx = new AbbrevPrefixContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_abbrevPrefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VectorContext extends ParserRuleContext {
		public List<DatumContext> datum() {
			return getRuleContexts(DatumContext.class);
		}
		public DatumContext datum(int i) {
			return getRuleContext(DatumContext.class,i);
		}
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_vector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(T__7);
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << ELSE) | (1L << ARROW) | (1L << DEFINE) | (1L << UNQUOTE_SPLICING) | (1L << UNQUOTE) | (1L << QUOTE) | (1L << LAMBDA) | (1L << IF) | (1L << SET) | (1L << BEGIN) | (1L << COND) | (1L << AND) | (1L << OR) | (1L << CASE) | (1L << LET) | (1L << LETSTAR) | (1L << LETREC) | (1L << DO) | (1L << DELAY) | (1L << QUASIQUOTE) | (1L << NUM_2) | (1L << NUM_8) | (1L << NUM_10) | (1L << NUM_16) | (1L << ELLIPSIS) | (1L << VARIABLE) | (1L << STRING) | (1L << CHARACTER) | (1L << TRUE) | (1L << FALSE))) != 0)) {
				{
				{
				setState(447);
				datum();
				}
				}
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(453);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUM_2() { return getToken(SchemeParser.NUM_2, 0); }
		public TerminalNode NUM_8() { return getToken(SchemeParser.NUM_8, 0); }
		public TerminalNode NUM_10() { return getToken(SchemeParser.NUM_10, 0); }
		public TerminalNode NUM_16() { return getToken(SchemeParser.NUM_16, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM_2) | (1L << NUM_8) | (1L << NUM_10) | (1L << NUM_16))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SchemeParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SchemeParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u01ce\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\2\3\2\3\3\3\3\5\3c\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4r\n\4\3\4\3\4\3\4\7\4w\n\4"+
		"\f\4\16\4z\13\4\3\4\5\4}\n\4\3\5\7\5\u0080\n\5\f\5\16\5\u0083\13\5\3\5"+
		"\3\5\5\5\u0087\n\5\3\6\3\6\3\7\3\7\5\7\u008d\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u0095\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a0\n\n\3\13"+
		"\3\13\3\f\3\f\5\f\u00a6\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00af\n\r"+
		"\3\16\3\16\3\16\3\16\5\16\u00b5\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\6\20\u00bf\n\20\r\20\16\20\u00c0\3\20\3\20\5\20\u00c5\n\20\5\20"+
		"\u00c7\n\20\3\20\3\20\5\20\u00cb\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u00d2"+
		"\n\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\6\26\u00ea\n\26\r\26\16"+
		"\26\u00eb\3\26\3\26\3\26\3\26\3\26\5\26\u00f3\n\26\5\26\u00f5\n\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\6\26\u00ff\n\26\r\26\16\26\u0100\3"+
		"\26\3\26\3\26\3\26\3\26\5\26\u0108\n\26\5\26\u010a\n\26\3\26\3\26\7\26"+
		"\u010e\n\26\f\26\16\26\u0111\13\26\3\26\3\26\7\26\u0115\n\26\f\26\16\26"+
		"\u0118\13\26\3\26\3\26\5\26\u011c\n\26\3\26\3\26\7\26\u0120\n\26\f\26"+
		"\16\26\u0123\13\26\3\26\3\26\3\26\3\26\3\26\7\26\u012a\n\26\f\26\16\26"+
		"\u012d\13\26\3\26\3\26\3\26\3\26\3\26\7\26\u0134\n\26\f\26\16\26\u0137"+
		"\13\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0140\n\26\f\26\16\26\u0143"+
		"\13\26\3\26\3\26\3\26\3\26\5\26\u0149\n\26\3\26\3\26\7\26\u014d\n\26\f"+
		"\26\16\26\u0150\13\26\3\26\3\26\5\26\u0154\n\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\5\27\u015d\n\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\7\31"+
		"\u0166\n\31\f\31\16\31\u0169\13\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u0178\n\33\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3\37\7\37\u0185\n\37\f\37\16\37\u0188\13\37"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\7\"\u0191\n\"\f\"\16\"\u0194\13\"\3\"\3\"\3"+
		"#\6#\u0199\n#\r#\16#\u019a\3$\3$\5$\u019f\n$\3%\3%\3%\3%\3%\5%\u01a6\n"+
		"%\3&\3&\5&\u01aa\n&\3\'\3\'\6\'\u01ae\n\'\r\'\16\'\u01af\3\'\3\'\5\'\u01b4"+
		"\n\'\5\'\u01b6\n\'\3\'\3\'\5\'\u01ba\n\'\3(\3(\3(\3)\3)\3*\3*\7*\u01c3"+
		"\n*\f*\16*\u01c6\13*\3*\3*\3+\3+\3,\3,\3,\2\2-\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\7\3\2\20\36\3\2"+
		"#$\3\2\6\t\3\2\37\"\3\2\'(\2\u01e9\2[\3\2\2\2\4b\3\2\2\2\6|\3\2\2\2\b"+
		"\u0081\3\2\2\2\n\u0088\3\2\2\2\f\u008c\3\2\2\2\16\u0094\3\2\2\2\20\u0096"+
		"\3\2\2\2\22\u009f\3\2\2\2\24\u00a1\3\2\2\2\26\u00a5\3\2\2\2\30\u00ae\3"+
		"\2\2\2\32\u00b4\3\2\2\2\34\u00b6\3\2\2\2\36\u00ca\3\2\2\2 \u00cc\3\2\2"+
		"\2\"\u00d5\3\2\2\2$\u00d7\3\2\2\2&\u00d9\3\2\2\2(\u00db\3\2\2\2*\u00e1"+
		"\3\2\2\2,\u0157\3\2\2\2.\u0160\3\2\2\2\60\u0162\3\2\2\2\62\u016e\3\2\2"+
		"\2\64\u0173\3\2\2\2\66\u017b\3\2\2\28\u017d\3\2\2\2:\u017f\3\2\2\2<\u0181"+
		"\3\2\2\2>\u018b\3\2\2\2@\u018d\3\2\2\2B\u0192\3\2\2\2D\u0198\3\2\2\2F"+
		"\u019e\3\2\2\2H\u01a5\3\2\2\2J\u01a9\3\2\2\2L\u01b9\3\2\2\2N\u01bb\3\2"+
		"\2\2P\u01be\3\2\2\2R\u01c0\3\2\2\2T\u01c9\3\2\2\2V\u01cb\3\2\2\2XZ\5\4"+
		"\3\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7"+
		"\2\2\3_\3\3\2\2\2`c\5\6\4\2ac\5\n\6\2b`\3\2\2\2ba\3\2\2\2c\5\3\2\2\2d"+
		"e\7\3\2\2eq\7\r\2\2fg\5\24\13\2gh\5\22\n\2hi\7\4\2\2ir\3\2\2\2jk\7\3\2"+
		"\2kl\5\24\13\2lm\5\b\5\2mn\7\4\2\2no\5B\"\2op\7\4\2\2pr\3\2\2\2qf\3\2"+
		"\2\2qj\3\2\2\2r}\3\2\2\2st\7\3\2\2tx\7\24\2\2uw\5\6\4\2vu\3\2\2\2wz\3"+
		"\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{}\7\4\2\2|d\3\2\2\2|s\3"+
		"\2\2\2}\7\3\2\2\2~\u0080\5\24\13\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0086\3\2\2\2\u0083\u0081\3\2\2"+
		"\2\u0084\u0085\7\5\2\2\u0085\u0087\5\24\13\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\t\3\2\2\2\u0088\u0089\5\22\n\2\u0089\13\3\2\2\2\u008a"+
		"\u008d\5\16\b\2\u008b\u008d\5\24\13\2\u008c\u008a\3\2\2\2\u008c\u008b"+
		"\3\2\2\2\u008d\r\3\2\2\2\u008e\u0095\5\20\t\2\u008f\u0095\7\13\2\2\u0090"+
		"\u0095\7\f\2\2\u0091\u0095\7\r\2\2\u0092\u0095\7\17\2\2\u0093\u0095\7"+
		"\16\2\2\u0094\u008e\3\2\2\2\u0094\u008f\3\2\2\2\u0094\u0090\3\2\2\2\u0094"+
		"\u0091\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\17\3\2\2"+
		"\2\u0096\u0097\t\2\2\2\u0097\21\3\2\2\2\u0098\u00a0\5\24\13\2\u0099\u00a0"+
		"\5\26\f\2\u009a\u00a0\5\34\17\2\u009b\u00a0\5 \21\2\u009c\u00a0\5(\25"+
		"\2\u009d\u00a0\5*\26\2\u009e\u00a0\5<\37\2\u009f\u0098\3\2\2\2\u009f\u0099"+
		"\3\2\2\2\u009f\u009a\3\2\2\2\u009f\u009b\3\2\2\2\u009f\u009c\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\23\3\2\2\2\u00a1\u00a2\t\3\2"+
		"\2\u00a2\25\3\2\2\2\u00a3\u00a6\5\30\r\2\u00a4\u00a6\5\32\16\2\u00a5\u00a3"+
		"\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\27\3\2\2\2\u00a7\u00a8\7\6\2\2\u00a8"+
		"\u00af\5F$\2\u00a9\u00aa\7\3\2\2\u00aa\u00ab\7\20\2\2\u00ab\u00ac\5F$"+
		"\2\u00ac\u00ad\7\4\2\2\u00ad\u00af\3\2\2\2\u00ae\u00a7\3\2\2\2\u00ae\u00a9"+
		"\3\2\2\2\u00af\31\3\2\2\2\u00b0\u00b5\5V,\2\u00b1\u00b5\5T+\2\u00b2\u00b5"+
		"\7&\2\2\u00b3\u00b5\7%\2\2\u00b4\u00b0\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\33\3\2\2\2\u00b6\u00b7\7\3\2"+
		"\2\u00b7\u00b8\7\21\2\2\u00b8\u00b9\5\36\20\2\u00b9\u00ba\5B\"\2\u00ba"+
		"\u00bb\7\4\2\2\u00bb\35\3\2\2\2\u00bc\u00c6\7\3\2\2\u00bd\u00bf\5\24\13"+
		"\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c3\7\5\2\2\u00c3\u00c5\5\24\13\2"+
		"\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00be"+
		"\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cb\7\4\2\2\u00c9"+
		"\u00cb\5\24\13\2\u00ca\u00bc\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\37\3\2"+
		"\2\2\u00cc\u00cd\7\3\2\2\u00cd\u00ce\7\22\2\2\u00ce\u00cf\5\"\22\2\u00cf"+
		"\u00d1\5$\23\2\u00d0\u00d2\5&\24\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7\4\2\2\u00d4!\3\2\2\2\u00d5\u00d6"+
		"\5\22\n\2\u00d6#\3\2\2\2\u00d7\u00d8\5\22\n\2\u00d8%\3\2\2\2\u00d9\u00da"+
		"\5\22\n\2\u00da\'\3\2\2\2\u00db\u00dc\7\3\2\2\u00dc\u00dd\7\23\2\2\u00dd"+
		"\u00de\5\24\13\2\u00de\u00df\5\22\n\2\u00df\u00e0\7\4\2\2\u00e0)\3\2\2"+
		"\2\u00e1\u0153\7\3\2\2\u00e2\u00f4\7\25\2\2\u00e3\u00e4\7\3\2\2\u00e4"+
		"\u00e5\7\13\2\2\u00e5\u00e6\5D#\2\u00e6\u00e7\7\4\2\2\u00e7\u00f5\3\2"+
		"\2\2\u00e8\u00ea\5,\27\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00f2\3\2\2\2\u00ed\u00ee\7\3"+
		"\2\2\u00ee\u00ef\7\13\2\2\u00ef\u00f0\5D#\2\u00f0\u00f1\7\4\2\2\u00f1"+
		"\u00f3\3\2\2\2\u00f2\u00ed\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2"+
		"\2\2\u00f4\u00e3\3\2\2\2\u00f4\u00e9\3\2\2\2\u00f5\u0154\3\2\2\2\u00f6"+
		"\u00f7\7\30\2\2\u00f7\u0109\5\22\n\2\u00f8\u00f9\7\3\2\2\u00f9\u00fa\7"+
		"\13\2\2\u00fa\u00fb\5D#\2\u00fb\u00fc\7\4\2\2\u00fc\u010a\3\2\2\2\u00fd"+
		"\u00ff\5\60\31\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3"+
		"\2\2\2\u0100\u0101\3\2\2\2\u0101\u0107\3\2\2\2\u0102\u0103\7\3\2\2\u0103"+
		"\u0104\7\13\2\2\u0104\u0105\5D#\2\u0105\u0106\7\4\2\2\u0106\u0108\3\2"+
		"\2\2\u0107\u0102\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109"+
		"\u00f8\3\2\2\2\u0109\u00fe\3\2\2\2\u010a\u0154\3\2\2\2\u010b\u010f\7\26"+
		"\2\2\u010c\u010e\5\"\22\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0154\3\2\2\2\u0111\u010f\3\2"+
		"\2\2\u0112\u0116\7\27\2\2\u0113\u0115\5\"\22\2\u0114\u0113\3\2\2\2\u0115"+
		"\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0154\3\2"+
		"\2\2\u0118\u0116\3\2\2\2\u0119\u011b\7\31\2\2\u011a\u011c\5\24\13\2\u011b"+
		"\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0121\7\3"+
		"\2\2\u011e\u0120\5\62\32\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0121\3\2"+
		"\2\2\u0124\u0125\7\4\2\2\u0125\u0154\5B\"\2\u0126\u0127\7\32\2\2\u0127"+
		"\u012b\7\3\2\2\u0128\u012a\5\62\32\2\u0129\u0128\3\2\2\2\u012a\u012d\3"+
		"\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012e\u012f\7\4\2\2\u012f\u0154\5B\"\2\u0130\u0131\7\33"+
		"\2\2\u0131\u0135\7\3\2\2\u0132\u0134\5\62\32\2\u0133\u0132\3\2\2\2\u0134"+
		"\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2"+
		"\2\2\u0137\u0135\3\2\2\2\u0138\u0139\7\4\2\2\u0139\u0154\5B\"\2\u013a"+
		"\u013b\7\24\2\2\u013b\u0154\5D#\2\u013c\u013d\7\34\2\2\u013d\u0141\7\3"+
		"\2\2\u013e\u0140\5\64\33\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2"+
		"\2\2\u0144\u0145\7\4\2\2\u0145\u0146\7\3\2\2\u0146\u0148\5\"\22\2\u0147"+
		"\u0149\5:\36\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014a\u014e\7\4\2\2\u014b\u014d\5\n\6\2\u014c\u014b\3\2\2\2\u014d"+
		"\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0154\3\2"+
		"\2\2\u0150\u014e\3\2\2\2\u0151\u0152\7\35\2\2\u0152\u0154\5\22\n\2\u0153"+
		"\u00e2\3\2\2\2\u0153\u00f6\3\2\2\2\u0153\u010b\3\2\2\2\u0153\u0112\3\2"+
		"\2\2\u0153\u0119\3\2\2\2\u0153\u0126\3\2\2\2\u0153\u0130\3\2\2\2\u0153"+
		"\u013a\3\2\2\2\u0153\u013c\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155\u0156\7\4\2\2\u0156+\3\2\2\2\u0157\u0158\7\3\2\2\u0158\u015c"+
		"\5\"\22\2\u0159\u015d\5D#\2\u015a\u015b\7\f\2\2\u015b\u015d\5.\30\2\u015c"+
		"\u0159\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2"+
		"\2\2\u015e\u015f\7\4\2\2\u015f-\3\2\2\2\u0160\u0161\5\22\n\2\u0161/\3"+
		"\2\2\2\u0162\u0163\7\3\2\2\u0163\u0167\7\3\2\2\u0164\u0166\5F$\2\u0165"+
		"\u0164\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2"+
		"\2\2\u0168\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\7\4\2\2\u016b"+
		"\u016c\5D#\2\u016c\u016d\7\4\2\2\u016d\61\3\2\2\2\u016e\u016f\7\3\2\2"+
		"\u016f\u0170\5\24\13\2\u0170\u0171\5\22\n\2\u0171\u0172\7\4\2\2\u0172"+
		"\63\3\2\2\2\u0173\u0174\7\3\2\2\u0174\u0175\5\24\13\2\u0175\u0177\5\66"+
		"\34\2\u0176\u0178\58\35\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017a\7\4\2\2\u017a\65\3\2\2\2\u017b\u017c\5\22\n"+
		"\2\u017c\67\3\2\2\2\u017d\u017e\5\22\n\2\u017e9\3\2\2\2\u017f\u0180\5"+
		"D#\2\u0180;\3\2\2\2\u0181\u0182\7\3\2\2\u0182\u0186\5> \2\u0183\u0185"+
		"\5@!\2\u0184\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018a\7\4"+
		"\2\2\u018a=\3\2\2\2\u018b\u018c\5\22\n\2\u018c?\3\2\2\2\u018d\u018e\5"+
		"\22\n\2\u018eA\3\2\2\2\u018f\u0191\5\6\4\2\u0190\u018f\3\2\2\2\u0191\u0194"+
		"\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0195\u0196\5D#\2\u0196C\3\2\2\2\u0197\u0199\5\22\n\2\u0198"+
		"\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2"+
		"\2\2\u019bE\3\2\2\2\u019c\u019f\5H%\2\u019d\u019f\5J&\2\u019e\u019c\3"+
		"\2\2\2\u019e\u019d\3\2\2\2\u019fG\3\2\2\2\u01a0\u01a6\5V,\2\u01a1\u01a6"+
		"\5T+\2\u01a2\u01a6\7&\2\2\u01a3\u01a6\7%\2\2\u01a4\u01a6\5\f\7\2\u01a5"+
		"\u01a0\3\2\2\2\u01a5\u01a1\3\2\2\2\u01a5\u01a2\3\2\2\2\u01a5\u01a3\3\2"+
		"\2\2\u01a5\u01a4\3\2\2\2\u01a6I\3\2\2\2\u01a7\u01aa\5L\'\2\u01a8\u01aa"+
		"\5R*\2\u01a9\u01a7\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aaK\3\2\2\2\u01ab\u01b5"+
		"\7\3\2\2\u01ac\u01ae\5F$\2\u01ad\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01b2\7\5"+
		"\2\2\u01b2\u01b4\5F$\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6"+
		"\3\2\2\2\u01b5\u01ad\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"\u01ba\7\4\2\2\u01b8\u01ba\5N(\2\u01b9\u01ab\3\2\2\2\u01b9\u01b8\3\2\2"+
		"\2\u01baM\3\2\2\2\u01bb\u01bc\5P)\2\u01bc\u01bd\5F$\2\u01bdO\3\2\2\2\u01be"+
		"\u01bf\t\4\2\2\u01bfQ\3\2\2\2\u01c0\u01c4\7\n\2\2\u01c1\u01c3\5F$\2\u01c2"+
		"\u01c1\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2"+
		"\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c8\7\4\2\2\u01c8"+
		"S\3\2\2\2\u01c9\u01ca\t\5\2\2\u01caU\3\2\2\2\u01cb\u01cc\t\6\2\2\u01cc"+
		"W\3\2\2\2\62[bqx|\u0081\u0086\u008c\u0094\u009f\u00a5\u00ae\u00b4\u00c0"+
		"\u00c4\u00c6\u00ca\u00d1\u00eb\u00f2\u00f4\u0100\u0107\u0109\u010f\u0116"+
		"\u011b\u0121\u012b\u0135\u0141\u0148\u014e\u0153\u015c\u0167\u0177\u0186"+
		"\u0192\u019a\u019e\u01a5\u01a9\u01af\u01b3\u01b5\u01b9\u01c4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}