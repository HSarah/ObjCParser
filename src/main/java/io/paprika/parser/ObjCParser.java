// Generated from C:\Users\Sarra\IdeaProjects\artid2\src\main\antlr\ObjC.g4 by ANTLR 4.2.2
package io.paprika.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ObjCParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, AUTORELEASEPOOL=2, CATCH=3, CLASS=4, DYNAMIC=5, ENCODE=6, END=7, 
		FINALLY=8, IMPLEMENTATION=9, INTERFACE=10, PACKAGE=11, PROTOCOL=12, OPTIONAL=13, 
		PRIVATE=14, PROPERTY=15, PROTECTED=16, PUBLIC=17, SELECTOR=18, SYNCHRONIZED=19, 
		SYNTHESIZE=20, THROW=21, TRY=22, SUPER=23, SELF=24, ABSTRACT=25, AUTO=26, 
		BOOLEAN=27, BREAK=28, BYCOPY=29, BYREF=30, CASE=31, CHAR=32, CONST=33, 
		CONTINUE=34, DEFAULT=35, DO=36, DOUBLE=37, ELSE=38, ENUM=39, EXTERN=40, 
		FLOAT=41, FOR=42, ID=43, IF=44, IN=45, INOUT=46, INSTANCETYPE=47, GOTO=48, 
		INT=49, LONG=50, ONEWAY=51, OUT=52, REGISTER=53, RETURN=54, SHORT=55, 
		SIGNED=56, SIZEOF=57, STATIC=58, STRUCT=59, SWITCH=60, TYPEDEF=61, UNION=62, 
		UNSIGNED=63, VOID=64, VOLATILE=65, WHILE=66, NS_OPTIONS=67, NS_ENUM=68, 
		WWEAK=69, WUNSAFE_UNRETAINED=70, LPAREN=71, RPAREN=72, LBRACE=73, RBRACE=74, 
		LBRACK=75, RBRACK=76, SEMI=77, COMMA=78, DOT=79, STRUCTACCESS=80, AT=81, 
		ASSIGN=82, GT=83, LT=84, BANG=85, TILDE=86, QUESTION=87, COLON=88, EQUAL=89, 
		LE=90, GE=91, NOTEQUAL=92, AND=93, OR=94, INC=95, DEC=96, ADD=97, SUB=98, 
		MUL=99, DIV=100, BITAND=101, BITOR=102, CARET=103, MOD=104, SHIFT_R=105, 
		SHIFT_L=106, ADD_ASSIGN=107, SUB_ASSIGN=108, MUL_ASSIGN=109, DIV_ASSIGN=110, 
		AND_ASSIGN=111, OR_ASSIGN=112, XOR_ASSIGN=113, MOD_ASSIGN=114, LSHIFT_ASSIGN=115, 
		RSHIFT_ASSIGN=116, ELIPSIS=117, ASSIGNPA=118, GETTER=119, NONATOMIC=120, 
		SETTER=121, STRONG=122, RETAIN=123, READONLY=124, READWRITE=125, WEAK=126, 
		IDENTIFIER=127, CHARACTER_LITERAL=128, STRING_LITERAL=129, HEX_LITERAL=130, 
		DECIMAL_LITERAL=131, OCTAL_LITERAL=132, FLOATING_POINT_LITERAL=133, IMPORT=134, 
		INCLUDE=135, PRAGMA=136, WS=137, COMMENT=138, LINE_COMMENT=139, HDEFINE=140, 
		HIF=141, HELIF=142, HELSE=143, HUNDEF=144, HIFNDEF=145, HENDIF=146;
	public static final String[] tokenNames = {
		"<INVALID>", "'@required'", "'@autoreleasepool'", "'@catch'", "'@class'", 
		"'@dynamic'", "'@encode'", "'@end'", "'@finally'", "'@implementation'", 
		"'@interface'", "'@package'", "'@protocol'", "'@optional'", "'@private'", 
		"'@property'", "'@protected'", "'@public'", "'@selector'", "'@synchronized'", 
		"'@synthesize'", "'@throw'", "'@try'", "'super'", "'self'", "'abstract'", 
		"'auto'", "'boolean'", "'break'", "'bycopy'", "'byref'", "'case'", "'char'", 
		"'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", "'enum'", 
		"'extern'", "'float'", "'for'", "'id'", "'if'", "'in'", "'inout'", "'instancetype'", 
		"'goto'", "'int'", "'long'", "'oneway'", "'out'", "'register'", "'return'", 
		"'short'", "'signed'", "'sizeof'", "'static'", "'struct'", "'switch'", 
		"'typedef'", "'union'", "'unsigned'", "'void'", "'volatile'", "'while'", 
		"'NS_OPTIONS'", "'NS_ENUM'", "'__weak'", "'__unsafe_unretained'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'->'", "'@'", 
		"'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", 
		"'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", 
		"'|'", "'^'", "'%'", "'>>'", "'<<'", "'+='", "'-='", "'*='", "'/='", "'&='", 
		"'|='", "'^='", "'%='", "'<<='", "'>>='", "'...'", "'assign'", "'getter'", 
		"'nonatomic'", "'setter'", "'strong'", "'retain'", "'readonly'", "'readwrite'", 
		"'weak'", "IDENTIFIER", "CHARACTER_LITERAL", "STRING_LITERAL", "HEX_LITERAL", 
		"DECIMAL_LITERAL", "OCTAL_LITERAL", "FLOATING_POINT_LITERAL", "IMPORT", 
		"INCLUDE", "PRAGMA", "WS", "COMMENT", "LINE_COMMENT", "HDEFINE", "HIF", 
		"HELIF", "HELSE", "HUNDEF", "HIFNDEF", "HENDIF"
	};
	public static final int
		RULE_translation_unit = 0, RULE_external_declaration = 1, RULE_preprocessor_declaration = 2, 
		RULE_class_interface = 3, RULE_category_interface = 4, RULE_class_implementation = 5, 
		RULE_category_implementation = 6, RULE_protocol_declaration = 7, RULE_protocol_declaration_list = 8, 
		RULE_class_declaration_list = 9, RULE_class_list = 10, RULE_protocol_reference_list = 11, 
		RULE_protocol_list = 12, RULE_property_declaration = 13, RULE_property_attributes_declaration = 14, 
		RULE_property_attributes_list = 15, RULE_property_attribute = 16, RULE_class_name = 17, 
		RULE_superclass_name = 18, RULE_category_name = 19, RULE_protocol_name = 20, 
		RULE_instance_variables = 21, RULE_visibility_specification = 22, RULE_interface_declaration_list = 23, 
		RULE_class_method_declaration = 24, RULE_instance_method_declaration = 25, 
		RULE_method_declaration = 26, RULE_implementation_definition_list = 27, 
		RULE_class_method_definition = 28, RULE_instance_method_definition = 29, 
		RULE_method_definition = 30, RULE_method_selector = 31, RULE_keyword_declarator = 32, 
		RULE_selector = 33, RULE_method_type = 34, RULE_property_implementation = 35, 
		RULE_property_synthesize_list = 36, RULE_property_synthesize_item = 37, 
		RULE_block_type = 38, RULE_generics_specifier = 39, RULE_type_specifier = 40, 
		RULE_type_qualifier = 41, RULE_protocol_qualifier = 42, RULE_primary_expression = 43, 
		RULE_dictionary_pair = 44, RULE_dictionary_expression = 45, RULE_array_expression = 46, 
		RULE_box_expression = 47, RULE_block_parameters = 48, RULE_block_expression = 49, 
		RULE_message_expression = 50, RULE_receiver = 51, RULE_message_selector = 52, 
		RULE_keyword_argument = 53, RULE_selector_expression = 54, RULE_selector_name = 55, 
		RULE_protocol_expression = 56, RULE_encode_expression = 57, RULE_type_variable_declarator = 58, 
		RULE_try_statement = 59, RULE_catch_statement = 60, RULE_finally_statement = 61, 
		RULE_throw_statement = 62, RULE_try_block = 63, RULE_synchronized_statement = 64, 
		RULE_autorelease_statement = 65, RULE_function_definition = 66, RULE_declaration = 67, 
		RULE_declaration_specifiers = 68, RULE_arc_behaviour_specifier = 69, RULE_storage_class_specifier = 70, 
		RULE_init_declarator_list = 71, RULE_init_declarator = 72, RULE_struct_or_union_specifier = 73, 
		RULE_struct_declaration = 74, RULE_specifier_qualifier_list = 75, RULE_struct_declarator_list = 76, 
		RULE_struct_declarator = 77, RULE_enum_specifier = 78, RULE_enumerator_list = 79, 
		RULE_enumerator = 80, RULE_pointer = 81, RULE_declarator = 82, RULE_direct_declarator = 83, 
		RULE_declarator_suffix = 84, RULE_parameter_list = 85, RULE_parameter_declaration = 86, 
		RULE_initializer = 87, RULE_type_name = 88, RULE_abstract_declarator = 89, 
		RULE_abstract_declarator_suffix = 90, RULE_parameter_declaration_list = 91, 
		RULE_statement_list = 92, RULE_statement = 93, RULE_labeled_statement = 94, 
		RULE_compound_statement = 95, RULE_selection_statement = 96, RULE_for_in_statement = 97, 
		RULE_for_statement = 98, RULE_while_statement = 99, RULE_do_statement = 100, 
		RULE_iteration_statement = 101, RULE_jump_statement = 102, RULE_expression = 103, 
		RULE_assignment_expression = 104, RULE_assignment_operator = 105, RULE_conditional_expression = 106, 
		RULE_constant_expression = 107, RULE_logical_or_expression = 108, RULE_logical_and_expression = 109, 
		RULE_inclusive_or_expression = 110, RULE_exclusive_or_expression = 111, 
		RULE_and_expression = 112, RULE_equality_expression = 113, RULE_relational_expression = 114, 
		RULE_shift_expression = 115, RULE_additive_expression = 116, RULE_multiplicative_expression = 117, 
		RULE_cast_expression = 118, RULE_unary_expression = 119, RULE_unary_operator = 120, 
		RULE_postfix_expression = 121, RULE_argument_expression_list = 122, RULE_identifier = 123, 
		RULE_constant = 124;
	public static final String[] ruleNames = {
		"translation_unit", "external_declaration", "preprocessor_declaration", 
		"class_interface", "category_interface", "class_implementation", "category_implementation", 
		"protocol_declaration", "protocol_declaration_list", "class_declaration_list", 
		"class_list", "protocol_reference_list", "protocol_list", "property_declaration", 
		"property_attributes_declaration", "property_attributes_list", "property_attribute", 
		"class_name", "superclass_name", "category_name", "protocol_name", "instance_variables", 
		"visibility_specification", "interface_declaration_list", "class_method_declaration", 
		"instance_method_declaration", "method_declaration", "implementation_definition_list", 
		"class_method_definition", "instance_method_definition", "method_definition", 
		"method_selector", "keyword_declarator", "selector", "method_type", "property_implementation", 
		"property_synthesize_list", "property_synthesize_item", "block_type", 
		"generics_specifier", "type_specifier", "type_qualifier", "protocol_qualifier", 
		"primary_expression", "dictionary_pair", "dictionary_expression", "array_expression", 
		"box_expression", "block_parameters", "block_expression", "message_expression", 
		"receiver", "message_selector", "keyword_argument", "selector_expression", 
		"selector_name", "protocol_expression", "encode_expression", "type_variable_declarator", 
		"try_statement", "catch_statement", "finally_statement", "throw_statement", 
		"try_block", "synchronized_statement", "autorelease_statement", "function_definition", 
		"declaration", "declaration_specifiers", "arc_behaviour_specifier", "storage_class_specifier", 
		"init_declarator_list", "init_declarator", "struct_or_union_specifier", 
		"struct_declaration", "specifier_qualifier_list", "struct_declarator_list", 
		"struct_declarator", "enum_specifier", "enumerator_list", "enumerator", 
		"pointer", "declarator", "direct_declarator", "declarator_suffix", "parameter_list", 
		"parameter_declaration", "initializer", "type_name", "abstract_declarator", 
		"abstract_declarator_suffix", "parameter_declaration_list", "statement_list", 
		"statement", "labeled_statement", "compound_statement", "selection_statement", 
		"for_in_statement", "for_statement", "while_statement", "do_statement", 
		"iteration_statement", "jump_statement", "expression", "assignment_expression", 
		"assignment_operator", "conditional_expression", "constant_expression", 
		"logical_or_expression", "logical_and_expression", "inclusive_or_expression", 
		"exclusive_or_expression", "and_expression", "equality_expression", "relational_expression", 
		"shift_expression", "additive_expression", "multiplicative_expression", 
		"cast_expression", "unary_expression", "unary_operator", "postfix_expression", 
		"argument_expression_list", "identifier", "constant"
	};

	@Override
	public String getGrammarFileName() { return "ObjC.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ObjCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Translation_unitContext extends ParserRuleContext {
		public External_declarationContext external_declaration(int i) {
			return getRuleContext(External_declarationContext.class,i);
		}
		public List<External_declarationContext> external_declaration() {
			return getRuleContexts(External_declarationContext.class);
		}
		public TerminalNode EOF() { return getToken(ObjCParser.EOF, 0); }
		public Translation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translation_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterTranslation_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitTranslation_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitTranslation_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Translation_unitContext translation_unit() throws RecognitionException {
		Translation_unitContext _localctx = new Translation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translation_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(250); external_declaration();
				}
				}
				setState(253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << IMPLEMENTATION) | (1L << INTERFACE) | (1L << PROTOCOL) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOID - 64)) | (1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (LPAREN - 64)) | (1L << (MUL - 64)) | (1L << (IDENTIFIER - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (IMPORT - 134)) | (1L << (INCLUDE - 134)) | (1L << (COMMENT - 134)) | (1L << (LINE_COMMENT - 134)))) != 0) );
			setState(255); match(EOF);
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

	public static class External_declarationContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(ObjCParser.COMMENT, 0); }
		public Class_implementationContext class_implementation() {
			return getRuleContext(Class_implementationContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Protocol_declaration_listContext protocol_declaration_list() {
			return getRuleContext(Protocol_declaration_listContext.class,0);
		}
		public Class_interfaceContext class_interface() {
			return getRuleContext(Class_interfaceContext.class,0);
		}
		public TerminalNode LINE_COMMENT() { return getToken(ObjCParser.LINE_COMMENT, 0); }
		public Protocol_declarationContext protocol_declaration() {
			return getRuleContext(Protocol_declarationContext.class,0);
		}
		public Class_declaration_listContext class_declaration_list() {
			return getRuleContext(Class_declaration_listContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Category_interfaceContext category_interface() {
			return getRuleContext(Category_interfaceContext.class,0);
		}
		public Preprocessor_declarationContext preprocessor_declaration() {
			return getRuleContext(Preprocessor_declarationContext.class,0);
		}
		public Category_implementationContext category_implementation() {
			return getRuleContext(Category_implementationContext.class,0);
		}
		public External_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterExternal_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitExternal_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitExternal_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final External_declarationContext external_declaration() throws RecognitionException {
		External_declarationContext _localctx = new External_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_external_declaration);
		try {
			setState(269);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257); match(COMMENT);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258); match(LINE_COMMENT);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(259); preprocessor_declaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(260); function_definition();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(261); declaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(262); class_interface();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(263); class_implementation();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(264); category_interface();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(265); category_implementation();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(266); protocol_declaration();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(267); protocol_declaration_list();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(268); class_declaration_list();
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

	public static class Preprocessor_declarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ObjCParser.IMPORT, 0); }
		public TerminalNode INCLUDE() { return getToken(ObjCParser.INCLUDE, 0); }
		public Preprocessor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocessor_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterPreprocessor_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitPreprocessor_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitPreprocessor_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Preprocessor_declarationContext preprocessor_declaration() throws RecognitionException {
		Preprocessor_declarationContext _localctx = new Preprocessor_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_preprocessor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !(_la==IMPORT || _la==INCLUDE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Class_interfaceContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Protocol_reference_listContext protocol_reference_list() {
			return getRuleContext(Protocol_reference_listContext.class,0);
		}
		public Interface_declaration_listContext interface_declaration_list() {
			return getRuleContext(Interface_declaration_listContext.class,0);
		}
		public Superclass_nameContext superclass_name() {
			return getRuleContext(Superclass_nameContext.class,0);
		}
		public Instance_variablesContext instance_variables() {
			return getRuleContext(Instance_variablesContext.class,0);
		}
		public Class_interfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_interface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterClass_interface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitClass_interface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitClass_interface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_interfaceContext class_interface() throws RecognitionException {
		Class_interfaceContext _localctx = new Class_interfaceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_interface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273); match(INTERFACE);
			setState(274); class_name();
			setState(277);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(275); match(COLON);
				setState(276); superclass_name();
				}
			}

			setState(280);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(279); protocol_reference_list();
				}
			}

			setState(283);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(282); instance_variables();
				}
			}

			setState(286);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROPERTY) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOID - 64)) | (1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(285); interface_declaration_list();
				}
			}

			setState(288); match(END);
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

	public static class Category_interfaceContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Protocol_reference_listContext protocol_reference_list() {
			return getRuleContext(Protocol_reference_listContext.class,0);
		}
		public Interface_declaration_listContext interface_declaration_list() {
			return getRuleContext(Interface_declaration_listContext.class,0);
		}
		public Category_nameContext category_name() {
			return getRuleContext(Category_nameContext.class,0);
		}
		public Instance_variablesContext instance_variables() {
			return getRuleContext(Instance_variablesContext.class,0);
		}
		public Category_interfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_interface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterCategory_interface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitCategory_interface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitCategory_interface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Category_interfaceContext category_interface() throws RecognitionException {
		Category_interfaceContext _localctx = new Category_interfaceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_category_interface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290); match(INTERFACE);
			setState(291); class_name();
			setState(292); match(LPAREN);
			setState(294);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(293); category_name();
				}
			}

			setState(296); match(RPAREN);
			setState(298);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(297); protocol_reference_list();
				}
			}

			setState(301);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(300); instance_variables();
				}
			}

			setState(304);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROPERTY) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOID - 64)) | (1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(303); interface_declaration_list();
				}
			}

			setState(306); match(END);
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

	public static class Class_implementationContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Implementation_definition_listContext implementation_definition_list() {
			return getRuleContext(Implementation_definition_listContext.class,0);
		}
		public Superclass_nameContext superclass_name() {
			return getRuleContext(Superclass_nameContext.class,0);
		}
		public Instance_variablesContext instance_variables() {
			return getRuleContext(Instance_variablesContext.class,0);
		}
		public Class_implementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_implementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterClass_implementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitClass_implementation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitClass_implementation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_implementationContext class_implementation() throws RecognitionException {
		Class_implementationContext _localctx = new Class_implementationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_class_implementation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308); match(IMPLEMENTATION);
			{
			setState(309); class_name();
			setState(312);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(310); match(COLON);
				setState(311); superclass_name();
				}
			}

			setState(315);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(314); instance_variables();
				}
			}

			setState(318);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DYNAMIC) | (1L << SYNTHESIZE) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOID - 64)) | (1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (LPAREN - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (MUL - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(317); implementation_definition_list();
				}
			}

			}
			setState(320); match(END);
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

	public static class Category_implementationContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Implementation_definition_listContext implementation_definition_list() {
			return getRuleContext(Implementation_definition_listContext.class,0);
		}
		public Category_nameContext category_name() {
			return getRuleContext(Category_nameContext.class,0);
		}
		public Category_implementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_implementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterCategory_implementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitCategory_implementation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitCategory_implementation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Category_implementationContext category_implementation() throws RecognitionException {
		Category_implementationContext _localctx = new Category_implementationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_category_implementation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322); match(IMPLEMENTATION);
			{
			setState(323); class_name();
			setState(324); match(LPAREN);
			setState(325); category_name();
			setState(326); match(RPAREN);
			setState(328);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DYNAMIC) | (1L << SYNTHESIZE) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOID - 64)) | (1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (LPAREN - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (MUL - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(327); implementation_definition_list();
				}
			}

			}
			setState(330); match(END);
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

	public static class Protocol_declarationContext extends ParserRuleContext {
		public Interface_declaration_listContext interface_declaration_list(int i) {
			return getRuleContext(Interface_declaration_listContext.class,i);
		}
		public Protocol_reference_listContext protocol_reference_list() {
			return getRuleContext(Protocol_reference_listContext.class,0);
		}
		public Protocol_nameContext protocol_name() {
			return getRuleContext(Protocol_nameContext.class,0);
		}
		public List<Interface_declaration_listContext> interface_declaration_list() {
			return getRuleContexts(Interface_declaration_listContext.class);
		}
		public Protocol_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProtocol_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProtocol_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitProtocol_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_declarationContext protocol_declaration() throws RecognitionException {
		Protocol_declarationContext _localctx = new Protocol_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_protocol_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332); match(PROTOCOL);
			{
			setState(333); protocol_name();
			setState(335);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(334); protocol_reference_list();
				}
			}

			setState(338);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(337); match(1);
				}
			}

			setState(341);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(340); interface_declaration_list();
				}
				break;
			}
			setState(344);
			_la = _input.LA(1);
			if (_la==OPTIONAL) {
				{
				setState(343); match(OPTIONAL);
				}
			}

			setState(347);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROPERTY) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOID - 64)) | (1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(346); interface_declaration_list();
				}
			}

			}
			setState(349); match(END);
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

	public static class Protocol_declaration_listContext extends ParserRuleContext {
		public Protocol_listContext protocol_list() {
			return getRuleContext(Protocol_listContext.class,0);
		}
		public Protocol_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProtocol_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProtocol_declaration_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitProtocol_declaration_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_declaration_listContext protocol_declaration_list() throws RecognitionException {
		Protocol_declaration_listContext _localctx = new Protocol_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_protocol_declaration_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(351); match(PROTOCOL);
			setState(352); protocol_list();
			setState(353); match(SEMI);
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

	public static class Class_declaration_listContext extends ParserRuleContext {
		public Class_listContext class_list() {
			return getRuleContext(Class_listContext.class,0);
		}
		public Class_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterClass_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitClass_declaration_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitClass_declaration_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declaration_listContext class_declaration_list() throws RecognitionException {
		Class_declaration_listContext _localctx = new Class_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_class_declaration_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(355); match(CLASS);
			setState(356); class_list();
			setState(357); match(SEMI);
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

	public static class Class_listContext extends ParserRuleContext {
		public List<Class_nameContext> class_name() {
			return getRuleContexts(Class_nameContext.class);
		}
		public Class_nameContext class_name(int i) {
			return getRuleContext(Class_nameContext.class,i);
		}
		public Class_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterClass_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitClass_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitClass_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_listContext class_list() throws RecognitionException {
		Class_listContext _localctx = new Class_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_class_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359); class_name();
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(360); match(COMMA);
				setState(361); class_name();
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Protocol_reference_listContext extends ParserRuleContext {
		public Protocol_listContext protocol_list() {
			return getRuleContext(Protocol_listContext.class,0);
		}
		public Protocol_reference_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_reference_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProtocol_reference_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProtocol_reference_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitProtocol_reference_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_reference_listContext protocol_reference_list() throws RecognitionException {
		Protocol_reference_listContext _localctx = new Protocol_reference_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_protocol_reference_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(367); match(LT);
			setState(368); protocol_list();
			setState(369); match(GT);
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

	public static class Protocol_listContext extends ParserRuleContext {
		public List<Protocol_nameContext> protocol_name() {
			return getRuleContexts(Protocol_nameContext.class);
		}
		public Protocol_nameContext protocol_name(int i) {
			return getRuleContext(Protocol_nameContext.class,i);
		}
		public Protocol_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProtocol_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProtocol_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitProtocol_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_listContext protocol_list() throws RecognitionException {
		Protocol_listContext _localctx = new Protocol_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_protocol_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371); protocol_name();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(372); match(COMMA);
				setState(373); protocol_name();
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Property_declarationContext extends ParserRuleContext {
		public Property_attributes_declarationContext property_attributes_declaration() {
			return getRuleContext(Property_attributes_declarationContext.class,0);
		}
		public Struct_declarationContext struct_declaration() {
			return getRuleContext(Struct_declarationContext.class,0);
		}
		public Property_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProperty_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProperty_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitProperty_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_declarationContext property_declaration() throws RecognitionException {
		Property_declarationContext _localctx = new Property_declarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_property_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379); match(PROPERTY);
			setState(381);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(380); property_attributes_declaration();
				}
			}

			setState(383); struct_declaration();
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

	public static class Property_attributes_declarationContext extends ParserRuleContext {
		public Property_attributes_listContext property_attributes_list() {
			return getRuleContext(Property_attributes_listContext.class,0);
		}
		public Property_attributes_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_attributes_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProperty_attributes_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProperty_attributes_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitProperty_attributes_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_attributes_declarationContext property_attributes_declaration() throws RecognitionException {
		Property_attributes_declarationContext _localctx = new Property_attributes_declarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_property_attributes_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385); match(LPAREN);
			setState(386); property_attributes_list();
			setState(387); match(RPAREN);
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

	public static class Property_attributes_listContext extends ParserRuleContext {
		public List<Property_attributeContext> property_attribute() {
			return getRuleContexts(Property_attributeContext.class);
		}
		public Property_attributeContext property_attribute(int i) {
			return getRuleContext(Property_attributeContext.class,i);
		}
		public Property_attributes_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_attributes_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProperty_attributes_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProperty_attributes_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitProperty_attributes_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_attributes_listContext property_attributes_list() throws RecognitionException {
		Property_attributes_listContext _localctx = new Property_attributes_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_property_attributes_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389); property_attribute();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(390); match(COMMA);
				setState(391); property_attribute();
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Property_attributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Property_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProperty_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProperty_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitProperty_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_attributeContext property_attribute() throws RecognitionException {
		Property_attributeContext _localctx = new Property_attributeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_property_attribute);
		try {
			setState(413);
			switch (_input.LA(1)) {
			case NONATOMIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(397); match(NONATOMIC);
				}
				break;
			case ASSIGNPA:
				enterOuterAlt(_localctx, 2);
				{
				setState(398); match(ASSIGNPA);
				}
				break;
			case WEAK:
				enterOuterAlt(_localctx, 3);
				{
				setState(399); match(WEAK);
				}
				break;
			case STRONG:
				enterOuterAlt(_localctx, 4);
				{
				setState(400); match(STRONG);
				}
				break;
			case RETAIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(401); match(RETAIN);
				}
				break;
			case READONLY:
				enterOuterAlt(_localctx, 6);
				{
				setState(402); match(READONLY);
				}
				break;
			case READWRITE:
				enterOuterAlt(_localctx, 7);
				{
				setState(403); match(READWRITE);
				}
				break;
			case RPAREN:
			case COMMA:
				enterOuterAlt(_localctx, 8);
				{
				}
				break;
			case GETTER:
				enterOuterAlt(_localctx, 9);
				{
				setState(405); match(GETTER);
				setState(406); match(ASSIGN);
				setState(407); match(IDENTIFIER);
				}
				break;
			case SETTER:
				enterOuterAlt(_localctx, 10);
				{
				setState(408); match(SETTER);
				setState(409); match(ASSIGN);
				setState(410); match(IDENTIFIER);
				setState(411); match(COLON);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 11);
				{
				setState(412); match(IDENTIFIER);
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

	public static class Class_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitClass_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitClass_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415); match(IDENTIFIER);
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

	public static class Superclass_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Superclass_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSuperclass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSuperclass_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitSuperclass_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Superclass_nameContext superclass_name() throws RecognitionException {
		Superclass_nameContext _localctx = new Superclass_nameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_superclass_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417); match(IDENTIFIER);
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

	public static class Category_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Category_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterCategory_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitCategory_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitCategory_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Category_nameContext category_name() throws RecognitionException {
		Category_nameContext _localctx = new Category_nameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_category_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419); match(IDENTIFIER);
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

	public static class Protocol_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Protocol_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProtocol_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProtocol_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitProtocol_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_nameContext protocol_name() throws RecognitionException {
		Protocol_nameContext _localctx = new Protocol_nameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_protocol_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421); match(IDENTIFIER);
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

	public static class Instance_variablesContext extends ParserRuleContext {
		public Visibility_specificationContext visibility_specification() {
			return getRuleContext(Visibility_specificationContext.class,0);
		}
		public Struct_declarationContext struct_declaration(int i) {
			return getRuleContext(Struct_declarationContext.class,i);
		}
		public List<Struct_declarationContext> struct_declaration() {
			return getRuleContexts(Struct_declarationContext.class);
		}
		public Instance_variablesContext instance_variables() {
			return getRuleContext(Instance_variablesContext.class,0);
		}
		public Instance_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instance_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInstance_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInstance_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitInstance_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instance_variablesContext instance_variables() throws RecognitionException {
		Instance_variablesContext _localctx = new Instance_variablesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_instance_variables);
		int _la;
		try {
			setState(459);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(423); match(LBRACE);
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << SHORT) | (1L << SIGNED) | (1L << STRUCT) | (1L << UNION) | (1L << UNSIGNED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOID - 64)) | (1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					{
					setState(424); struct_declaration();
					}
					}
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(430); match(RBRACE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431); match(LBRACE);
				setState(432); visibility_specification();
				setState(434); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(433); struct_declaration();
					}
					}
					setState(436); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << SHORT) | (1L << SIGNED) | (1L << STRUCT) | (1L << UNION) | (1L << UNSIGNED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOID - 64)) | (1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
				setState(438); match(RBRACE);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(440); match(LBRACE);
				setState(442); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(441); struct_declaration();
					}
					}
					setState(444); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << SHORT) | (1L << SIGNED) | (1L << STRUCT) | (1L << UNION) | (1L << UNSIGNED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOID - 64)) | (1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
				setState(446); instance_variables();
				setState(447); match(RBRACE);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(449); match(LBRACE);
				setState(450); visibility_specification();
				setState(452); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(451); struct_declaration();
					}
					}
					setState(454); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << SHORT) | (1L << SIGNED) | (1L << STRUCT) | (1L << UNION) | (1L << UNSIGNED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOID - 64)) | (1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
				setState(456); instance_variables();
				setState(457); match(RBRACE);
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

	public static class Visibility_specificationContext extends ParserRuleContext {
		public Visibility_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibility_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterVisibility_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitVisibility_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitVisibility_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Visibility_specificationContext visibility_specification() throws RecognitionException {
		Visibility_specificationContext _localctx = new Visibility_specificationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_visibility_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PACKAGE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Interface_declaration_listContext extends ParserRuleContext {
		public Instance_method_declarationContext instance_method_declaration(int i) {
			return getRuleContext(Instance_method_declarationContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public Class_method_declarationContext class_method_declaration(int i) {
			return getRuleContext(Class_method_declarationContext.class,i);
		}
		public Property_declarationContext property_declaration(int i) {
			return getRuleContext(Property_declarationContext.class,i);
		}
		public List<Instance_method_declarationContext> instance_method_declaration() {
			return getRuleContexts(Instance_method_declarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<Property_declarationContext> property_declaration() {
			return getRuleContexts(Property_declarationContext.class);
		}
		public List<Class_method_declarationContext> class_method_declaration() {
			return getRuleContexts(Class_method_declarationContext.class);
		}
		public Interface_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInterface_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInterface_declaration_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitInterface_declaration_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_declaration_listContext interface_declaration_list() throws RecognitionException {
		Interface_declaration_listContext _localctx = new Interface_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_interface_declaration_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(467); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(467);
					switch (_input.LA(1)) {
					case AUTO:
					case BYCOPY:
					case BYREF:
					case CHAR:
					case CONST:
					case DOUBLE:
					case ENUM:
					case EXTERN:
					case FLOAT:
					case ID:
					case IN:
					case INOUT:
					case INSTANCETYPE:
					case INT:
					case LONG:
					case ONEWAY:
					case OUT:
					case REGISTER:
					case SHORT:
					case SIGNED:
					case STATIC:
					case STRUCT:
					case TYPEDEF:
					case UNION:
					case UNSIGNED:
					case VOID:
					case VOLATILE:
					case NS_OPTIONS:
					case NS_ENUM:
					case WWEAK:
					case WUNSAFE_UNRETAINED:
					case IDENTIFIER:
						{
						setState(463); declaration();
						}
						break;
					case ADD:
						{
						setState(464); class_method_declaration();
						}
						break;
					case SUB:
						{
						setState(465); instance_method_declaration();
						}
						break;
					case PROPERTY:
						{
						setState(466); property_declaration();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(469); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
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

	public static class Class_method_declarationContext extends ParserRuleContext {
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Class_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterClass_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitClass_method_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitClass_method_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_method_declarationContext class_method_declaration() throws RecognitionException {
		Class_method_declarationContext _localctx = new Class_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_class_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(471); match(ADD);
			setState(472); method_declaration();
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

	public static class Instance_method_declarationContext extends ParserRuleContext {
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Instance_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instance_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInstance_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInstance_method_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitInstance_method_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instance_method_declarationContext instance_method_declaration() throws RecognitionException {
		Instance_method_declarationContext _localctx = new Instance_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_instance_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(474); match(SUB);
			setState(475); method_declaration();
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

	public static class Method_declarationContext extends ParserRuleContext {
		public Method_typeContext method_type() {
			return getRuleContext(Method_typeContext.class,0);
		}
		public Method_selectorContext method_selector() {
			return getRuleContext(Method_selectorContext.class,0);
		}
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMethod_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMethod_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitMethod_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(477); method_type();
				}
			}

			setState(480); method_selector();
			setState(481); match(SEMI);
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

	public static class Implementation_definition_listContext extends ParserRuleContext {
		public List<Class_method_definitionContext> class_method_definition() {
			return getRuleContexts(Class_method_definitionContext.class);
		}
		public Instance_method_definitionContext instance_method_definition(int i) {
			return getRuleContext(Instance_method_definitionContext.class,i);
		}
		public Class_method_definitionContext class_method_definition(int i) {
			return getRuleContext(Class_method_definitionContext.class,i);
		}
		public List<Function_definitionContext> function_definition() {
			return getRuleContexts(Function_definitionContext.class);
		}
		public Property_implementationContext property_implementation(int i) {
			return getRuleContext(Property_implementationContext.class,i);
		}
		public List<Property_implementationContext> property_implementation() {
			return getRuleContexts(Property_implementationContext.class);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public Function_definitionContext function_definition(int i) {
			return getRuleContext(Function_definitionContext.class,i);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<Instance_method_definitionContext> instance_method_definition() {
			return getRuleContexts(Instance_method_definitionContext.class);
		}
		public Implementation_definition_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementation_definition_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterImplementation_definition_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitImplementation_definition_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitImplementation_definition_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Implementation_definition_listContext implementation_definition_list() throws RecognitionException {
		Implementation_definition_listContext _localctx = new Implementation_definition_listContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_implementation_definition_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(488);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(483); function_definition();
					}
					break;

				case 2:
					{
					setState(484); declaration();
					}
					break;

				case 3:
					{
					setState(485); class_method_definition();
					}
					break;

				case 4:
					{
					setState(486); instance_method_definition();
					}
					break;

				case 5:
					{
					setState(487); property_implementation();
					}
					break;
				}
				}
				setState(490); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DYNAMIC) | (1L << SYNTHESIZE) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOID - 64)) | (1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (LPAREN - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (MUL - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
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

	public static class Class_method_definitionContext extends ParserRuleContext {
		public Method_definitionContext method_definition() {
			return getRuleContext(Method_definitionContext.class,0);
		}
		public Class_method_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_method_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterClass_method_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitClass_method_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitClass_method_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_method_definitionContext class_method_definition() throws RecognitionException {
		Class_method_definitionContext _localctx = new Class_method_definitionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_class_method_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(492); match(ADD);
			setState(493); method_definition();
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

	public static class Instance_method_definitionContext extends ParserRuleContext {
		public Method_definitionContext method_definition() {
			return getRuleContext(Method_definitionContext.class,0);
		}
		public Instance_method_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instance_method_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInstance_method_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInstance_method_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitInstance_method_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instance_method_definitionContext instance_method_definition() throws RecognitionException {
		Instance_method_definitionContext _localctx = new Instance_method_definitionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_instance_method_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(495); match(SUB);
			setState(496); method_definition();
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

	public static class Method_definitionContext extends ParserRuleContext {
		public Method_typeContext method_type() {
			return getRuleContext(Method_typeContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public Method_selectorContext method_selector() {
			return getRuleContext(Method_selectorContext.class,0);
		}
		public Method_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMethod_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMethod_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitMethod_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_definitionContext method_definition() throws RecognitionException {
		Method_definitionContext _localctx = new Method_definitionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_method_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(498); method_type();
				}
			}

			setState(501); method_selector();
			setState(503);
			_la = _input.LA(1);
			if (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LPAREN - 71)) | (1L << (MUL - 71)) | (1L << (IDENTIFIER - 71)))) != 0)) {
				{
				setState(502); init_declarator_list();
				}
			}

			setState(506);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(505); match(SEMI);
				}
			}

			setState(508); compound_statement();
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

	public static class Method_selectorContext extends ParserRuleContext {
		public List<Keyword_declaratorContext> keyword_declarator() {
			return getRuleContexts(Keyword_declaratorContext.class);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public Keyword_declaratorContext keyword_declarator(int i) {
			return getRuleContext(Keyword_declaratorContext.class,i);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Method_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMethod_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMethod_selector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitMethod_selector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_selectorContext method_selector() throws RecognitionException {
		Method_selectorContext _localctx = new Method_selectorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_method_selector);
		try {
			int _alt;
			setState(519);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(510); selector();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(512); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(511); keyword_declarator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(514); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
				setState(517);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(516); parameter_list();
					}
					break;
				}
				}
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

	public static class Keyword_declaratorContext extends ParserRuleContext {
		public List<Method_typeContext> method_type() {
			return getRuleContexts(Method_typeContext.class);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public Method_typeContext method_type(int i) {
			return getRuleContext(Method_typeContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Keyword_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterKeyword_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitKeyword_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitKeyword_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Keyword_declaratorContext keyword_declarator() throws RecognitionException {
		Keyword_declaratorContext _localctx = new Keyword_declaratorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_keyword_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(521); selector();
				}
			}

			setState(524); match(COLON);
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(525); method_type();
				}
				}
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(531); match(IDENTIFIER);
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

	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533); match(IDENTIFIER);
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

	public static class Method_typeContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Method_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMethod_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMethod_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitMethod_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_typeContext method_type() throws RecognitionException {
		Method_typeContext _localctx = new Method_typeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_method_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535); match(LPAREN);
			setState(536); type_name();
			setState(537); match(RPAREN);
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

	public static class Property_implementationContext extends ParserRuleContext {
		public Property_synthesize_listContext property_synthesize_list() {
			return getRuleContext(Property_synthesize_listContext.class,0);
		}
		public Property_implementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_implementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProperty_implementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProperty_implementation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitProperty_implementation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_implementationContext property_implementation() throws RecognitionException {
		Property_implementationContext _localctx = new Property_implementationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_property_implementation);
		try {
			setState(547);
			switch (_input.LA(1)) {
			case SYNTHESIZE:
				enterOuterAlt(_localctx, 1);
				{
				setState(539); match(SYNTHESIZE);
				setState(540); property_synthesize_list();
				setState(541); match(SEMI);
				}
				break;
			case DYNAMIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(543); match(DYNAMIC);
				setState(544); property_synthesize_list();
				setState(545); match(SEMI);
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

	public static class Property_synthesize_listContext extends ParserRuleContext {
		public List<Property_synthesize_itemContext> property_synthesize_item() {
			return getRuleContexts(Property_synthesize_itemContext.class);
		}
		public Property_synthesize_itemContext property_synthesize_item(int i) {
			return getRuleContext(Property_synthesize_itemContext.class,i);
		}
		public Property_synthesize_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_synthesize_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProperty_synthesize_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProperty_synthesize_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitProperty_synthesize_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_synthesize_listContext property_synthesize_list() throws RecognitionException {
		Property_synthesize_listContext _localctx = new Property_synthesize_listContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_property_synthesize_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549); property_synthesize_item();
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(550); match(COMMA);
				setState(551); property_synthesize_item();
				}
				}
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Property_synthesize_itemContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ObjCParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ObjCParser.IDENTIFIER); }
		public Property_synthesize_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_synthesize_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProperty_synthesize_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProperty_synthesize_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitProperty_synthesize_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_synthesize_itemContext property_synthesize_item() throws RecognitionException {
		Property_synthesize_itemContext _localctx = new Property_synthesize_itemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_property_synthesize_item);
		try {
			setState(561);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(557); match(IDENTIFIER);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(558); match(IDENTIFIER);
				setState(559); match(ASSIGN);
				setState(560); match(IDENTIFIER);
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

	public static class Block_typeContext extends ParserRuleContext {
		public List<Type_specifierContext> type_specifier() {
			return getRuleContexts(Type_specifierContext.class);
		}
		public Type_specifierContext type_specifier(int i) {
			return getRuleContext(Type_specifierContext.class,i);
		}
		public Block_parametersContext block_parameters() {
			return getRuleContext(Block_parametersContext.class,0);
		}
		public Block_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterBlock_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitBlock_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitBlock_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_typeContext block_type() throws RecognitionException {
		Block_typeContext _localctx = new Block_typeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_block_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563); type_specifier();
			setState(564); match(LPAREN);
			setState(565); match(CARET);
			setState(567);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << DOUBLE) | (1L << ENUM) | (1L << FLOAT) | (1L << ID) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << SIGNED) | (1L << STRUCT) | (1L << UNION) | (1L << UNSIGNED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOID - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(566); type_specifier();
				}
			}

			setState(569); match(RPAREN);
			setState(571);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(570); block_parameters();
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

	public static class Generics_specifierContext extends ParserRuleContext {
		public List<Type_specifierContext> type_specifier() {
			return getRuleContexts(Type_specifierContext.class);
		}
		public Type_specifierContext type_specifier(int i) {
			return getRuleContext(Type_specifierContext.class,i);
		}
		public Generics_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generics_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterGenerics_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitGenerics_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitGenerics_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generics_specifierContext generics_specifier() throws RecognitionException {
		Generics_specifierContext _localctx = new Generics_specifierContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_generics_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573); match(LT);
			setState(575);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << DOUBLE) | (1L << ENUM) | (1L << FLOAT) | (1L << ID) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << SIGNED) | (1L << STRUCT) | (1L << UNION) | (1L << UNSIGNED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOID - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(574); type_specifier();
				}
			}

			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(577); match(COMMA);
				setState(578); type_specifier();
				}
				}
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(584); match(GT);
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

	public static class Type_specifierContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public Protocol_reference_listContext protocol_reference_list() {
			return getRuleContext(Protocol_reference_listContext.class,0);
		}
		public Struct_or_union_specifierContext struct_or_union_specifier() {
			return getRuleContext(Struct_or_union_specifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Generics_specifierContext generics_specifier() {
			return getRuleContext(Generics_specifierContext.class,0);
		}
		public Enum_specifierContext enum_specifier() {
			return getRuleContext(Enum_specifierContext.class,0);
		}
		public Type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterType_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitType_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitType_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_specifierContext type_specifier() throws RecognitionException {
		Type_specifierContext _localctx = new Type_specifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_type_specifier);
		int _la;
		try {
			setState(610);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(586); match(VOID);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(587); match(CHAR);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(588); match(SHORT);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(589); match(INT);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(590); match(LONG);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(591); match(FLOAT);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(592); match(DOUBLE);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(593); match(SIGNED);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(594); match(UNSIGNED);
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(595); match(INSTANCETYPE);
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(596); match(ID);
				setState(598);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(597); protocol_reference_list();
					}
				}

				}
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(600); class_name();
				setState(603);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(601); protocol_reference_list();
					}
					break;

				case 2:
					{
					setState(602); generics_specifier();
					}
					break;
				}
				}
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(605); struct_or_union_specifier();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(606); enum_specifier();
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(607); match(IDENTIFIER);
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(608); match(IDENTIFIER);
				setState(609); pointer();
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

	public static class Type_qualifierContext extends ParserRuleContext {
		public Protocol_qualifierContext protocol_qualifier() {
			return getRuleContext(Protocol_qualifierContext.class,0);
		}
		public Type_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterType_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitType_qualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitType_qualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_qualifierContext type_qualifier() throws RecognitionException {
		Type_qualifierContext _localctx = new Type_qualifierContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_type_qualifier);
		try {
			setState(615);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(612); match(CONST);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(613); match(VOLATILE);
				}
				break;
			case BYCOPY:
			case BYREF:
			case IN:
			case INOUT:
			case ONEWAY:
			case OUT:
				enterOuterAlt(_localctx, 3);
				{
				setState(614); protocol_qualifier();
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

	public static class Protocol_qualifierContext extends ParserRuleContext {
		public Protocol_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProtocol_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProtocol_qualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitProtocol_qualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_qualifierContext protocol_qualifier() throws RecognitionException {
		Protocol_qualifierContext _localctx = new Protocol_qualifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_protocol_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYCOPY) | (1L << BYREF) | (1L << IN) | (1L << INOUT) | (1L << ONEWAY) | (1L << OUT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Primary_expressionContext extends ParserRuleContext {
		public Dictionary_expressionContext dictionary_expression() {
			return getRuleContext(Dictionary_expressionContext.class,0);
		}
		public Box_expressionContext box_expression() {
			return getRuleContext(Box_expressionContext.class,0);
		}
		public Block_expressionContext block_expression() {
			return getRuleContext(Block_expressionContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Selector_expressionContext selector_expression() {
			return getRuleContext(Selector_expressionContext.class,0);
		}
		public Encode_expressionContext encode_expression() {
			return getRuleContext(Encode_expressionContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ObjCParser.STRING_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_expressionContext array_expression() {
			return getRuleContext(Array_expressionContext.class,0);
		}
		public Message_expressionContext message_expression() {
			return getRuleContext(Message_expressionContext.class,0);
		}
		public Protocol_expressionContext protocol_expression() {
			return getRuleContext(Protocol_expressionContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitPrimary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_primary_expression);
		try {
			setState(636);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(619); match(IDENTIFIER);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(620); constant();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(621); match(STRING_LITERAL);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(622); match(LPAREN);
				setState(623); expression();
				setState(624); match(RPAREN);
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(626); match(SELF);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(627); match(SUPER);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(628); message_expression();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(629); selector_expression();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(630); protocol_expression();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(631); encode_expression();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(632); dictionary_expression();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(633); array_expression();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(634); box_expression();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(635); block_expression();
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

	public static class Dictionary_pairContext extends ParserRuleContext {
		public List<Postfix_expressionContext> postfix_expression() {
			return getRuleContexts(Postfix_expressionContext.class);
		}
		public Postfix_expressionContext postfix_expression(int i) {
			return getRuleContext(Postfix_expressionContext.class,i);
		}
		public Dictionary_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDictionary_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDictionary_pair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitDictionary_pair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dictionary_pairContext dictionary_pair() throws RecognitionException {
		Dictionary_pairContext _localctx = new Dictionary_pairContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_dictionary_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638); postfix_expression();
			setState(639); match(COLON);
			setState(640); postfix_expression();
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

	public static class Dictionary_expressionContext extends ParserRuleContext {
		public List<Dictionary_pairContext> dictionary_pair() {
			return getRuleContexts(Dictionary_pairContext.class);
		}
		public Dictionary_pairContext dictionary_pair(int i) {
			return getRuleContext(Dictionary_pairContext.class,i);
		}
		public Dictionary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDictionary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDictionary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitDictionary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dictionary_expressionContext dictionary_expression() throws RecognitionException {
		Dictionary_expressionContext _localctx = new Dictionary_expressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_dictionary_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(642); match(AT);
			setState(643); match(LBRACE);
			setState(645);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LPAREN - 71)) | (1L << (LBRACK - 71)) | (1L << (AT - 71)) | (1L << (CARET - 71)) | (1L << (IDENTIFIER - 71)) | (1L << (CHARACTER_LITERAL - 71)) | (1L << (STRING_LITERAL - 71)) | (1L << (HEX_LITERAL - 71)) | (1L << (DECIMAL_LITERAL - 71)) | (1L << (OCTAL_LITERAL - 71)) | (1L << (FLOATING_POINT_LITERAL - 71)))) != 0)) {
				{
				setState(644); dictionary_pair();
				}
			}

			setState(651);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(647); match(COMMA);
					setState(648); dictionary_pair();
					}
					} 
				}
				setState(653);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			setState(655);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(654); match(COMMA);
				}
			}

			setState(657); match(RBRACE);
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

	public static class Array_expressionContext extends ParserRuleContext {
		public List<Postfix_expressionContext> postfix_expression() {
			return getRuleContexts(Postfix_expressionContext.class);
		}
		public Postfix_expressionContext postfix_expression(int i) {
			return getRuleContext(Postfix_expressionContext.class,i);
		}
		public Array_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterArray_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitArray_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitArray_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_expressionContext array_expression() throws RecognitionException {
		Array_expressionContext _localctx = new Array_expressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_array_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(659); match(AT);
			setState(660); match(LBRACK);
			setState(662);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LPAREN - 71)) | (1L << (LBRACK - 71)) | (1L << (AT - 71)) | (1L << (CARET - 71)) | (1L << (IDENTIFIER - 71)) | (1L << (CHARACTER_LITERAL - 71)) | (1L << (STRING_LITERAL - 71)) | (1L << (HEX_LITERAL - 71)) | (1L << (DECIMAL_LITERAL - 71)) | (1L << (OCTAL_LITERAL - 71)) | (1L << (FLOATING_POINT_LITERAL - 71)))) != 0)) {
				{
				setState(661); postfix_expression();
				}
			}

			setState(668);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(664); match(COMMA);
					setState(665); postfix_expression();
					}
					} 
				}
				setState(670);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(672);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(671); match(COMMA);
				}
			}

			setState(674); match(RBRACK);
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

	public static class Box_expressionContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Box_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_box_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterBox_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitBox_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitBox_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Box_expressionContext box_expression() throws RecognitionException {
		Box_expressionContext _localctx = new Box_expressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_box_expression);
		try {
			setState(683);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(676); match(AT);
				setState(677); match(LPAREN);
				setState(678); conditional_expression();
				setState(679); match(RPAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(681); match(AT);
				setState(682); constant();
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

	public static class Block_parametersContext extends ParserRuleContext {
		public Type_variable_declaratorContext type_variable_declarator(int i) {
			return getRuleContext(Type_variable_declaratorContext.class,i);
		}
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public List<Type_variable_declaratorContext> type_variable_declarator() {
			return getRuleContexts(Type_variable_declaratorContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
		}
		public Block_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterBlock_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitBlock_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitBlock_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_parametersContext block_parameters() throws RecognitionException {
		Block_parametersContext _localctx = new Block_parametersContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_block_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685); match(LPAREN);
			setState(689);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(686); type_variable_declarator();
				}
				break;

			case 2:
				{
				setState(687); type_name();
				}
				break;

			case 3:
				{
				setState(688); match(VOID);
				}
				break;
			}
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(691); match(COMMA);
				setState(694);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(692); type_variable_declarator();
					}
					break;

				case 2:
					{
					setState(693); type_name();
					}
					break;
				}
				}
				}
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(701); match(RPAREN);
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

	public static class Block_expressionContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Block_parametersContext block_parameters() {
			return getRuleContext(Block_parametersContext.class,0);
		}
		public Block_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterBlock_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitBlock_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitBlock_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_expressionContext block_expression() throws RecognitionException {
		Block_expressionContext _localctx = new Block_expressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_block_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703); match(CARET);
			setState(705);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << DOUBLE) | (1L << ENUM) | (1L << FLOAT) | (1L << ID) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << SIGNED) | (1L << STRUCT) | (1L << UNION) | (1L << UNSIGNED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOID - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(704); type_specifier();
				}
			}

			setState(708);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(707); block_parameters();
				}
			}

			setState(710); compound_statement();
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

	public static class Message_expressionContext extends ParserRuleContext {
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public Message_selectorContext message_selector() {
			return getRuleContext(Message_selectorContext.class,0);
		}
		public Message_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMessage_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMessage_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitMessage_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Message_expressionContext message_expression() throws RecognitionException {
		Message_expressionContext _localctx = new Message_expressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_message_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712); match(LBRACK);
			setState(713); receiver();
			setState(714); message_selector();
			setState(715); match(RBRACK);
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

	public static class ReceiverContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitReceiver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitReceiver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_receiver);
		try {
			setState(720);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(717); expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(718); class_name();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(719); match(SUPER);
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

	public static class Message_selectorContext extends ParserRuleContext {
		public List<Keyword_argumentContext> keyword_argument() {
			return getRuleContexts(Keyword_argumentContext.class);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public Keyword_argumentContext keyword_argument(int i) {
			return getRuleContext(Keyword_argumentContext.class,i);
		}
		public Message_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMessage_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMessage_selector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitMessage_selector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Message_selectorContext message_selector() throws RecognitionException {
		Message_selectorContext _localctx = new Message_selectorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_message_selector);
		int _la;
		try {
			setState(728);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(722); selector();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(724); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(723); keyword_argument();
					}
					}
					setState(726); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COLON || _la==IDENTIFIER );
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

	public static class Keyword_argumentContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Keyword_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterKeyword_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitKeyword_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitKeyword_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Keyword_argumentContext keyword_argument() throws RecognitionException {
		Keyword_argumentContext _localctx = new Keyword_argumentContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_keyword_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(730); selector();
				}
			}

			setState(733); match(COLON);
			setState(734); expression();
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

	public static class Selector_expressionContext extends ParserRuleContext {
		public Selector_nameContext selector_name() {
			return getRuleContext(Selector_nameContext.class,0);
		}
		public Selector_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSelector_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSelector_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitSelector_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selector_expressionContext selector_expression() throws RecognitionException {
		Selector_expressionContext _localctx = new Selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_selector_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736); match(SELECTOR);
			setState(737); match(LPAREN);
			setState(738); selector_name();
			setState(739); match(RPAREN);
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

	public static class Selector_nameContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public Selector_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSelector_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSelector_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitSelector_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selector_nameContext selector_name() throws RecognitionException {
		Selector_nameContext _localctx = new Selector_nameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_selector_name);
		int _la;
		try {
			setState(750);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(741); selector();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(746); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(743);
					_la = _input.LA(1);
					if (_la==IDENTIFIER) {
						{
						setState(742); selector();
						}
					}

					setState(745); match(COLON);
					}
					}
					setState(748); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COLON || _la==IDENTIFIER );
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

	public static class Protocol_expressionContext extends ParserRuleContext {
		public Protocol_nameContext protocol_name() {
			return getRuleContext(Protocol_nameContext.class,0);
		}
		public Protocol_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProtocol_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProtocol_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitProtocol_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_expressionContext protocol_expression() throws RecognitionException {
		Protocol_expressionContext _localctx = new Protocol_expressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_protocol_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752); match(PROTOCOL);
			setState(753); match(LPAREN);
			setState(754); protocol_name();
			setState(755); match(RPAREN);
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

	public static class Encode_expressionContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Encode_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encode_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterEncode_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitEncode_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitEncode_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Encode_expressionContext encode_expression() throws RecognitionException {
		Encode_expressionContext _localctx = new Encode_expressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_encode_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757); match(ENCODE);
			setState(758); match(LPAREN);
			setState(759); type_name();
			setState(760); match(RPAREN);
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

	public static class Type_variable_declaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public Type_variable_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_variable_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterType_variable_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitType_variable_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitType_variable_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_variable_declaratorContext type_variable_declarator() throws RecognitionException {
		Type_variable_declaratorContext _localctx = new Type_variable_declaratorContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_type_variable_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762); declaration_specifiers();
			setState(763); declarator();
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

	public static class Try_statementContext extends ParserRuleContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Try_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterTry_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitTry_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitTry_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_statementContext try_statement() throws RecognitionException {
		Try_statementContext _localctx = new Try_statementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_try_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765); match(TRY);
			setState(766); compound_statement();
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

	public static class Catch_statementContext extends ParserRuleContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Type_variable_declaratorContext type_variable_declarator() {
			return getRuleContext(Type_variable_declaratorContext.class,0);
		}
		public Catch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterCatch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitCatch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitCatch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_statementContext catch_statement() throws RecognitionException {
		Catch_statementContext _localctx = new Catch_statementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_catch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768); match(CATCH);
			setState(769); match(LPAREN);
			setState(770); type_variable_declarator();
			setState(771); match(RPAREN);
			setState(772); compound_statement();
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

	public static class Finally_statementContext extends ParserRuleContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Finally_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterFinally_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitFinally_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitFinally_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Finally_statementContext finally_statement() throws RecognitionException {
		Finally_statementContext _localctx = new Finally_statementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_finally_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774); match(FINALLY);
			setState(775); compound_statement();
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

	public static class Throw_statementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Throw_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throw_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterThrow_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitThrow_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitThrow_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Throw_statementContext throw_statement() throws RecognitionException {
		Throw_statementContext _localctx = new Throw_statementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_throw_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777); match(THROW);
			setState(778); match(LPAREN);
			setState(779); match(IDENTIFIER);
			setState(780); match(RPAREN);
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

	public static class Try_blockContext extends ParserRuleContext {
		public Catch_statementContext catch_statement(int i) {
			return getRuleContext(Catch_statementContext.class,i);
		}
		public List<Catch_statementContext> catch_statement() {
			return getRuleContexts(Catch_statementContext.class);
		}
		public Finally_statementContext finally_statement() {
			return getRuleContext(Finally_statementContext.class,0);
		}
		public Try_statementContext try_statement() {
			return getRuleContext(Try_statementContext.class,0);
		}
		public Try_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterTry_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitTry_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitTry_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_blockContext try_block() throws RecognitionException {
		Try_blockContext _localctx = new Try_blockContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_try_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782); try_statement();
			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(783); catch_statement();
				}
				}
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(790);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(789); finally_statement();
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

	public static class Synchronized_statementContext extends ParserRuleContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Synchronized_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronized_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSynchronized_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSynchronized_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitSynchronized_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Synchronized_statementContext synchronized_statement() throws RecognitionException {
		Synchronized_statementContext _localctx = new Synchronized_statementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_synchronized_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792); match(SYNCHRONIZED);
			setState(793); match(LPAREN);
			setState(794); primary_expression();
			setState(795); match(RPAREN);
			setState(796); compound_statement();
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

	public static class Autorelease_statementContext extends ParserRuleContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Autorelease_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autorelease_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAutorelease_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAutorelease_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitAutorelease_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Autorelease_statementContext autorelease_statement() throws RecognitionException {
		Autorelease_statementContext _localctx = new Autorelease_statementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_autorelease_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798); match(AUTORELEASEPOOL);
			setState(799); compound_statement();
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

	public static class Function_definitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitFunction_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitFunction_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(801); declaration_specifiers();
				}
				break;
			}
			setState(804); declarator();
			setState(805); compound_statement();
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

	public static class DeclarationContext extends ParserRuleContext {
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807); declaration_specifiers();
			setState(809);
			_la = _input.LA(1);
			if (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LPAREN - 71)) | (1L << (MUL - 71)) | (1L << (IDENTIFIER - 71)))) != 0)) {
				{
				setState(808); init_declarator_list();
				}
			}

			setState(811); match(SEMI);
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

	public static class Declaration_specifiersContext extends ParserRuleContext {
		public List<Type_specifierContext> type_specifier() {
			return getRuleContexts(Type_specifierContext.class);
		}
		public List<Storage_class_specifierContext> storage_class_specifier() {
			return getRuleContexts(Storage_class_specifierContext.class);
		}
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public List<Arc_behaviour_specifierContext> arc_behaviour_specifier() {
			return getRuleContexts(Arc_behaviour_specifierContext.class);
		}
		public Arc_behaviour_specifierContext arc_behaviour_specifier(int i) {
			return getRuleContext(Arc_behaviour_specifierContext.class,i);
		}
		public Type_specifierContext type_specifier(int i) {
			return getRuleContext(Type_specifierContext.class,i);
		}
		public Storage_class_specifierContext storage_class_specifier(int i) {
			return getRuleContext(Storage_class_specifierContext.class,i);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public Declaration_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_specifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDeclaration_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDeclaration_specifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitDeclaration_specifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_specifiersContext declaration_specifiers() throws RecognitionException {
		Declaration_specifiersContext _localctx = new Declaration_specifiersContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_declaration_specifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(817); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(817);
					switch (_input.LA(1)) {
					case WWEAK:
					case WUNSAFE_UNRETAINED:
						{
						setState(813); arc_behaviour_specifier();
						}
						break;
					case AUTO:
					case EXTERN:
					case REGISTER:
					case STATIC:
					case TYPEDEF:
						{
						setState(814); storage_class_specifier();
						}
						break;
					case CHAR:
					case DOUBLE:
					case ENUM:
					case FLOAT:
					case ID:
					case INSTANCETYPE:
					case INT:
					case LONG:
					case SHORT:
					case SIGNED:
					case STRUCT:
					case UNION:
					case UNSIGNED:
					case VOID:
					case NS_OPTIONS:
					case NS_ENUM:
					case IDENTIFIER:
						{
						setState(815); type_specifier();
						}
						break;
					case BYCOPY:
					case BYREF:
					case CONST:
					case IN:
					case INOUT:
					case ONEWAY:
					case OUT:
					case VOLATILE:
						{
						setState(816); type_qualifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(819); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
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

	public static class Arc_behaviour_specifierContext extends ParserRuleContext {
		public Arc_behaviour_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arc_behaviour_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterArc_behaviour_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitArc_behaviour_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitArc_behaviour_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arc_behaviour_specifierContext arc_behaviour_specifier() throws RecognitionException {
		Arc_behaviour_specifierContext _localctx = new Arc_behaviour_specifierContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_arc_behaviour_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			_la = _input.LA(1);
			if ( !(_la==WWEAK || _la==WUNSAFE_UNRETAINED) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Storage_class_specifierContext extends ParserRuleContext {
		public Storage_class_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storage_class_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterStorage_class_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitStorage_class_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitStorage_class_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Storage_class_specifierContext storage_class_specifier() throws RecognitionException {
		Storage_class_specifierContext _localctx = new Storage_class_specifierContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_storage_class_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO) | (1L << EXTERN) | (1L << REGISTER) | (1L << STATIC) | (1L << TYPEDEF))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Init_declarator_listContext extends ParserRuleContext {
		public Init_declaratorContext init_declarator(int i) {
			return getRuleContext(Init_declaratorContext.class,i);
		}
		public List<Init_declaratorContext> init_declarator() {
			return getRuleContexts(Init_declaratorContext.class);
		}
		public Init_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInit_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInit_declarator_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitInit_declarator_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_declarator_listContext init_declarator_list() throws RecognitionException {
		Init_declarator_listContext _localctx = new Init_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_init_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825); init_declarator();
			setState(830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(826); match(COMMA);
				setState(827); init_declarator();
				}
				}
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Init_declaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Init_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInit_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInit_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitInit_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_declaratorContext init_declarator() throws RecognitionException {
		Init_declaratorContext _localctx = new Init_declaratorContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_init_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833); declarator();
			setState(836);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(834); match(ASSIGN);
				setState(835); initializer();
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

	public static class Struct_or_union_specifierContext extends ParserRuleContext {
		public Struct_declarationContext struct_declaration(int i) {
			return getRuleContext(Struct_declarationContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public List<Struct_declarationContext> struct_declaration() {
			return getRuleContexts(Struct_declarationContext.class);
		}
		public Struct_or_union_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_or_union_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterStruct_or_union_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitStruct_or_union_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitStruct_or_union_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_or_union_specifierContext struct_or_union_specifier() throws RecognitionException {
		Struct_or_union_specifierContext _localctx = new Struct_or_union_specifierContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_struct_or_union_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			_la = _input.LA(1);
			if ( !(_la==STRUCT || _la==UNION) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(851);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(839); match(IDENTIFIER);
				}
				break;

			case 2:
				{
				setState(841);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(840); match(IDENTIFIER);
					}
				}

				setState(843); match(LBRACE);
				setState(845); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(844); struct_declaration();
					}
					}
					setState(847); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << SHORT) | (1L << SIGNED) | (1L << STRUCT) | (1L << UNION) | (1L << UNSIGNED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOID - 64)) | (1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
				setState(849); match(RBRACE);
				}
				break;
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

	public static class Struct_declarationContext extends ParserRuleContext {
		public Struct_declarator_listContext struct_declarator_list() {
			return getRuleContext(Struct_declarator_listContext.class,0);
		}
		public Specifier_qualifier_listContext specifier_qualifier_list() {
			return getRuleContext(Specifier_qualifier_listContext.class,0);
		}
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterStruct_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitStruct_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitStruct_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_struct_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853); specifier_qualifier_list();
			setState(854); struct_declarator_list();
			setState(855); match(SEMI);
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

	public static class Specifier_qualifier_listContext extends ParserRuleContext {
		public List<Type_specifierContext> type_specifier() {
			return getRuleContexts(Type_specifierContext.class);
		}
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public List<Arc_behaviour_specifierContext> arc_behaviour_specifier() {
			return getRuleContexts(Arc_behaviour_specifierContext.class);
		}
		public Arc_behaviour_specifierContext arc_behaviour_specifier(int i) {
			return getRuleContext(Arc_behaviour_specifierContext.class,i);
		}
		public Type_specifierContext type_specifier(int i) {
			return getRuleContext(Type_specifierContext.class,i);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public Specifier_qualifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifier_qualifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSpecifier_qualifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSpecifier_qualifier_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitSpecifier_qualifier_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Specifier_qualifier_listContext specifier_qualifier_list() throws RecognitionException {
		Specifier_qualifier_listContext _localctx = new Specifier_qualifier_listContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_specifier_qualifier_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(860); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(860);
					switch (_input.LA(1)) {
					case WWEAK:
					case WUNSAFE_UNRETAINED:
						{
						setState(857); arc_behaviour_specifier();
						}
						break;
					case CHAR:
					case DOUBLE:
					case ENUM:
					case FLOAT:
					case ID:
					case INSTANCETYPE:
					case INT:
					case LONG:
					case SHORT:
					case SIGNED:
					case STRUCT:
					case UNION:
					case UNSIGNED:
					case VOID:
					case NS_OPTIONS:
					case NS_ENUM:
					case IDENTIFIER:
						{
						setState(858); type_specifier();
						}
						break;
					case BYCOPY:
					case BYREF:
					case CONST:
					case IN:
					case INOUT:
					case ONEWAY:
					case OUT:
					case VOLATILE:
						{
						setState(859); type_qualifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(862); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
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

	public static class Struct_declarator_listContext extends ParserRuleContext {
		public List<Struct_declaratorContext> struct_declarator() {
			return getRuleContexts(Struct_declaratorContext.class);
		}
		public Struct_declaratorContext struct_declarator(int i) {
			return getRuleContext(Struct_declaratorContext.class,i);
		}
		public Struct_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterStruct_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitStruct_declarator_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitStruct_declarator_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_declarator_listContext struct_declarator_list() throws RecognitionException {
		Struct_declarator_listContext _localctx = new Struct_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_struct_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864); struct_declarator();
			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(865); match(COMMA);
				setState(866); struct_declarator();
				}
				}
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Struct_declaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Struct_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterStruct_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitStruct_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitStruct_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_declaratorContext struct_declarator() throws RecognitionException {
		Struct_declaratorContext _localctx = new Struct_declaratorContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_struct_declarator);
		int _la;
		try {
			setState(878);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(872); declarator();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(874);
				_la = _input.LA(1);
				if (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LPAREN - 71)) | (1L << (MUL - 71)) | (1L << (IDENTIFIER - 71)))) != 0)) {
					{
					setState(873); declarator();
					}
				}

				setState(876); match(COLON);
				setState(877); constant();
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

	public static class Enum_specifierContext extends ParserRuleContext {
		public Enumerator_listContext enumerator_list() {
			return getRuleContext(Enumerator_listContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Enum_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterEnum_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitEnum_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitEnum_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_specifierContext enum_specifier() throws RecognitionException {
		Enum_specifierContext _localctx = new Enum_specifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_enum_specifier);
		int _la;
		try {
			setState(918);
			switch (_input.LA(1)) {
			case ENUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(880); match(ENUM);
				setState(883);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(881); match(COLON);
					setState(882); type_name();
					}
				}

				setState(896);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(885); identifier();
					setState(890);
					switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
					case 1:
						{
						setState(886); match(LBRACE);
						setState(887); enumerator_list();
						setState(888); match(RBRACE);
						}
						break;
					}
					}
					break;
				case LBRACE:
					{
					setState(892); match(LBRACE);
					setState(893); enumerator_list();
					setState(894); match(RBRACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NS_OPTIONS:
				enterOuterAlt(_localctx, 2);
				{
				setState(898); match(NS_OPTIONS);
				setState(899); match(LPAREN);
				setState(900); type_name();
				setState(901); match(COMMA);
				setState(902); identifier();
				setState(903); match(RPAREN);
				setState(904); match(LBRACE);
				setState(905); enumerator_list();
				setState(906); match(RBRACE);
				}
				break;
			case NS_ENUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(908); match(NS_ENUM);
				setState(909); match(LPAREN);
				setState(910); type_name();
				setState(911); match(COMMA);
				setState(912); identifier();
				setState(913); match(RPAREN);
				setState(914); match(LBRACE);
				setState(915); enumerator_list();
				setState(916); match(RBRACE);
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

	public static class Enumerator_listContext extends ParserRuleContext {
		public List<EnumeratorContext> enumerator() {
			return getRuleContexts(EnumeratorContext.class);
		}
		public EnumeratorContext enumerator(int i) {
			return getRuleContext(EnumeratorContext.class,i);
		}
		public Enumerator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterEnumerator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitEnumerator_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitEnumerator_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enumerator_listContext enumerator_list() throws RecognitionException {
		Enumerator_listContext _localctx = new Enumerator_listContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_enumerator_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(920); enumerator();
			setState(925);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(921); match(COMMA);
					setState(922); enumerator();
					}
					} 
				}
				setState(927);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			}
			setState(929);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(928); match(COMMA);
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

	public static class EnumeratorContext extends ParserRuleContext {
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitEnumerator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitEnumerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_enumerator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931); identifier();
			setState(934);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(932); match(ASSIGN);
				setState(933); constant_expression();
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

	public static class PointerContext extends ParserRuleContext {
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_pointer);
		int _la;
		try {
			setState(945);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(936); match(MUL);
				setState(938);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(937); declaration_specifiers();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(940); match(MUL);
				setState(942);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOID - 64)) | (1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(941); declaration_specifiers();
					}
				}

				setState(944); pointer();
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

	public static class DeclaratorContext extends ParserRuleContext {
		public Direct_declaratorContext direct_declarator() {
			return getRuleContext(Direct_declaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			_la = _input.LA(1);
			if (_la==MUL) {
				{
				setState(947); pointer();
				}
			}

			setState(950); direct_declarator();
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

	public static class Direct_declaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Block_parametersContext block_parameters() {
			return getRuleContext(Block_parametersContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<Declarator_suffixContext> declarator_suffix() {
			return getRuleContexts(Declarator_suffixContext.class);
		}
		public Declarator_suffixContext declarator_suffix(int i) {
			return getRuleContext(Declarator_suffixContext.class,i);
		}
		public Direct_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direct_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDirect_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDirect_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitDirect_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Direct_declaratorContext direct_declarator() throws RecognitionException {
		Direct_declaratorContext _localctx = new Direct_declaratorContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_direct_declarator);
		int _la;
		try {
			int _alt;
			setState(975);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(952); identifier();
				setState(956);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(953); declarator_suffix();
						}
						} 
					}
					setState(958);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(959); match(LPAREN);
				setState(960); declarator();
				setState(961); match(RPAREN);
				setState(965);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(962); declarator_suffix();
						}
						} 
					}
					setState(967);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(968); match(LPAREN);
				setState(969); match(CARET);
				setState(971);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(970); identifier();
					}
				}

				setState(973); match(RPAREN);
				setState(974); block_parameters();
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

	public static class Declarator_suffixContext extends ParserRuleContext {
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Declarator_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDeclarator_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDeclarator_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitDeclarator_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declarator_suffixContext declarator_suffix() throws RecognitionException {
		Declarator_suffixContext _localctx = new Declarator_suffixContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_declarator_suffix);
		int _la;
		try {
			setState(987);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(977); match(LBRACK);
				setState(979);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LPAREN - 71)) | (1L << (LBRACK - 71)) | (1L << (AT - 71)) | (1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (SUB - 71)) | (1L << (MUL - 71)) | (1L << (BITAND - 71)) | (1L << (CARET - 71)) | (1L << (IDENTIFIER - 71)) | (1L << (CHARACTER_LITERAL - 71)) | (1L << (STRING_LITERAL - 71)) | (1L << (HEX_LITERAL - 71)) | (1L << (DECIMAL_LITERAL - 71)) | (1L << (OCTAL_LITERAL - 71)) | (1L << (FLOATING_POINT_LITERAL - 71)))) != 0)) {
					{
					setState(978); constant_expression();
					}
				}

				setState(981); match(RBRACK);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(982); match(LPAREN);
				setState(984);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOID - 64)) | (1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(983); parameter_list();
					}
				}

				setState(986); match(RPAREN);
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

	public static class Parameter_listContext extends ParserRuleContext {
		public Parameter_declaration_listContext parameter_declaration_list() {
			return getRuleContext(Parameter_declaration_listContext.class,0);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989); parameter_declaration_list();
			setState(992);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(990); match(COMMA);
				setState(991); match(ELIPSIS);
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

	public static class Parameter_declarationContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public Abstract_declaratorContext abstract_declarator() {
			return getRuleContext(Abstract_declaratorContext.class,0);
		}
		public Parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterParameter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitParameter_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitParameter_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_declarationContext parameter_declaration() throws RecognitionException {
		Parameter_declarationContext _localctx = new Parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_parameter_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994); declaration_specifiers();
			setState(999);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(996);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(995); declarator();
					}
					break;
				}
				}
				break;

			case 2:
				{
				setState(998); abstract_declarator();
				}
				break;
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

	public static class InitializerContext extends ParserRuleContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_initializer);
		int _la;
		try {
			int _alt;
			setState(1016);
			switch (_input.LA(1)) {
			case ENCODE:
			case PROTOCOL:
			case SELECTOR:
			case SUPER:
			case SELF:
			case SIZEOF:
			case LPAREN:
			case LBRACK:
			case AT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case SUB:
			case MUL:
			case BITAND:
			case CARET:
			case IDENTIFIER:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1001); assignment_expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1002); match(LBRACE);
				setState(1003); initializer();
				setState(1008);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1004); match(COMMA);
						setState(1005); initializer();
						}
						} 
					}
					setState(1010);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				}
				setState(1012);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1011); match(COMMA);
					}
				}

				setState(1014); match(RBRACE);
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

	public static class Type_nameContext extends ParserRuleContext {
		public Abstract_declaratorContext abstract_declarator() {
			return getRuleContext(Abstract_declaratorContext.class,0);
		}
		public Block_typeContext block_type() {
			return getRuleContext(Block_typeContext.class,0);
		}
		public Specifier_qualifier_listContext specifier_qualifier_list() {
			return getRuleContext(Specifier_qualifier_listContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_type_name);
		try {
			setState(1022);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1018); specifier_qualifier_list();
				setState(1019); abstract_declarator();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1021); block_type();
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

	public static class Abstract_declaratorContext extends ParserRuleContext {
		public Constant_expressionContext constant_expression(int i) {
			return getRuleContext(Constant_expressionContext.class,i);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public Abstract_declarator_suffixContext abstract_declarator_suffix(int i) {
			return getRuleContext(Abstract_declarator_suffixContext.class,i);
		}
		public List<Constant_expressionContext> constant_expression() {
			return getRuleContexts(Constant_expressionContext.class);
		}
		public Abstract_declaratorContext abstract_declarator() {
			return getRuleContext(Abstract_declaratorContext.class,0);
		}
		public List<Abstract_declarator_suffixContext> abstract_declarator_suffix() {
			return getRuleContexts(Abstract_declarator_suffixContext.class);
		}
		public Abstract_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAbstract_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAbstract_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitAbstract_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Abstract_declaratorContext abstract_declarator() throws RecognitionException {
		Abstract_declaratorContext _localctx = new Abstract_declaratorContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_abstract_declarator);
		int _la;
		try {
			int _alt;
			setState(1045);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1024); pointer();
				setState(1025); abstract_declarator();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1027); match(LPAREN);
				setState(1028); abstract_declarator();
				setState(1029); match(RPAREN);
				setState(1031); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1030); abstract_declarator_suffix();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1033); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
				} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1040); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1035); match(LBRACK);
					setState(1037);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LPAREN - 71)) | (1L << (LBRACK - 71)) | (1L << (AT - 71)) | (1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (SUB - 71)) | (1L << (MUL - 71)) | (1L << (BITAND - 71)) | (1L << (CARET - 71)) | (1L << (IDENTIFIER - 71)) | (1L << (CHARACTER_LITERAL - 71)) | (1L << (STRING_LITERAL - 71)) | (1L << (HEX_LITERAL - 71)) | (1L << (DECIMAL_LITERAL - 71)) | (1L << (OCTAL_LITERAL - 71)) | (1L << (FLOATING_POINT_LITERAL - 71)))) != 0)) {
						{
						setState(1036); constant_expression();
						}
					}

					setState(1039); match(RBRACK);
					}
					}
					setState(1042); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACK );
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class Abstract_declarator_suffixContext extends ParserRuleContext {
		public Parameter_declaration_listContext parameter_declaration_list() {
			return getRuleContext(Parameter_declaration_listContext.class,0);
		}
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Abstract_declarator_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_declarator_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAbstract_declarator_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAbstract_declarator_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitAbstract_declarator_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Abstract_declarator_suffixContext abstract_declarator_suffix() throws RecognitionException {
		Abstract_declarator_suffixContext _localctx = new Abstract_declarator_suffixContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_abstract_declarator_suffix);
		int _la;
		try {
			setState(1057);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(1047); match(LBRACK);
				setState(1049);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LPAREN - 71)) | (1L << (LBRACK - 71)) | (1L << (AT - 71)) | (1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (SUB - 71)) | (1L << (MUL - 71)) | (1L << (BITAND - 71)) | (1L << (CARET - 71)) | (1L << (IDENTIFIER - 71)) | (1L << (CHARACTER_LITERAL - 71)) | (1L << (STRING_LITERAL - 71)) | (1L << (HEX_LITERAL - 71)) | (1L << (DECIMAL_LITERAL - 71)) | (1L << (OCTAL_LITERAL - 71)) | (1L << (FLOATING_POINT_LITERAL - 71)))) != 0)) {
					{
					setState(1048); constant_expression();
					}
				}

				setState(1051); match(RBRACK);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1052); match(LPAREN);
				setState(1054);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOID - 64)) | (1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1053); parameter_declaration_list();
					}
				}

				setState(1056); match(RPAREN);
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

	public static class Parameter_declaration_listContext extends ParserRuleContext {
		public List<Parameter_declarationContext> parameter_declaration() {
			return getRuleContexts(Parameter_declarationContext.class);
		}
		public Parameter_declarationContext parameter_declaration(int i) {
			return getRuleContext(Parameter_declarationContext.class,i);
		}
		public Parameter_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterParameter_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitParameter_declaration_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitParameter_declaration_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_declaration_listContext parameter_declaration_list() throws RecognitionException {
		Parameter_declaration_listContext _localctx = new Parameter_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_parameter_declaration_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1059); parameter_declaration();
			setState(1064);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1060); match(COMMA);
					setState(1061); parameter_declaration();
					}
					} 
				}
				setState(1066);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
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

	public static class Statement_listContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitStatement_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitStatement_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1068); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1067); statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1070); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
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

	public static class StatementContext extends ParserRuleContext {
		public Selection_statementContext selection_statement() {
			return getRuleContext(Selection_statementContext.class,0);
		}
		public Autorelease_statementContext autorelease_statement() {
			return getRuleContext(Autorelease_statementContext.class,0);
		}
		public Labeled_statementContext labeled_statement() {
			return getRuleContext(Labeled_statementContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Try_blockContext try_block() {
			return getRuleContext(Try_blockContext.class,0);
		}
		public Jump_statementContext jump_statement() {
			return getRuleContext(Jump_statementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Synchronized_statementContext synchronized_statement() {
			return getRuleContext(Synchronized_statementContext.class,0);
		}
		public Iteration_statementContext iteration_statement() {
			return getRuleContext(Iteration_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_statement);
		try {
			setState(1084);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1072); labeled_statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1073); expression();
				setState(1074); match(SEMI);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1076); compound_statement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1077); selection_statement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1078); iteration_statement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1079); jump_statement();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1080); synchronized_statement();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1081); autorelease_statement();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1082); try_block();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1083); match(SEMI);
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

	public static class Labeled_statementContext extends ParserRuleContext {
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Labeled_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterLabeled_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitLabeled_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitLabeled_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Labeled_statementContext labeled_statement() throws RecognitionException {
		Labeled_statementContext _localctx = new Labeled_statementContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_labeled_statement);
		try {
			setState(1098);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1086); identifier();
				setState(1087); match(COLON);
				setState(1088); statement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1090); match(CASE);
				setState(1091); constant_expression();
				setState(1092); match(COLON);
				setState(1093); statement();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1095); match(DEFAULT);
				setState(1096); match(COLON);
				setState(1097); statement();
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

	public static class Compound_statementContext extends ParserRuleContext {
		public Statement_listContext statement_list(int i) {
			return getRuleContext(Statement_listContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<Statement_listContext> statement_list() {
			return getRuleContexts(Statement_listContext.class);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitCompound_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitCompound_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_compound_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100); match(LBRACE);
			setState(1105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTORELEASEPOOL) | (1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SYNCHRONIZED) | (1L << TRY) | (1L << SUPER) | (1L << SELF) | (1L << AUTO) | (1L << BREAK) | (1L << BYCOPY) | (1L << BYREF) | (1L << CASE) | (1L << CHAR) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << FOR) | (1L << ID) | (1L << IF) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << GOTO) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << RETURN) | (1L << SHORT) | (1L << SIGNED) | (1L << SIZEOF) | (1L << STATIC) | (1L << STRUCT) | (1L << SWITCH) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOID - 64)) | (1L << (VOLATILE - 64)) | (1L << (WHILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (SEMI - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (SUB - 64)) | (1L << (MUL - 64)) | (1L << (BITAND - 64)) | (1L << (CARET - 64)) | (1L << (IDENTIFIER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (CHARACTER_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (HEX_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (OCTAL_LITERAL - 128)) | (1L << (FLOATING_POINT_LITERAL - 128)))) != 0)) {
				{
				setState(1103);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1101); declaration();
					}
					break;

				case 2:
					{
					setState(1102); statement_list();
					}
					break;
				}
				}
				setState(1107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1108); match(RBRACE);
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

	public static class Selection_statementContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Selection_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSelection_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSelection_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitSelection_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selection_statementContext selection_statement() throws RecognitionException {
		Selection_statementContext _localctx = new Selection_statementContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_selection_statement);
		try {
			setState(1125);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(1110); match(IF);
				setState(1111); match(LPAREN);
				setState(1112); expression();
				setState(1113); match(RPAREN);
				setState(1114); statement();
				setState(1117);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(1115); match(ELSE);
					setState(1116); statement();
					}
					break;
				}
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1119); match(SWITCH);
				setState(1120); match(LPAREN);
				setState(1121); expression();
				setState(1122); match(RPAREN);
				setState(1123); statement();
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

	public static class For_in_statementContext extends ParserRuleContext {
		public Type_variable_declaratorContext type_variable_declarator() {
			return getRuleContext(Type_variable_declaratorContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_in_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_in_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterFor_in_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitFor_in_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitFor_in_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_in_statementContext for_in_statement() throws RecognitionException {
		For_in_statementContext _localctx = new For_in_statementContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_for_in_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127); match(FOR);
			setState(1128); match(LPAREN);
			setState(1129); type_variable_declarator();
			setState(1130); match(IN);
			setState(1132);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LPAREN - 71)) | (1L << (LBRACK - 71)) | (1L << (AT - 71)) | (1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (SUB - 71)) | (1L << (MUL - 71)) | (1L << (BITAND - 71)) | (1L << (CARET - 71)) | (1L << (IDENTIFIER - 71)) | (1L << (CHARACTER_LITERAL - 71)) | (1L << (STRING_LITERAL - 71)) | (1L << (HEX_LITERAL - 71)) | (1L << (DECIMAL_LITERAL - 71)) | (1L << (OCTAL_LITERAL - 71)) | (1L << (FLOATING_POINT_LITERAL - 71)))) != 0)) {
				{
				setState(1131); expression();
				}
			}

			setState(1134); match(RPAREN);
			setState(1135); statement();
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

	public static class For_statementContext extends ParserRuleContext {
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137); match(FOR);
			setState(1138); match(LPAREN);
			setState(1143);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				{
				setState(1139); declaration_specifiers();
				setState(1140); init_declarator_list();
				}
				}
				break;

			case 2:
				{
				setState(1142); expression();
				}
				break;
			}
			setState(1145); match(SEMI);
			setState(1147);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LPAREN - 71)) | (1L << (LBRACK - 71)) | (1L << (AT - 71)) | (1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (SUB - 71)) | (1L << (MUL - 71)) | (1L << (BITAND - 71)) | (1L << (CARET - 71)) | (1L << (IDENTIFIER - 71)) | (1L << (CHARACTER_LITERAL - 71)) | (1L << (STRING_LITERAL - 71)) | (1L << (HEX_LITERAL - 71)) | (1L << (DECIMAL_LITERAL - 71)) | (1L << (OCTAL_LITERAL - 71)) | (1L << (FLOATING_POINT_LITERAL - 71)))) != 0)) {
				{
				setState(1146); expression();
				}
			}

			setState(1149); match(SEMI);
			setState(1151);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LPAREN - 71)) | (1L << (LBRACK - 71)) | (1L << (AT - 71)) | (1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (SUB - 71)) | (1L << (MUL - 71)) | (1L << (BITAND - 71)) | (1L << (CARET - 71)) | (1L << (IDENTIFIER - 71)) | (1L << (CHARACTER_LITERAL - 71)) | (1L << (STRING_LITERAL - 71)) | (1L << (HEX_LITERAL - 71)) | (1L << (DECIMAL_LITERAL - 71)) | (1L << (OCTAL_LITERAL - 71)) | (1L << (FLOATING_POINT_LITERAL - 71)))) != 0)) {
				{
				setState(1150); expression();
				}
			}

			setState(1153); match(RPAREN);
			setState(1154); statement();
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

	public static class While_statementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156); match(WHILE);
			setState(1157); match(LPAREN);
			setState(1158); expression();
			setState(1159); match(RPAREN);
			setState(1160); statement();
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

	public static class Do_statementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Do_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDo_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDo_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitDo_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_statementContext do_statement() throws RecognitionException {
		Do_statementContext _localctx = new Do_statementContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_do_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1162); match(DO);
			setState(1163); statement();
			setState(1164); match(WHILE);
			setState(1165); match(LPAREN);
			setState(1166); expression();
			setState(1167); match(RPAREN);
			setState(1168); match(SEMI);
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

	public static class Iteration_statementContext extends ParserRuleContext {
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Do_statementContext do_statement() {
			return getRuleContext(Do_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public For_in_statementContext for_in_statement() {
			return getRuleContext(For_in_statementContext.class,0);
		}
		public Iteration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterIteration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitIteration_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitIteration_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iteration_statementContext iteration_statement() throws RecognitionException {
		Iteration_statementContext _localctx = new Iteration_statementContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_iteration_statement);
		try {
			setState(1174);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1170); while_statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1171); do_statement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1172); for_statement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1173); for_in_statement();
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

	public static class Jump_statementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterJump_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitJump_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitJump_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_jump_statement);
		int _la;
		try {
			setState(1189);
			switch (_input.LA(1)) {
			case GOTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(1176); match(GOTO);
				setState(1177); identifier();
				setState(1178); match(SEMI);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1180); match(CONTINUE);
				setState(1181); match(SEMI);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 3);
				{
				setState(1182); match(BREAK);
				setState(1183); match(SEMI);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1184); match(RETURN);
				setState(1186);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LPAREN - 71)) | (1L << (LBRACK - 71)) | (1L << (AT - 71)) | (1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (SUB - 71)) | (1L << (MUL - 71)) | (1L << (BITAND - 71)) | (1L << (CARET - 71)) | (1L << (IDENTIFIER - 71)) | (1L << (CHARACTER_LITERAL - 71)) | (1L << (STRING_LITERAL - 71)) | (1L << (HEX_LITERAL - 71)) | (1L << (DECIMAL_LITERAL - 71)) | (1L << (OCTAL_LITERAL - 71)) | (1L << (FLOATING_POINT_LITERAL - 71)))) != 0)) {
					{
					setState(1185); expression();
					}
				}

				setState(1188); match(SEMI);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<Assignment_expressionContext> assignment_expression() {
			return getRuleContexts(Assignment_expressionContext.class);
		}
		public Assignment_expressionContext assignment_expression(int i) {
			return getRuleContext(Assignment_expressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191); assignment_expression();
			setState(1196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1192); match(COMMA);
				setState(1193); assignment_expression();
				}
				}
				setState(1198);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Assignment_expressionContext extends ParserRuleContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAssignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAssignment_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitAssignment_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_assignment_expression);
		try {
			setState(1204);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1199); conditional_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1200); unary_expression();
				setState(1201); assignment_operator();
				setState(1202); assignment_expression();
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

	public static class Assignment_operatorContext extends ParserRuleContext {
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAssignment_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitAssignment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			_la = _input.LA(1);
			if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (ASSIGN - 82)) | (1L << (ADD_ASSIGN - 82)) | (1L << (SUB_ASSIGN - 82)) | (1L << (MUL_ASSIGN - 82)) | (1L << (DIV_ASSIGN - 82)) | (1L << (AND_ASSIGN - 82)) | (1L << (OR_ASSIGN - 82)) | (1L << (XOR_ASSIGN - 82)) | (1L << (MOD_ASSIGN - 82)) | (1L << (LSHIFT_ASSIGN - 82)) | (1L << (RSHIFT_ASSIGN - 82)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Conditional_expressionContext extends ParserRuleContext {
		public List<Conditional_expressionContext> conditional_expression() {
			return getRuleContexts(Conditional_expressionContext.class);
		}
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public Conditional_expressionContext conditional_expression(int i) {
			return getRuleContext(Conditional_expressionContext.class,i);
		}
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterConditional_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitConditional_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitConditional_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_conditional_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1208); logical_or_expression();
			setState(1214);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(1209); match(QUESTION);
				setState(1210); conditional_expression();
				setState(1211); match(COLON);
				setState(1212); conditional_expression();
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

	public static class Constant_expressionContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Constant_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterConstant_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitConstant_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitConstant_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_constant_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216); conditional_expression();
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

	public static class Logical_or_expressionContext extends ParserRuleContext {
		public Logical_and_expressionContext logical_and_expression(int i) {
			return getRuleContext(Logical_and_expressionContext.class,i);
		}
		public List<Logical_and_expressionContext> logical_and_expression() {
			return getRuleContexts(Logical_and_expressionContext.class);
		}
		public Logical_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterLogical_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitLogical_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitLogical_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_or_expressionContext logical_or_expression() throws RecognitionException {
		Logical_or_expressionContext _localctx = new Logical_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_logical_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218); logical_and_expression();
			setState(1223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(1219); match(OR);
				setState(1220); logical_and_expression();
				}
				}
				setState(1225);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Logical_and_expressionContext extends ParserRuleContext {
		public Inclusive_or_expressionContext inclusive_or_expression(int i) {
			return getRuleContext(Inclusive_or_expressionContext.class,i);
		}
		public List<Inclusive_or_expressionContext> inclusive_or_expression() {
			return getRuleContexts(Inclusive_or_expressionContext.class);
		}
		public Logical_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterLogical_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitLogical_and_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitLogical_and_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_and_expressionContext logical_and_expression() throws RecognitionException {
		Logical_and_expressionContext _localctx = new Logical_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_logical_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226); inclusive_or_expression();
			setState(1231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(1227); match(AND);
				setState(1228); inclusive_or_expression();
				}
				}
				setState(1233);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Inclusive_or_expressionContext extends ParserRuleContext {
		public List<Exclusive_or_expressionContext> exclusive_or_expression() {
			return getRuleContexts(Exclusive_or_expressionContext.class);
		}
		public Exclusive_or_expressionContext exclusive_or_expression(int i) {
			return getRuleContext(Exclusive_or_expressionContext.class,i);
		}
		public Inclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInclusive_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitInclusive_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234); exclusive_or_expression();
			setState(1239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1235); match(BITOR);
				setState(1236); exclusive_or_expression();
				}
				}
				setState(1241);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Exclusive_or_expressionContext extends ParserRuleContext {
		public And_expressionContext and_expression(int i) {
			return getRuleContext(And_expressionContext.class,i);
		}
		public List<And_expressionContext> and_expression() {
			return getRuleContexts(And_expressionContext.class);
		}
		public Exclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterExclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitExclusive_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitExclusive_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1242); and_expression();
			setState(1247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(1243); match(CARET);
				setState(1244); and_expression();
				}
				}
				setState(1249);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class And_expressionContext extends ParserRuleContext {
		public Equality_expressionContext equality_expression(int i) {
			return getRuleContext(Equality_expressionContext.class,i);
		}
		public List<Equality_expressionContext> equality_expression() {
			return getRuleContexts(Equality_expressionContext.class);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAnd_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitAnd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1250); equality_expression();
			setState(1255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(1251); match(BITAND);
				setState(1252); equality_expression();
				}
				}
				setState(1257);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Equality_expressionContext extends ParserRuleContext {
		public List<Relational_expressionContext> relational_expression() {
			return getRuleContexts(Relational_expressionContext.class);
		}
		public Relational_expressionContext relational_expression(int i) {
			return getRuleContext(Relational_expressionContext.class,i);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitEquality_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitEquality_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258); relational_expression();
			setState(1263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL || _la==NOTEQUAL) {
				{
				{
				setState(1259);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1260); relational_expression();
				}
				}
				setState(1265);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Relational_expressionContext extends ParserRuleContext {
		public List<Shift_expressionContext> shift_expression() {
			return getRuleContexts(Shift_expressionContext.class);
		}
		public Shift_expressionContext shift_expression(int i) {
			return getRuleContext(Shift_expressionContext.class,i);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitRelational_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitRelational_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266); shift_expression();
			setState(1271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (GT - 83)) | (1L << (LT - 83)) | (1L << (LE - 83)) | (1L << (GE - 83)))) != 0)) {
				{
				{
				setState(1267);
				_la = _input.LA(1);
				if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (GT - 83)) | (1L << (LT - 83)) | (1L << (LE - 83)) | (1L << (GE - 83)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1268); shift_expression();
				}
				}
				setState(1273);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Shift_expressionContext extends ParserRuleContext {
		public Additive_expressionContext additive_expression(int i) {
			return getRuleContext(Additive_expressionContext.class,i);
		}
		public List<Additive_expressionContext> additive_expression() {
			return getRuleContexts(Additive_expressionContext.class);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitShift_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitShift_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1274); additive_expression();
			setState(1279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SHIFT_R || _la==SHIFT_L) {
				{
				{
				setState(1275);
				_la = _input.LA(1);
				if ( !(_la==SHIFT_R || _la==SHIFT_L) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1276); additive_expression();
				}
				}
				setState(1281);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Additive_expressionContext extends ParserRuleContext {
		public Multiplicative_expressionContext multiplicative_expression(int i) {
			return getRuleContext(Multiplicative_expressionContext.class,i);
		}
		public List<Multiplicative_expressionContext> multiplicative_expression() {
			return getRuleContexts(Multiplicative_expressionContext.class);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAdditive_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitAdditive_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1282); multiplicative_expression();
			setState(1287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(1283);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1284); multiplicative_expression();
				}
				}
				setState(1289);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public Cast_expressionContext cast_expression(int i) {
			return getRuleContext(Cast_expressionContext.class,i);
		}
		public List<Cast_expressionContext> cast_expression() {
			return getRuleContexts(Cast_expressionContext.class);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMultiplicative_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitMultiplicative_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290); cast_expression();
			setState(1295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (MUL - 99)) | (1L << (DIV - 99)) | (1L << (MOD - 99)))) != 0)) {
				{
				{
				setState(1291);
				_la = _input.LA(1);
				if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (MUL - 99)) | (1L << (DIV - 99)) | (1L << (MOD - 99)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1292); cast_expression();
				}
				}
				setState(1297);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Cast_expressionContext extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Cast_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterCast_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitCast_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitCast_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_cast_expression);
		try {
			setState(1304);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1298); match(LPAREN);
				setState(1299); type_name();
				setState(1300); match(RPAREN);
				setState(1301); cast_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1303); unary_expression();
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

	public static class Unary_expressionContext extends ParserRuleContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitUnary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_unary_expression);
		try {
			setState(1322);
			switch (_input.LA(1)) {
			case ENCODE:
			case PROTOCOL:
			case SELECTOR:
			case SUPER:
			case SELF:
			case LPAREN:
			case LBRACK:
			case AT:
			case CARET:
			case IDENTIFIER:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1306); postfix_expression();
				}
				break;
			case INC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1307); match(INC);
				setState(1308); unary_expression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1309); match(DEC);
				setState(1310); unary_expression();
				}
				break;
			case BANG:
			case TILDE:
			case SUB:
			case MUL:
			case BITAND:
				enterOuterAlt(_localctx, 4);
				{
				setState(1311); unary_operator();
				setState(1312); cast_expression();
				}
				break;
			case SIZEOF:
				enterOuterAlt(_localctx, 5);
				{
				setState(1314); match(SIZEOF);
				setState(1320);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1315); match(LPAREN);
					setState(1316); type_name();
					setState(1317); match(RPAREN);
					}
					break;

				case 2:
					{
					setState(1319); unary_expression();
					}
					break;
				}
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
			_la = _input.LA(1);
			if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (BANG - 85)) | (1L << (TILDE - 85)) | (1L << (SUB - 85)) | (1L << (MUL - 85)) | (1L << (BITAND - 85)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Postfix_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Argument_expression_listContext argument_expression_list(int i) {
			return getRuleContext(Argument_expression_listContext.class,i);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Argument_expression_listContext> argument_expression_list() {
			return getRuleContexts(Argument_expression_listContext.class);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterPostfix_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitPostfix_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitPostfix_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_postfix_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326); primary_expression();
			setState(1344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LPAREN - 71)) | (1L << (LBRACK - 71)) | (1L << (DOT - 71)) | (1L << (STRUCTACCESS - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)))) != 0)) {
				{
				setState(1342);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1327); match(LBRACK);
					setState(1328); expression();
					setState(1329); match(RBRACK);
					}
					break;
				case LPAREN:
					{
					setState(1331); match(LPAREN);
					setState(1333);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LPAREN - 71)) | (1L << (LBRACK - 71)) | (1L << (AT - 71)) | (1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (SUB - 71)) | (1L << (MUL - 71)) | (1L << (BITAND - 71)) | (1L << (CARET - 71)) | (1L << (IDENTIFIER - 71)) | (1L << (CHARACTER_LITERAL - 71)) | (1L << (STRING_LITERAL - 71)) | (1L << (HEX_LITERAL - 71)) | (1L << (DECIMAL_LITERAL - 71)) | (1L << (OCTAL_LITERAL - 71)) | (1L << (FLOATING_POINT_LITERAL - 71)))) != 0)) {
						{
						setState(1332); argument_expression_list();
						}
					}

					setState(1335); match(RPAREN);
					}
					break;
				case DOT:
					{
					setState(1336); match(DOT);
					setState(1337); identifier();
					}
					break;
				case STRUCTACCESS:
					{
					setState(1338); match(STRUCTACCESS);
					setState(1339); identifier();
					}
					break;
				case INC:
					{
					setState(1340); match(INC);
					}
					break;
				case DEC:
					{
					setState(1341); match(DEC);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1346);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Argument_expression_listContext extends ParserRuleContext {
		public List<Assignment_expressionContext> assignment_expression() {
			return getRuleContexts(Assignment_expressionContext.class);
		}
		public Assignment_expressionContext assignment_expression(int i) {
			return getRuleContext(Assignment_expressionContext.class,i);
		}
		public Argument_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterArgument_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitArgument_expression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitArgument_expression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_expression_listContext argument_expression_list() throws RecognitionException {
		Argument_expression_listContext _localctx = new Argument_expression_listContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_argument_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1347); assignment_expression();
			setState(1352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1348); match(COMMA);
				setState(1349); assignment_expression();
				}
				}
				setState(1354);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1355); match(IDENTIFIER);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(ObjCParser.DECIMAL_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(ObjCParser.OCTAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(ObjCParser.HEX_LITERAL, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(ObjCParser.CHARACTER_LITERAL, 0); }
		public TerminalNode FLOATING_POINT_LITERAL() { return getToken(ObjCParser.FLOATING_POINT_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjCVisitor ) return ((ObjCVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357);
			_la = _input.LA(1);
			if ( !(((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (CHARACTER_LITERAL - 128)) | (1L << (HEX_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (OCTAL_LITERAL - 128)) | (1L << (FLOATING_POINT_LITERAL - 128)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0094\u0552\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\3\2\6\2\u00fe\n\2\r\2\16"+
		"\2\u00ff\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0110"+
		"\n\3\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u0118\n\5\3\5\5\5\u011b\n\5\3\5\5\5\u011e"+
		"\n\5\3\5\5\5\u0121\n\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u0129\n\6\3\6\3\6\5"+
		"\6\u012d\n\6\3\6\5\6\u0130\n\6\3\6\5\6\u0133\n\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\5\7\u013b\n\7\3\7\5\7\u013e\n\7\3\7\5\7\u0141\n\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u014b\n\b\3\b\3\b\3\t\3\t\3\t\5\t\u0152\n\t\3\t\5\t"+
		"\u0155\n\t\3\t\5\t\u0158\n\t\3\t\5\t\u015b\n\t\3\t\5\t\u015e\n\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u016d\n\f\f\f\16"+
		"\f\u0170\13\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u0179\n\16\f\16\16\16"+
		"\u017c\13\16\3\17\3\17\5\17\u0180\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\7\21\u018b\n\21\f\21\16\21\u018e\13\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01a0"+
		"\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\7\27\u01ac\n\27"+
		"\f\27\16\27\u01af\13\27\3\27\3\27\3\27\3\27\6\27\u01b5\n\27\r\27\16\27"+
		"\u01b6\3\27\3\27\3\27\3\27\6\27\u01bd\n\27\r\27\16\27\u01be\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\6\27\u01c7\n\27\r\27\16\27\u01c8\3\27\3\27\3\27\5"+
		"\27\u01ce\n\27\3\30\3\30\3\31\3\31\3\31\3\31\6\31\u01d6\n\31\r\31\16\31"+
		"\u01d7\3\32\3\32\3\32\3\33\3\33\3\33\3\34\5\34\u01e1\n\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\35\6\35\u01eb\n\35\r\35\16\35\u01ec\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3 \5 \u01f6\n \3 \3 \5 \u01fa\n \3 \5 \u01fd\n \3"+
		" \3 \3!\3!\6!\u0203\n!\r!\16!\u0204\3!\5!\u0208\n!\5!\u020a\n!\3\"\5\""+
		"\u020d\n\"\3\"\3\"\7\"\u0211\n\"\f\"\16\"\u0214\13\"\3\"\3\"\3#\3#\3$"+
		"\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0226\n%\3&\3&\3&\7&\u022b\n&\f&"+
		"\16&\u022e\13&\3\'\3\'\3\'\3\'\5\'\u0234\n\'\3(\3(\3(\3(\5(\u023a\n(\3"+
		"(\3(\5(\u023e\n(\3)\3)\5)\u0242\n)\3)\3)\7)\u0246\n)\f)\16)\u0249\13)"+
		"\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0259\n*\3*\3*\3*\5*\u025e"+
		"\n*\3*\3*\3*\3*\3*\5*\u0265\n*\3+\3+\3+\5+\u026a\n+\3,\3,\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u027f\n-\3.\3.\3.\3.\3/\3/"+
		"\3/\5/\u0288\n/\3/\3/\7/\u028c\n/\f/\16/\u028f\13/\3/\5/\u0292\n/\3/\3"+
		"/\3\60\3\60\3\60\5\60\u0299\n\60\3\60\3\60\7\60\u029d\n\60\f\60\16\60"+
		"\u02a0\13\60\3\60\5\60\u02a3\n\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\5\61\u02ae\n\61\3\62\3\62\3\62\3\62\5\62\u02b4\n\62\3\62\3\62"+
		"\3\62\5\62\u02b9\n\62\7\62\u02bb\n\62\f\62\16\62\u02be\13\62\3\62\3\62"+
		"\3\63\3\63\5\63\u02c4\n\63\3\63\5\63\u02c7\n\63\3\63\3\63\3\64\3\64\3"+
		"\64\3\64\3\64\3\65\3\65\3\65\5\65\u02d3\n\65\3\66\3\66\6\66\u02d7\n\66"+
		"\r\66\16\66\u02d8\5\66\u02db\n\66\3\67\5\67\u02de\n\67\3\67\3\67\3\67"+
		"\38\38\38\38\38\39\39\59\u02ea\n9\39\69\u02ed\n9\r9\169\u02ee\59\u02f1"+
		"\n9\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3>\3>\3>\3>"+
		"\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\7A\u0313\nA\fA\16A\u0316\13A\3A\5A\u0319"+
		"\nA\3B\3B\3B\3B\3B\3B\3C\3C\3C\3D\5D\u0325\nD\3D\3D\3D\3E\3E\5E\u032c"+
		"\nE\3E\3E\3F\3F\3F\3F\6F\u0334\nF\rF\16F\u0335\3G\3G\3H\3H\3I\3I\3I\7"+
		"I\u033f\nI\fI\16I\u0342\13I\3J\3J\3J\5J\u0347\nJ\3K\3K\3K\5K\u034c\nK"+
		"\3K\3K\6K\u0350\nK\rK\16K\u0351\3K\3K\5K\u0356\nK\3L\3L\3L\3L\3M\3M\3"+
		"M\6M\u035f\nM\rM\16M\u0360\3N\3N\3N\7N\u0366\nN\fN\16N\u0369\13N\3O\3"+
		"O\5O\u036d\nO\3O\3O\5O\u0371\nO\3P\3P\3P\5P\u0376\nP\3P\3P\3P\3P\3P\5"+
		"P\u037d\nP\3P\3P\3P\3P\5P\u0383\nP\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3"+
		"P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u0399\nP\3Q\3Q\3Q\7Q\u039e\nQ\fQ\16Q\u03a1"+
		"\13Q\3Q\5Q\u03a4\nQ\3R\3R\3R\5R\u03a9\nR\3S\3S\5S\u03ad\nS\3S\3S\5S\u03b1"+
		"\nS\3S\5S\u03b4\nS\3T\5T\u03b7\nT\3T\3T\3U\3U\7U\u03bd\nU\fU\16U\u03c0"+
		"\13U\3U\3U\3U\3U\7U\u03c6\nU\fU\16U\u03c9\13U\3U\3U\3U\5U\u03ce\nU\3U"+
		"\3U\5U\u03d2\nU\3V\3V\5V\u03d6\nV\3V\3V\3V\5V\u03db\nV\3V\5V\u03de\nV"+
		"\3W\3W\3W\5W\u03e3\nW\3X\3X\5X\u03e7\nX\3X\5X\u03ea\nX\3Y\3Y\3Y\3Y\3Y"+
		"\7Y\u03f1\nY\fY\16Y\u03f4\13Y\3Y\5Y\u03f7\nY\3Y\3Y\5Y\u03fb\nY\3Z\3Z\3"+
		"Z\3Z\5Z\u0401\nZ\3[\3[\3[\3[\3[\3[\3[\6[\u040a\n[\r[\16[\u040b\3[\3[\5"+
		"[\u0410\n[\3[\6[\u0413\n[\r[\16[\u0414\3[\5[\u0418\n[\3\\\3\\\5\\\u041c"+
		"\n\\\3\\\3\\\3\\\5\\\u0421\n\\\3\\\5\\\u0424\n\\\3]\3]\3]\7]\u0429\n]"+
		"\f]\16]\u042c\13]\3^\6^\u042f\n^\r^\16^\u0430\3_\3_\3_\3_\3_\3_\3_\3_"+
		"\3_\3_\3_\3_\5_\u043f\n_\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u044d"+
		"\n`\3a\3a\3a\7a\u0452\na\fa\16a\u0455\13a\3a\3a\3b\3b\3b\3b\3b\3b\3b\5"+
		"b\u0460\nb\3b\3b\3b\3b\3b\3b\5b\u0468\nb\3c\3c\3c\3c\3c\5c\u046f\nc\3"+
		"c\3c\3c\3d\3d\3d\3d\3d\3d\5d\u047a\nd\3d\3d\5d\u047e\nd\3d\3d\5d\u0482"+
		"\nd\3d\3d\3d\3e\3e\3e\3e\3e\3e\3f\3f\3f\3f\3f\3f\3f\3f\3g\3g\3g\3g\5g"+
		"\u0499\ng\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\5h\u04a5\nh\3h\5h\u04a8\nh\3i"+
		"\3i\3i\7i\u04ad\ni\fi\16i\u04b0\13i\3j\3j\3j\3j\3j\5j\u04b7\nj\3k\3k\3"+
		"l\3l\3l\3l\3l\3l\5l\u04c1\nl\3m\3m\3n\3n\3n\7n\u04c8\nn\fn\16n\u04cb\13"+
		"n\3o\3o\3o\7o\u04d0\no\fo\16o\u04d3\13o\3p\3p\3p\7p\u04d8\np\fp\16p\u04db"+
		"\13p\3q\3q\3q\7q\u04e0\nq\fq\16q\u04e3\13q\3r\3r\3r\7r\u04e8\nr\fr\16"+
		"r\u04eb\13r\3s\3s\3s\7s\u04f0\ns\fs\16s\u04f3\13s\3t\3t\3t\7t\u04f8\n"+
		"t\ft\16t\u04fb\13t\3u\3u\3u\7u\u0500\nu\fu\16u\u0503\13u\3v\3v\3v\7v\u0508"+
		"\nv\fv\16v\u050b\13v\3w\3w\3w\7w\u0510\nw\fw\16w\u0513\13w\3x\3x\3x\3"+
		"x\3x\3x\5x\u051b\nx\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\5y\u052b"+
		"\ny\5y\u052d\ny\3z\3z\3{\3{\3{\3{\3{\3{\3{\5{\u0538\n{\3{\3{\3{\3{\3{"+
		"\3{\3{\7{\u0541\n{\f{\16{\u0544\13{\3|\3|\3|\7|\u0549\n|\f|\16|\u054c"+
		"\13|\3}\3}\3~\3~\3~\2\2\177\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\2\20"+
		"\3\2\u0088\u0089\5\2\r\r\20\20\22\23\5\2\37 /\60\65\66\3\2GH\7\2\34\34"+
		"**\67\67<<??\4\2==@@\4\2TTmv\4\2[[^^\4\2UV\\]\3\2kl\3\2cd\4\2efjj\5\2"+
		"WXdegg\4\2\u0082\u0082\u0084\u0087\u05c5\2\u00fd\3\2\2\2\4\u010f\3\2\2"+
		"\2\6\u0111\3\2\2\2\b\u0113\3\2\2\2\n\u0124\3\2\2\2\f\u0136\3\2\2\2\16"+
		"\u0144\3\2\2\2\20\u014e\3\2\2\2\22\u0161\3\2\2\2\24\u0165\3\2\2\2\26\u0169"+
		"\3\2\2\2\30\u0171\3\2\2\2\32\u0175\3\2\2\2\34\u017d\3\2\2\2\36\u0183\3"+
		"\2\2\2 \u0187\3\2\2\2\"\u019f\3\2\2\2$\u01a1\3\2\2\2&\u01a3\3\2\2\2(\u01a5"+
		"\3\2\2\2*\u01a7\3\2\2\2,\u01cd\3\2\2\2.\u01cf\3\2\2\2\60\u01d5\3\2\2\2"+
		"\62\u01d9\3\2\2\2\64\u01dc\3\2\2\2\66\u01e0\3\2\2\28\u01ea\3\2\2\2:\u01ee"+
		"\3\2\2\2<\u01f1\3\2\2\2>\u01f5\3\2\2\2@\u0209\3\2\2\2B\u020c\3\2\2\2D"+
		"\u0217\3\2\2\2F\u0219\3\2\2\2H\u0225\3\2\2\2J\u0227\3\2\2\2L\u0233\3\2"+
		"\2\2N\u0235\3\2\2\2P\u023f\3\2\2\2R\u0264\3\2\2\2T\u0269\3\2\2\2V\u026b"+
		"\3\2\2\2X\u027e\3\2\2\2Z\u0280\3\2\2\2\\\u0284\3\2\2\2^\u0295\3\2\2\2"+
		"`\u02ad\3\2\2\2b\u02af\3\2\2\2d\u02c1\3\2\2\2f\u02ca\3\2\2\2h\u02d2\3"+
		"\2\2\2j\u02da\3\2\2\2l\u02dd\3\2\2\2n\u02e2\3\2\2\2p\u02f0\3\2\2\2r\u02f2"+
		"\3\2\2\2t\u02f7\3\2\2\2v\u02fc\3\2\2\2x\u02ff\3\2\2\2z\u0302\3\2\2\2|"+
		"\u0308\3\2\2\2~\u030b\3\2\2\2\u0080\u0310\3\2\2\2\u0082\u031a\3\2\2\2"+
		"\u0084\u0320\3\2\2\2\u0086\u0324\3\2\2\2\u0088\u0329\3\2\2\2\u008a\u0333"+
		"\3\2\2\2\u008c\u0337\3\2\2\2\u008e\u0339\3\2\2\2\u0090\u033b\3\2\2\2\u0092"+
		"\u0343\3\2\2\2\u0094\u0348\3\2\2\2\u0096\u0357\3\2\2\2\u0098\u035e\3\2"+
		"\2\2\u009a\u0362\3\2\2\2\u009c\u0370\3\2\2\2\u009e\u0398\3\2\2\2\u00a0"+
		"\u039a\3\2\2\2\u00a2\u03a5\3\2\2\2\u00a4\u03b3\3\2\2\2\u00a6\u03b6\3\2"+
		"\2\2\u00a8\u03d1\3\2\2\2\u00aa\u03dd\3\2\2\2\u00ac\u03df\3\2\2\2\u00ae"+
		"\u03e4\3\2\2\2\u00b0\u03fa\3\2\2\2\u00b2\u0400\3\2\2\2\u00b4\u0417\3\2"+
		"\2\2\u00b6\u0423\3\2\2\2\u00b8\u0425\3\2\2\2\u00ba\u042e\3\2\2\2\u00bc"+
		"\u043e\3\2\2\2\u00be\u044c\3\2\2\2\u00c0\u044e\3\2\2\2\u00c2\u0467\3\2"+
		"\2\2\u00c4\u0469\3\2\2\2\u00c6\u0473\3\2\2\2\u00c8\u0486\3\2\2\2\u00ca"+
		"\u048c\3\2\2\2\u00cc\u0498\3\2\2\2\u00ce\u04a7\3\2\2\2\u00d0\u04a9\3\2"+
		"\2\2\u00d2\u04b6\3\2\2\2\u00d4\u04b8\3\2\2\2\u00d6\u04ba\3\2\2\2\u00d8"+
		"\u04c2\3\2\2\2\u00da\u04c4\3\2\2\2\u00dc\u04cc\3\2\2\2\u00de\u04d4\3\2"+
		"\2\2\u00e0\u04dc\3\2\2\2\u00e2\u04e4\3\2\2\2\u00e4\u04ec\3\2\2\2\u00e6"+
		"\u04f4\3\2\2\2\u00e8\u04fc\3\2\2\2\u00ea\u0504\3\2\2\2\u00ec\u050c\3\2"+
		"\2\2\u00ee\u051a\3\2\2\2\u00f0\u052c\3\2\2\2\u00f2\u052e\3\2\2\2\u00f4"+
		"\u0530\3\2\2\2\u00f6\u0545\3\2\2\2\u00f8\u054d\3\2\2\2\u00fa\u054f\3\2"+
		"\2\2\u00fc\u00fe\5\4\3\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7\2"+
		"\2\3\u0102\3\3\2\2\2\u0103\u0110\7\u008c\2\2\u0104\u0110\7\u008d\2\2\u0105"+
		"\u0110\5\6\4\2\u0106\u0110\5\u0086D\2\u0107\u0110\5\u0088E\2\u0108\u0110"+
		"\5\b\5\2\u0109\u0110\5\f\7\2\u010a\u0110\5\n\6\2\u010b\u0110\5\16\b\2"+
		"\u010c\u0110\5\20\t\2\u010d\u0110\5\22\n\2\u010e\u0110\5\24\13\2\u010f"+
		"\u0103\3\2\2\2\u010f\u0104\3\2\2\2\u010f\u0105\3\2\2\2\u010f\u0106\3\2"+
		"\2\2\u010f\u0107\3\2\2\2\u010f\u0108\3\2\2\2\u010f\u0109\3\2\2\2\u010f"+
		"\u010a\3\2\2\2\u010f\u010b\3\2\2\2\u010f\u010c\3\2\2\2\u010f\u010d\3\2"+
		"\2\2\u010f\u010e\3\2\2\2\u0110\5\3\2\2\2\u0111\u0112\t\2\2\2\u0112\7\3"+
		"\2\2\2\u0113\u0114\7\f\2\2\u0114\u0117\5$\23\2\u0115\u0116\7Z\2\2\u0116"+
		"\u0118\5&\24\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2"+
		"\2\2\u0119\u011b\5\30\r\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u011d\3\2\2\2\u011c\u011e\5,\27\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2"+
		"\2\2\u011e\u0120\3\2\2\2\u011f\u0121\5\60\31\2\u0120\u011f\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\7\t\2\2\u0123\t\3\2\2\2"+
		"\u0124\u0125\7\f\2\2\u0125\u0126\5$\23\2\u0126\u0128\7I\2\2\u0127\u0129"+
		"\5(\25\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012c\7J\2\2\u012b\u012d\5\30\r\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2"+
		"\2\2\u012d\u012f\3\2\2\2\u012e\u0130\5,\27\2\u012f\u012e\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u0133\5\60\31\2\u0132\u0131\3"+
		"\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\7\t\2\2\u0135"+
		"\13\3\2\2\2\u0136\u0137\7\13\2\2\u0137\u013a\5$\23\2\u0138\u0139\7Z\2"+
		"\2\u0139\u013b\5&\24\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d"+
		"\3\2\2\2\u013c\u013e\5,\27\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u0140\3\2\2\2\u013f\u0141\58\35\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\u0143\7\t\2\2\u0143\r\3\2\2\2\u0144\u0145"+
		"\7\13\2\2\u0145\u0146\5$\23\2\u0146\u0147\7I\2\2\u0147\u0148\5(\25\2\u0148"+
		"\u014a\7J\2\2\u0149\u014b\58\35\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u014c\3\2\2\2\u014c\u014d\7\t\2\2\u014d\17\3\2\2\2\u014e\u014f"+
		"\7\16\2\2\u014f\u0151\5*\26\2\u0150\u0152\5\30\r\2\u0151\u0150\3\2\2\2"+
		"\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0155\7\3\2\2\u0154\u0153"+
		"\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0158\5\60\31\2"+
		"\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u015b"+
		"\7\17\2\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d\3\2\2\2"+
		"\u015c\u015e\5\60\31\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f"+
		"\3\2\2\2\u015f\u0160\7\t\2\2\u0160\21\3\2\2\2\u0161\u0162\7\16\2\2\u0162"+
		"\u0163\5\32\16\2\u0163\u0164\7O\2\2\u0164\23\3\2\2\2\u0165\u0166\7\6\2"+
		"\2\u0166\u0167\5\26\f\2\u0167\u0168\7O\2\2\u0168\25\3\2\2\2\u0169\u016e"+
		"\5$\23\2\u016a\u016b\7P\2\2\u016b\u016d\5$\23\2\u016c\u016a\3\2\2\2\u016d"+
		"\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\27\3\2\2"+
		"\2\u0170\u016e\3\2\2\2\u0171\u0172\7V\2\2\u0172\u0173\5\32\16\2\u0173"+
		"\u0174\7U\2\2\u0174\31\3\2\2\2\u0175\u017a\5*\26\2\u0176\u0177\7P\2\2"+
		"\u0177\u0179\5*\26\2\u0178\u0176\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178"+
		"\3\2\2\2\u017a\u017b\3\2\2\2\u017b\33\3\2\2\2\u017c\u017a\3\2\2\2\u017d"+
		"\u017f\7\21\2\2\u017e\u0180\5\36\20\2\u017f\u017e\3\2\2\2\u017f\u0180"+
		"\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\5\u0096L\2\u0182\35\3\2\2\2\u0183"+
		"\u0184\7I\2\2\u0184\u0185\5 \21\2\u0185\u0186\7J\2\2\u0186\37\3\2\2\2"+
		"\u0187\u018c\5\"\22\2\u0188\u0189\7P\2\2\u0189\u018b\5\"\22\2\u018a\u0188"+
		"\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"!\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u01a0\7z\2\2\u0190\u01a0\7x\2\2\u0191"+
		"\u01a0\7\u0080\2\2\u0192\u01a0\7|\2\2\u0193\u01a0\7}\2\2\u0194\u01a0\7"+
		"~\2\2\u0195\u01a0\7\177\2\2\u0196\u01a0\3\2\2\2\u0197\u0198\7y\2\2\u0198"+
		"\u0199\7T\2\2\u0199\u01a0\7\u0081\2\2\u019a\u019b\7{\2\2\u019b\u019c\7"+
		"T\2\2\u019c\u019d\7\u0081\2\2\u019d\u01a0\7Z\2\2\u019e\u01a0\7\u0081\2"+
		"\2\u019f\u018f\3\2\2\2\u019f\u0190\3\2\2\2\u019f\u0191\3\2\2\2\u019f\u0192"+
		"\3\2\2\2\u019f\u0193\3\2\2\2\u019f\u0194\3\2\2\2\u019f\u0195\3\2\2\2\u019f"+
		"\u0196\3\2\2\2\u019f\u0197\3\2\2\2\u019f\u019a\3\2\2\2\u019f\u019e\3\2"+
		"\2\2\u01a0#\3\2\2\2\u01a1\u01a2\7\u0081\2\2\u01a2%\3\2\2\2\u01a3\u01a4"+
		"\7\u0081\2\2\u01a4\'\3\2\2\2\u01a5\u01a6\7\u0081\2\2\u01a6)\3\2\2\2\u01a7"+
		"\u01a8\7\u0081\2\2\u01a8+\3\2\2\2\u01a9\u01ad\7K\2\2\u01aa\u01ac\5\u0096"+
		"L\2\u01ab\u01aa\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01ce\7L"+
		"\2\2\u01b1\u01b2\7K\2\2\u01b2\u01b4\5.\30\2\u01b3\u01b5\5\u0096L\2\u01b4"+
		"\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2"+
		"\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\7L\2\2\u01b9\u01ce\3\2\2\2\u01ba"+
		"\u01bc\7K\2\2\u01bb\u01bd\5\u0096L\2\u01bc\u01bb\3\2\2\2\u01bd\u01be\3"+
		"\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"\u01c1\5,\27\2\u01c1\u01c2\7L\2\2\u01c2\u01ce\3\2\2\2\u01c3\u01c4\7K\2"+
		"\2\u01c4\u01c6\5.\30\2\u01c5\u01c7\5\u0096L\2\u01c6\u01c5\3\2\2\2\u01c7"+
		"\u01c8\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\3\2"+
		"\2\2\u01ca\u01cb\5,\27\2\u01cb\u01cc\7L\2\2\u01cc\u01ce\3\2\2\2\u01cd"+
		"\u01a9\3\2\2\2\u01cd\u01b1\3\2\2\2\u01cd\u01ba\3\2\2\2\u01cd\u01c3\3\2"+
		"\2\2\u01ce-\3\2\2\2\u01cf\u01d0\t\3\2\2\u01d0/\3\2\2\2\u01d1\u01d6\5\u0088"+
		"E\2\u01d2\u01d6\5\62\32\2\u01d3\u01d6\5\64\33\2\u01d4\u01d6\5\34\17\2"+
		"\u01d5\u01d1\3\2\2\2\u01d5\u01d2\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d4"+
		"\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"\61\3\2\2\2\u01d9\u01da\7c\2\2\u01da\u01db\5\66\34\2\u01db\63\3\2\2\2"+
		"\u01dc\u01dd\7d\2\2\u01dd\u01de\5\66\34\2\u01de\65\3\2\2\2\u01df\u01e1"+
		"\5F$\2\u01e0\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\u01e3\5@!\2\u01e3\u01e4\7O\2\2\u01e4\67\3\2\2\2\u01e5\u01eb\5\u0086D"+
		"\2\u01e6\u01eb\5\u0088E\2\u01e7\u01eb\5:\36\2\u01e8\u01eb\5<\37\2\u01e9"+
		"\u01eb\5H%\2\u01ea\u01e5\3\2\2\2\u01ea\u01e6\3\2\2\2\u01ea\u01e7\3\2\2"+
		"\2\u01ea\u01e8\3\2\2\2\u01ea\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ea"+
		"\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed9\3\2\2\2\u01ee\u01ef\7c\2\2\u01ef\u01f0"+
		"\5> \2\u01f0;\3\2\2\2\u01f1\u01f2\7d\2\2\u01f2\u01f3\5> \2\u01f3=\3\2"+
		"\2\2\u01f4\u01f6\5F$\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7"+
		"\3\2\2\2\u01f7\u01f9\5@!\2\u01f8\u01fa\5\u0090I\2\u01f9\u01f8\3\2\2\2"+
		"\u01f9\u01fa\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01fd\7O\2\2\u01fc\u01fb"+
		"\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\5\u00c0a"+
		"\2\u01ff?\3\2\2\2\u0200\u020a\5D#\2\u0201\u0203\5B\"\2\u0202\u0201\3\2"+
		"\2\2\u0203\u0204\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"\u0207\3\2\2\2\u0206\u0208\5\u00acW\2\u0207\u0206\3\2\2\2\u0207\u0208"+
		"\3\2\2\2\u0208\u020a\3\2\2\2\u0209\u0200\3\2\2\2\u0209\u0202\3\2\2\2\u020a"+
		"A\3\2\2\2\u020b\u020d\5D#\2\u020c\u020b\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u020e\3\2\2\2\u020e\u0212\7Z\2\2\u020f\u0211\5F$\2\u0210\u020f\3\2\2"+
		"\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0215"+
		"\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u0216\7\u0081\2\2\u0216C\3\2\2\2\u0217"+
		"\u0218\7\u0081\2\2\u0218E\3\2\2\2\u0219\u021a\7I\2\2\u021a\u021b\5\u00b2"+
		"Z\2\u021b\u021c\7J\2\2\u021cG\3\2\2\2\u021d\u021e\7\26\2\2\u021e\u021f"+
		"\5J&\2\u021f\u0220\7O\2\2\u0220\u0226\3\2\2\2\u0221\u0222\7\7\2\2\u0222"+
		"\u0223\5J&\2\u0223\u0224\7O\2\2\u0224\u0226\3\2\2\2\u0225\u021d\3\2\2"+
		"\2\u0225\u0221\3\2\2\2\u0226I\3\2\2\2\u0227\u022c\5L\'\2\u0228\u0229\7"+
		"P\2\2\u0229\u022b\5L\'\2\u022a\u0228\3\2\2\2\u022b\u022e\3\2\2\2\u022c"+
		"\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022dK\3\2\2\2\u022e\u022c\3\2\2\2"+
		"\u022f\u0234\7\u0081\2\2\u0230\u0231\7\u0081\2\2\u0231\u0232\7T\2\2\u0232"+
		"\u0234\7\u0081\2\2\u0233\u022f\3\2\2\2\u0233\u0230\3\2\2\2\u0234M\3\2"+
		"\2\2\u0235\u0236\5R*\2\u0236\u0237\7I\2\2\u0237\u0239\7i\2\2\u0238\u023a"+
		"\5R*\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\3\2\2\2\u023b"+
		"\u023d\7J\2\2\u023c\u023e\5b\62\2\u023d\u023c\3\2\2\2\u023d\u023e\3\2"+
		"\2\2\u023eO\3\2\2\2\u023f\u0241\7V\2\2\u0240\u0242\5R*\2\u0241\u0240\3"+
		"\2\2\2\u0241\u0242\3\2\2\2\u0242\u0247\3\2\2\2\u0243\u0244\7P\2\2\u0244"+
		"\u0246\5R*\2\u0245\u0243\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2\2"+
		"\2\u0247\u0248\3\2\2\2\u0248\u024a\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u024b"+
		"\7U\2\2\u024bQ\3\2\2\2\u024c\u0265\7B\2\2\u024d\u0265\7\"\2\2\u024e\u0265"+
		"\79\2\2\u024f\u0265\7\63\2\2\u0250\u0265\7\64\2\2\u0251\u0265\7+\2\2\u0252"+
		"\u0265\7\'\2\2\u0253\u0265\7:\2\2\u0254\u0265\7A\2\2\u0255\u0265\7\61"+
		"\2\2\u0256\u0258\7-\2\2\u0257\u0259\5\30\r\2\u0258\u0257\3\2\2\2\u0258"+
		"\u0259\3\2\2\2\u0259\u0265\3\2\2\2\u025a\u025d\5$\23\2\u025b\u025e\5\30"+
		"\r\2\u025c\u025e\5P)\2\u025d\u025b\3\2\2\2\u025d\u025c\3\2\2\2\u025d\u025e"+
		"\3\2\2\2\u025e\u0265\3\2\2\2\u025f\u0265\5\u0094K\2\u0260\u0265\5\u009e"+
		"P\2\u0261\u0265\7\u0081\2\2\u0262\u0263\7\u0081\2\2\u0263\u0265\5\u00a4"+
		"S\2\u0264\u024c\3\2\2\2\u0264\u024d\3\2\2\2\u0264\u024e\3\2\2\2\u0264"+
		"\u024f\3\2\2\2\u0264\u0250\3\2\2\2\u0264\u0251\3\2\2\2\u0264\u0252\3\2"+
		"\2\2\u0264\u0253\3\2\2\2\u0264\u0254\3\2\2\2\u0264\u0255\3\2\2\2\u0264"+
		"\u0256\3\2\2\2\u0264\u025a\3\2\2\2\u0264\u025f\3\2\2\2\u0264\u0260\3\2"+
		"\2\2\u0264\u0261\3\2\2\2\u0264\u0262\3\2\2\2\u0265S\3\2\2\2\u0266\u026a"+
		"\7#\2\2\u0267\u026a\7C\2\2\u0268\u026a\5V,\2\u0269\u0266\3\2\2\2\u0269"+
		"\u0267\3\2\2\2\u0269\u0268\3\2\2\2\u026aU\3\2\2\2\u026b\u026c\t\4\2\2"+
		"\u026cW\3\2\2\2\u026d\u027f\7\u0081\2\2\u026e\u027f\5\u00fa~\2\u026f\u027f"+
		"\7\u0083\2\2\u0270\u0271\7I\2\2\u0271\u0272\5\u00d0i\2\u0272\u0273\7J"+
		"\2\2\u0273\u027f\3\2\2\2\u0274\u027f\7\32\2\2\u0275\u027f\7\31\2\2\u0276"+
		"\u027f\5f\64\2\u0277\u027f\5n8\2\u0278\u027f\5r:\2\u0279\u027f\5t;\2\u027a"+
		"\u027f\5\\/\2\u027b\u027f\5^\60\2\u027c\u027f\5`\61\2\u027d\u027f\5d\63"+
		"\2\u027e\u026d\3\2\2\2\u027e\u026e\3\2\2\2\u027e\u026f\3\2\2\2\u027e\u0270"+
		"\3\2\2\2\u027e\u0274\3\2\2\2\u027e\u0275\3\2\2\2\u027e\u0276\3\2\2\2\u027e"+
		"\u0277\3\2\2\2\u027e\u0278\3\2\2\2\u027e\u0279\3\2\2\2\u027e\u027a\3\2"+
		"\2\2\u027e\u027b\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027d\3\2\2\2\u027f"+
		"Y\3\2\2\2\u0280\u0281\5\u00f4{\2\u0281\u0282\7Z\2\2\u0282\u0283\5\u00f4"+
		"{\2\u0283[\3\2\2\2\u0284\u0285\7S\2\2\u0285\u0287\7K\2\2\u0286\u0288\5"+
		"Z.\2\u0287\u0286\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u028d\3\2\2\2\u0289"+
		"\u028a\7P\2\2\u028a\u028c\5Z.\2\u028b\u0289\3\2\2\2\u028c\u028f\3\2\2"+
		"\2\u028d\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d"+
		"\3\2\2\2\u0290\u0292\7P\2\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292"+
		"\u0293\3\2\2\2\u0293\u0294\7L\2\2\u0294]\3\2\2\2\u0295\u0296\7S\2\2\u0296"+
		"\u0298\7M\2\2\u0297\u0299\5\u00f4{\2\u0298\u0297\3\2\2\2\u0298\u0299\3"+
		"\2\2\2\u0299\u029e\3\2\2\2\u029a\u029b\7P\2\2\u029b\u029d\5\u00f4{\2\u029c"+
		"\u029a\3\2\2\2\u029d\u02a0\3\2\2\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2"+
		"\2\2\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a3\7P\2\2\u02a2"+
		"\u02a1\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\7N"+
		"\2\2\u02a5_\3\2\2\2\u02a6\u02a7\7S\2\2\u02a7\u02a8\7I\2\2\u02a8\u02a9"+
		"\5\u00d6l\2\u02a9\u02aa\7J\2\2\u02aa\u02ae\3\2\2\2\u02ab\u02ac\7S\2\2"+
		"\u02ac\u02ae\5\u00fa~\2\u02ad\u02a6\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae"+
		"a\3\2\2\2\u02af\u02b3\7I\2\2\u02b0\u02b4\5v<\2\u02b1\u02b4\5\u00b2Z\2"+
		"\u02b2\u02b4\7B\2\2\u02b3\u02b0\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3\u02b2"+
		"\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02bc\3\2\2\2\u02b5\u02b8\7P\2\2\u02b6"+
		"\u02b9\5v<\2\u02b7\u02b9\5\u00b2Z\2\u02b8\u02b6\3\2\2\2\u02b8\u02b7\3"+
		"\2\2\2\u02b9\u02bb\3\2\2\2\u02ba\u02b5\3\2\2\2\u02bb\u02be\3\2\2\2\u02bc"+
		"\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02bf\3\2\2\2\u02be\u02bc\3\2"+
		"\2\2\u02bf\u02c0\7J\2\2\u02c0c\3\2\2\2\u02c1\u02c3\7i\2\2\u02c2\u02c4"+
		"\5R*\2\u02c3\u02c2\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c6\3\2\2\2\u02c5"+
		"\u02c7\5b\62\2\u02c6\u02c5\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\3\2"+
		"\2\2\u02c8\u02c9\5\u00c0a\2\u02c9e\3\2\2\2\u02ca\u02cb\7M\2\2\u02cb\u02cc"+
		"\5h\65\2\u02cc\u02cd\5j\66\2\u02cd\u02ce\7N\2\2\u02ceg\3\2\2\2\u02cf\u02d3"+
		"\5\u00d0i\2\u02d0\u02d3\5$\23\2\u02d1\u02d3\7\31\2\2\u02d2\u02cf\3\2\2"+
		"\2\u02d2\u02d0\3\2\2\2\u02d2\u02d1\3\2\2\2\u02d3i\3\2\2\2\u02d4\u02db"+
		"\5D#\2\u02d5\u02d7\5l\67\2\u02d6\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8"+
		"\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02db\3\2\2\2\u02da\u02d4\3\2"+
		"\2\2\u02da\u02d6\3\2\2\2\u02dbk\3\2\2\2\u02dc\u02de\5D#\2\u02dd\u02dc"+
		"\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e0\7Z\2\2\u02e0"+
		"\u02e1\5\u00d0i\2\u02e1m\3\2\2\2\u02e2\u02e3\7\24\2\2\u02e3\u02e4\7I\2"+
		"\2\u02e4\u02e5\5p9\2\u02e5\u02e6\7J\2\2\u02e6o\3\2\2\2\u02e7\u02f1\5D"+
		"#\2\u02e8\u02ea\5D#\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb"+
		"\3\2\2\2\u02eb\u02ed\7Z\2\2\u02ec\u02e9\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee"+
		"\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f1\3\2\2\2\u02f0\u02e7\3\2"+
		"\2\2\u02f0\u02ec\3\2\2\2\u02f1q\3\2\2\2\u02f2\u02f3\7\16\2\2\u02f3\u02f4"+
		"\7I\2\2\u02f4\u02f5\5*\26\2\u02f5\u02f6\7J\2\2\u02f6s\3\2\2\2\u02f7\u02f8"+
		"\7\b\2\2\u02f8\u02f9\7I\2\2\u02f9\u02fa\5\u00b2Z\2\u02fa\u02fb\7J\2\2"+
		"\u02fbu\3\2\2\2\u02fc\u02fd\5\u008aF\2\u02fd\u02fe\5\u00a6T\2\u02few\3"+
		"\2\2\2\u02ff\u0300\7\30\2\2\u0300\u0301\5\u00c0a\2\u0301y\3\2\2\2\u0302"+
		"\u0303\7\5\2\2\u0303\u0304\7I\2\2\u0304\u0305\5v<\2\u0305\u0306\7J\2\2"+
		"\u0306\u0307\5\u00c0a\2\u0307{\3\2\2\2\u0308\u0309\7\n\2\2\u0309\u030a"+
		"\5\u00c0a\2\u030a}\3\2\2\2\u030b\u030c\7\27\2\2\u030c\u030d\7I\2\2\u030d"+
		"\u030e\7\u0081\2\2\u030e\u030f\7J\2\2\u030f\177\3\2\2\2\u0310\u0314\5"+
		"x=\2\u0311\u0313\5z>\2\u0312\u0311\3\2\2\2\u0313\u0316\3\2\2\2\u0314\u0312"+
		"\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0318\3\2\2\2\u0316\u0314\3\2\2\2\u0317"+
		"\u0319\5|?\2\u0318\u0317\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u0081\3\2\2"+
		"\2\u031a\u031b\7\25\2\2\u031b\u031c\7I\2\2\u031c\u031d\5X-\2\u031d\u031e"+
		"\7J\2\2\u031e\u031f\5\u00c0a\2\u031f\u0083\3\2\2\2\u0320\u0321\7\4\2\2"+
		"\u0321\u0322\5\u00c0a\2\u0322\u0085\3\2\2\2\u0323\u0325\5\u008aF\2\u0324"+
		"\u0323\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0327\5\u00a6"+
		"T\2\u0327\u0328\5\u00c0a\2\u0328\u0087\3\2\2\2\u0329\u032b\5\u008aF\2"+
		"\u032a\u032c\5\u0090I\2\u032b\u032a\3\2\2\2\u032b\u032c\3\2\2\2\u032c"+
		"\u032d\3\2\2\2\u032d\u032e\7O\2\2\u032e\u0089\3\2\2\2\u032f\u0334\5\u008c"+
		"G\2\u0330\u0334\5\u008eH\2\u0331\u0334\5R*\2\u0332\u0334\5T+\2\u0333\u032f"+
		"\3\2\2\2\u0333\u0330\3\2\2\2\u0333\u0331\3\2\2\2\u0333\u0332\3\2\2\2\u0334"+
		"\u0335\3\2\2\2\u0335\u0333\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u008b\3\2"+
		"\2\2\u0337\u0338\t\5\2\2\u0338\u008d\3\2\2\2\u0339\u033a\t\6\2\2\u033a"+
		"\u008f\3\2\2\2\u033b\u0340\5\u0092J\2\u033c\u033d\7P\2\2\u033d\u033f\5"+
		"\u0092J\2\u033e\u033c\3\2\2\2\u033f\u0342\3\2\2\2\u0340\u033e\3\2\2\2"+
		"\u0340\u0341\3\2\2\2\u0341\u0091\3\2\2\2\u0342\u0340\3\2\2\2\u0343\u0346"+
		"\5\u00a6T\2\u0344\u0345\7T\2\2\u0345\u0347\5\u00b0Y\2\u0346\u0344\3\2"+
		"\2\2\u0346\u0347\3\2\2\2\u0347\u0093\3\2\2\2\u0348\u0355\t\7\2\2\u0349"+
		"\u0356\7\u0081\2\2\u034a\u034c\7\u0081\2\2\u034b\u034a\3\2\2\2\u034b\u034c"+
		"\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034f\7K\2\2\u034e\u0350\5\u0096L\2"+
		"\u034f\u034e\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u034f\3\2\2\2\u0351\u0352"+
		"\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0354\7L\2\2\u0354\u0356\3\2\2\2\u0355"+
		"\u0349\3\2\2\2\u0355\u034b\3\2\2\2\u0356\u0095\3\2\2\2\u0357\u0358\5\u0098"+
		"M\2\u0358\u0359\5\u009aN\2\u0359\u035a\7O\2\2\u035a\u0097\3\2\2\2\u035b"+
		"\u035f\5\u008cG\2\u035c\u035f\5R*\2\u035d\u035f\5T+\2\u035e\u035b\3\2"+
		"\2\2\u035e\u035c\3\2\2\2\u035e\u035d\3\2\2\2\u035f\u0360\3\2\2\2\u0360"+
		"\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0099\3\2\2\2\u0362\u0367\5\u009c"+
		"O\2\u0363\u0364\7P\2\2\u0364\u0366\5\u009cO\2\u0365\u0363\3\2\2\2\u0366"+
		"\u0369\3\2\2\2\u0367\u0365\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u009b\3\2"+
		"\2\2\u0369\u0367\3\2\2\2\u036a\u0371\5\u00a6T\2\u036b\u036d\5\u00a6T\2"+
		"\u036c\u036b\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u036f"+
		"\7Z\2\2\u036f\u0371\5\u00fa~\2\u0370\u036a\3\2\2\2\u0370\u036c\3\2\2\2"+
		"\u0371\u009d\3\2\2\2\u0372\u0375\7)\2\2\u0373\u0374\7Z\2\2\u0374\u0376"+
		"\5\u00b2Z\2\u0375\u0373\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0382\3\2\2"+
		"\2\u0377\u037c\5\u00f8}\2\u0378\u0379\7K\2\2\u0379\u037a\5\u00a0Q\2\u037a"+
		"\u037b\7L\2\2\u037b\u037d\3\2\2\2\u037c\u0378\3\2\2\2\u037c\u037d\3\2"+
		"\2\2\u037d\u0383\3\2\2\2\u037e\u037f\7K\2\2\u037f\u0380\5\u00a0Q\2\u0380"+
		"\u0381\7L\2\2\u0381\u0383\3\2\2\2\u0382\u0377\3\2\2\2\u0382\u037e\3\2"+
		"\2\2\u0383\u0399\3\2\2\2\u0384\u0385\7E\2\2\u0385\u0386\7I\2\2\u0386\u0387"+
		"\5\u00b2Z\2\u0387\u0388\7P\2\2\u0388\u0389\5\u00f8}\2\u0389\u038a\7J\2"+
		"\2\u038a\u038b\7K\2\2\u038b\u038c\5\u00a0Q\2\u038c\u038d\7L\2\2\u038d"+
		"\u0399\3\2\2\2\u038e\u038f\7F\2\2\u038f\u0390\7I\2\2\u0390\u0391\5\u00b2"+
		"Z\2\u0391\u0392\7P\2\2\u0392\u0393\5\u00f8}\2\u0393\u0394\7J\2\2\u0394"+
		"\u0395\7K\2\2\u0395\u0396\5\u00a0Q\2\u0396\u0397\7L\2\2\u0397\u0399\3"+
		"\2\2\2\u0398\u0372\3\2\2\2\u0398\u0384\3\2\2\2\u0398\u038e\3\2\2\2\u0399"+
		"\u009f\3\2\2\2\u039a\u039f\5\u00a2R\2\u039b\u039c\7P\2\2\u039c\u039e\5"+
		"\u00a2R\2\u039d\u039b\3\2\2\2\u039e\u03a1\3\2\2\2\u039f\u039d\3\2\2\2"+
		"\u039f\u03a0\3\2\2\2\u03a0\u03a3\3\2\2\2\u03a1\u039f\3\2\2\2\u03a2\u03a4"+
		"\7P\2\2\u03a3\u03a2\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u00a1\3\2\2\2\u03a5"+
		"\u03a8\5\u00f8}\2\u03a6\u03a7\7T\2\2\u03a7\u03a9\5\u00d8m\2\u03a8\u03a6"+
		"\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u00a3\3\2\2\2\u03aa\u03ac\7e\2\2\u03ab"+
		"\u03ad\5\u008aF\2\u03ac\u03ab\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03b4"+
		"\3\2\2\2\u03ae\u03b0\7e\2\2\u03af\u03b1\5\u008aF\2\u03b0\u03af\3\2\2\2"+
		"\u03b0\u03b1\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b4\5\u00a4S\2\u03b3"+
		"\u03aa\3\2\2\2\u03b3\u03ae\3\2\2\2\u03b4\u00a5\3\2\2\2\u03b5\u03b7\5\u00a4"+
		"S\2\u03b6\u03b5\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8"+
		"\u03b9\5\u00a8U\2\u03b9\u00a7\3\2\2\2\u03ba\u03be\5\u00f8}\2\u03bb\u03bd"+
		"\5\u00aaV\2\u03bc\u03bb\3\2\2\2\u03bd\u03c0\3\2\2\2\u03be\u03bc\3\2\2"+
		"\2\u03be\u03bf\3\2\2\2\u03bf\u03d2\3\2\2\2\u03c0\u03be\3\2\2\2\u03c1\u03c2"+
		"\7I\2\2\u03c2\u03c3\5\u00a6T\2\u03c3\u03c7\7J\2\2\u03c4\u03c6\5\u00aa"+
		"V\2\u03c5\u03c4\3\2\2\2\u03c6\u03c9\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c7"+
		"\u03c8\3\2\2\2\u03c8\u03d2\3\2\2\2\u03c9\u03c7\3\2\2\2\u03ca\u03cb\7I"+
		"\2\2\u03cb\u03cd\7i\2\2\u03cc\u03ce\5\u00f8}\2\u03cd\u03cc\3\2\2\2\u03cd"+
		"\u03ce\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\7J\2\2\u03d0\u03d2\5b\62"+
		"\2\u03d1\u03ba\3\2\2\2\u03d1\u03c1\3\2\2\2\u03d1\u03ca\3\2\2\2\u03d2\u00a9"+
		"\3\2\2\2\u03d3\u03d5\7M\2\2\u03d4\u03d6\5\u00d8m\2\u03d5\u03d4\3\2\2\2"+
		"\u03d5\u03d6\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03de\7N\2\2\u03d8\u03da"+
		"\7I\2\2\u03d9\u03db\5\u00acW\2\u03da\u03d9\3\2\2\2\u03da\u03db\3\2\2\2"+
		"\u03db\u03dc\3\2\2\2\u03dc\u03de\7J\2\2\u03dd\u03d3\3\2\2\2\u03dd\u03d8"+
		"\3\2\2\2\u03de\u00ab\3\2\2\2\u03df\u03e2\5\u00b8]\2\u03e0\u03e1\7P\2\2"+
		"\u03e1\u03e3\7w\2\2\u03e2\u03e0\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u00ad"+
		"\3\2\2\2\u03e4\u03e9\5\u008aF\2\u03e5\u03e7\5\u00a6T\2\u03e6\u03e5\3\2"+
		"\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03ea\3\2\2\2\u03e8\u03ea\5\u00b4[\2\u03e9"+
		"\u03e6\3\2\2\2\u03e9\u03e8\3\2\2\2\u03ea\u00af\3\2\2\2\u03eb\u03fb\5\u00d2"+
		"j\2\u03ec\u03ed\7K\2\2\u03ed\u03f2\5\u00b0Y\2\u03ee\u03ef\7P\2\2\u03ef"+
		"\u03f1\5\u00b0Y\2\u03f0\u03ee\3\2\2\2\u03f1\u03f4\3\2\2\2\u03f2\u03f0"+
		"\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f6\3\2\2\2\u03f4\u03f2\3\2\2\2\u03f5"+
		"\u03f7\7P\2\2\u03f6\u03f5\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f8\3\2"+
		"\2\2\u03f8\u03f9\7L\2\2\u03f9\u03fb\3\2\2\2\u03fa\u03eb\3\2\2\2\u03fa"+
		"\u03ec\3\2\2\2\u03fb\u00b1\3\2\2\2\u03fc\u03fd\5\u0098M\2\u03fd\u03fe"+
		"\5\u00b4[\2\u03fe\u0401\3\2\2\2\u03ff\u0401\5N(\2\u0400\u03fc\3\2\2\2"+
		"\u0400\u03ff\3\2\2\2\u0401\u00b3\3\2\2\2\u0402\u0403\5\u00a4S\2\u0403"+
		"\u0404\5\u00b4[\2\u0404\u0418\3\2\2\2\u0405\u0406\7I\2\2\u0406\u0407\5"+
		"\u00b4[\2\u0407\u0409\7J\2\2\u0408\u040a\5\u00b6\\\2\u0409\u0408\3\2\2"+
		"\2\u040a\u040b\3\2\2\2\u040b\u0409\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u0418"+
		"\3\2\2\2\u040d\u040f\7M\2\2\u040e\u0410\5\u00d8m\2\u040f\u040e\3\2\2\2"+
		"\u040f\u0410\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0413\7N\2\2\u0412\u040d"+
		"\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0412\3\2\2\2\u0414\u0415\3\2\2\2\u0415"+
		"\u0418\3\2\2\2\u0416\u0418\3\2\2\2\u0417\u0402\3\2\2\2\u0417\u0405\3\2"+
		"\2\2\u0417\u0412\3\2\2\2\u0417\u0416\3\2\2\2\u0418\u00b5\3\2\2\2\u0419"+
		"\u041b\7M\2\2\u041a\u041c\5\u00d8m\2\u041b\u041a\3\2\2\2\u041b\u041c\3"+
		"\2\2\2\u041c\u041d\3\2\2\2\u041d\u0424\7N\2\2\u041e\u0420\7I\2\2\u041f"+
		"\u0421\5\u00b8]\2\u0420\u041f\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u0422"+
		"\3\2\2\2\u0422\u0424\7J\2\2\u0423\u0419\3\2\2\2\u0423\u041e\3\2\2\2\u0424"+
		"\u00b7\3\2\2\2\u0425\u042a\5\u00aeX\2\u0426\u0427\7P\2\2\u0427\u0429\5"+
		"\u00aeX\2\u0428\u0426\3\2\2\2\u0429\u042c\3\2\2\2\u042a\u0428\3\2\2\2"+
		"\u042a\u042b\3\2\2\2\u042b\u00b9\3\2\2\2\u042c\u042a\3\2\2\2\u042d\u042f"+
		"\5\u00bc_\2\u042e\u042d\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u042e\3\2\2"+
		"\2\u0430\u0431\3\2\2\2\u0431\u00bb\3\2\2\2\u0432\u043f\5\u00be`\2\u0433"+
		"\u0434\5\u00d0i\2\u0434\u0435\7O\2\2\u0435\u043f\3\2\2\2\u0436\u043f\5"+
		"\u00c0a\2\u0437\u043f\5\u00c2b\2\u0438\u043f\5\u00ccg\2\u0439\u043f\5"+
		"\u00ceh\2\u043a\u043f\5\u0082B\2\u043b\u043f\5\u0084C\2\u043c\u043f\5"+
		"\u0080A\2\u043d\u043f\7O\2\2\u043e\u0432\3\2\2\2\u043e\u0433\3\2\2\2\u043e"+
		"\u0436\3\2\2\2\u043e\u0437\3\2\2\2\u043e\u0438\3\2\2\2\u043e\u0439\3\2"+
		"\2\2\u043e\u043a\3\2\2\2\u043e\u043b\3\2\2\2\u043e\u043c\3\2\2\2\u043e"+
		"\u043d\3\2\2\2\u043f\u00bd\3\2\2\2\u0440\u0441\5\u00f8}\2\u0441\u0442"+
		"\7Z\2\2\u0442\u0443\5\u00bc_\2\u0443\u044d\3\2\2\2\u0444\u0445\7!\2\2"+
		"\u0445\u0446\5\u00d8m\2\u0446\u0447\7Z\2\2\u0447\u0448\5\u00bc_\2\u0448"+
		"\u044d\3\2\2\2\u0449\u044a\7%\2\2\u044a\u044b\7Z\2\2\u044b\u044d\5\u00bc"+
		"_\2\u044c\u0440\3\2\2\2\u044c\u0444\3\2\2\2\u044c\u0449\3\2\2\2\u044d"+
		"\u00bf\3\2\2\2\u044e\u0453\7K\2\2\u044f\u0452\5\u0088E\2\u0450\u0452\5"+
		"\u00ba^\2\u0451\u044f\3\2\2\2\u0451\u0450\3\2\2\2\u0452\u0455\3\2\2\2"+
		"\u0453\u0451\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0456\3\2\2\2\u0455\u0453"+
		"\3\2\2\2\u0456\u0457\7L\2\2\u0457\u00c1\3\2\2\2\u0458\u0459\7.\2\2\u0459"+
		"\u045a\7I\2\2\u045a\u045b\5\u00d0i\2\u045b\u045c\7J\2\2\u045c\u045f\5"+
		"\u00bc_\2\u045d\u045e\7(\2\2\u045e\u0460\5\u00bc_\2\u045f\u045d\3\2\2"+
		"\2\u045f\u0460\3\2\2\2\u0460\u0468\3\2\2\2\u0461\u0462\7>\2\2\u0462\u0463"+
		"\7I\2\2\u0463\u0464\5\u00d0i\2\u0464\u0465\7J\2\2\u0465\u0466\5\u00bc"+
		"_\2\u0466\u0468\3\2\2\2\u0467\u0458\3\2\2\2\u0467\u0461\3\2\2\2\u0468"+
		"\u00c3\3\2\2\2\u0469\u046a\7,\2\2\u046a\u046b\7I\2\2\u046b\u046c\5v<\2"+
		"\u046c\u046e\7/\2\2\u046d\u046f\5\u00d0i\2\u046e\u046d\3\2\2\2\u046e\u046f"+
		"\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0471\7J\2\2\u0471\u0472\5\u00bc_\2"+
		"\u0472\u00c5\3\2\2\2\u0473\u0474\7,\2\2\u0474\u0479\7I\2\2\u0475\u0476"+
		"\5\u008aF\2\u0476\u0477\5\u0090I\2\u0477\u047a\3\2\2\2\u0478\u047a\5\u00d0"+
		"i\2\u0479\u0475\3\2\2\2\u0479\u0478\3\2\2\2\u0479\u047a\3\2\2\2\u047a"+
		"\u047b\3\2\2\2\u047b\u047d\7O\2\2\u047c\u047e\5\u00d0i\2\u047d\u047c\3"+
		"\2\2\2\u047d\u047e\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0481\7O\2\2\u0480"+
		"\u0482\5\u00d0i\2\u0481\u0480\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0483"+
		"\3\2\2\2\u0483\u0484\7J\2\2\u0484\u0485\5\u00bc_\2\u0485\u00c7\3\2\2\2"+
		"\u0486\u0487\7D\2\2\u0487\u0488\7I\2\2\u0488\u0489\5\u00d0i\2\u0489\u048a"+
		"\7J\2\2\u048a\u048b\5\u00bc_\2\u048b\u00c9\3\2\2\2\u048c\u048d\7&\2\2"+
		"\u048d\u048e\5\u00bc_\2\u048e\u048f\7D\2\2\u048f\u0490\7I\2\2\u0490\u0491"+
		"\5\u00d0i\2\u0491\u0492\7J\2\2\u0492\u0493\7O\2\2\u0493\u00cb\3\2\2\2"+
		"\u0494\u0499\5\u00c8e\2\u0495\u0499\5\u00caf\2\u0496\u0499\5\u00c6d\2"+
		"\u0497\u0499\5\u00c4c\2\u0498\u0494\3\2\2\2\u0498\u0495\3\2\2\2\u0498"+
		"\u0496\3\2\2\2\u0498\u0497\3\2\2\2\u0499\u00cd\3\2\2\2\u049a\u049b\7\62"+
		"\2\2\u049b\u049c\5\u00f8}\2\u049c\u049d\7O\2\2\u049d\u04a8\3\2\2\2\u049e"+
		"\u049f\7$\2\2\u049f\u04a8\7O\2\2\u04a0\u04a1\7\36\2\2\u04a1\u04a8\7O\2"+
		"\2\u04a2\u04a4\78\2\2\u04a3\u04a5\5\u00d0i\2\u04a4\u04a3\3\2\2\2\u04a4"+
		"\u04a5\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a8\7O\2\2\u04a7\u049a\3\2"+
		"\2\2\u04a7\u049e\3\2\2\2\u04a7\u04a0\3\2\2\2\u04a7\u04a2\3\2\2\2\u04a8"+
		"\u00cf\3\2\2\2\u04a9\u04ae\5\u00d2j\2\u04aa\u04ab\7P\2\2\u04ab\u04ad\5"+
		"\u00d2j\2\u04ac\u04aa\3\2\2\2\u04ad\u04b0\3\2\2\2\u04ae\u04ac\3\2\2\2"+
		"\u04ae\u04af\3\2\2\2\u04af\u00d1\3\2\2\2\u04b0\u04ae\3\2\2\2\u04b1\u04b7"+
		"\5\u00d6l\2\u04b2\u04b3\5\u00f0y\2\u04b3\u04b4\5\u00d4k\2\u04b4\u04b5"+
		"\5\u00d2j\2\u04b5\u04b7\3\2\2\2\u04b6\u04b1\3\2\2\2\u04b6\u04b2\3\2\2"+
		"\2\u04b7\u00d3\3\2\2\2\u04b8\u04b9\t\b\2\2\u04b9\u00d5\3\2\2\2\u04ba\u04c0"+
		"\5\u00dan\2\u04bb\u04bc\7Y\2\2\u04bc\u04bd\5\u00d6l\2\u04bd\u04be\7Z\2"+
		"\2\u04be\u04bf\5\u00d6l\2\u04bf\u04c1\3\2\2\2\u04c0\u04bb\3\2\2\2\u04c0"+
		"\u04c1\3\2\2\2\u04c1\u00d7\3\2\2\2\u04c2\u04c3\5\u00d6l\2\u04c3\u00d9"+
		"\3\2\2\2\u04c4\u04c9\5\u00dco\2\u04c5\u04c6\7`\2\2\u04c6\u04c8\5\u00dc"+
		"o\2\u04c7\u04c5\3\2\2\2\u04c8\u04cb\3\2\2\2\u04c9\u04c7\3\2\2\2\u04c9"+
		"\u04ca\3\2\2\2\u04ca\u00db\3\2\2\2\u04cb\u04c9\3\2\2\2\u04cc\u04d1\5\u00de"+
		"p\2\u04cd\u04ce\7_\2\2\u04ce\u04d0\5\u00dep\2\u04cf\u04cd\3\2\2\2\u04d0"+
		"\u04d3\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u00dd\3\2"+
		"\2\2\u04d3\u04d1\3\2\2\2\u04d4\u04d9\5\u00e0q\2\u04d5\u04d6\7h\2\2\u04d6"+
		"\u04d8\5\u00e0q\2\u04d7\u04d5\3\2\2\2\u04d8\u04db\3\2\2\2\u04d9\u04d7"+
		"\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u00df\3\2\2\2\u04db\u04d9\3\2\2\2\u04dc"+
		"\u04e1\5\u00e2r\2\u04dd\u04de\7i\2\2\u04de\u04e0\5\u00e2r\2\u04df\u04dd"+
		"\3\2\2\2\u04e0\u04e3\3\2\2\2\u04e1\u04df\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2"+
		"\u00e1\3\2\2\2\u04e3\u04e1\3\2\2\2\u04e4\u04e9\5\u00e4s\2\u04e5\u04e6"+
		"\7g\2\2\u04e6\u04e8\5\u00e4s\2\u04e7\u04e5\3\2\2\2\u04e8\u04eb\3\2\2\2"+
		"\u04e9\u04e7\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u00e3\3\2\2\2\u04eb\u04e9"+
		"\3\2\2\2\u04ec\u04f1\5\u00e6t\2\u04ed\u04ee\t\t\2\2\u04ee\u04f0\5\u00e6"+
		"t\2\u04ef\u04ed\3\2\2\2\u04f0\u04f3\3\2\2\2\u04f1\u04ef\3\2\2\2\u04f1"+
		"\u04f2\3\2\2\2\u04f2\u00e5\3\2\2\2\u04f3\u04f1\3\2\2\2\u04f4\u04f9\5\u00e8"+
		"u\2\u04f5\u04f6\t\n\2\2\u04f6\u04f8\5\u00e8u\2\u04f7\u04f5\3\2\2\2\u04f8"+
		"\u04fb\3\2\2\2\u04f9\u04f7\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u00e7\3\2"+
		"\2\2\u04fb\u04f9\3\2\2\2\u04fc\u0501\5\u00eav\2\u04fd\u04fe\t\13\2\2\u04fe"+
		"\u0500\5\u00eav\2\u04ff\u04fd\3\2\2\2\u0500\u0503\3\2\2\2\u0501\u04ff"+
		"\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u00e9\3\2\2\2\u0503\u0501\3\2\2\2\u0504"+
		"\u0509\5\u00ecw\2\u0505\u0506\t\f\2\2\u0506\u0508\5\u00ecw\2\u0507\u0505"+
		"\3\2\2\2\u0508\u050b\3\2\2\2\u0509\u0507\3\2\2\2\u0509\u050a\3\2\2\2\u050a"+
		"\u00eb\3\2\2\2\u050b\u0509\3\2\2\2\u050c\u0511\5\u00eex\2\u050d\u050e"+
		"\t\r\2\2\u050e\u0510\5\u00eex\2\u050f\u050d\3\2\2\2\u0510\u0513\3\2\2"+
		"\2\u0511\u050f\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u00ed\3\2\2\2\u0513\u0511"+
		"\3\2\2\2\u0514\u0515\7I\2\2\u0515\u0516\5\u00b2Z\2\u0516\u0517\7J\2\2"+
		"\u0517\u0518\5\u00eex\2\u0518\u051b\3\2\2\2\u0519\u051b\5\u00f0y\2\u051a"+
		"\u0514\3\2\2\2\u051a\u0519\3\2\2\2\u051b\u00ef\3\2\2\2\u051c\u052d\5\u00f4"+
		"{\2\u051d\u051e\7a\2\2\u051e\u052d\5\u00f0y\2\u051f\u0520\7b\2\2\u0520"+
		"\u052d\5\u00f0y\2\u0521\u0522\5\u00f2z\2\u0522\u0523\5\u00eex\2\u0523"+
		"\u052d\3\2\2\2\u0524\u052a\7;\2\2\u0525\u0526\7I\2\2\u0526\u0527\5\u00b2"+
		"Z\2\u0527\u0528\7J\2\2\u0528\u052b\3\2\2\2\u0529\u052b\5\u00f0y\2\u052a"+
		"\u0525\3\2\2\2\u052a\u0529\3\2\2\2\u052b\u052d\3\2\2\2\u052c\u051c\3\2"+
		"\2\2\u052c\u051d\3\2\2\2\u052c\u051f\3\2\2\2\u052c\u0521\3\2\2\2\u052c"+
		"\u0524\3\2\2\2\u052d\u00f1\3\2\2\2\u052e\u052f\t\16\2\2\u052f\u00f3\3"+
		"\2\2\2\u0530\u0542\5X-\2\u0531\u0532\7M\2\2\u0532\u0533\5\u00d0i\2\u0533"+
		"\u0534\7N\2\2\u0534\u0541\3\2\2\2\u0535\u0537\7I\2\2\u0536\u0538\5\u00f6"+
		"|\2\u0537\u0536\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u0539\3\2\2\2\u0539"+
		"\u0541\7J\2\2\u053a\u053b\7Q\2\2\u053b\u0541\5\u00f8}\2\u053c\u053d\7"+
		"R\2\2\u053d\u0541\5\u00f8}\2\u053e\u0541\7a\2\2\u053f\u0541\7b\2\2\u0540"+
		"\u0531\3\2\2\2\u0540\u0535\3\2\2\2\u0540\u053a\3\2\2\2\u0540\u053c\3\2"+
		"\2\2\u0540\u053e\3\2\2\2\u0540\u053f\3\2\2\2\u0541\u0544\3\2\2\2\u0542"+
		"\u0540\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u00f5\3\2\2\2\u0544\u0542\3\2"+
		"\2\2\u0545\u054a\5\u00d2j\2\u0546\u0547\7P\2\2\u0547\u0549\5\u00d2j\2"+
		"\u0548\u0546\3\2\2\2\u0549\u054c\3\2\2\2\u054a\u0548\3\2\2\2\u054a\u054b"+
		"\3\2\2\2\u054b\u00f7\3\2\2\2\u054c\u054a\3\2\2\2\u054d\u054e\7\u0081\2"+
		"\2\u054e\u00f9\3\2\2\2\u054f\u0550\t\17\2\2\u0550\u00fb\3\2\2\2\u009e"+
		"\u00ff\u010f\u0117\u011a\u011d\u0120\u0128\u012c\u012f\u0132\u013a\u013d"+
		"\u0140\u014a\u0151\u0154\u0157\u015a\u015d\u016e\u017a\u017f\u018c\u019f"+
		"\u01ad\u01b6\u01be\u01c8\u01cd\u01d5\u01d7\u01e0\u01ea\u01ec\u01f5\u01f9"+
		"\u01fc\u0204\u0207\u0209\u020c\u0212\u0225\u022c\u0233\u0239\u023d\u0241"+
		"\u0247\u0258\u025d\u0264\u0269\u027e\u0287\u028d\u0291\u0298\u029e\u02a2"+
		"\u02ad\u02b3\u02b8\u02bc\u02c3\u02c6\u02d2\u02d8\u02da\u02dd\u02e9\u02ee"+
		"\u02f0\u0314\u0318\u0324\u032b\u0333\u0335\u0340\u0346\u034b\u0351\u0355"+
		"\u035e\u0360\u0367\u036c\u0370\u0375\u037c\u0382\u0398\u039f\u03a3\u03a8"+
		"\u03ac\u03b0\u03b3\u03b6\u03be\u03c7\u03cd\u03d1\u03d5\u03da\u03dd\u03e2"+
		"\u03e6\u03e9\u03f2\u03f6\u03fa\u0400\u040b\u040f\u0414\u0417\u041b\u0420"+
		"\u0423\u042a\u0430\u043e\u044c\u0451\u0453\u045f\u0467\u046e\u0479\u047d"+
		"\u0481\u0498\u04a4\u04a7\u04ae\u04b6\u04c0\u04c9\u04d1\u04d9\u04e1\u04e9"+
		"\u04f1\u04f9\u0501\u0509\u0511\u051a\u052a\u052c\u0537\u0540\u0542\u054a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}