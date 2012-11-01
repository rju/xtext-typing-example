package de.cau.cs.se.lad.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cau.cs.se.lad.services.AppLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAppLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'extends'", "'{'", "'}'", "'service'", "'('", "','", "')'", "'op'", "'return'", "'or'", "'+'", "'null'", "'['", "']'", "'.'", "'model'", "'start'", "'new'", "'view'", "'container'", "'<'", "'>'", "'decode'", "'encode'", "'get'", "'put'", "'button'", "'value-spinner'", "'date-spinner'", "'label'", "'text'", "'input'", "'canvas'", "'tree-list'", "'px'", "'%'", "'horizontal'", "'vertical'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalAppLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAppLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAppLangParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private AppLangGrammarAccess grammarAccess;
     	
        public InternalAppLangParser(TokenStream input, AppLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected AppLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:74:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:75:2: (iv_ruleModel= ruleModel EOF )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:76:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel81);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel91); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:83:1: ruleModel returns [EObject current=null] : ( ( ( (lv_services_0_0= ruleService ) ) | ( (lv_views_1_0= ruleView ) ) | ( (lv_classes_2_0= ruleClass ) ) )* ( (lv_model_3_0= ruleDataModel ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_services_0_0 = null;

        EObject lv_views_1_0 = null;

        EObject lv_classes_2_0 = null;

        EObject lv_model_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:86:28: ( ( ( ( (lv_services_0_0= ruleService ) ) | ( (lv_views_1_0= ruleView ) ) | ( (lv_classes_2_0= ruleClass ) ) )* ( (lv_model_3_0= ruleDataModel ) ) ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:87:1: ( ( ( (lv_services_0_0= ruleService ) ) | ( (lv_views_1_0= ruleView ) ) | ( (lv_classes_2_0= ruleClass ) ) )* ( (lv_model_3_0= ruleDataModel ) ) )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:87:1: ( ( ( (lv_services_0_0= ruleService ) ) | ( (lv_views_1_0= ruleView ) ) | ( (lv_classes_2_0= ruleClass ) ) )* ( (lv_model_3_0= ruleDataModel ) ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:87:2: ( ( (lv_services_0_0= ruleService ) ) | ( (lv_views_1_0= ruleView ) ) | ( (lv_classes_2_0= ruleClass ) ) )* ( (lv_model_3_0= ruleDataModel ) )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:87:2: ( ( (lv_services_0_0= ruleService ) ) | ( (lv_views_1_0= ruleView ) ) | ( (lv_classes_2_0= ruleClass ) ) )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case 15:
                    {
                    alt1=1;
                    }
                    break;
                case 30:
                    {
                    alt1=2;
                    }
                    break;
                case 11:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:87:3: ( (lv_services_0_0= ruleService ) )
            	    {
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:87:3: ( (lv_services_0_0= ruleService ) )
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:88:1: (lv_services_0_0= ruleService )
            	    {
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:88:1: (lv_services_0_0= ruleService )
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:89:3: lv_services_0_0= ruleService
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getServicesServiceParserRuleCall_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleService_in_ruleModel138);
            	    lv_services_0_0=ruleService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"services",
            	              		lv_services_0_0, 
            	              		"Service");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:106:6: ( (lv_views_1_0= ruleView ) )
            	    {
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:106:6: ( (lv_views_1_0= ruleView ) )
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:107:1: (lv_views_1_0= ruleView )
            	    {
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:107:1: (lv_views_1_0= ruleView )
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:108:3: lv_views_1_0= ruleView
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getViewsViewParserRuleCall_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleView_in_ruleModel165);
            	    lv_views_1_0=ruleView();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"views",
            	              		lv_views_1_0, 
            	              		"View");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:125:6: ( (lv_classes_2_0= ruleClass ) )
            	    {
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:125:6: ( (lv_classes_2_0= ruleClass ) )
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:126:1: (lv_classes_2_0= ruleClass )
            	    {
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:126:1: (lv_classes_2_0= ruleClass )
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:127:3: lv_classes_2_0= ruleClass
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getClassesClassParserRuleCall_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleClass_in_ruleModel192);
            	    lv_classes_2_0=ruleClass();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"classes",
            	              		lv_classes_2_0, 
            	              		"Class");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:143:4: ( (lv_model_3_0= ruleDataModel ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:144:1: (lv_model_3_0= ruleDataModel )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:144:1: (lv_model_3_0= ruleDataModel )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:145:3: lv_model_3_0= ruleDataModel
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getModelDataModelParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDataModel_in_ruleModel215);
            lv_model_3_0=ruleDataModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelRule());
              	        }
                     		set(
                     			current, 
                     			"model",
                      		lv_model_3_0, 
                      		"DataModel");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleClass"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:169:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:170:2: (iv_ruleClass= ruleClass EOF )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:171:2: iv_ruleClass= ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass251);
            iv_ruleClass=ruleClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass261); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:178:1: ruleClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )+ otherlv_6= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:181:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )+ otherlv_6= '}' ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:182:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )+ otherlv_6= '}' )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:182:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )+ otherlv_6= '}' )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:182:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleClass298); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassKeyword_0());
                  
            }
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:186:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:187:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:187:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:188:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass315); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClassRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:204:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:204:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleClass333); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getClassAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:208:1: ( (otherlv_3= RULE_ID ) )
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:209:1: (otherlv_3= RULE_ID )
                    {
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:209:1: (otherlv_3= RULE_ID )
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:210:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass357); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getClassAccess().getParentClassTypeCrossReference_2_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleClass371); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:228:1: ( (lv_properties_5_0= ruleProperty ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:229:1: (lv_properties_5_0= ruleProperty )
            	    {
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:229:1: (lv_properties_5_0= ruleProperty )
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:230:3: lv_properties_5_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassAccess().getPropertiesPropertyParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProperty_in_ruleClass392);
            	    lv_properties_5_0=ruleProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"properties",
            	              		lv_properties_5_0, 
            	              		"Property");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleClass405); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleService"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:258:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:259:2: (iv_ruleService= ruleService EOF )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:260:2: iv_ruleService= ruleService EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceRule()); 
            }
            pushFollow(FOLLOW_ruleService_in_entryRuleService441);
            iv_ruleService=ruleService();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleService; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleService451); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:267:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_configurations_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_configurations_5_0= ruleProperty ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) )+ otherlv_9= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_configurations_3_0 = null;

        EObject lv_configurations_5_0 = null;

        EObject lv_operations_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:270:28: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_configurations_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_configurations_5_0= ruleProperty ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) )+ otherlv_9= '}' ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:271:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_configurations_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_configurations_5_0= ruleProperty ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) )+ otherlv_9= '}' )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:271:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_configurations_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_configurations_5_0= ruleProperty ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) )+ otherlv_9= '}' )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:271:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_configurations_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_configurations_5_0= ruleProperty ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_operations_8_0= ruleOperation ) )+ otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleService488); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                  
            }
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:275:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:276:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:276:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:277:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService505); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getServiceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleService522); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:297:1: ( (lv_configurations_3_0= ruleProperty ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:298:1: (lv_configurations_3_0= ruleProperty )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:298:1: (lv_configurations_3_0= ruleProperty )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:299:3: lv_configurations_3_0= ruleProperty
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getServiceAccess().getConfigurationsPropertyParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleProperty_in_ruleService543);
            lv_configurations_3_0=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getServiceRule());
              	        }
                     		add(
                     			current, 
                     			"configurations",
                      		lv_configurations_3_0, 
                      		"Property");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:315:2: (otherlv_4= ',' ( (lv_configurations_5_0= ruleProperty ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:315:4: otherlv_4= ',' ( (lv_configurations_5_0= ruleProperty ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleService556); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:319:1: ( (lv_configurations_5_0= ruleProperty ) )
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:320:1: (lv_configurations_5_0= ruleProperty )
            	    {
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:320:1: (lv_configurations_5_0= ruleProperty )
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:321:3: lv_configurations_5_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getServiceAccess().getConfigurationsPropertyParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProperty_in_ruleService577);
            	    lv_configurations_5_0=ruleProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"configurations",
            	              		lv_configurations_5_0, 
            	              		"Property");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleService591); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getRightParenthesisKeyword_5());
                  
            }
            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleService603); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_6());
                  
            }
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:345:1: ( (lv_operations_8_0= ruleOperation ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:346:1: (lv_operations_8_0= ruleOperation )
            	    {
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:346:1: (lv_operations_8_0= ruleOperation )
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:347:3: lv_operations_8_0= ruleOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getServiceAccess().getOperationsOperationParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOperation_in_ruleService624);
            	    lv_operations_8_0=ruleOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"operations",
            	              		lv_operations_8_0, 
            	              		"Operation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleService637); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleOperation"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:375:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:376:2: (iv_ruleOperation= ruleOperation EOF )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:377:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation673);
            iv_ruleOperation=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation683); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:384:1: ruleOperation returns [EObject current=null] : (otherlv_0= 'op' ( (lv_type_1_0= ruleTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleProperty ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleProperty ) ) )* otherlv_7= ')' otherlv_8= 'return' ( (lv_expression_9_0= ruleExpression ) ) ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_type_1_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_expression_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:387:28: ( (otherlv_0= 'op' ( (lv_type_1_0= ruleTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleProperty ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleProperty ) ) )* otherlv_7= ')' otherlv_8= 'return' ( (lv_expression_9_0= ruleExpression ) ) ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:388:1: (otherlv_0= 'op' ( (lv_type_1_0= ruleTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleProperty ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleProperty ) ) )* otherlv_7= ')' otherlv_8= 'return' ( (lv_expression_9_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:388:1: (otherlv_0= 'op' ( (lv_type_1_0= ruleTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleProperty ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleProperty ) ) )* otherlv_7= ')' otherlv_8= 'return' ( (lv_expression_9_0= ruleExpression ) ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:388:3: otherlv_0= 'op' ( (lv_type_1_0= ruleTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleProperty ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleProperty ) ) )* otherlv_7= ')' otherlv_8= 'return' ( (lv_expression_9_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleOperation720); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getOpKeyword_0());
                  
            }
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:392:1: ( (lv_type_1_0= ruleTypeReference ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:393:1: (lv_type_1_0= ruleTypeReference )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:393:1: (lv_type_1_0= ruleTypeReference )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:394:3: lv_type_1_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationAccess().getTypeTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeReference_in_ruleOperation741);
            lv_type_1_0=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"TypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:410:2: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:411:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:411:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:412:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperation758); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOperationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleOperation775); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:432:1: ( (lv_parameters_4_0= ruleProperty ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:433:1: (lv_parameters_4_0= ruleProperty )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:433:1: (lv_parameters_4_0= ruleProperty )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:434:3: lv_parameters_4_0= ruleProperty
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationAccess().getParametersPropertyParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleProperty_in_ruleOperation796);
            lv_parameters_4_0=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperationRule());
              	        }
                     		add(
                     			current, 
                     			"parameters",
                      		lv_parameters_4_0, 
                      		"Property");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:450:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleProperty ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:450:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleProperty ) )
            	    {
            	    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleOperation809); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:454:1: ( (lv_parameters_6_0= ruleProperty ) )
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:455:1: (lv_parameters_6_0= ruleProperty )
            	    {
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:455:1: (lv_parameters_6_0= ruleProperty )
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:456:3: lv_parameters_6_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOperationAccess().getParametersPropertyParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProperty_in_ruleOperation830);
            	    lv_parameters_6_0=ruleProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOperationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parameters",
            	              		lv_parameters_6_0, 
            	              		"Property");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleOperation844); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getRightParenthesisKeyword_6());
                  
            }
            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleOperation856); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getOperationAccess().getReturnKeyword_7());
                  
            }
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:480:1: ( (lv_expression_9_0= ruleExpression ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:481:1: (lv_expression_9_0= ruleExpression )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:481:1: (lv_expression_9_0= ruleExpression )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:482:3: lv_expression_9_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationAccess().getExpressionExpressionParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleOperation877);
            lv_expression_9_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperationRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_9_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleExpression"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:506:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:507:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:508:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression913);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression923); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:515:1: ruleExpression returns [EObject current=null] : (this_BaseExpression_0= ruleBaseExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleBaseExpression ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BaseExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:518:28: ( (this_BaseExpression_0= ruleBaseExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleBaseExpression ) ) )? ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:519:1: (this_BaseExpression_0= ruleBaseExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleBaseExpression ) ) )? )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:519:1: (this_BaseExpression_0= ruleBaseExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleBaseExpression ) ) )? )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:520:2: this_BaseExpression_0= ruleBaseExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleBaseExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getBaseExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBaseExpression_in_ruleExpression973);
            this_BaseExpression_0=ruleBaseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BaseExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:531:1: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleBaseExpression ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:531:2: () otherlv_2= 'or' ( (lv_right_3_0= ruleBaseExpression ) )
                    {
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:531:2: ()
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:532:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleExpression997); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getOrKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:544:1: ( (lv_right_3_0= ruleBaseExpression ) )
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:545:1: (lv_right_3_0= ruleBaseExpression )
                    {
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:545:1: (lv_right_3_0= ruleBaseExpression )
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:546:3: lv_right_3_0= ruleBaseExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getRightBaseExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBaseExpression_in_ruleExpression1018);
                    lv_right_3_0=ruleBaseExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"BaseExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBaseExpression"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:570:1: entryRuleBaseExpression returns [EObject current=null] : iv_ruleBaseExpression= ruleBaseExpression EOF ;
    public final EObject entryRuleBaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseExpression = null;


        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:571:2: (iv_ruleBaseExpression= ruleBaseExpression EOF )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:572:2: iv_ruleBaseExpression= ruleBaseExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBaseExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBaseExpression_in_entryRuleBaseExpression1056);
            iv_ruleBaseExpression=ruleBaseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBaseExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseExpression1066); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBaseExpression"


    // $ANTLR start "ruleBaseExpression"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:579:1: ruleBaseExpression returns [EObject current=null] : (this_Function_0= ruleFunction | this_NullLiteral_1= ruleNullLiteral | this_StringExpression_2= ruleStringExpression ) ;
    public final EObject ruleBaseExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Function_0 = null;

        EObject this_NullLiteral_1 = null;

        EObject this_StringExpression_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:582:28: ( (this_Function_0= ruleFunction | this_NullLiteral_1= ruleNullLiteral | this_StringExpression_2= ruleStringExpression ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:583:1: (this_Function_0= ruleFunction | this_NullLiteral_1= ruleNullLiteral | this_StringExpression_2= ruleStringExpression )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:583:1: (this_Function_0= ruleFunction | this_NullLiteral_1= ruleNullLiteral | this_StringExpression_2= ruleStringExpression )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 34:
            case 35:
            case 36:
            case 37:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:584:2: this_Function_0= ruleFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBaseExpressionAccess().getFunctionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunction_in_ruleBaseExpression1116);
                    this_Function_0=ruleFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Function_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:597:2: this_NullLiteral_1= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBaseExpressionAccess().getNullLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleBaseExpression1146);
                    this_NullLiteral_1=ruleNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NullLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:610:2: this_StringExpression_2= ruleStringExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBaseExpressionAccess().getStringExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringExpression_in_ruleBaseExpression1176);
                    this_StringExpression_2=ruleStringExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBaseExpression"


    // $ANTLR start "entryRuleStringExpression"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:629:1: entryRuleStringExpression returns [EObject current=null] : iv_ruleStringExpression= ruleStringExpression EOF ;
    public final EObject entryRuleStringExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringExpression = null;


        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:630:2: (iv_ruleStringExpression= ruleStringExpression EOF )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:631:2: iv_ruleStringExpression= ruleStringExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleStringExpression_in_entryRuleStringExpression1211);
            iv_ruleStringExpression=ruleStringExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringExpression1221); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringExpression"


    // $ANTLR start "ruleStringExpression"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:638:1: ruleStringExpression returns [EObject current=null] : (this_StringValue_0= ruleStringValue ( () otherlv_2= '+' ( (lv_right_3_0= ruleStringValue ) ) )* ) ;
    public final EObject ruleStringExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_StringValue_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:641:28: ( (this_StringValue_0= ruleStringValue ( () otherlv_2= '+' ( (lv_right_3_0= ruleStringValue ) ) )* ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:642:1: (this_StringValue_0= ruleStringValue ( () otherlv_2= '+' ( (lv_right_3_0= ruleStringValue ) ) )* )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:642:1: (this_StringValue_0= ruleStringValue ( () otherlv_2= '+' ( (lv_right_3_0= ruleStringValue ) ) )* )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:643:2: this_StringValue_0= ruleStringValue ( () otherlv_2= '+' ( (lv_right_3_0= ruleStringValue ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getStringExpressionAccess().getStringValueParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleStringValue_in_ruleStringExpression1271);
            this_StringValue_0=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_StringValue_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:654:1: ( () otherlv_2= '+' ( (lv_right_3_0= ruleStringValue ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:654:2: () otherlv_2= '+' ( (lv_right_3_0= ruleStringValue ) )
            	    {
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:654:2: ()
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:655:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getStringExpressionAccess().getStringExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleStringExpression1295); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getStringExpressionAccess().getPlusSignKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:667:1: ( (lv_right_3_0= ruleStringValue ) )
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:668:1: (lv_right_3_0= ruleStringValue )
            	    {
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:668:1: (lv_right_3_0= ruleStringValue )
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:669:3: lv_right_3_0= ruleStringValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStringExpressionAccess().getRightStringValueParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStringValue_in_ruleStringExpression1316);
            	    lv_right_3_0=ruleStringValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStringExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"StringValue");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringExpression"


    // $ANTLR start "entryRuleStringValue"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:693:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:694:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:695:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue1354);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue1364); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:702:1: ruleStringValue returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_StringProperty_1= ruleStringProperty ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_StringProperty_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:705:28: ( (this_StringLiteral_0= ruleStringLiteral | this_StringProperty_1= ruleStringProperty ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:706:1: (this_StringLiteral_0= ruleStringLiteral | this_StringProperty_1= ruleStringProperty )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:706:1: (this_StringLiteral_0= ruleStringLiteral | this_StringProperty_1= ruleStringProperty )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:707:2: this_StringLiteral_0= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStringValueAccess().getStringLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleStringValue1414);
                    this_StringLiteral_0=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:720:2: this_StringProperty_1= ruleStringProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStringValueAccess().getStringPropertyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringProperty_in_ruleStringValue1444);
                    this_StringProperty_1=ruleStringProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringProperty_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleStringProperty"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:739:1: entryRuleStringProperty returns [EObject current=null] : iv_ruleStringProperty= ruleStringProperty EOF ;
    public final EObject entryRuleStringProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringProperty = null;


        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:740:2: (iv_ruleStringProperty= ruleStringProperty EOF )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:741:2: iv_ruleStringProperty= ruleStringProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleStringProperty_in_entryRuleStringProperty1479);
            iv_ruleStringProperty=ruleStringProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringProperty1489); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringProperty"


    // $ANTLR start "ruleStringProperty"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:748:1: ruleStringProperty returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleStringProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:751:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:752:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:752:1: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:753:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:753:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:754:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getStringPropertyRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringProperty1537); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getStringPropertyAccess().getReferencePropertyCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringProperty"


    // $ANTLR start "entryRuleStringLiteral"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:776:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:777:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:778:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1572);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1582); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:785:1: ruleStringLiteral returns [EObject current=null] : ( (lv_literal_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_literal_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:788:28: ( ( (lv_literal_0_0= RULE_STRING ) ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:789:1: ( (lv_literal_0_0= RULE_STRING ) )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:789:1: ( (lv_literal_0_0= RULE_STRING ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:790:1: (lv_literal_0_0= RULE_STRING )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:790:1: (lv_literal_0_0= RULE_STRING )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:791:3: lv_literal_0_0= RULE_STRING
            {
            lv_literal_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral1623); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_literal_0_0, grammarAccess.getStringLiteralAccess().getLiteralSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"literal",
                      		lv_literal_0_0, 
                      		"STRING");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleNullLiteral"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:815:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:816:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:817:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral1663);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral1673); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullLiteral"


    // $ANTLR start "ruleNullLiteral"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:824:1: ruleNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:827:28: ( ( () otherlv_1= 'null' ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:828:1: ( () otherlv_1= 'null' )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:828:1: ( () otherlv_1= 'null' )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:828:2: () otherlv_1= 'null'
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:828:2: ()
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:829:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNullLiteralAccess().getNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleNullLiteral1722); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullLiteral"


    // $ANTLR start "entryRuleFunction"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:849:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:850:2: (iv_ruleFunction= ruleFunction EOF )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:851:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction1758);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction1768); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:858:1: ruleFunction returns [EObject current=null] : ( ( (lv_name_0_0= ruleFunctionEnum ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_name_0_0 = null;

        EObject lv_expressions_2_0 = null;

        EObject lv_expressions_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:861:28: ( ( ( (lv_name_0_0= ruleFunctionEnum ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) )* otherlv_5= ')' ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:862:1: ( ( (lv_name_0_0= ruleFunctionEnum ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) )* otherlv_5= ')' )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:862:1: ( ( (lv_name_0_0= ruleFunctionEnum ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) )* otherlv_5= ')' )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:862:2: ( (lv_name_0_0= ruleFunctionEnum ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) )* otherlv_5= ')'
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:862:2: ( (lv_name_0_0= ruleFunctionEnum ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:863:1: (lv_name_0_0= ruleFunctionEnum )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:863:1: (lv_name_0_0= ruleFunctionEnum )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:864:3: lv_name_0_0= ruleFunctionEnum
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionAccess().getNameFunctionEnumEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFunctionEnum_in_ruleFunction1814);
            lv_name_0_0=ruleFunctionEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"FunctionEnum");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleFunction1826); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:884:1: ( (lv_expressions_2_0= ruleExpression ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:885:1: (lv_expressions_2_0= ruleExpression )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:885:1: (lv_expressions_2_0= ruleExpression )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:886:3: lv_expressions_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionAccess().getExpressionsExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleFunction1847);
            lv_expressions_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionRule());
              	        }
                     		add(
                     			current, 
                     			"expressions",
                      		lv_expressions_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:902:2: (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:902:4: otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleFunction1860); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:906:1: ( (lv_expressions_4_0= ruleExpression ) )
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:907:1: (lv_expressions_4_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:907:1: (lv_expressions_4_0= ruleExpression )
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:908:3: lv_expressions_4_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionAccess().getExpressionsExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleFunction1881);
            	    lv_expressions_4_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFunctionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_4_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleFunction1895); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleProperty"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:936:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:937:2: (iv_ruleProperty= ruleProperty EOF )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:938:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1931);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1941); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:945:1: ruleProperty returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:948:28: ( ( ( (lv_type_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:949:1: ( ( (lv_type_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:949:1: ( ( (lv_type_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:949:2: ( (lv_type_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:949:2: ( (lv_type_0_0= ruleTypeReference ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:950:1: (lv_type_0_0= ruleTypeReference )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:950:1: (lv_type_0_0= ruleTypeReference )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:951:3: lv_type_0_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeReference_in_ruleProperty1987);
            lv_type_0_0=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"TypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:967:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:968:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:968:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:969:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty2004); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleTypeReference"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:993:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:994:2: (iv_ruleTypeReference= ruleTypeReference EOF )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:995:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleTypeReference_in_entryRuleTypeReference2045);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeReference2055); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1002:1: ruleTypeReference returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_size_3_0= RULE_INT ) )? otherlv_4= ']' ) | ( () ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (lv_remainder_8_0= ruleTypeReference ) ) )? ) ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_size_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_remainder_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1005:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_size_3_0= RULE_INT ) )? otherlv_4= ']' ) | ( () ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (lv_remainder_8_0= ruleTypeReference ) ) )? ) ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1006:1: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_size_3_0= RULE_INT ) )? otherlv_4= ']' ) | ( () ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (lv_remainder_8_0= ruleTypeReference ) ) )? ) )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1006:1: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_size_3_0= RULE_INT ) )? otherlv_4= ']' ) | ( () ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (lv_remainder_8_0= ruleTypeReference ) ) )? ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==24) ) {
                    alt14=1;
                }
                else if ( (LA14_1==EOF||LA14_1==RULE_ID||LA14_1==26) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1006:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_size_3_0= RULE_INT ) )? otherlv_4= ']' )
                    {
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1006:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_size_3_0= RULE_INT ) )? otherlv_4= ']' )
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1006:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_size_3_0= RULE_INT ) )? otherlv_4= ']'
                    {
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1006:3: ()
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1007:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeReferenceAccess().getArrayTypeAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1015:2: ( (otherlv_1= RULE_ID ) )
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1016:1: (otherlv_1= RULE_ID )
                    {
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1016:1: (otherlv_1= RULE_ID )
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1017:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeReferenceRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeReference2117); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getTypeReferenceAccess().getTypeTypeCrossReference_0_1_0()); 
                      	
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleTypeReference2129); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTypeReferenceAccess().getLeftSquareBracketKeyword_0_2());
                          
                    }
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1035:1: ( (lv_size_3_0= RULE_INT ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_INT) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1036:1: (lv_size_3_0= RULE_INT )
                            {
                            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1036:1: (lv_size_3_0= RULE_INT )
                            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1037:3: lv_size_3_0= RULE_INT
                            {
                            lv_size_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTypeReference2146); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_size_3_0, grammarAccess.getTypeReferenceAccess().getSizeINTTerminalRuleCall_0_3_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getTypeReferenceRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"size",
                                      		lv_size_3_0, 
                                      		"INT");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleTypeReference2164); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTypeReferenceAccess().getRightSquareBracketKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1058:6: ( () ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (lv_remainder_8_0= ruleTypeReference ) ) )? )
                    {
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1058:6: ( () ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (lv_remainder_8_0= ruleTypeReference ) ) )? )
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1058:7: () ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (lv_remainder_8_0= ruleTypeReference ) ) )?
                    {
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1058:7: ()
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1059:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeReferenceAccess().getTypeReferenceAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1067:2: ( (otherlv_6= RULE_ID ) )
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1068:1: (otherlv_6= RULE_ID )
                    {
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1068:1: (otherlv_6= RULE_ID )
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1069:3: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeReferenceRule());
                      	        }
                              
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeReference2208); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_6, grammarAccess.getTypeReferenceAccess().getTypeTypeCrossReference_1_1_0()); 
                      	
                    }

                    }


                    }

                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1083:2: (otherlv_7= '.' ( (lv_remainder_8_0= ruleTypeReference ) ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==26) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1083:4: otherlv_7= '.' ( (lv_remainder_8_0= ruleTypeReference ) )
                            {
                            otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleTypeReference2221); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getTypeReferenceAccess().getFullStopKeyword_1_2_0());
                                  
                            }
                            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1087:1: ( (lv_remainder_8_0= ruleTypeReference ) )
                            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1088:1: (lv_remainder_8_0= ruleTypeReference )
                            {
                            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1088:1: (lv_remainder_8_0= ruleTypeReference )
                            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1089:3: lv_remainder_8_0= ruleTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTypeReferenceAccess().getRemainderTypeReferenceParserRuleCall_1_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleTypeReference_in_ruleTypeReference2242);
                            lv_remainder_8_0=ruleTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTypeReferenceRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"remainder",
                                      		lv_remainder_8_0, 
                                      		"TypeReference");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleDataModel"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1113:1: entryRuleDataModel returns [EObject current=null] : iv_ruleDataModel= ruleDataModel EOF ;
    public final EObject entryRuleDataModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataModel = null;


        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1114:2: (iv_ruleDataModel= ruleDataModel EOF )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1115:2: iv_ruleDataModel= ruleDataModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataModelRule()); 
            }
            pushFollow(FOLLOW_ruleDataModel_in_entryRuleDataModel2281);
            iv_ruleDataModel=ruleDataModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataModel2291); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataModel"


    // $ANTLR start "ruleDataModel"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1122:1: ruleDataModel returns [EObject current=null] : ( () otherlv_1= 'model' otherlv_2= '{' ( (lv_instances_3_0= ruleInstance ) )* otherlv_4= 'start' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) ;
    public final EObject ruleDataModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_instances_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1125:28: ( ( () otherlv_1= 'model' otherlv_2= '{' ( (lv_instances_3_0= ruleInstance ) )* otherlv_4= 'start' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1126:1: ( () otherlv_1= 'model' otherlv_2= '{' ( (lv_instances_3_0= ruleInstance ) )* otherlv_4= 'start' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1126:1: ( () otherlv_1= 'model' otherlv_2= '{' ( (lv_instances_3_0= ruleInstance ) )* otherlv_4= 'start' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1126:2: () otherlv_1= 'model' otherlv_2= '{' ( (lv_instances_3_0= ruleInstance ) )* otherlv_4= 'start' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}'
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1126:2: ()
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1127:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDataModelAccess().getDataModelAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleDataModel2340); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDataModelAccess().getModelKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleDataModel2352); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1143:1: ( (lv_instances_3_0= ruleInstance ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1144:1: (lv_instances_3_0= ruleInstance )
            	    {
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1144:1: (lv_instances_3_0= ruleInstance )
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1145:3: lv_instances_3_0= ruleInstance
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDataModelAccess().getInstancesInstanceParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInstance_in_ruleDataModel2373);
            	    lv_instances_3_0=ruleInstance();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDataModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"instances",
            	              		lv_instances_3_0, 
            	              		"Instance");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleDataModel2386); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDataModelAccess().getStartKeyword_4());
                  
            }
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1165:1: ( (otherlv_5= RULE_ID ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1166:1: (otherlv_5= RULE_ID )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1166:1: (otherlv_5= RULE_ID )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1167:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDataModelRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataModel2410); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getDataModelAccess().getViewInstanceCrossReference_5_0()); 
              	
            }

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleDataModel2422); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataModel"


    // $ANTLR start "entryRuleInstance"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1193:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1194:2: (iv_ruleInstance= ruleInstance EOF )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1195:2: iv_ruleInstance= ruleInstance EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceRule()); 
            }
            pushFollow(FOLLOW_ruleInstance_in_entryRuleInstance2458);
            iv_ruleInstance=ruleInstance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstance; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstance2468); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstance"


    // $ANTLR start "ruleInstance"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1202:1: ruleInstance returns [EObject current=null] : (otherlv_0= 'new' ( (lv_type_1_0= ruleTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1205:28: ( (otherlv_0= 'new' ( (lv_type_1_0= ruleTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1206:1: (otherlv_0= 'new' ( (lv_type_1_0= ruleTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1206:1: (otherlv_0= 'new' ( (lv_type_1_0= ruleTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1206:3: otherlv_0= 'new' ( (lv_type_1_0= ruleTypeReference ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleInstance2505); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getNewKeyword_0());
                  
            }
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1210:1: ( (lv_type_1_0= ruleTypeReference ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1211:1: (lv_type_1_0= ruleTypeReference )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1211:1: (lv_type_1_0= ruleTypeReference )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1212:3: lv_type_1_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstanceAccess().getTypeTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeReference_in_ruleInstance2526);
            lv_type_1_0=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInstanceRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"TypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1228:2: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1229:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1229:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1230:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstance2543); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInstanceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstance"


    // $ANTLR start "entryRuleView"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1254:1: entryRuleView returns [EObject current=null] : iv_ruleView= ruleView EOF ;
    public final EObject entryRuleView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleView = null;


        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1255:2: (iv_ruleView= ruleView EOF )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1256:2: iv_ruleView= ruleView EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getViewRule()); 
            }
            pushFollow(FOLLOW_ruleView_in_entryRuleView2584);
            iv_ruleView=ruleView();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleView; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleView2594); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleView"


    // $ANTLR start "ruleView"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1263:1: ruleView returns [EObject current=null] : (otherlv_0= 'view' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_layout_3_0= ruleLayout ) ) ( (lv_contents_4_0= ruleViewContent ) )* otherlv_5= '}' ) ;
    public final EObject ruleView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_layout_3_0 = null;

        EObject lv_contents_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1266:28: ( (otherlv_0= 'view' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_layout_3_0= ruleLayout ) ) ( (lv_contents_4_0= ruleViewContent ) )* otherlv_5= '}' ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1267:1: (otherlv_0= 'view' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_layout_3_0= ruleLayout ) ) ( (lv_contents_4_0= ruleViewContent ) )* otherlv_5= '}' )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1267:1: (otherlv_0= 'view' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_layout_3_0= ruleLayout ) ) ( (lv_contents_4_0= ruleViewContent ) )* otherlv_5= '}' )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1267:3: otherlv_0= 'view' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_layout_3_0= ruleLayout ) ) ( (lv_contents_4_0= ruleViewContent ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleView2631); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getViewAccess().getViewKeyword_0());
                  
            }
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1271:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1272:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1272:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1273:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleView2648); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getViewAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getViewRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleView2665); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getViewAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1293:1: ( (lv_layout_3_0= ruleLayout ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1294:1: (lv_layout_3_0= ruleLayout )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1294:1: (lv_layout_3_0= ruleLayout )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1295:3: lv_layout_3_0= ruleLayout
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getViewAccess().getLayoutLayoutParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLayout_in_ruleView2686);
            lv_layout_3_0=ruleLayout();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getViewRule());
              	        }
                     		set(
                     			current, 
                     			"layout",
                      		lv_layout_3_0, 
                      		"Layout");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1311:2: ( (lv_contents_4_0= ruleViewContent ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31||(LA16_0>=38 && LA16_0<=45)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1312:1: (lv_contents_4_0= ruleViewContent )
            	    {
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1312:1: (lv_contents_4_0= ruleViewContent )
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1313:3: lv_contents_4_0= ruleViewContent
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getViewAccess().getContentsViewContentParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleViewContent_in_ruleView2707);
            	    lv_contents_4_0=ruleViewContent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getViewRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"contents",
            	              		lv_contents_4_0, 
            	              		"ViewContent");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleView2720); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getViewAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleView"


    // $ANTLR start "entryRuleViewContent"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1341:1: entryRuleViewContent returns [EObject current=null] : iv_ruleViewContent= ruleViewContent EOF ;
    public final EObject entryRuleViewContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewContent = null;


        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1342:2: (iv_ruleViewContent= ruleViewContent EOF )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1343:2: iv_ruleViewContent= ruleViewContent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getViewContentRule()); 
            }
            pushFollow(FOLLOW_ruleViewContent_in_entryRuleViewContent2756);
            iv_ruleViewContent=ruleViewContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleViewContent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewContent2766); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleViewContent"


    // $ANTLR start "ruleViewContent"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1350:1: ruleViewContent returns [EObject current=null] : (this_ViewElement_0= ruleViewElement | this_ViewContainer_1= ruleViewContainer ) ;
    public final EObject ruleViewContent() throws RecognitionException {
        EObject current = null;

        EObject this_ViewElement_0 = null;

        EObject this_ViewContainer_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1353:28: ( (this_ViewElement_0= ruleViewElement | this_ViewContainer_1= ruleViewContainer ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1354:1: (this_ViewElement_0= ruleViewElement | this_ViewContainer_1= ruleViewContainer )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1354:1: (this_ViewElement_0= ruleViewElement | this_ViewContainer_1= ruleViewContainer )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=38 && LA17_0<=45)) ) {
                alt17=1;
            }
            else if ( (LA17_0==31) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1355:2: this_ViewElement_0= ruleViewElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getViewContentAccess().getViewElementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleViewElement_in_ruleViewContent2816);
                    this_ViewElement_0=ruleViewElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ViewElement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1368:2: this_ViewContainer_1= ruleViewContainer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getViewContentAccess().getViewContainerParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleViewContainer_in_ruleViewContent2846);
                    this_ViewContainer_1=ruleViewContainer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ViewContainer_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViewContent"


    // $ANTLR start "entryRuleViewContainer"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1387:1: entryRuleViewContainer returns [EObject current=null] : iv_ruleViewContainer= ruleViewContainer EOF ;
    public final EObject entryRuleViewContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewContainer = null;


        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1388:2: (iv_ruleViewContainer= ruleViewContainer EOF )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1389:2: iv_ruleViewContainer= ruleViewContainer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getViewContainerRule()); 
            }
            pushFollow(FOLLOW_ruleViewContainer_in_entryRuleViewContainer2881);
            iv_ruleViewContainer=ruleViewContainer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleViewContainer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewContainer2891); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleViewContainer"


    // $ANTLR start "ruleViewContainer"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1396:1: ruleViewContainer returns [EObject current=null] : (otherlv_0= 'container' otherlv_1= '{' ( (lv_layout_2_0= ruleLayout ) ) ( (lv_contents_3_0= ruleViewContent ) )* otherlv_4= '}' ) ;
    public final EObject ruleViewContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_layout_2_0 = null;

        EObject lv_contents_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1399:28: ( (otherlv_0= 'container' otherlv_1= '{' ( (lv_layout_2_0= ruleLayout ) ) ( (lv_contents_3_0= ruleViewContent ) )* otherlv_4= '}' ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1400:1: (otherlv_0= 'container' otherlv_1= '{' ( (lv_layout_2_0= ruleLayout ) ) ( (lv_contents_3_0= ruleViewContent ) )* otherlv_4= '}' )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1400:1: (otherlv_0= 'container' otherlv_1= '{' ( (lv_layout_2_0= ruleLayout ) ) ( (lv_contents_3_0= ruleViewContent ) )* otherlv_4= '}' )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1400:3: otherlv_0= 'container' otherlv_1= '{' ( (lv_layout_2_0= ruleLayout ) ) ( (lv_contents_3_0= ruleViewContent ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleViewContainer2928); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getViewContainerAccess().getContainerKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleViewContainer2940); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getViewContainerAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1408:1: ( (lv_layout_2_0= ruleLayout ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1409:1: (lv_layout_2_0= ruleLayout )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1409:1: (lv_layout_2_0= ruleLayout )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1410:3: lv_layout_2_0= ruleLayout
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getViewContainerAccess().getLayoutLayoutParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLayout_in_ruleViewContainer2961);
            lv_layout_2_0=ruleLayout();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getViewContainerRule());
              	        }
                     		set(
                     			current, 
                     			"layout",
                      		lv_layout_2_0, 
                      		"Layout");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1426:2: ( (lv_contents_3_0= ruleViewContent ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==31||(LA18_0>=38 && LA18_0<=45)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1427:1: (lv_contents_3_0= ruleViewContent )
            	    {
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1427:1: (lv_contents_3_0= ruleViewContent )
            	    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1428:3: lv_contents_3_0= ruleViewContent
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getViewContainerAccess().getContentsViewContentParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleViewContent_in_ruleViewContainer2982);
            	    lv_contents_3_0=ruleViewContent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getViewContainerRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"contents",
            	              		lv_contents_3_0, 
            	              		"ViewContent");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleViewContainer2995); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getViewContainerAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViewContainer"


    // $ANTLR start "entryRuleViewElement"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1456:1: entryRuleViewElement returns [EObject current=null] : iv_ruleViewElement= ruleViewElement EOF ;
    public final EObject entryRuleViewElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewElement = null;


        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1457:2: (iv_ruleViewElement= ruleViewElement EOF )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1458:2: iv_ruleViewElement= ruleViewElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getViewElementRule()); 
            }
            pushFollow(FOLLOW_ruleViewElement_in_entryRuleViewElement3031);
            iv_ruleViewElement=ruleViewElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleViewElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewElement3041); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleViewElement"


    // $ANTLR start "ruleViewElement"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1465:1: ruleViewElement returns [EObject current=null] : ( ( (lv_type_0_0= ruleViewType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleViewElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1468:28: ( ( ( (lv_type_0_0= ruleViewType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1469:1: ( ( (lv_type_0_0= ruleViewType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1469:1: ( ( (lv_type_0_0= ruleViewType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1469:2: ( (lv_type_0_0= ruleViewType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1469:2: ( (lv_type_0_0= ruleViewType ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1470:1: (lv_type_0_0= ruleViewType )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1470:1: (lv_type_0_0= ruleViewType )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1471:3: lv_type_0_0= ruleViewType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getViewElementAccess().getTypeViewTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleViewType_in_ruleViewElement3087);
            lv_type_0_0=ruleViewType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getViewElementRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"ViewType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1487:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1488:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1488:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1489:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleViewElement3104); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getViewElementAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getViewElementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleViewElement3121); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getViewElementAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleViewElement3133); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getViewElementAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViewElement"


    // $ANTLR start "entryRuleLayout"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1521:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1522:2: (iv_ruleLayout= ruleLayout EOF )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1523:2: iv_ruleLayout= ruleLayout EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLayoutRule()); 
            }
            pushFollow(FOLLOW_ruleLayout_in_entryRuleLayout3169);
            iv_ruleLayout=ruleLayout();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLayout; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayout3179); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1530:1: ruleLayout returns [EObject current=null] : (this_StackLayout_0= ruleStackLayout | this_GridLayout_1= ruleGridLayout ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        EObject this_StackLayout_0 = null;

        EObject this_GridLayout_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1533:28: ( (this_StackLayout_0= ruleStackLayout | this_GridLayout_1= ruleGridLayout ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1534:1: (this_StackLayout_0= ruleStackLayout | this_GridLayout_1= ruleGridLayout )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1534:1: (this_StackLayout_0= ruleStackLayout | this_GridLayout_1= ruleGridLayout )
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1535:2: this_StackLayout_0= ruleStackLayout
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLayoutAccess().getStackLayoutParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStackLayout_in_ruleLayout3229);
                    this_StackLayout_0=ruleStackLayout();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StackLayout_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1548:2: this_GridLayout_1= ruleGridLayout
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLayoutAccess().getGridLayoutParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGridLayout_in_ruleLayout3259);
                    this_GridLayout_1=ruleGridLayout();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GridLayout_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleGridLayout"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1567:1: entryRuleGridLayout returns [EObject current=null] : iv_ruleGridLayout= ruleGridLayout EOF ;
    public final EObject entryRuleGridLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGridLayout = null;


        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1568:2: (iv_ruleGridLayout= ruleGridLayout EOF )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1569:2: iv_ruleGridLayout= ruleGridLayout EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGridLayoutRule()); 
            }
            pushFollow(FOLLOW_ruleGridLayout_in_entryRuleGridLayout3294);
            iv_ruleGridLayout=ruleGridLayout();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGridLayout; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGridLayout3304); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGridLayout"


    // $ANTLR start "ruleGridLayout"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1576:1: ruleGridLayout returns [EObject current=null] : ( ( (lv_size_0_0= ruleSize ) ) ( (lv_fields_1_0= ruleField ) ) ) ;
    public final EObject ruleGridLayout() throws RecognitionException {
        EObject current = null;

        EObject lv_size_0_0 = null;

        EObject lv_fields_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1579:28: ( ( ( (lv_size_0_0= ruleSize ) ) ( (lv_fields_1_0= ruleField ) ) ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1580:1: ( ( (lv_size_0_0= ruleSize ) ) ( (lv_fields_1_0= ruleField ) ) )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1580:1: ( ( (lv_size_0_0= ruleSize ) ) ( (lv_fields_1_0= ruleField ) ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1580:2: ( (lv_size_0_0= ruleSize ) ) ( (lv_fields_1_0= ruleField ) )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1580:2: ( (lv_size_0_0= ruleSize ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1581:1: (lv_size_0_0= ruleSize )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1581:1: (lv_size_0_0= ruleSize )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1582:3: lv_size_0_0= ruleSize
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGridLayoutAccess().getSizeSizeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSize_in_ruleGridLayout3350);
            lv_size_0_0=ruleSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGridLayoutRule());
              	        }
                     		set(
                     			current, 
                     			"size",
                      		lv_size_0_0, 
                      		"Size");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1598:2: ( (lv_fields_1_0= ruleField ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1599:1: (lv_fields_1_0= ruleField )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1599:1: (lv_fields_1_0= ruleField )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1600:3: lv_fields_1_0= ruleField
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGridLayoutAccess().getFieldsFieldParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleField_in_ruleGridLayout3371);
            lv_fields_1_0=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGridLayoutRule());
              	        }
                     		set(
                     			current, 
                     			"fields",
                      		lv_fields_1_0, 
                      		"Field");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGridLayout"


    // $ANTLR start "entryRuleField"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1624:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1625:2: (iv_ruleField= ruleField EOF )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1626:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_ruleField_in_entryRuleField3407);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField3417); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1633:1: ruleField returns [EObject current=null] : (otherlv_0= '<' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= '>' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_width_1_0=null;
        Token otherlv_2=null;
        Token lv_height_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1636:28: ( (otherlv_0= '<' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= '>' ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1637:1: (otherlv_0= '<' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= '>' )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1637:1: (otherlv_0= '<' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= '>' )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1637:3: otherlv_0= '<' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleField3454); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getLessThanSignKeyword_0());
                  
            }
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1641:1: ( (lv_width_1_0= RULE_INT ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1642:1: (lv_width_1_0= RULE_INT )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1642:1: (lv_width_1_0= RULE_INT )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1643:3: lv_width_1_0= RULE_INT
            {
            lv_width_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleField3471); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_width_1_0, grammarAccess.getFieldAccess().getWidthINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"width",
                      		lv_width_1_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleField3488); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getCommaKeyword_2());
                  
            }
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1663:1: ( (lv_height_3_0= RULE_INT ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1664:1: (lv_height_3_0= RULE_INT )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1664:1: (lv_height_3_0= RULE_INT )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1665:3: lv_height_3_0= RULE_INT
            {
            lv_height_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleField3505); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_height_3_0, grammarAccess.getFieldAccess().getHeightINTTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"height",
                      		lv_height_3_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleField3522); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getGreaterThanSignKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleStackLayout"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1693:1: entryRuleStackLayout returns [EObject current=null] : iv_ruleStackLayout= ruleStackLayout EOF ;
    public final EObject entryRuleStackLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStackLayout = null;


        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1694:2: (iv_ruleStackLayout= ruleStackLayout EOF )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1695:2: iv_ruleStackLayout= ruleStackLayout EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStackLayoutRule()); 
            }
            pushFollow(FOLLOW_ruleStackLayout_in_entryRuleStackLayout3558);
            iv_ruleStackLayout=ruleStackLayout();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStackLayout; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStackLayout3568); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStackLayout"


    // $ANTLR start "ruleStackLayout"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1702:1: ruleStackLayout returns [EObject current=null] : ( ( (lv_size_0_0= ruleSize ) ) ( (lv_direction_1_0= ruleDirection ) ) ) ;
    public final EObject ruleStackLayout() throws RecognitionException {
        EObject current = null;

        EObject lv_size_0_0 = null;

        Enumerator lv_direction_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1705:28: ( ( ( (lv_size_0_0= ruleSize ) ) ( (lv_direction_1_0= ruleDirection ) ) ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1706:1: ( ( (lv_size_0_0= ruleSize ) ) ( (lv_direction_1_0= ruleDirection ) ) )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1706:1: ( ( (lv_size_0_0= ruleSize ) ) ( (lv_direction_1_0= ruleDirection ) ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1706:2: ( (lv_size_0_0= ruleSize ) ) ( (lv_direction_1_0= ruleDirection ) )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1706:2: ( (lv_size_0_0= ruleSize ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1707:1: (lv_size_0_0= ruleSize )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1707:1: (lv_size_0_0= ruleSize )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1708:3: lv_size_0_0= ruleSize
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStackLayoutAccess().getSizeSizeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSize_in_ruleStackLayout3614);
            lv_size_0_0=ruleSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStackLayoutRule());
              	        }
                     		set(
                     			current, 
                     			"size",
                      		lv_size_0_0, 
                      		"Size");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1724:2: ( (lv_direction_1_0= ruleDirection ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1725:1: (lv_direction_1_0= ruleDirection )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1725:1: (lv_direction_1_0= ruleDirection )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1726:3: lv_direction_1_0= ruleDirection
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStackLayoutAccess().getDirectionDirectionEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDirection_in_ruleStackLayout3635);
            lv_direction_1_0=ruleDirection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStackLayoutRule());
              	        }
                     		set(
                     			current, 
                     			"direction",
                      		lv_direction_1_0, 
                      		"Direction");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStackLayout"


    // $ANTLR start "entryRuleSize"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1750:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1751:2: (iv_ruleSize= ruleSize EOF )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1752:2: iv_ruleSize= ruleSize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSizeRule()); 
            }
            pushFollow(FOLLOW_ruleSize_in_entryRuleSize3671);
            iv_ruleSize=ruleSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSize; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSize3681); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1759:1: ruleSize returns [EObject current=null] : (otherlv_0= '<' ( (lv_width_1_0= ruleSizeExpr ) ) otherlv_2= ',' ( (lv_height_3_0= ruleSizeExpr ) ) otherlv_4= '>' ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_width_1_0 = null;

        EObject lv_height_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1762:28: ( (otherlv_0= '<' ( (lv_width_1_0= ruleSizeExpr ) ) otherlv_2= ',' ( (lv_height_3_0= ruleSizeExpr ) ) otherlv_4= '>' ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1763:1: (otherlv_0= '<' ( (lv_width_1_0= ruleSizeExpr ) ) otherlv_2= ',' ( (lv_height_3_0= ruleSizeExpr ) ) otherlv_4= '>' )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1763:1: (otherlv_0= '<' ( (lv_width_1_0= ruleSizeExpr ) ) otherlv_2= ',' ( (lv_height_3_0= ruleSizeExpr ) ) otherlv_4= '>' )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1763:3: otherlv_0= '<' ( (lv_width_1_0= ruleSizeExpr ) ) otherlv_2= ',' ( (lv_height_3_0= ruleSizeExpr ) ) otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleSize3718); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getLessThanSignKeyword_0());
                  
            }
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1767:1: ( (lv_width_1_0= ruleSizeExpr ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1768:1: (lv_width_1_0= ruleSizeExpr )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1768:1: (lv_width_1_0= ruleSizeExpr )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1769:3: lv_width_1_0= ruleSizeExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSizeAccess().getWidthSizeExprParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSizeExpr_in_ruleSize3739);
            lv_width_1_0=ruleSizeExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSizeRule());
              	        }
                     		set(
                     			current, 
                     			"width",
                      		lv_width_1_0, 
                      		"SizeExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleSize3751); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSizeAccess().getCommaKeyword_2());
                  
            }
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1789:1: ( (lv_height_3_0= ruleSizeExpr ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1790:1: (lv_height_3_0= ruleSizeExpr )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1790:1: (lv_height_3_0= ruleSizeExpr )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1791:3: lv_height_3_0= ruleSizeExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSizeAccess().getHeightSizeExprParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSizeExpr_in_ruleSize3772);
            lv_height_3_0=ruleSizeExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSizeRule());
              	        }
                     		set(
                     			current, 
                     			"height",
                      		lv_height_3_0, 
                      		"SizeExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleSize3784); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSizeAccess().getGreaterThanSignKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRuleSizeExpr"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1819:1: entryRuleSizeExpr returns [EObject current=null] : iv_ruleSizeExpr= ruleSizeExpr EOF ;
    public final EObject entryRuleSizeExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSizeExpr = null;


        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1820:2: (iv_ruleSizeExpr= ruleSizeExpr EOF )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1821:2: iv_ruleSizeExpr= ruleSizeExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSizeExprRule()); 
            }
            pushFollow(FOLLOW_ruleSizeExpr_in_entryRuleSizeExpr3820);
            iv_ruleSizeExpr=ruleSizeExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSizeExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSizeExpr3830); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSizeExpr"


    // $ANTLR start "ruleSizeExpr"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1828:1: ruleSizeExpr returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleUnit ) ) ) ;
    public final EObject ruleSizeExpr() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Enumerator lv_unit_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1831:28: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleUnit ) ) ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1832:1: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleUnit ) ) )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1832:1: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleUnit ) ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1832:2: ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleUnit ) )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1832:2: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1833:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1833:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1834:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSizeExpr3872); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getSizeExprAccess().getValueINTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSizeExprRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"INT");
              	    
            }

            }


            }

            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1850:2: ( (lv_unit_1_0= ruleUnit ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1851:1: (lv_unit_1_0= ruleUnit )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1851:1: (lv_unit_1_0= ruleUnit )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1852:3: lv_unit_1_0= ruleUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSizeExprAccess().getUnitUnitEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUnit_in_ruleSizeExpr3898);
            lv_unit_1_0=ruleUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSizeExprRule());
              	        }
                     		set(
                     			current, 
                     			"unit",
                      		lv_unit_1_0, 
                      		"Unit");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSizeExpr"


    // $ANTLR start "ruleFunctionEnum"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1876:1: ruleFunctionEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'decode' ) | (enumLiteral_1= 'encode' ) | (enumLiteral_2= 'get' ) | (enumLiteral_3= 'put' ) ) ;
    public final Enumerator ruleFunctionEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1878:28: ( ( (enumLiteral_0= 'decode' ) | (enumLiteral_1= 'encode' ) | (enumLiteral_2= 'get' ) | (enumLiteral_3= 'put' ) ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1879:1: ( (enumLiteral_0= 'decode' ) | (enumLiteral_1= 'encode' ) | (enumLiteral_2= 'get' ) | (enumLiteral_3= 'put' ) )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1879:1: ( (enumLiteral_0= 'decode' ) | (enumLiteral_1= 'encode' ) | (enumLiteral_2= 'get' ) | (enumLiteral_3= 'put' ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt20=1;
                }
                break;
            case 35:
                {
                alt20=2;
                }
                break;
            case 36:
                {
                alt20=3;
                }
                break;
            case 37:
                {
                alt20=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1879:2: (enumLiteral_0= 'decode' )
                    {
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1879:2: (enumLiteral_0= 'decode' )
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1879:4: enumLiteral_0= 'decode'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_34_in_ruleFunctionEnum3948); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getFunctionEnumAccess().getDECODEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getFunctionEnumAccess().getDECODEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1885:6: (enumLiteral_1= 'encode' )
                    {
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1885:6: (enumLiteral_1= 'encode' )
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1885:8: enumLiteral_1= 'encode'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_35_in_ruleFunctionEnum3965); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getFunctionEnumAccess().getENCODEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getFunctionEnumAccess().getENCODEEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1891:6: (enumLiteral_2= 'get' )
                    {
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1891:6: (enumLiteral_2= 'get' )
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1891:8: enumLiteral_2= 'get'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_36_in_ruleFunctionEnum3982); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getFunctionEnumAccess().getGETEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getFunctionEnumAccess().getGETEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1897:6: (enumLiteral_3= 'put' )
                    {
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1897:6: (enumLiteral_3= 'put' )
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1897:8: enumLiteral_3= 'put'
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_37_in_ruleFunctionEnum3999); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getFunctionEnumAccess().getPUTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getFunctionEnumAccess().getPUTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionEnum"


    // $ANTLR start "ruleViewType"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1907:1: ruleViewType returns [Enumerator current=null] : ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'value-spinner' ) | (enumLiteral_2= 'date-spinner' ) | (enumLiteral_3= 'label' ) | (enumLiteral_4= 'text' ) | (enumLiteral_5= 'input' ) | (enumLiteral_6= 'canvas' ) | (enumLiteral_7= 'tree-list' ) ) ;
    public final Enumerator ruleViewType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;

         enterRule(); 
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1909:28: ( ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'value-spinner' ) | (enumLiteral_2= 'date-spinner' ) | (enumLiteral_3= 'label' ) | (enumLiteral_4= 'text' ) | (enumLiteral_5= 'input' ) | (enumLiteral_6= 'canvas' ) | (enumLiteral_7= 'tree-list' ) ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1910:1: ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'value-spinner' ) | (enumLiteral_2= 'date-spinner' ) | (enumLiteral_3= 'label' ) | (enumLiteral_4= 'text' ) | (enumLiteral_5= 'input' ) | (enumLiteral_6= 'canvas' ) | (enumLiteral_7= 'tree-list' ) )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1910:1: ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'value-spinner' ) | (enumLiteral_2= 'date-spinner' ) | (enumLiteral_3= 'label' ) | (enumLiteral_4= 'text' ) | (enumLiteral_5= 'input' ) | (enumLiteral_6= 'canvas' ) | (enumLiteral_7= 'tree-list' ) )
            int alt21=8;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt21=1;
                }
                break;
            case 39:
                {
                alt21=2;
                }
                break;
            case 40:
                {
                alt21=3;
                }
                break;
            case 41:
                {
                alt21=4;
                }
                break;
            case 42:
                {
                alt21=5;
                }
                break;
            case 43:
                {
                alt21=6;
                }
                break;
            case 44:
                {
                alt21=7;
                }
                break;
            case 45:
                {
                alt21=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1910:2: (enumLiteral_0= 'button' )
                    {
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1910:2: (enumLiteral_0= 'button' )
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1910:4: enumLiteral_0= 'button'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_38_in_ruleViewType4044); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getViewTypeAccess().getButtonEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getViewTypeAccess().getButtonEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1916:6: (enumLiteral_1= 'value-spinner' )
                    {
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1916:6: (enumLiteral_1= 'value-spinner' )
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1916:8: enumLiteral_1= 'value-spinner'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_39_in_ruleViewType4061); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getViewTypeAccess().getValueSpinnerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getViewTypeAccess().getValueSpinnerEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1922:6: (enumLiteral_2= 'date-spinner' )
                    {
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1922:6: (enumLiteral_2= 'date-spinner' )
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1922:8: enumLiteral_2= 'date-spinner'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_40_in_ruleViewType4078); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getViewTypeAccess().getDateSpinnerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getViewTypeAccess().getDateSpinnerEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1928:6: (enumLiteral_3= 'label' )
                    {
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1928:6: (enumLiteral_3= 'label' )
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1928:8: enumLiteral_3= 'label'
                    {
                    enumLiteral_3=(Token)match(input,41,FOLLOW_41_in_ruleViewType4095); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getViewTypeAccess().getLabelEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getViewTypeAccess().getLabelEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1934:6: (enumLiteral_4= 'text' )
                    {
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1934:6: (enumLiteral_4= 'text' )
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1934:8: enumLiteral_4= 'text'
                    {
                    enumLiteral_4=(Token)match(input,42,FOLLOW_42_in_ruleViewType4112); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getViewTypeAccess().getTextOutputEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getViewTypeAccess().getTextOutputEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1940:6: (enumLiteral_5= 'input' )
                    {
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1940:6: (enumLiteral_5= 'input' )
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1940:8: enumLiteral_5= 'input'
                    {
                    enumLiteral_5=(Token)match(input,43,FOLLOW_43_in_ruleViewType4129); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getViewTypeAccess().getInputFieldEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getViewTypeAccess().getInputFieldEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1946:6: (enumLiteral_6= 'canvas' )
                    {
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1946:6: (enumLiteral_6= 'canvas' )
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1946:8: enumLiteral_6= 'canvas'
                    {
                    enumLiteral_6=(Token)match(input,44,FOLLOW_44_in_ruleViewType4146); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getViewTypeAccess().getCanvasEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getViewTypeAccess().getCanvasEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1952:6: (enumLiteral_7= 'tree-list' )
                    {
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1952:6: (enumLiteral_7= 'tree-list' )
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1952:8: enumLiteral_7= 'tree-list'
                    {
                    enumLiteral_7=(Token)match(input,45,FOLLOW_45_in_ruleViewType4163); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getViewTypeAccess().getTreeListEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getViewTypeAccess().getTreeListEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViewType"


    // $ANTLR start "ruleUnit"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1962:1: ruleUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'px' ) | (enumLiteral_1= '%' ) ) ;
    public final Enumerator ruleUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1964:28: ( ( (enumLiteral_0= 'px' ) | (enumLiteral_1= '%' ) ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1965:1: ( (enumLiteral_0= 'px' ) | (enumLiteral_1= '%' ) )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1965:1: ( (enumLiteral_0= 'px' ) | (enumLiteral_1= '%' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==46) ) {
                alt22=1;
            }
            else if ( (LA22_0==47) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1965:2: (enumLiteral_0= 'px' )
                    {
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1965:2: (enumLiteral_0= 'px' )
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1965:4: enumLiteral_0= 'px'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_46_in_ruleUnit4208); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnitAccess().getPXEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnitAccess().getPXEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1971:6: (enumLiteral_1= '%' )
                    {
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1971:6: (enumLiteral_1= '%' )
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1971:8: enumLiteral_1= '%'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_47_in_ruleUnit4225); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnitAccess().getPERCENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnitAccess().getPERCENTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnit"


    // $ANTLR start "ruleDirection"
    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1981:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'horizontal' ) | (enumLiteral_1= 'vertical' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1983:28: ( ( (enumLiteral_0= 'horizontal' ) | (enumLiteral_1= 'vertical' ) ) )
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1984:1: ( (enumLiteral_0= 'horizontal' ) | (enumLiteral_1= 'vertical' ) )
            {
            // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1984:1: ( (enumLiteral_0= 'horizontal' ) | (enumLiteral_1= 'vertical' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==48) ) {
                alt23=1;
            }
            else if ( (LA23_0==49) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1984:2: (enumLiteral_0= 'horizontal' )
                    {
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1984:2: (enumLiteral_0= 'horizontal' )
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1984:4: enumLiteral_0= 'horizontal'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_48_in_ruleDirection4270); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getHORIZONTALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getHORIZONTALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1990:6: (enumLiteral_1= 'vertical' )
                    {
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1990:6: (enumLiteral_1= 'vertical' )
                    // ../de.cau.cs.se.lad/src-gen/de/cau/cs/se/lad/parser/antlr/internal/InternalAppLang.g:1990:8: enumLiteral_1= 'vertical'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_49_in_ruleDirection4287); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getVERTICALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getVERTICALEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirection"

    // Delegated rules


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\14\uffff";
    static final String DFA19_eofS =
        "\14\uffff";
    static final String DFA19_minS =
        "\1\40\1\6\1\56\2\21\1\6\1\56\2\41\1\40\2\uffff";
    static final String DFA19_maxS =
        "\1\40\1\6\1\57\2\21\1\6\1\57\2\41\1\61\2\uffff";
    static final String DFA19_acceptS =
        "\12\uffff\1\1\1\2";
    static final String DFA19_specialS =
        "\14\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4",
            "\1\5",
            "\1\5",
            "\1\6",
            "\1\7\1\10",
            "\1\11",
            "\1\11",
            "\1\13\17\uffff\2\12",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1534:1: (this_StackLayout_0= ruleStackLayout | this_GridLayout_1= ruleGridLayout )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_ruleModel138 = new BitSet(new long[]{0x0000000048008800L});
    public static final BitSet FOLLOW_ruleView_in_ruleModel165 = new BitSet(new long[]{0x0000000048008800L});
    public static final BitSet FOLLOW_ruleClass_in_ruleModel192 = new BitSet(new long[]{0x0000000048008800L});
    public static final BitSet FOLLOW_ruleDataModel_in_ruleModel215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleClass298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass315 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleClass333 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass357 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleClass371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleClass392 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleClass405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleService488 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService505 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleService522 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleService543 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleService556 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleService577 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleService591 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleService603 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleService624 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_14_in_ruleService637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOperation720 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleOperation741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperation758 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOperation775 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleOperation796 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleOperation809 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleOperation830 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleOperation844 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOperation856 = new BitSet(new long[]{0x0000003C00800030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleOperation877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseExpression_in_ruleExpression973 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleExpression997 = new BitSet(new long[]{0x0000003C00800030L});
    public static final BitSet FOLLOW_ruleBaseExpression_in_ruleExpression1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseExpression_in_entryRuleBaseExpression1056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseExpression1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleBaseExpression1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleBaseExpression1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_ruleBaseExpression1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_entryRuleStringExpression1211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringExpression1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleStringExpression1271 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleStringExpression1295 = new BitSet(new long[]{0x0000003C00800030L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleStringExpression1316 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue1354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleStringValue1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringProperty_in_ruleStringValue1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringProperty_in_entryRuleStringProperty1479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringProperty1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringProperty1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral1663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleNullLiteral1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction1758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionEnum_in_ruleFunction1814 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunction1826 = new BitSet(new long[]{0x0000003C00800030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunction1847 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleFunction1860 = new BitSet(new long[]{0x0000003C00800030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunction1881 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleFunction1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleProperty1987 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_entryRuleTypeReference2045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeReference2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeReference2117 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleTypeReference2129 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTypeReference2146 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTypeReference2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeReference2208 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleTypeReference2221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleTypeReference2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataModel_in_entryRuleDataModel2281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataModel2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleDataModel2340 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDataModel2352 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_ruleInstance_in_ruleDataModel2373 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleDataModel2386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataModel2410 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDataModel2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstance_in_entryRuleInstance2458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstance2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleInstance2505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleInstance2526 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstance2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_entryRuleView2584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleView2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleView2631 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleView2648 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleView2665 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleLayout_in_ruleView2686 = new BitSet(new long[]{0x00003FC080004000L});
    public static final BitSet FOLLOW_ruleViewContent_in_ruleView2707 = new BitSet(new long[]{0x00003FC080004000L});
    public static final BitSet FOLLOW_14_in_ruleView2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewContent_in_entryRuleViewContent2756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewContent2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewElement_in_ruleViewContent2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewContainer_in_ruleViewContent2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewContainer_in_entryRuleViewContainer2881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewContainer2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleViewContainer2928 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleViewContainer2940 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleLayout_in_ruleViewContainer2961 = new BitSet(new long[]{0x00003FC080004000L});
    public static final BitSet FOLLOW_ruleViewContent_in_ruleViewContainer2982 = new BitSet(new long[]{0x00003FC080004000L});
    public static final BitSet FOLLOW_14_in_ruleViewContainer2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewElement_in_entryRuleViewElement3031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewElement3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewType_in_ruleViewElement3087 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleViewElement3104 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleViewElement3121 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleViewElement3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout3169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayout3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStackLayout_in_ruleLayout3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGridLayout_in_ruleLayout3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGridLayout_in_entryRuleGridLayout3294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGridLayout3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_ruleGridLayout3350 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleField_in_ruleGridLayout3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField3407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleField3454 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleField3471 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleField3488 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleField3505 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleField3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStackLayout_in_entryRuleStackLayout3558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStackLayout3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_ruleStackLayout3614 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleStackLayout3635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_entryRuleSize3671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSize3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleSize3718 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleSizeExpr_in_ruleSize3739 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSize3751 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleSizeExpr_in_ruleSize3772 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleSize3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSizeExpr_in_entryRuleSizeExpr3820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSizeExpr3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSizeExpr3872 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_ruleUnit_in_ruleSizeExpr3898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleFunctionEnum3948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleFunctionEnum3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleFunctionEnum3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleFunctionEnum3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleViewType4044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleViewType4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleViewType4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleViewType4095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleViewType4112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleViewType4129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleViewType4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleViewType4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleUnit4208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleUnit4225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDirection4270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleDirection4287 = new BitSet(new long[]{0x0000000000000002L});

}