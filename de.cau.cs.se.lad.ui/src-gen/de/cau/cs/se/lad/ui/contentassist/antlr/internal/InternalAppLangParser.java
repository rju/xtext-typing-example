package de.cau.cs.se.lad.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.cau.cs.se.lad.services.AppLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAppLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'decode'", "'encode'", "'get'", "'put'", "'button'", "'value-spinner'", "'date-spinner'", "'label'", "'text'", "'input'", "'canvas'", "'tree-list'", "'px'", "'%'", "'horizontal'", "'vertical'", "'class'", "'{'", "'}'", "'extends'", "'service'", "'('", "')'", "','", "'op'", "'return'", "'or'", "'+'", "'null'", "'['", "']'", "'.'", "'model'", "'start'", "'new'", "'view'", "'container'", "'<'", "'>'"
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
    public String getGrammarFileName() { return "../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g"; }


     
     	private AppLangGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AppLangGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:62:1: ( ruleModel EOF )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:63:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel67);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:70:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:74:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:75:1: ( ( rule__Model__Group__0 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:75:1: ( ( rule__Model__Group__0 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:76:1: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:77:1: ( rule__Model__Group__0 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:77:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel100);
            rule__Model__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleClass"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:89:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:90:1: ( ruleClass EOF )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:91:1: ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass127);
            ruleClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass134); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:98:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:102:2: ( ( ( rule__Class__Group__0 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:103:1: ( ( rule__Class__Group__0 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:103:1: ( ( rule__Class__Group__0 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:104:1: ( rule__Class__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:105:1: ( rule__Class__Group__0 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:105:2: rule__Class__Group__0
            {
            pushFollow(FOLLOW_rule__Class__Group__0_in_ruleClass160);
            rule__Class__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleService"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:117:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:118:1: ( ruleService EOF )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:119:1: ruleService EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceRule()); 
            }
            pushFollow(FOLLOW_ruleService_in_entryRuleService187);
            ruleService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleService194); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:126:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:130:2: ( ( ( rule__Service__Group__0 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:131:1: ( ( rule__Service__Group__0 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:131:1: ( ( rule__Service__Group__0 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:132:1: ( rule__Service__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getGroup()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:133:1: ( rule__Service__Group__0 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:133:2: rule__Service__Group__0
            {
            pushFollow(FOLLOW_rule__Service__Group__0_in_ruleService220);
            rule__Service__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleOperation"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:145:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:146:1: ( ruleOperation EOF )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:147:1: ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation247);
            ruleOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation254); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:154:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:158:2: ( ( ( rule__Operation__Group__0 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:159:1: ( ( rule__Operation__Group__0 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:159:1: ( ( rule__Operation__Group__0 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:160:1: ( rule__Operation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:161:1: ( rule__Operation__Group__0 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:161:2: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_rule__Operation__Group__0_in_ruleOperation280);
            rule__Operation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleExpression"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:173:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:174:1: ( ruleExpression EOF )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:175:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression307);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression314); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:182:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:186:2: ( ( ( rule__Expression__Group__0 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:187:1: ( ( rule__Expression__Group__0 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:187:1: ( ( rule__Expression__Group__0 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:188:1: ( rule__Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:189:1: ( rule__Expression__Group__0 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:189:2: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_rule__Expression__Group__0_in_ruleExpression340);
            rule__Expression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBaseExpression"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:201:1: entryRuleBaseExpression : ruleBaseExpression EOF ;
    public final void entryRuleBaseExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:202:1: ( ruleBaseExpression EOF )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:203:1: ruleBaseExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBaseExpression_in_entryRuleBaseExpression367);
            ruleBaseExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseExpression374); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBaseExpression"


    // $ANTLR start "ruleBaseExpression"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:210:1: ruleBaseExpression : ( ( rule__BaseExpression__Alternatives ) ) ;
    public final void ruleBaseExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:214:2: ( ( ( rule__BaseExpression__Alternatives ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:215:1: ( ( rule__BaseExpression__Alternatives ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:215:1: ( ( rule__BaseExpression__Alternatives ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:216:1: ( rule__BaseExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:217:1: ( rule__BaseExpression__Alternatives )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:217:2: rule__BaseExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__BaseExpression__Alternatives_in_ruleBaseExpression400);
            rule__BaseExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaseExpression"


    // $ANTLR start "entryRuleStringExpression"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:229:1: entryRuleStringExpression : ruleStringExpression EOF ;
    public final void entryRuleStringExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:230:1: ( ruleStringExpression EOF )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:231:1: ruleStringExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleStringExpression_in_entryRuleStringExpression427);
            ruleStringExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringExpression434); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringExpression"


    // $ANTLR start "ruleStringExpression"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:238:1: ruleStringExpression : ( ( rule__StringExpression__Group__0 ) ) ;
    public final void ruleStringExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:242:2: ( ( ( rule__StringExpression__Group__0 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:243:1: ( ( rule__StringExpression__Group__0 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:243:1: ( ( rule__StringExpression__Group__0 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:244:1: ( rule__StringExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:245:1: ( rule__StringExpression__Group__0 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:245:2: rule__StringExpression__Group__0
            {
            pushFollow(FOLLOW_rule__StringExpression__Group__0_in_ruleStringExpression460);
            rule__StringExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringExpression"


    // $ANTLR start "entryRuleStringValue"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:257:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:258:1: ( ruleStringValue EOF )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:259:1: ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue487);
            ruleStringValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue494); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:266:1: ruleStringValue : ( ( rule__StringValue__Alternatives ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:270:2: ( ( ( rule__StringValue__Alternatives ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:271:1: ( ( rule__StringValue__Alternatives ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:271:1: ( ( rule__StringValue__Alternatives ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:272:1: ( rule__StringValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:273:1: ( rule__StringValue__Alternatives )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:273:2: rule__StringValue__Alternatives
            {
            pushFollow(FOLLOW_rule__StringValue__Alternatives_in_ruleStringValue520);
            rule__StringValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleStringProperty"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:285:1: entryRuleStringProperty : ruleStringProperty EOF ;
    public final void entryRuleStringProperty() throws RecognitionException {
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:286:1: ( ruleStringProperty EOF )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:287:1: ruleStringProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleStringProperty_in_entryRuleStringProperty547);
            ruleStringProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringPropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringProperty554); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringProperty"


    // $ANTLR start "ruleStringProperty"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:294:1: ruleStringProperty : ( ( rule__StringProperty__ReferenceAssignment ) ) ;
    public final void ruleStringProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:298:2: ( ( ( rule__StringProperty__ReferenceAssignment ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:299:1: ( ( rule__StringProperty__ReferenceAssignment ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:299:1: ( ( rule__StringProperty__ReferenceAssignment ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:300:1: ( rule__StringProperty__ReferenceAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPropertyAccess().getReferenceAssignment()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:301:1: ( rule__StringProperty__ReferenceAssignment )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:301:2: rule__StringProperty__ReferenceAssignment
            {
            pushFollow(FOLLOW_rule__StringProperty__ReferenceAssignment_in_ruleStringProperty580);
            rule__StringProperty__ReferenceAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringPropertyAccess().getReferenceAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringProperty"


    // $ANTLR start "entryRuleStringLiteral"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:313:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:314:1: ( ruleStringLiteral EOF )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:315:1: ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral607);
            ruleStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral614); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:322:1: ruleStringLiteral : ( ( rule__StringLiteral__LiteralAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:326:2: ( ( ( rule__StringLiteral__LiteralAssignment ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:327:1: ( ( rule__StringLiteral__LiteralAssignment ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:327:1: ( ( rule__StringLiteral__LiteralAssignment ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:328:1: ( rule__StringLiteral__LiteralAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getLiteralAssignment()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:329:1: ( rule__StringLiteral__LiteralAssignment )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:329:2: rule__StringLiteral__LiteralAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__LiteralAssignment_in_ruleStringLiteral640);
            rule__StringLiteral__LiteralAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralAccess().getLiteralAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleNullLiteral"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:341:1: entryRuleNullLiteral : ruleNullLiteral EOF ;
    public final void entryRuleNullLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:342:1: ( ruleNullLiteral EOF )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:343:1: ruleNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral667);
            ruleNullLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral674); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNullLiteral"


    // $ANTLR start "ruleNullLiteral"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:350:1: ruleNullLiteral : ( ( rule__NullLiteral__Group__0 ) ) ;
    public final void ruleNullLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:354:2: ( ( ( rule__NullLiteral__Group__0 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:355:1: ( ( rule__NullLiteral__Group__0 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:355:1: ( ( rule__NullLiteral__Group__0 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:356:1: ( rule__NullLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullLiteralAccess().getGroup()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:357:1: ( rule__NullLiteral__Group__0 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:357:2: rule__NullLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__NullLiteral__Group__0_in_ruleNullLiteral700);
            rule__NullLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNullLiteral"


    // $ANTLR start "entryRuleFunction"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:369:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:370:1: ( ruleFunction EOF )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:371:1: ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction727);
            ruleFunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction734); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:378:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:382:2: ( ( ( rule__Function__Group__0 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:383:1: ( ( rule__Function__Group__0 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:383:1: ( ( rule__Function__Group__0 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:384:1: ( rule__Function__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getGroup()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:385:1: ( rule__Function__Group__0 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:385:2: rule__Function__Group__0
            {
            pushFollow(FOLLOW_rule__Function__Group__0_in_ruleFunction760);
            rule__Function__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleProperty"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:397:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:398:1: ( ruleProperty EOF )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:399:1: ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty787);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty794); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:406:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:410:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:411:1: ( ( rule__Property__Group__0 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:411:1: ( ( rule__Property__Group__0 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:412:1: ( rule__Property__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:413:1: ( rule__Property__Group__0 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:413:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty820);
            rule__Property__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleTypeReference"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:425:1: entryRuleTypeReference : ruleTypeReference EOF ;
    public final void entryRuleTypeReference() throws RecognitionException {
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:426:1: ( ruleTypeReference EOF )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:427:1: ruleTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleTypeReference_in_entryRuleTypeReference847);
            ruleTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeReference854); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:434:1: ruleTypeReference : ( ( rule__TypeReference__Alternatives ) ) ;
    public final void ruleTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:438:2: ( ( ( rule__TypeReference__Alternatives ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:439:1: ( ( rule__TypeReference__Alternatives ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:439:1: ( ( rule__TypeReference__Alternatives ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:440:1: ( rule__TypeReference__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:441:1: ( rule__TypeReference__Alternatives )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:441:2: rule__TypeReference__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeReference__Alternatives_in_ruleTypeReference880);
            rule__TypeReference__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleDataModel"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:453:1: entryRuleDataModel : ruleDataModel EOF ;
    public final void entryRuleDataModel() throws RecognitionException {
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:454:1: ( ruleDataModel EOF )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:455:1: ruleDataModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataModelRule()); 
            }
            pushFollow(FOLLOW_ruleDataModel_in_entryRuleDataModel907);
            ruleDataModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataModel914); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataModel"


    // $ANTLR start "ruleDataModel"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:462:1: ruleDataModel : ( ( rule__DataModel__Group__0 ) ) ;
    public final void ruleDataModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:466:2: ( ( ( rule__DataModel__Group__0 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:467:1: ( ( rule__DataModel__Group__0 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:467:1: ( ( rule__DataModel__Group__0 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:468:1: ( rule__DataModel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataModelAccess().getGroup()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:469:1: ( rule__DataModel__Group__0 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:469:2: rule__DataModel__Group__0
            {
            pushFollow(FOLLOW_rule__DataModel__Group__0_in_ruleDataModel940);
            rule__DataModel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataModelAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataModel"


    // $ANTLR start "entryRuleInstance"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:481:1: entryRuleInstance : ruleInstance EOF ;
    public final void entryRuleInstance() throws RecognitionException {
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:482:1: ( ruleInstance EOF )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:483:1: ruleInstance EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceRule()); 
            }
            pushFollow(FOLLOW_ruleInstance_in_entryRuleInstance967);
            ruleInstance();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstance974); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstance"


    // $ANTLR start "ruleInstance"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:490:1: ruleInstance : ( ( rule__Instance__Group__0 ) ) ;
    public final void ruleInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:494:2: ( ( ( rule__Instance__Group__0 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:495:1: ( ( rule__Instance__Group__0 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:495:1: ( ( rule__Instance__Group__0 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:496:1: ( rule__Instance__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getGroup()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:497:1: ( rule__Instance__Group__0 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:497:2: rule__Instance__Group__0
            {
            pushFollow(FOLLOW_rule__Instance__Group__0_in_ruleInstance1000);
            rule__Instance__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstance"


    // $ANTLR start "entryRuleView"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:509:1: entryRuleView : ruleView EOF ;
    public final void entryRuleView() throws RecognitionException {
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:510:1: ( ruleView EOF )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:511:1: ruleView EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewRule()); 
            }
            pushFollow(FOLLOW_ruleView_in_entryRuleView1027);
            ruleView();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleView1034); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleView"


    // $ANTLR start "ruleView"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:518:1: ruleView : ( ( rule__View__Group__0 ) ) ;
    public final void ruleView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:522:2: ( ( ( rule__View__Group__0 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:523:1: ( ( rule__View__Group__0 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:523:1: ( ( rule__View__Group__0 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:524:1: ( rule__View__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewAccess().getGroup()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:525:1: ( rule__View__Group__0 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:525:2: rule__View__Group__0
            {
            pushFollow(FOLLOW_rule__View__Group__0_in_ruleView1060);
            rule__View__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleView"


    // $ANTLR start "entryRuleViewContent"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:537:1: entryRuleViewContent : ruleViewContent EOF ;
    public final void entryRuleViewContent() throws RecognitionException {
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:538:1: ( ruleViewContent EOF )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:539:1: ruleViewContent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewContentRule()); 
            }
            pushFollow(FOLLOW_ruleViewContent_in_entryRuleViewContent1087);
            ruleViewContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewContentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewContent1094); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleViewContent"


    // $ANTLR start "ruleViewContent"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:546:1: ruleViewContent : ( ( rule__ViewContent__Alternatives ) ) ;
    public final void ruleViewContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:550:2: ( ( ( rule__ViewContent__Alternatives ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:551:1: ( ( rule__ViewContent__Alternatives ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:551:1: ( ( rule__ViewContent__Alternatives ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:552:1: ( rule__ViewContent__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewContentAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:553:1: ( rule__ViewContent__Alternatives )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:553:2: rule__ViewContent__Alternatives
            {
            pushFollow(FOLLOW_rule__ViewContent__Alternatives_in_ruleViewContent1120);
            rule__ViewContent__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewContentAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleViewContent"


    // $ANTLR start "entryRuleViewContainer"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:565:1: entryRuleViewContainer : ruleViewContainer EOF ;
    public final void entryRuleViewContainer() throws RecognitionException {
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:566:1: ( ruleViewContainer EOF )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:567:1: ruleViewContainer EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewContainerRule()); 
            }
            pushFollow(FOLLOW_ruleViewContainer_in_entryRuleViewContainer1147);
            ruleViewContainer();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewContainerRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewContainer1154); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleViewContainer"


    // $ANTLR start "ruleViewContainer"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:574:1: ruleViewContainer : ( ( rule__ViewContainer__Group__0 ) ) ;
    public final void ruleViewContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:578:2: ( ( ( rule__ViewContainer__Group__0 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:579:1: ( ( rule__ViewContainer__Group__0 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:579:1: ( ( rule__ViewContainer__Group__0 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:580:1: ( rule__ViewContainer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewContainerAccess().getGroup()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:581:1: ( rule__ViewContainer__Group__0 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:581:2: rule__ViewContainer__Group__0
            {
            pushFollow(FOLLOW_rule__ViewContainer__Group__0_in_ruleViewContainer1180);
            rule__ViewContainer__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewContainerAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleViewContainer"


    // $ANTLR start "entryRuleViewElement"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:593:1: entryRuleViewElement : ruleViewElement EOF ;
    public final void entryRuleViewElement() throws RecognitionException {
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:594:1: ( ruleViewElement EOF )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:595:1: ruleViewElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewElementRule()); 
            }
            pushFollow(FOLLOW_ruleViewElement_in_entryRuleViewElement1207);
            ruleViewElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewElement1214); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleViewElement"


    // $ANTLR start "ruleViewElement"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:602:1: ruleViewElement : ( ( rule__ViewElement__Group__0 ) ) ;
    public final void ruleViewElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:606:2: ( ( ( rule__ViewElement__Group__0 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:607:1: ( ( rule__ViewElement__Group__0 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:607:1: ( ( rule__ViewElement__Group__0 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:608:1: ( rule__ViewElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewElementAccess().getGroup()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:609:1: ( rule__ViewElement__Group__0 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:609:2: rule__ViewElement__Group__0
            {
            pushFollow(FOLLOW_rule__ViewElement__Group__0_in_ruleViewElement1240);
            rule__ViewElement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewElementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleViewElement"


    // $ANTLR start "entryRuleLayout"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:621:1: entryRuleLayout : ruleLayout EOF ;
    public final void entryRuleLayout() throws RecognitionException {
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:622:1: ( ruleLayout EOF )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:623:1: ruleLayout EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutRule()); 
            }
            pushFollow(FOLLOW_ruleLayout_in_entryRuleLayout1267);
            ruleLayout();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLayoutRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayout1274); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:630:1: ruleLayout : ( ( rule__Layout__Alternatives ) ) ;
    public final void ruleLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:634:2: ( ( ( rule__Layout__Alternatives ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:635:1: ( ( rule__Layout__Alternatives ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:635:1: ( ( rule__Layout__Alternatives ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:636:1: ( rule__Layout__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:637:1: ( rule__Layout__Alternatives )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:637:2: rule__Layout__Alternatives
            {
            pushFollow(FOLLOW_rule__Layout__Alternatives_in_ruleLayout1300);
            rule__Layout__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLayoutAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleGridLayout"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:649:1: entryRuleGridLayout : ruleGridLayout EOF ;
    public final void entryRuleGridLayout() throws RecognitionException {
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:650:1: ( ruleGridLayout EOF )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:651:1: ruleGridLayout EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGridLayoutRule()); 
            }
            pushFollow(FOLLOW_ruleGridLayout_in_entryRuleGridLayout1327);
            ruleGridLayout();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGridLayoutRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGridLayout1334); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGridLayout"


    // $ANTLR start "ruleGridLayout"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:658:1: ruleGridLayout : ( ( rule__GridLayout__Group__0 ) ) ;
    public final void ruleGridLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:662:2: ( ( ( rule__GridLayout__Group__0 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:663:1: ( ( rule__GridLayout__Group__0 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:663:1: ( ( rule__GridLayout__Group__0 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:664:1: ( rule__GridLayout__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGridLayoutAccess().getGroup()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:665:1: ( rule__GridLayout__Group__0 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:665:2: rule__GridLayout__Group__0
            {
            pushFollow(FOLLOW_rule__GridLayout__Group__0_in_ruleGridLayout1360);
            rule__GridLayout__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGridLayoutAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGridLayout"


    // $ANTLR start "entryRuleField"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:677:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:678:1: ( ruleField EOF )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:679:1: ruleField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_ruleField_in_entryRuleField1387);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField1394); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:686:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:690:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:691:1: ( ( rule__Field__Group__0 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:691:1: ( ( rule__Field__Group__0 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:692:1: ( rule__Field__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getGroup()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:693:1: ( rule__Field__Group__0 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:693:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField1420);
            rule__Field__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleStackLayout"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:705:1: entryRuleStackLayout : ruleStackLayout EOF ;
    public final void entryRuleStackLayout() throws RecognitionException {
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:706:1: ( ruleStackLayout EOF )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:707:1: ruleStackLayout EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStackLayoutRule()); 
            }
            pushFollow(FOLLOW_ruleStackLayout_in_entryRuleStackLayout1447);
            ruleStackLayout();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStackLayoutRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStackLayout1454); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStackLayout"


    // $ANTLR start "ruleStackLayout"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:714:1: ruleStackLayout : ( ( rule__StackLayout__Group__0 ) ) ;
    public final void ruleStackLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:718:2: ( ( ( rule__StackLayout__Group__0 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:719:1: ( ( rule__StackLayout__Group__0 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:719:1: ( ( rule__StackLayout__Group__0 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:720:1: ( rule__StackLayout__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStackLayoutAccess().getGroup()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:721:1: ( rule__StackLayout__Group__0 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:721:2: rule__StackLayout__Group__0
            {
            pushFollow(FOLLOW_rule__StackLayout__Group__0_in_ruleStackLayout1480);
            rule__StackLayout__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStackLayoutAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStackLayout"


    // $ANTLR start "entryRuleSize"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:733:1: entryRuleSize : ruleSize EOF ;
    public final void entryRuleSize() throws RecognitionException {
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:734:1: ( ruleSize EOF )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:735:1: ruleSize EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeRule()); 
            }
            pushFollow(FOLLOW_ruleSize_in_entryRuleSize1507);
            ruleSize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSizeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSize1514); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:742:1: ruleSize : ( ( rule__Size__Group__0 ) ) ;
    public final void ruleSize() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:746:2: ( ( ( rule__Size__Group__0 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:747:1: ( ( rule__Size__Group__0 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:747:1: ( ( rule__Size__Group__0 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:748:1: ( rule__Size__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:749:1: ( rule__Size__Group__0 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:749:2: rule__Size__Group__0
            {
            pushFollow(FOLLOW_rule__Size__Group__0_in_ruleSize1540);
            rule__Size__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSizeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRuleSizeExpr"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:761:1: entryRuleSizeExpr : ruleSizeExpr EOF ;
    public final void entryRuleSizeExpr() throws RecognitionException {
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:762:1: ( ruleSizeExpr EOF )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:763:1: ruleSizeExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeExprRule()); 
            }
            pushFollow(FOLLOW_ruleSizeExpr_in_entryRuleSizeExpr1567);
            ruleSizeExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSizeExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSizeExpr1574); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSizeExpr"


    // $ANTLR start "ruleSizeExpr"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:770:1: ruleSizeExpr : ( ( rule__SizeExpr__Group__0 ) ) ;
    public final void ruleSizeExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:774:2: ( ( ( rule__SizeExpr__Group__0 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:775:1: ( ( rule__SizeExpr__Group__0 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:775:1: ( ( rule__SizeExpr__Group__0 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:776:1: ( rule__SizeExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeExprAccess().getGroup()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:777:1: ( rule__SizeExpr__Group__0 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:777:2: rule__SizeExpr__Group__0
            {
            pushFollow(FOLLOW_rule__SizeExpr__Group__0_in_ruleSizeExpr1600);
            rule__SizeExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSizeExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSizeExpr"


    // $ANTLR start "ruleFunctionEnum"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:790:1: ruleFunctionEnum : ( ( rule__FunctionEnum__Alternatives ) ) ;
    public final void ruleFunctionEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:794:1: ( ( ( rule__FunctionEnum__Alternatives ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:795:1: ( ( rule__FunctionEnum__Alternatives ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:795:1: ( ( rule__FunctionEnum__Alternatives ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:796:1: ( rule__FunctionEnum__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionEnumAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:797:1: ( rule__FunctionEnum__Alternatives )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:797:2: rule__FunctionEnum__Alternatives
            {
            pushFollow(FOLLOW_rule__FunctionEnum__Alternatives_in_ruleFunctionEnum1637);
            rule__FunctionEnum__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionEnumAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionEnum"


    // $ANTLR start "ruleViewType"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:809:1: ruleViewType : ( ( rule__ViewType__Alternatives ) ) ;
    public final void ruleViewType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:813:1: ( ( ( rule__ViewType__Alternatives ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:814:1: ( ( rule__ViewType__Alternatives ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:814:1: ( ( rule__ViewType__Alternatives ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:815:1: ( rule__ViewType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewTypeAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:816:1: ( rule__ViewType__Alternatives )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:816:2: rule__ViewType__Alternatives
            {
            pushFollow(FOLLOW_rule__ViewType__Alternatives_in_ruleViewType1673);
            rule__ViewType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleViewType"


    // $ANTLR start "ruleUnit"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:828:1: ruleUnit : ( ( rule__Unit__Alternatives ) ) ;
    public final void ruleUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:832:1: ( ( ( rule__Unit__Alternatives ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:833:1: ( ( rule__Unit__Alternatives ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:833:1: ( ( rule__Unit__Alternatives ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:834:1: ( rule__Unit__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:835:1: ( rule__Unit__Alternatives )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:835:2: rule__Unit__Alternatives
            {
            pushFollow(FOLLOW_rule__Unit__Alternatives_in_ruleUnit1709);
            rule__Unit__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnit"


    // $ANTLR start "ruleDirection"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:847:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:851:1: ( ( ( rule__Direction__Alternatives ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:852:1: ( ( rule__Direction__Alternatives ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:852:1: ( ( rule__Direction__Alternatives ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:853:1: ( rule__Direction__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:854:1: ( rule__Direction__Alternatives )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:854:2: rule__Direction__Alternatives
            {
            pushFollow(FOLLOW_rule__Direction__Alternatives_in_ruleDirection1745);
            rule__Direction__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirection"


    // $ANTLR start "rule__Model__Alternatives_0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:865:1: rule__Model__Alternatives_0 : ( ( ( rule__Model__ServicesAssignment_0_0 ) ) | ( ( rule__Model__ViewsAssignment_0_1 ) ) | ( ( rule__Model__ClassesAssignment_0_2 ) ) );
    public final void rule__Model__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:869:1: ( ( ( rule__Model__ServicesAssignment_0_0 ) ) | ( ( rule__Model__ViewsAssignment_0_1 ) ) | ( ( rule__Model__ClassesAssignment_0_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt1=1;
                }
                break;
            case 46:
                {
                alt1=2;
                }
                break;
            case 27:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:870:1: ( ( rule__Model__ServicesAssignment_0_0 ) )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:870:1: ( ( rule__Model__ServicesAssignment_0_0 ) )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:871:1: ( rule__Model__ServicesAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getServicesAssignment_0_0()); 
                    }
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:872:1: ( rule__Model__ServicesAssignment_0_0 )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:872:2: rule__Model__ServicesAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Model__ServicesAssignment_0_0_in_rule__Model__Alternatives_01780);
                    rule__Model__ServicesAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getServicesAssignment_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:876:6: ( ( rule__Model__ViewsAssignment_0_1 ) )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:876:6: ( ( rule__Model__ViewsAssignment_0_1 ) )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:877:1: ( rule__Model__ViewsAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getViewsAssignment_0_1()); 
                    }
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:878:1: ( rule__Model__ViewsAssignment_0_1 )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:878:2: rule__Model__ViewsAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__Model__ViewsAssignment_0_1_in_rule__Model__Alternatives_01798);
                    rule__Model__ViewsAssignment_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getViewsAssignment_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:882:6: ( ( rule__Model__ClassesAssignment_0_2 ) )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:882:6: ( ( rule__Model__ClassesAssignment_0_2 ) )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:883:1: ( rule__Model__ClassesAssignment_0_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getClassesAssignment_0_2()); 
                    }
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:884:1: ( rule__Model__ClassesAssignment_0_2 )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:884:2: rule__Model__ClassesAssignment_0_2
                    {
                    pushFollow(FOLLOW_rule__Model__ClassesAssignment_0_2_in_rule__Model__Alternatives_01816);
                    rule__Model__ClassesAssignment_0_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getClassesAssignment_0_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives_0"


    // $ANTLR start "rule__BaseExpression__Alternatives"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:893:1: rule__BaseExpression__Alternatives : ( ( ruleFunction ) | ( ruleNullLiteral ) | ( ruleStringExpression ) );
    public final void rule__BaseExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:897:1: ( ( ruleFunction ) | ( ruleNullLiteral ) | ( ruleStringExpression ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
            case 13:
            case 14:
                {
                alt2=1;
                }
                break;
            case 39:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:898:1: ( ruleFunction )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:898:1: ( ruleFunction )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:899:1: ruleFunction
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseExpressionAccess().getFunctionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleFunction_in_rule__BaseExpression__Alternatives1849);
                    ruleFunction();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseExpressionAccess().getFunctionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:904:6: ( ruleNullLiteral )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:904:6: ( ruleNullLiteral )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:905:1: ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseExpressionAccess().getNullLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_rule__BaseExpression__Alternatives1866);
                    ruleNullLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseExpressionAccess().getNullLiteralParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:910:6: ( ruleStringExpression )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:910:6: ( ruleStringExpression )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:911:1: ruleStringExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseExpressionAccess().getStringExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleStringExpression_in_rule__BaseExpression__Alternatives1883);
                    ruleStringExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseExpressionAccess().getStringExpressionParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpression__Alternatives"


    // $ANTLR start "rule__StringValue__Alternatives"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:921:1: rule__StringValue__Alternatives : ( ( ruleStringLiteral ) | ( ruleStringProperty ) );
    public final void rule__StringValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:925:1: ( ( ruleStringLiteral ) | ( ruleStringProperty ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:926:1: ( ruleStringLiteral )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:926:1: ( ruleStringLiteral )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:927:1: ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStringValueAccess().getStringLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__StringValue__Alternatives1915);
                    ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStringValueAccess().getStringLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:932:6: ( ruleStringProperty )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:932:6: ( ruleStringProperty )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:933:1: ruleStringProperty
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStringValueAccess().getStringPropertyParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleStringProperty_in_rule__StringValue__Alternatives1932);
                    ruleStringProperty();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStringValueAccess().getStringPropertyParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Alternatives"


    // $ANTLR start "rule__TypeReference__Alternatives"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:943:1: rule__TypeReference__Alternatives : ( ( ( rule__TypeReference__Group_0__0 ) ) | ( ( rule__TypeReference__Group_1__0 ) ) );
    public final void rule__TypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:947:1: ( ( ( rule__TypeReference__Group_0__0 ) ) | ( ( rule__TypeReference__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==40) ) {
                    alt4=1;
                }
                else if ( (LA4_1==EOF||LA4_1==RULE_ID||LA4_1==42) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:948:1: ( ( rule__TypeReference__Group_0__0 ) )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:948:1: ( ( rule__TypeReference__Group_0__0 ) )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:949:1: ( rule__TypeReference__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeReferenceAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:950:1: ( rule__TypeReference__Group_0__0 )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:950:2: rule__TypeReference__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TypeReference__Group_0__0_in_rule__TypeReference__Alternatives1964);
                    rule__TypeReference__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeReferenceAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:954:6: ( ( rule__TypeReference__Group_1__0 ) )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:954:6: ( ( rule__TypeReference__Group_1__0 ) )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:955:1: ( rule__TypeReference__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeReferenceAccess().getGroup_1()); 
                    }
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:956:1: ( rule__TypeReference__Group_1__0 )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:956:2: rule__TypeReference__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeReference__Group_1__0_in_rule__TypeReference__Alternatives1982);
                    rule__TypeReference__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeReferenceAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Alternatives"


    // $ANTLR start "rule__ViewContent__Alternatives"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:965:1: rule__ViewContent__Alternatives : ( ( ruleViewElement ) | ( ruleViewContainer ) );
    public final void rule__ViewContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:969:1: ( ( ruleViewElement ) | ( ruleViewContainer ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=15 && LA5_0<=22)) ) {
                alt5=1;
            }
            else if ( (LA5_0==47) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:970:1: ( ruleViewElement )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:970:1: ( ruleViewElement )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:971:1: ruleViewElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getViewContentAccess().getViewElementParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleViewElement_in_rule__ViewContent__Alternatives2015);
                    ruleViewElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getViewContentAccess().getViewElementParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:976:6: ( ruleViewContainer )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:976:6: ( ruleViewContainer )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:977:1: ruleViewContainer
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getViewContentAccess().getViewContainerParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleViewContainer_in_rule__ViewContent__Alternatives2032);
                    ruleViewContainer();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getViewContentAccess().getViewContainerParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewContent__Alternatives"


    // $ANTLR start "rule__Layout__Alternatives"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:987:1: rule__Layout__Alternatives : ( ( ruleStackLayout ) | ( ruleGridLayout ) );
    public final void rule__Layout__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:991:1: ( ( ruleStackLayout ) | ( ruleGridLayout ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:992:1: ( ruleStackLayout )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:992:1: ( ruleStackLayout )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:993:1: ruleStackLayout
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLayoutAccess().getStackLayoutParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleStackLayout_in_rule__Layout__Alternatives2064);
                    ruleStackLayout();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLayoutAccess().getStackLayoutParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:998:6: ( ruleGridLayout )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:998:6: ( ruleGridLayout )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:999:1: ruleGridLayout
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLayoutAccess().getGridLayoutParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleGridLayout_in_rule__Layout__Alternatives2081);
                    ruleGridLayout();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLayoutAccess().getGridLayoutParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Alternatives"


    // $ANTLR start "rule__FunctionEnum__Alternatives"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1009:1: rule__FunctionEnum__Alternatives : ( ( ( 'decode' ) ) | ( ( 'encode' ) ) | ( ( 'get' ) ) | ( ( 'put' ) ) );
    public final void rule__FunctionEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1013:1: ( ( ( 'decode' ) ) | ( ( 'encode' ) ) | ( ( 'get' ) ) | ( ( 'put' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt7=1;
                }
                break;
            case 12:
                {
                alt7=2;
                }
                break;
            case 13:
                {
                alt7=3;
                }
                break;
            case 14:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1014:1: ( ( 'decode' ) )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1014:1: ( ( 'decode' ) )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1015:1: ( 'decode' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionEnumAccess().getDECODEEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1016:1: ( 'decode' )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1016:3: 'decode'
                    {
                    match(input,11,FOLLOW_11_in_rule__FunctionEnum__Alternatives2114); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionEnumAccess().getDECODEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1021:6: ( ( 'encode' ) )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1021:6: ( ( 'encode' ) )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1022:1: ( 'encode' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionEnumAccess().getENCODEEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1023:1: ( 'encode' )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1023:3: 'encode'
                    {
                    match(input,12,FOLLOW_12_in_rule__FunctionEnum__Alternatives2135); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionEnumAccess().getENCODEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1028:6: ( ( 'get' ) )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1028:6: ( ( 'get' ) )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1029:1: ( 'get' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionEnumAccess().getGETEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1030:1: ( 'get' )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1030:3: 'get'
                    {
                    match(input,13,FOLLOW_13_in_rule__FunctionEnum__Alternatives2156); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionEnumAccess().getGETEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1035:6: ( ( 'put' ) )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1035:6: ( ( 'put' ) )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1036:1: ( 'put' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionEnumAccess().getPUTEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1037:1: ( 'put' )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1037:3: 'put'
                    {
                    match(input,14,FOLLOW_14_in_rule__FunctionEnum__Alternatives2177); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionEnumAccess().getPUTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionEnum__Alternatives"


    // $ANTLR start "rule__ViewType__Alternatives"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1047:1: rule__ViewType__Alternatives : ( ( ( 'button' ) ) | ( ( 'value-spinner' ) ) | ( ( 'date-spinner' ) ) | ( ( 'label' ) ) | ( ( 'text' ) ) | ( ( 'input' ) ) | ( ( 'canvas' ) ) | ( ( 'tree-list' ) ) );
    public final void rule__ViewType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1051:1: ( ( ( 'button' ) ) | ( ( 'value-spinner' ) ) | ( ( 'date-spinner' ) ) | ( ( 'label' ) ) | ( ( 'text' ) ) | ( ( 'input' ) ) | ( ( 'canvas' ) ) | ( ( 'tree-list' ) ) )
            int alt8=8;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt8=1;
                }
                break;
            case 16:
                {
                alt8=2;
                }
                break;
            case 17:
                {
                alt8=3;
                }
                break;
            case 18:
                {
                alt8=4;
                }
                break;
            case 19:
                {
                alt8=5;
                }
                break;
            case 20:
                {
                alt8=6;
                }
                break;
            case 21:
                {
                alt8=7;
                }
                break;
            case 22:
                {
                alt8=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1052:1: ( ( 'button' ) )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1052:1: ( ( 'button' ) )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1053:1: ( 'button' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getViewTypeAccess().getButtonEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1054:1: ( 'button' )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1054:3: 'button'
                    {
                    match(input,15,FOLLOW_15_in_rule__ViewType__Alternatives2213); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getViewTypeAccess().getButtonEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1059:6: ( ( 'value-spinner' ) )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1059:6: ( ( 'value-spinner' ) )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1060:1: ( 'value-spinner' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getViewTypeAccess().getValueSpinnerEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1061:1: ( 'value-spinner' )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1061:3: 'value-spinner'
                    {
                    match(input,16,FOLLOW_16_in_rule__ViewType__Alternatives2234); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getViewTypeAccess().getValueSpinnerEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1066:6: ( ( 'date-spinner' ) )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1066:6: ( ( 'date-spinner' ) )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1067:1: ( 'date-spinner' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getViewTypeAccess().getDateSpinnerEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1068:1: ( 'date-spinner' )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1068:3: 'date-spinner'
                    {
                    match(input,17,FOLLOW_17_in_rule__ViewType__Alternatives2255); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getViewTypeAccess().getDateSpinnerEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1073:6: ( ( 'label' ) )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1073:6: ( ( 'label' ) )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1074:1: ( 'label' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getViewTypeAccess().getLabelEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1075:1: ( 'label' )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1075:3: 'label'
                    {
                    match(input,18,FOLLOW_18_in_rule__ViewType__Alternatives2276); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getViewTypeAccess().getLabelEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1080:6: ( ( 'text' ) )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1080:6: ( ( 'text' ) )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1081:1: ( 'text' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getViewTypeAccess().getTextOutputEnumLiteralDeclaration_4()); 
                    }
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1082:1: ( 'text' )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1082:3: 'text'
                    {
                    match(input,19,FOLLOW_19_in_rule__ViewType__Alternatives2297); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getViewTypeAccess().getTextOutputEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1087:6: ( ( 'input' ) )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1087:6: ( ( 'input' ) )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1088:1: ( 'input' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getViewTypeAccess().getInputFieldEnumLiteralDeclaration_5()); 
                    }
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1089:1: ( 'input' )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1089:3: 'input'
                    {
                    match(input,20,FOLLOW_20_in_rule__ViewType__Alternatives2318); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getViewTypeAccess().getInputFieldEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1094:6: ( ( 'canvas' ) )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1094:6: ( ( 'canvas' ) )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1095:1: ( 'canvas' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getViewTypeAccess().getCanvasEnumLiteralDeclaration_6()); 
                    }
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1096:1: ( 'canvas' )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1096:3: 'canvas'
                    {
                    match(input,21,FOLLOW_21_in_rule__ViewType__Alternatives2339); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getViewTypeAccess().getCanvasEnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1101:6: ( ( 'tree-list' ) )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1101:6: ( ( 'tree-list' ) )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1102:1: ( 'tree-list' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getViewTypeAccess().getTreeListEnumLiteralDeclaration_7()); 
                    }
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1103:1: ( 'tree-list' )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1103:3: 'tree-list'
                    {
                    match(input,22,FOLLOW_22_in_rule__ViewType__Alternatives2360); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getViewTypeAccess().getTreeListEnumLiteralDeclaration_7()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewType__Alternatives"


    // $ANTLR start "rule__Unit__Alternatives"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1113:1: rule__Unit__Alternatives : ( ( ( 'px' ) ) | ( ( '%' ) ) );
    public final void rule__Unit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1117:1: ( ( ( 'px' ) ) | ( ( '%' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==24) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1118:1: ( ( 'px' ) )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1118:1: ( ( 'px' ) )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1119:1: ( 'px' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnitAccess().getPXEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1120:1: ( 'px' )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1120:3: 'px'
                    {
                    match(input,23,FOLLOW_23_in_rule__Unit__Alternatives2396); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnitAccess().getPXEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1125:6: ( ( '%' ) )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1125:6: ( ( '%' ) )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1126:1: ( '%' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnitAccess().getPERCENTEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1127:1: ( '%' )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1127:3: '%'
                    {
                    match(input,24,FOLLOW_24_in_rule__Unit__Alternatives2417); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnitAccess().getPERCENTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__Alternatives"


    // $ANTLR start "rule__Direction__Alternatives"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1137:1: rule__Direction__Alternatives : ( ( ( 'horizontal' ) ) | ( ( 'vertical' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1141:1: ( ( ( 'horizontal' ) ) | ( ( 'vertical' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1142:1: ( ( 'horizontal' ) )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1142:1: ( ( 'horizontal' ) )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1143:1: ( 'horizontal' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionAccess().getHORIZONTALEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1144:1: ( 'horizontal' )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1144:3: 'horizontal'
                    {
                    match(input,25,FOLLOW_25_in_rule__Direction__Alternatives2453); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectionAccess().getHORIZONTALEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1149:6: ( ( 'vertical' ) )
                    {
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1149:6: ( ( 'vertical' ) )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1150:1: ( 'vertical' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionAccess().getVERTICALEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1151:1: ( 'vertical' )
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1151:3: 'vertical'
                    {
                    match(input,26,FOLLOW_26_in_rule__Direction__Alternatives2474); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectionAccess().getVERTICALEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1163:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1167:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1168:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02507);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02510);
            rule__Model__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1175:1: rule__Model__Group__0__Impl : ( ( rule__Model__Alternatives_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1179:1: ( ( ( rule__Model__Alternatives_0 )* ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1180:1: ( ( rule__Model__Alternatives_0 )* )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1180:1: ( ( rule__Model__Alternatives_0 )* )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1181:1: ( rule__Model__Alternatives_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAlternatives_0()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1182:1: ( rule__Model__Alternatives_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27||LA11_0==31||LA11_0==46) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1182:2: rule__Model__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__Alternatives_0_in_rule__Model__Group__0__Impl2537);
            	    rule__Model__Alternatives_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1192:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1196:1: ( rule__Model__Group__1__Impl )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1197:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12568);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1203:1: rule__Model__Group__1__Impl : ( ( rule__Model__ModelAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1207:1: ( ( ( rule__Model__ModelAssignment_1 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1208:1: ( ( rule__Model__ModelAssignment_1 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1208:1: ( ( rule__Model__ModelAssignment_1 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1209:1: ( rule__Model__ModelAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getModelAssignment_1()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1210:1: ( rule__Model__ModelAssignment_1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1210:2: rule__Model__ModelAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__ModelAssignment_1_in_rule__Model__Group__1__Impl2595);
            rule__Model__ModelAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getModelAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1224:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1228:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1229:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__02629);
            rule__Class__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__1_in_rule__Class__Group__02632);
            rule__Class__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1236:1: rule__Class__Group__0__Impl : ( 'class' ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1240:1: ( ( 'class' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1241:1: ( 'class' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1241:1: ( 'class' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1242:1: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getClassKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Class__Group__0__Impl2660); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getClassKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1255:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1259:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1260:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__12691);
            rule__Class__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__2_in_rule__Class__Group__12694);
            rule__Class__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1267:1: rule__Class__Group__1__Impl : ( ( rule__Class__NameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1271:1: ( ( ( rule__Class__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1272:1: ( ( rule__Class__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1272:1: ( ( rule__Class__NameAssignment_1 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1273:1: ( rule__Class__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1274:1: ( rule__Class__NameAssignment_1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1274:2: rule__Class__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Class__NameAssignment_1_in_rule__Class__Group__1__Impl2721);
            rule__Class__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1284:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1288:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1289:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__22751);
            rule__Class__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__3_in_rule__Class__Group__22754);
            rule__Class__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1296:1: rule__Class__Group__2__Impl : ( ( rule__Class__Group_2__0 )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1300:1: ( ( ( rule__Class__Group_2__0 )? ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1301:1: ( ( rule__Class__Group_2__0 )? )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1301:1: ( ( rule__Class__Group_2__0 )? )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1302:1: ( rule__Class__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1303:1: ( rule__Class__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1303:2: rule__Class__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Class__Group_2__0_in_rule__Class__Group__2__Impl2781);
                    rule__Class__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1313:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1317:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1318:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__32812);
            rule__Class__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__4_in_rule__Class__Group__32815);
            rule__Class__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1325:1: rule__Class__Group__3__Impl : ( '{' ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1329:1: ( ( '{' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1330:1: ( '{' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1330:1: ( '{' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1331:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,28,FOLLOW_28_in_rule__Class__Group__3__Impl2843); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1344:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1348:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1349:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__42874);
            rule__Class__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__5_in_rule__Class__Group__42877);
            rule__Class__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1356:1: rule__Class__Group__4__Impl : ( ( ( rule__Class__PropertiesAssignment_4 ) ) ( ( rule__Class__PropertiesAssignment_4 )* ) ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1360:1: ( ( ( ( rule__Class__PropertiesAssignment_4 ) ) ( ( rule__Class__PropertiesAssignment_4 )* ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1361:1: ( ( ( rule__Class__PropertiesAssignment_4 ) ) ( ( rule__Class__PropertiesAssignment_4 )* ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1361:1: ( ( ( rule__Class__PropertiesAssignment_4 ) ) ( ( rule__Class__PropertiesAssignment_4 )* ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1362:1: ( ( rule__Class__PropertiesAssignment_4 ) ) ( ( rule__Class__PropertiesAssignment_4 )* )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1362:1: ( ( rule__Class__PropertiesAssignment_4 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1363:1: ( rule__Class__PropertiesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getPropertiesAssignment_4()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1364:1: ( rule__Class__PropertiesAssignment_4 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1364:2: rule__Class__PropertiesAssignment_4
            {
            pushFollow(FOLLOW_rule__Class__PropertiesAssignment_4_in_rule__Class__Group__4__Impl2906);
            rule__Class__PropertiesAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getPropertiesAssignment_4()); 
            }

            }

            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1367:1: ( ( rule__Class__PropertiesAssignment_4 )* )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1368:1: ( rule__Class__PropertiesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getPropertiesAssignment_4()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1369:1: ( rule__Class__PropertiesAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1369:2: rule__Class__PropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Class__PropertiesAssignment_4_in_rule__Class__Group__4__Impl2918);
            	    rule__Class__PropertiesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getPropertiesAssignment_4()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__5"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1380:1: rule__Class__Group__5 : rule__Class__Group__5__Impl ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1384:1: ( rule__Class__Group__5__Impl )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1385:2: rule__Class__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__52951);
            rule__Class__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5"


    // $ANTLR start "rule__Class__Group__5__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1391:1: rule__Class__Group__5__Impl : ( '}' ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1395:1: ( ( '}' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1396:1: ( '}' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1396:1: ( '}' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1397:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,29,FOLLOW_29_in_rule__Class__Group__5__Impl2979); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5__Impl"


    // $ANTLR start "rule__Class__Group_2__0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1422:1: rule__Class__Group_2__0 : rule__Class__Group_2__0__Impl rule__Class__Group_2__1 ;
    public final void rule__Class__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1426:1: ( rule__Class__Group_2__0__Impl rule__Class__Group_2__1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1427:2: rule__Class__Group_2__0__Impl rule__Class__Group_2__1
            {
            pushFollow(FOLLOW_rule__Class__Group_2__0__Impl_in_rule__Class__Group_2__03022);
            rule__Class__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group_2__1_in_rule__Class__Group_2__03025);
            rule__Class__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_2__0"


    // $ANTLR start "rule__Class__Group_2__0__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1434:1: rule__Class__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Class__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1438:1: ( ( 'extends' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1439:1: ( 'extends' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1439:1: ( 'extends' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1440:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getExtendsKeyword_2_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__Class__Group_2__0__Impl3053); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getExtendsKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_2__0__Impl"


    // $ANTLR start "rule__Class__Group_2__1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1453:1: rule__Class__Group_2__1 : rule__Class__Group_2__1__Impl ;
    public final void rule__Class__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1457:1: ( rule__Class__Group_2__1__Impl )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1458:2: rule__Class__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group_2__1__Impl_in_rule__Class__Group_2__13084);
            rule__Class__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_2__1"


    // $ANTLR start "rule__Class__Group_2__1__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1464:1: rule__Class__Group_2__1__Impl : ( ( rule__Class__ParentAssignment_2_1 ) ) ;
    public final void rule__Class__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1468:1: ( ( ( rule__Class__ParentAssignment_2_1 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1469:1: ( ( rule__Class__ParentAssignment_2_1 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1469:1: ( ( rule__Class__ParentAssignment_2_1 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1470:1: ( rule__Class__ParentAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getParentAssignment_2_1()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1471:1: ( rule__Class__ParentAssignment_2_1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1471:2: rule__Class__ParentAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Class__ParentAssignment_2_1_in_rule__Class__Group_2__1__Impl3111);
            rule__Class__ParentAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getParentAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_2__1__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1485:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1489:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1490:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__03145);
            rule__Service__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__1_in_rule__Service__Group__03148);
            rule__Service__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1497:1: rule__Service__Group__0__Impl : ( 'service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1501:1: ( ( 'service' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1502:1: ( 'service' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1502:1: ( 'service' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1503:1: 'service'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__Service__Group__0__Impl3176); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1516:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1520:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1521:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__13207);
            rule__Service__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__2_in_rule__Service__Group__13210);
            rule__Service__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1528:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1532:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1533:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1533:1: ( ( rule__Service__NameAssignment_1 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1534:1: ( rule__Service__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1535:1: ( rule__Service__NameAssignment_1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1535:2: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl3237);
            rule__Service__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1545:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1549:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1550:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__23267);
            rule__Service__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__3_in_rule__Service__Group__23270);
            rule__Service__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1557:1: rule__Service__Group__2__Impl : ( '(' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1561:1: ( ( '(' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1562:1: ( '(' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1562:1: ( '(' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1563:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__Service__Group__2__Impl3298); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1576:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1580:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1581:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__33329);
            rule__Service__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__4_in_rule__Service__Group__33332);
            rule__Service__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1588:1: rule__Service__Group__3__Impl : ( ( rule__Service__ConfigurationsAssignment_3 ) ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1592:1: ( ( ( rule__Service__ConfigurationsAssignment_3 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1593:1: ( ( rule__Service__ConfigurationsAssignment_3 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1593:1: ( ( rule__Service__ConfigurationsAssignment_3 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1594:1: ( rule__Service__ConfigurationsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getConfigurationsAssignment_3()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1595:1: ( rule__Service__ConfigurationsAssignment_3 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1595:2: rule__Service__ConfigurationsAssignment_3
            {
            pushFollow(FOLLOW_rule__Service__ConfigurationsAssignment_3_in_rule__Service__Group__3__Impl3359);
            rule__Service__ConfigurationsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getConfigurationsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1605:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1609:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1610:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__43389);
            rule__Service__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__5_in_rule__Service__Group__43392);
            rule__Service__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1617:1: rule__Service__Group__4__Impl : ( ( rule__Service__Group_4__0 )* ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1621:1: ( ( ( rule__Service__Group_4__0 )* ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1622:1: ( ( rule__Service__Group_4__0 )* )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1622:1: ( ( rule__Service__Group_4__0 )* )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1623:1: ( rule__Service__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getGroup_4()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1624:1: ( rule__Service__Group_4__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1624:2: rule__Service__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Service__Group_4__0_in_rule__Service__Group__4__Impl3419);
            	    rule__Service__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Service__Group__5"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1634:1: rule__Service__Group__5 : rule__Service__Group__5__Impl rule__Service__Group__6 ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1638:1: ( rule__Service__Group__5__Impl rule__Service__Group__6 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1639:2: rule__Service__Group__5__Impl rule__Service__Group__6
            {
            pushFollow(FOLLOW_rule__Service__Group__5__Impl_in_rule__Service__Group__53450);
            rule__Service__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__6_in_rule__Service__Group__53453);
            rule__Service__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5"


    // $ANTLR start "rule__Service__Group__5__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1646:1: rule__Service__Group__5__Impl : ( ')' ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1650:1: ( ( ')' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1651:1: ( ')' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1651:1: ( ')' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1652:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,33,FOLLOW_33_in_rule__Service__Group__5__Impl3481); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5__Impl"


    // $ANTLR start "rule__Service__Group__6"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1665:1: rule__Service__Group__6 : rule__Service__Group__6__Impl rule__Service__Group__7 ;
    public final void rule__Service__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1669:1: ( rule__Service__Group__6__Impl rule__Service__Group__7 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1670:2: rule__Service__Group__6__Impl rule__Service__Group__7
            {
            pushFollow(FOLLOW_rule__Service__Group__6__Impl_in_rule__Service__Group__63512);
            rule__Service__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__7_in_rule__Service__Group__63515);
            rule__Service__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__6"


    // $ANTLR start "rule__Service__Group__6__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1677:1: rule__Service__Group__6__Impl : ( '{' ) ;
    public final void rule__Service__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1681:1: ( ( '{' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1682:1: ( '{' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1682:1: ( '{' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1683:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_6()); 
            }
            match(input,28,FOLLOW_28_in_rule__Service__Group__6__Impl3543); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__6__Impl"


    // $ANTLR start "rule__Service__Group__7"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1696:1: rule__Service__Group__7 : rule__Service__Group__7__Impl rule__Service__Group__8 ;
    public final void rule__Service__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1700:1: ( rule__Service__Group__7__Impl rule__Service__Group__8 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1701:2: rule__Service__Group__7__Impl rule__Service__Group__8
            {
            pushFollow(FOLLOW_rule__Service__Group__7__Impl_in_rule__Service__Group__73574);
            rule__Service__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group__8_in_rule__Service__Group__73577);
            rule__Service__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__7"


    // $ANTLR start "rule__Service__Group__7__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1708:1: rule__Service__Group__7__Impl : ( ( ( rule__Service__OperationsAssignment_7 ) ) ( ( rule__Service__OperationsAssignment_7 )* ) ) ;
    public final void rule__Service__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1712:1: ( ( ( ( rule__Service__OperationsAssignment_7 ) ) ( ( rule__Service__OperationsAssignment_7 )* ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1713:1: ( ( ( rule__Service__OperationsAssignment_7 ) ) ( ( rule__Service__OperationsAssignment_7 )* ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1713:1: ( ( ( rule__Service__OperationsAssignment_7 ) ) ( ( rule__Service__OperationsAssignment_7 )* ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1714:1: ( ( rule__Service__OperationsAssignment_7 ) ) ( ( rule__Service__OperationsAssignment_7 )* )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1714:1: ( ( rule__Service__OperationsAssignment_7 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1715:1: ( rule__Service__OperationsAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getOperationsAssignment_7()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1716:1: ( rule__Service__OperationsAssignment_7 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1716:2: rule__Service__OperationsAssignment_7
            {
            pushFollow(FOLLOW_rule__Service__OperationsAssignment_7_in_rule__Service__Group__7__Impl3606);
            rule__Service__OperationsAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getOperationsAssignment_7()); 
            }

            }

            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1719:1: ( ( rule__Service__OperationsAssignment_7 )* )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1720:1: ( rule__Service__OperationsAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getOperationsAssignment_7()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1721:1: ( rule__Service__OperationsAssignment_7 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==35) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1721:2: rule__Service__OperationsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Service__OperationsAssignment_7_in_rule__Service__Group__7__Impl3618);
            	    rule__Service__OperationsAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getOperationsAssignment_7()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__7__Impl"


    // $ANTLR start "rule__Service__Group__8"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1732:1: rule__Service__Group__8 : rule__Service__Group__8__Impl ;
    public final void rule__Service__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1736:1: ( rule__Service__Group__8__Impl )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1737:2: rule__Service__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group__8__Impl_in_rule__Service__Group__83651);
            rule__Service__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__8"


    // $ANTLR start "rule__Service__Group__8__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1743:1: rule__Service__Group__8__Impl : ( '}' ) ;
    public final void rule__Service__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1747:1: ( ( '}' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1748:1: ( '}' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1748:1: ( '}' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1749:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,29,FOLLOW_29_in_rule__Service__Group__8__Impl3679); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__8__Impl"


    // $ANTLR start "rule__Service__Group_4__0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1780:1: rule__Service__Group_4__0 : rule__Service__Group_4__0__Impl rule__Service__Group_4__1 ;
    public final void rule__Service__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1784:1: ( rule__Service__Group_4__0__Impl rule__Service__Group_4__1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1785:2: rule__Service__Group_4__0__Impl rule__Service__Group_4__1
            {
            pushFollow(FOLLOW_rule__Service__Group_4__0__Impl_in_rule__Service__Group_4__03728);
            rule__Service__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Service__Group_4__1_in_rule__Service__Group_4__03731);
            rule__Service__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__0"


    // $ANTLR start "rule__Service__Group_4__0__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1792:1: rule__Service__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Service__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1796:1: ( ( ',' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1797:1: ( ',' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1797:1: ( ',' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1798:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getCommaKeyword_4_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__Service__Group_4__0__Impl3759); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getCommaKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__0__Impl"


    // $ANTLR start "rule__Service__Group_4__1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1811:1: rule__Service__Group_4__1 : rule__Service__Group_4__1__Impl ;
    public final void rule__Service__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1815:1: ( rule__Service__Group_4__1__Impl )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1816:2: rule__Service__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group_4__1__Impl_in_rule__Service__Group_4__13790);
            rule__Service__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__1"


    // $ANTLR start "rule__Service__Group_4__1__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1822:1: rule__Service__Group_4__1__Impl : ( ( rule__Service__ConfigurationsAssignment_4_1 ) ) ;
    public final void rule__Service__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1826:1: ( ( ( rule__Service__ConfigurationsAssignment_4_1 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1827:1: ( ( rule__Service__ConfigurationsAssignment_4_1 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1827:1: ( ( rule__Service__ConfigurationsAssignment_4_1 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1828:1: ( rule__Service__ConfigurationsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getConfigurationsAssignment_4_1()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1829:1: ( rule__Service__ConfigurationsAssignment_4_1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1829:2: rule__Service__ConfigurationsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Service__ConfigurationsAssignment_4_1_in_rule__Service__Group_4__1__Impl3817);
            rule__Service__ConfigurationsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getConfigurationsAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__1__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1843:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1847:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1848:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__03851);
            rule__Operation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__03854);
            rule__Operation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1855:1: rule__Operation__Group__0__Impl : ( 'op' ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1859:1: ( ( 'op' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1860:1: ( 'op' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1860:1: ( 'op' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1861:1: 'op'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getOpKeyword_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__Operation__Group__0__Impl3882); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getOpKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1874:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1878:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1879:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__13913);
            rule__Operation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__13916);
            rule__Operation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1886:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__TypeAssignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1890:1: ( ( ( rule__Operation__TypeAssignment_1 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1891:1: ( ( rule__Operation__TypeAssignment_1 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1891:1: ( ( rule__Operation__TypeAssignment_1 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1892:1: ( rule__Operation__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getTypeAssignment_1()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1893:1: ( rule__Operation__TypeAssignment_1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1893:2: rule__Operation__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Operation__TypeAssignment_1_in_rule__Operation__Group__1__Impl3943);
            rule__Operation__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1903:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1907:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1908:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__23973);
            rule__Operation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__23976);
            rule__Operation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1915:1: rule__Operation__Group__2__Impl : ( ( rule__Operation__NameAssignment_2 ) ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1919:1: ( ( ( rule__Operation__NameAssignment_2 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1920:1: ( ( rule__Operation__NameAssignment_2 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1920:1: ( ( rule__Operation__NameAssignment_2 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1921:1: ( rule__Operation__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getNameAssignment_2()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1922:1: ( rule__Operation__NameAssignment_2 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1922:2: rule__Operation__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Operation__NameAssignment_2_in_rule__Operation__Group__2__Impl4003);
            rule__Operation__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group__3"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1932:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1936:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1937:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__34033);
            rule__Operation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__34036);
            rule__Operation__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3"


    // $ANTLR start "rule__Operation__Group__3__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1944:1: rule__Operation__Group__3__Impl : ( '(' ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1948:1: ( ( '(' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1949:1: ( '(' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1949:1: ( '(' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1950:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,32,FOLLOW_32_in_rule__Operation__Group__3__Impl4064); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__4"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1963:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1967:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1968:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__44095);
            rule__Operation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__44098);
            rule__Operation__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4"


    // $ANTLR start "rule__Operation__Group__4__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1975:1: rule__Operation__Group__4__Impl : ( ( rule__Operation__ParametersAssignment_4 ) ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1979:1: ( ( ( rule__Operation__ParametersAssignment_4 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1980:1: ( ( rule__Operation__ParametersAssignment_4 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1980:1: ( ( rule__Operation__ParametersAssignment_4 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1981:1: ( rule__Operation__ParametersAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getParametersAssignment_4()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1982:1: ( rule__Operation__ParametersAssignment_4 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1982:2: rule__Operation__ParametersAssignment_4
            {
            pushFollow(FOLLOW_rule__Operation__ParametersAssignment_4_in_rule__Operation__Group__4__Impl4125);
            rule__Operation__ParametersAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getParametersAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4__Impl"


    // $ANTLR start "rule__Operation__Group__5"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1992:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1996:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:1997:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__54155);
            rule__Operation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group__6_in_rule__Operation__Group__54158);
            rule__Operation__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5"


    // $ANTLR start "rule__Operation__Group__5__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2004:1: rule__Operation__Group__5__Impl : ( ( rule__Operation__Group_5__0 )* ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2008:1: ( ( ( rule__Operation__Group_5__0 )* ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2009:1: ( ( rule__Operation__Group_5__0 )* )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2009:1: ( ( rule__Operation__Group_5__0 )* )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2010:1: ( rule__Operation__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup_5()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2011:1: ( rule__Operation__Group_5__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==34) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2011:2: rule__Operation__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Operation__Group_5__0_in_rule__Operation__Group__5__Impl4185);
            	    rule__Operation__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5__Impl"


    // $ANTLR start "rule__Operation__Group__6"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2021:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl rule__Operation__Group__7 ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2025:1: ( rule__Operation__Group__6__Impl rule__Operation__Group__7 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2026:2: rule__Operation__Group__6__Impl rule__Operation__Group__7
            {
            pushFollow(FOLLOW_rule__Operation__Group__6__Impl_in_rule__Operation__Group__64216);
            rule__Operation__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group__7_in_rule__Operation__Group__64219);
            rule__Operation__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__6"


    // $ANTLR start "rule__Operation__Group__6__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2033:1: rule__Operation__Group__6__Impl : ( ')' ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2037:1: ( ( ')' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2038:1: ( ')' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2038:1: ( ')' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2039:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,33,FOLLOW_33_in_rule__Operation__Group__6__Impl4247); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getRightParenthesisKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__6__Impl"


    // $ANTLR start "rule__Operation__Group__7"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2052:1: rule__Operation__Group__7 : rule__Operation__Group__7__Impl rule__Operation__Group__8 ;
    public final void rule__Operation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2056:1: ( rule__Operation__Group__7__Impl rule__Operation__Group__8 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2057:2: rule__Operation__Group__7__Impl rule__Operation__Group__8
            {
            pushFollow(FOLLOW_rule__Operation__Group__7__Impl_in_rule__Operation__Group__74278);
            rule__Operation__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group__8_in_rule__Operation__Group__74281);
            rule__Operation__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__7"


    // $ANTLR start "rule__Operation__Group__7__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2064:1: rule__Operation__Group__7__Impl : ( 'return' ) ;
    public final void rule__Operation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2068:1: ( ( 'return' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2069:1: ( 'return' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2069:1: ( 'return' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2070:1: 'return'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getReturnKeyword_7()); 
            }
            match(input,36,FOLLOW_36_in_rule__Operation__Group__7__Impl4309); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getReturnKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__7__Impl"


    // $ANTLR start "rule__Operation__Group__8"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2083:1: rule__Operation__Group__8 : rule__Operation__Group__8__Impl ;
    public final void rule__Operation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2087:1: ( rule__Operation__Group__8__Impl )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2088:2: rule__Operation__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group__8__Impl_in_rule__Operation__Group__84340);
            rule__Operation__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__8"


    // $ANTLR start "rule__Operation__Group__8__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2094:1: rule__Operation__Group__8__Impl : ( ( rule__Operation__ExpressionAssignment_8 ) ) ;
    public final void rule__Operation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2098:1: ( ( ( rule__Operation__ExpressionAssignment_8 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2099:1: ( ( rule__Operation__ExpressionAssignment_8 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2099:1: ( ( rule__Operation__ExpressionAssignment_8 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2100:1: ( rule__Operation__ExpressionAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getExpressionAssignment_8()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2101:1: ( rule__Operation__ExpressionAssignment_8 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2101:2: rule__Operation__ExpressionAssignment_8
            {
            pushFollow(FOLLOW_rule__Operation__ExpressionAssignment_8_in_rule__Operation__Group__8__Impl4367);
            rule__Operation__ExpressionAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getExpressionAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__8__Impl"


    // $ANTLR start "rule__Operation__Group_5__0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2129:1: rule__Operation__Group_5__0 : rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 ;
    public final void rule__Operation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2133:1: ( rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2134:2: rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_5__0__Impl_in_rule__Operation__Group_5__04415);
            rule__Operation__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group_5__1_in_rule__Operation__Group_5__04418);
            rule__Operation__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_5__0"


    // $ANTLR start "rule__Operation__Group_5__0__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2141:1: rule__Operation__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Operation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2145:1: ( ( ',' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2146:1: ( ',' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2146:1: ( ',' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2147:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getCommaKeyword_5_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__Operation__Group_5__0__Impl4446); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getCommaKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_5__0__Impl"


    // $ANTLR start "rule__Operation__Group_5__1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2160:1: rule__Operation__Group_5__1 : rule__Operation__Group_5__1__Impl ;
    public final void rule__Operation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2164:1: ( rule__Operation__Group_5__1__Impl )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2165:2: rule__Operation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_5__1__Impl_in_rule__Operation__Group_5__14477);
            rule__Operation__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_5__1"


    // $ANTLR start "rule__Operation__Group_5__1__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2171:1: rule__Operation__Group_5__1__Impl : ( ( rule__Operation__ParametersAssignment_5_1 ) ) ;
    public final void rule__Operation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2175:1: ( ( ( rule__Operation__ParametersAssignment_5_1 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2176:1: ( ( rule__Operation__ParametersAssignment_5_1 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2176:1: ( ( rule__Operation__ParametersAssignment_5_1 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2177:1: ( rule__Operation__ParametersAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getParametersAssignment_5_1()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2178:1: ( rule__Operation__ParametersAssignment_5_1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2178:2: rule__Operation__ParametersAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Operation__ParametersAssignment_5_1_in_rule__Operation__Group_5__1__Impl4504);
            rule__Operation__ParametersAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getParametersAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_5__1__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2192:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2196:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2197:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__04538);
            rule__Expression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__04541);
            rule__Expression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2204:1: rule__Expression__Group__0__Impl : ( ruleBaseExpression ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2208:1: ( ( ruleBaseExpression ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2209:1: ( ruleBaseExpression )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2209:1: ( ruleBaseExpression )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2210:1: ruleBaseExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getBaseExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBaseExpression_in_rule__Expression__Group__0__Impl4568);
            ruleBaseExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getBaseExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2221:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2225:1: ( rule__Expression__Group__1__Impl )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2226:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__14597);
            rule__Expression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2232:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2236:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2237:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2237:1: ( ( rule__Expression__Group_1__0 )? )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2238:1: ( rule__Expression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2239:1: ( rule__Expression__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2239:2: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl4624);
                    rule__Expression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2253:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2257:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2258:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__04659);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__04662);
            rule__Expression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2265:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2269:1: ( ( () ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2270:1: ( () )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2270:1: ( () )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2271:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2272:1: ()
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2274:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2284:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2288:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2289:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__14720);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__14723);
            rule__Expression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2296:1: rule__Expression__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2300:1: ( ( 'or' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2301:1: ( 'or' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2301:1: ( 'or' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2302:1: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOrKeyword_1_1()); 
            }
            match(input,37,FOLLOW_37_in_rule__Expression__Group_1__1__Impl4751); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getOrKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__2"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2315:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2319:1: ( rule__Expression__Group_1__2__Impl )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2320:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__24782);
            rule__Expression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__2"


    // $ANTLR start "rule__Expression__Group_1__2__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2326:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RightAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2330:1: ( ( ( rule__Expression__RightAssignment_1_2 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2331:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2331:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2332:1: ( rule__Expression__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2333:1: ( rule__Expression__RightAssignment_1_2 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2333:2: rule__Expression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Expression__RightAssignment_1_2_in_rule__Expression__Group_1__2__Impl4809);
            rule__Expression__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__2__Impl"


    // $ANTLR start "rule__StringExpression__Group__0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2349:1: rule__StringExpression__Group__0 : rule__StringExpression__Group__0__Impl rule__StringExpression__Group__1 ;
    public final void rule__StringExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2353:1: ( rule__StringExpression__Group__0__Impl rule__StringExpression__Group__1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2354:2: rule__StringExpression__Group__0__Impl rule__StringExpression__Group__1
            {
            pushFollow(FOLLOW_rule__StringExpression__Group__0__Impl_in_rule__StringExpression__Group__04845);
            rule__StringExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StringExpression__Group__1_in_rule__StringExpression__Group__04848);
            rule__StringExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringExpression__Group__0"


    // $ANTLR start "rule__StringExpression__Group__0__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2361:1: rule__StringExpression__Group__0__Impl : ( ruleStringValue ) ;
    public final void rule__StringExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2365:1: ( ( ruleStringValue ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2366:1: ( ruleStringValue )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2366:1: ( ruleStringValue )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2367:1: ruleStringValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringExpressionAccess().getStringValueParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_rule__StringExpression__Group__0__Impl4875);
            ruleStringValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringExpressionAccess().getStringValueParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringExpression__Group__0__Impl"


    // $ANTLR start "rule__StringExpression__Group__1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2378:1: rule__StringExpression__Group__1 : rule__StringExpression__Group__1__Impl ;
    public final void rule__StringExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2382:1: ( rule__StringExpression__Group__1__Impl )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2383:2: rule__StringExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StringExpression__Group__1__Impl_in_rule__StringExpression__Group__14904);
            rule__StringExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringExpression__Group__1"


    // $ANTLR start "rule__StringExpression__Group__1__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2389:1: rule__StringExpression__Group__1__Impl : ( ( rule__StringExpression__Group_1__0 )* ) ;
    public final void rule__StringExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2393:1: ( ( ( rule__StringExpression__Group_1__0 )* ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2394:1: ( ( rule__StringExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2394:1: ( ( rule__StringExpression__Group_1__0 )* )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2395:1: ( rule__StringExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2396:1: ( rule__StringExpression__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==38) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2396:2: rule__StringExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__StringExpression__Group_1__0_in_rule__StringExpression__Group__1__Impl4931);
            	    rule__StringExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringExpression__Group__1__Impl"


    // $ANTLR start "rule__StringExpression__Group_1__0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2410:1: rule__StringExpression__Group_1__0 : rule__StringExpression__Group_1__0__Impl rule__StringExpression__Group_1__1 ;
    public final void rule__StringExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2414:1: ( rule__StringExpression__Group_1__0__Impl rule__StringExpression__Group_1__1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2415:2: rule__StringExpression__Group_1__0__Impl rule__StringExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__StringExpression__Group_1__0__Impl_in_rule__StringExpression__Group_1__04966);
            rule__StringExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StringExpression__Group_1__1_in_rule__StringExpression__Group_1__04969);
            rule__StringExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringExpression__Group_1__0"


    // $ANTLR start "rule__StringExpression__Group_1__0__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2422:1: rule__StringExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__StringExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2426:1: ( ( () ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2427:1: ( () )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2427:1: ( () )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2428:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringExpressionAccess().getStringExpressionLeftAction_1_0()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2429:1: ()
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2431:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringExpressionAccess().getStringExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringExpression__Group_1__0__Impl"


    // $ANTLR start "rule__StringExpression__Group_1__1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2441:1: rule__StringExpression__Group_1__1 : rule__StringExpression__Group_1__1__Impl rule__StringExpression__Group_1__2 ;
    public final void rule__StringExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2445:1: ( rule__StringExpression__Group_1__1__Impl rule__StringExpression__Group_1__2 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2446:2: rule__StringExpression__Group_1__1__Impl rule__StringExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__StringExpression__Group_1__1__Impl_in_rule__StringExpression__Group_1__15027);
            rule__StringExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StringExpression__Group_1__2_in_rule__StringExpression__Group_1__15030);
            rule__StringExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringExpression__Group_1__1"


    // $ANTLR start "rule__StringExpression__Group_1__1__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2453:1: rule__StringExpression__Group_1__1__Impl : ( '+' ) ;
    public final void rule__StringExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2457:1: ( ( '+' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2458:1: ( '+' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2458:1: ( '+' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2459:1: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringExpressionAccess().getPlusSignKeyword_1_1()); 
            }
            match(input,38,FOLLOW_38_in_rule__StringExpression__Group_1__1__Impl5058); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringExpressionAccess().getPlusSignKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringExpression__Group_1__1__Impl"


    // $ANTLR start "rule__StringExpression__Group_1__2"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2472:1: rule__StringExpression__Group_1__2 : rule__StringExpression__Group_1__2__Impl ;
    public final void rule__StringExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2476:1: ( rule__StringExpression__Group_1__2__Impl )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2477:2: rule__StringExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__StringExpression__Group_1__2__Impl_in_rule__StringExpression__Group_1__25089);
            rule__StringExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringExpression__Group_1__2"


    // $ANTLR start "rule__StringExpression__Group_1__2__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2483:1: rule__StringExpression__Group_1__2__Impl : ( ( rule__StringExpression__RightAssignment_1_2 ) ) ;
    public final void rule__StringExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2487:1: ( ( ( rule__StringExpression__RightAssignment_1_2 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2488:1: ( ( rule__StringExpression__RightAssignment_1_2 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2488:1: ( ( rule__StringExpression__RightAssignment_1_2 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2489:1: ( rule__StringExpression__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringExpressionAccess().getRightAssignment_1_2()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2490:1: ( rule__StringExpression__RightAssignment_1_2 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2490:2: rule__StringExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__StringExpression__RightAssignment_1_2_in_rule__StringExpression__Group_1__2__Impl5116);
            rule__StringExpression__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringExpressionAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringExpression__Group_1__2__Impl"


    // $ANTLR start "rule__NullLiteral__Group__0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2506:1: rule__NullLiteral__Group__0 : rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1 ;
    public final void rule__NullLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2510:1: ( rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2511:2: rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__NullLiteral__Group__0__Impl_in_rule__NullLiteral__Group__05152);
            rule__NullLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NullLiteral__Group__1_in_rule__NullLiteral__Group__05155);
            rule__NullLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteral__Group__0"


    // $ANTLR start "rule__NullLiteral__Group__0__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2518:1: rule__NullLiteral__Group__0__Impl : ( () ) ;
    public final void rule__NullLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2522:1: ( ( () ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2523:1: ( () )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2523:1: ( () )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2524:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullLiteralAccess().getNullLiteralAction_0()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2525:1: ()
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2527:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullLiteralAccess().getNullLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteral__Group__0__Impl"


    // $ANTLR start "rule__NullLiteral__Group__1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2537:1: rule__NullLiteral__Group__1 : rule__NullLiteral__Group__1__Impl ;
    public final void rule__NullLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2541:1: ( rule__NullLiteral__Group__1__Impl )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2542:2: rule__NullLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NullLiteral__Group__1__Impl_in_rule__NullLiteral__Group__15213);
            rule__NullLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteral__Group__1"


    // $ANTLR start "rule__NullLiteral__Group__1__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2548:1: rule__NullLiteral__Group__1__Impl : ( 'null' ) ;
    public final void rule__NullLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2552:1: ( ( 'null' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2553:1: ( 'null' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2553:1: ( 'null' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2554:1: 'null'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullLiteralAccess().getNullKeyword_1()); 
            }
            match(input,39,FOLLOW_39_in_rule__NullLiteral__Group__1__Impl5241); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullLiteralAccess().getNullKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteral__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2571:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2575:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2576:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__05276);
            rule__Function__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__05279);
            rule__Function__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2583:1: rule__Function__Group__0__Impl : ( ( rule__Function__NameAssignment_0 ) ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2587:1: ( ( ( rule__Function__NameAssignment_0 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2588:1: ( ( rule__Function__NameAssignment_0 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2588:1: ( ( rule__Function__NameAssignment_0 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2589:1: ( rule__Function__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getNameAssignment_0()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2590:1: ( rule__Function__NameAssignment_0 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2590:2: rule__Function__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Function__NameAssignment_0_in_rule__Function__Group__0__Impl5306);
            rule__Function__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2600:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2604:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2605:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__15336);
            rule__Function__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__15339);
            rule__Function__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2612:1: rule__Function__Group__1__Impl : ( '(' ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2616:1: ( ( '(' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2617:1: ( '(' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2617:1: ( '(' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2618:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__Function__Group__1__Impl5367); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2631:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2635:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2636:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__25398);
            rule__Function__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__25401);
            rule__Function__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2643:1: rule__Function__Group__2__Impl : ( ( rule__Function__ExpressionsAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2647:1: ( ( ( rule__Function__ExpressionsAssignment_2 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2648:1: ( ( rule__Function__ExpressionsAssignment_2 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2648:1: ( ( rule__Function__ExpressionsAssignment_2 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2649:1: ( rule__Function__ExpressionsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getExpressionsAssignment_2()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2650:1: ( rule__Function__ExpressionsAssignment_2 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2650:2: rule__Function__ExpressionsAssignment_2
            {
            pushFollow(FOLLOW_rule__Function__ExpressionsAssignment_2_in_rule__Function__Group__2__Impl5428);
            rule__Function__ExpressionsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getExpressionsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2660:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2664:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2665:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__35458);
            rule__Function__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__4_in_rule__Function__Group__35461);
            rule__Function__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2672:1: rule__Function__Group__3__Impl : ( ( rule__Function__Group_3__0 )* ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2676:1: ( ( ( rule__Function__Group_3__0 )* ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2677:1: ( ( rule__Function__Group_3__0 )* )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2677:1: ( ( rule__Function__Group_3__0 )* )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2678:1: ( rule__Function__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getGroup_3()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2679:1: ( rule__Function__Group_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==34) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2679:2: rule__Function__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Function__Group_3__0_in_rule__Function__Group__3__Impl5488);
            	    rule__Function__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__4"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2689:1: rule__Function__Group__4 : rule__Function__Group__4__Impl ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2693:1: ( rule__Function__Group__4__Impl )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2694:2: rule__Function__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__45519);
            rule__Function__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4"


    // $ANTLR start "rule__Function__Group__4__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2700:1: rule__Function__Group__4__Impl : ( ')' ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2704:1: ( ( ')' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2705:1: ( ')' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2705:1: ( ')' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2706:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,33,FOLLOW_33_in_rule__Function__Group__4__Impl5547); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4__Impl"


    // $ANTLR start "rule__Function__Group_3__0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2729:1: rule__Function__Group_3__0 : rule__Function__Group_3__0__Impl rule__Function__Group_3__1 ;
    public final void rule__Function__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2733:1: ( rule__Function__Group_3__0__Impl rule__Function__Group_3__1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2734:2: rule__Function__Group_3__0__Impl rule__Function__Group_3__1
            {
            pushFollow(FOLLOW_rule__Function__Group_3__0__Impl_in_rule__Function__Group_3__05588);
            rule__Function__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group_3__1_in_rule__Function__Group_3__05591);
            rule__Function__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3__0"


    // $ANTLR start "rule__Function__Group_3__0__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2741:1: rule__Function__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Function__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2745:1: ( ( ',' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2746:1: ( ',' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2746:1: ( ',' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2747:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getCommaKeyword_3_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__Function__Group_3__0__Impl5619); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getCommaKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3__0__Impl"


    // $ANTLR start "rule__Function__Group_3__1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2760:1: rule__Function__Group_3__1 : rule__Function__Group_3__1__Impl ;
    public final void rule__Function__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2764:1: ( rule__Function__Group_3__1__Impl )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2765:2: rule__Function__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group_3__1__Impl_in_rule__Function__Group_3__15650);
            rule__Function__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3__1"


    // $ANTLR start "rule__Function__Group_3__1__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2771:1: rule__Function__Group_3__1__Impl : ( ( rule__Function__ExpressionsAssignment_3_1 ) ) ;
    public final void rule__Function__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2775:1: ( ( ( rule__Function__ExpressionsAssignment_3_1 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2776:1: ( ( rule__Function__ExpressionsAssignment_3_1 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2776:1: ( ( rule__Function__ExpressionsAssignment_3_1 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2777:1: ( rule__Function__ExpressionsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getExpressionsAssignment_3_1()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2778:1: ( rule__Function__ExpressionsAssignment_3_1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2778:2: rule__Function__ExpressionsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Function__ExpressionsAssignment_3_1_in_rule__Function__Group_3__1__Impl5677);
            rule__Function__ExpressionsAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getExpressionsAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3__1__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2792:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2796:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2797:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__05711);
            rule__Property__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__05714);
            rule__Property__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2804:1: rule__Property__Group__0__Impl : ( ( rule__Property__TypeAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2808:1: ( ( ( rule__Property__TypeAssignment_0 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2809:1: ( ( rule__Property__TypeAssignment_0 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2809:1: ( ( rule__Property__TypeAssignment_0 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2810:1: ( rule__Property__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeAssignment_0()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2811:1: ( rule__Property__TypeAssignment_0 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2811:2: rule__Property__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Property__TypeAssignment_0_in_rule__Property__Group__0__Impl5741);
            rule__Property__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2821:1: rule__Property__Group__1 : rule__Property__Group__1__Impl ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2825:1: ( rule__Property__Group__1__Impl )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2826:2: rule__Property__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__15771);
            rule__Property__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2832:1: rule__Property__Group__1__Impl : ( ( rule__Property__NameAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2836:1: ( ( ( rule__Property__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2837:1: ( ( rule__Property__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2837:1: ( ( rule__Property__NameAssignment_1 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2838:1: ( rule__Property__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2839:1: ( rule__Property__NameAssignment_1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2839:2: rule__Property__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Property__NameAssignment_1_in_rule__Property__Group__1__Impl5798);
            rule__Property__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__TypeReference__Group_0__0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2853:1: rule__TypeReference__Group_0__0 : rule__TypeReference__Group_0__0__Impl rule__TypeReference__Group_0__1 ;
    public final void rule__TypeReference__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2857:1: ( rule__TypeReference__Group_0__0__Impl rule__TypeReference__Group_0__1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2858:2: rule__TypeReference__Group_0__0__Impl rule__TypeReference__Group_0__1
            {
            pushFollow(FOLLOW_rule__TypeReference__Group_0__0__Impl_in_rule__TypeReference__Group_0__05832);
            rule__TypeReference__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypeReference__Group_0__1_in_rule__TypeReference__Group_0__05835);
            rule__TypeReference__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Group_0__0"


    // $ANTLR start "rule__TypeReference__Group_0__0__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2865:1: rule__TypeReference__Group_0__0__Impl : ( () ) ;
    public final void rule__TypeReference__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2869:1: ( ( () ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2870:1: ( () )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2870:1: ( () )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2871:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getArrayTypeAction_0_0()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2872:1: ()
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2874:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getArrayTypeAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Group_0__0__Impl"


    // $ANTLR start "rule__TypeReference__Group_0__1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2884:1: rule__TypeReference__Group_0__1 : rule__TypeReference__Group_0__1__Impl rule__TypeReference__Group_0__2 ;
    public final void rule__TypeReference__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2888:1: ( rule__TypeReference__Group_0__1__Impl rule__TypeReference__Group_0__2 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2889:2: rule__TypeReference__Group_0__1__Impl rule__TypeReference__Group_0__2
            {
            pushFollow(FOLLOW_rule__TypeReference__Group_0__1__Impl_in_rule__TypeReference__Group_0__15893);
            rule__TypeReference__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypeReference__Group_0__2_in_rule__TypeReference__Group_0__15896);
            rule__TypeReference__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Group_0__1"


    // $ANTLR start "rule__TypeReference__Group_0__1__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2896:1: rule__TypeReference__Group_0__1__Impl : ( ( rule__TypeReference__TypeAssignment_0_1 ) ) ;
    public final void rule__TypeReference__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2900:1: ( ( ( rule__TypeReference__TypeAssignment_0_1 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2901:1: ( ( rule__TypeReference__TypeAssignment_0_1 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2901:1: ( ( rule__TypeReference__TypeAssignment_0_1 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2902:1: ( rule__TypeReference__TypeAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getTypeAssignment_0_1()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2903:1: ( rule__TypeReference__TypeAssignment_0_1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2903:2: rule__TypeReference__TypeAssignment_0_1
            {
            pushFollow(FOLLOW_rule__TypeReference__TypeAssignment_0_1_in_rule__TypeReference__Group_0__1__Impl5923);
            rule__TypeReference__TypeAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getTypeAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Group_0__1__Impl"


    // $ANTLR start "rule__TypeReference__Group_0__2"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2913:1: rule__TypeReference__Group_0__2 : rule__TypeReference__Group_0__2__Impl rule__TypeReference__Group_0__3 ;
    public final void rule__TypeReference__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2917:1: ( rule__TypeReference__Group_0__2__Impl rule__TypeReference__Group_0__3 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2918:2: rule__TypeReference__Group_0__2__Impl rule__TypeReference__Group_0__3
            {
            pushFollow(FOLLOW_rule__TypeReference__Group_0__2__Impl_in_rule__TypeReference__Group_0__25953);
            rule__TypeReference__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypeReference__Group_0__3_in_rule__TypeReference__Group_0__25956);
            rule__TypeReference__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Group_0__2"


    // $ANTLR start "rule__TypeReference__Group_0__2__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2925:1: rule__TypeReference__Group_0__2__Impl : ( '[' ) ;
    public final void rule__TypeReference__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2929:1: ( ( '[' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2930:1: ( '[' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2930:1: ( '[' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2931:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getLeftSquareBracketKeyword_0_2()); 
            }
            match(input,40,FOLLOW_40_in_rule__TypeReference__Group_0__2__Impl5984); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getLeftSquareBracketKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Group_0__2__Impl"


    // $ANTLR start "rule__TypeReference__Group_0__3"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2944:1: rule__TypeReference__Group_0__3 : rule__TypeReference__Group_0__3__Impl rule__TypeReference__Group_0__4 ;
    public final void rule__TypeReference__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2948:1: ( rule__TypeReference__Group_0__3__Impl rule__TypeReference__Group_0__4 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2949:2: rule__TypeReference__Group_0__3__Impl rule__TypeReference__Group_0__4
            {
            pushFollow(FOLLOW_rule__TypeReference__Group_0__3__Impl_in_rule__TypeReference__Group_0__36015);
            rule__TypeReference__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypeReference__Group_0__4_in_rule__TypeReference__Group_0__36018);
            rule__TypeReference__Group_0__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Group_0__3"


    // $ANTLR start "rule__TypeReference__Group_0__3__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2956:1: rule__TypeReference__Group_0__3__Impl : ( ( rule__TypeReference__SizeAssignment_0_3 )? ) ;
    public final void rule__TypeReference__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2960:1: ( ( ( rule__TypeReference__SizeAssignment_0_3 )? ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2961:1: ( ( rule__TypeReference__SizeAssignment_0_3 )? )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2961:1: ( ( rule__TypeReference__SizeAssignment_0_3 )? )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2962:1: ( rule__TypeReference__SizeAssignment_0_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getSizeAssignment_0_3()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2963:1: ( rule__TypeReference__SizeAssignment_0_3 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2963:2: rule__TypeReference__SizeAssignment_0_3
                    {
                    pushFollow(FOLLOW_rule__TypeReference__SizeAssignment_0_3_in_rule__TypeReference__Group_0__3__Impl6045);
                    rule__TypeReference__SizeAssignment_0_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getSizeAssignment_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Group_0__3__Impl"


    // $ANTLR start "rule__TypeReference__Group_0__4"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2973:1: rule__TypeReference__Group_0__4 : rule__TypeReference__Group_0__4__Impl ;
    public final void rule__TypeReference__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2977:1: ( rule__TypeReference__Group_0__4__Impl )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2978:2: rule__TypeReference__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__TypeReference__Group_0__4__Impl_in_rule__TypeReference__Group_0__46076);
            rule__TypeReference__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Group_0__4"


    // $ANTLR start "rule__TypeReference__Group_0__4__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2984:1: rule__TypeReference__Group_0__4__Impl : ( ']' ) ;
    public final void rule__TypeReference__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2988:1: ( ( ']' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2989:1: ( ']' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2989:1: ( ']' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:2990:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getRightSquareBracketKeyword_0_4()); 
            }
            match(input,41,FOLLOW_41_in_rule__TypeReference__Group_0__4__Impl6104); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getRightSquareBracketKeyword_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Group_0__4__Impl"


    // $ANTLR start "rule__TypeReference__Group_1__0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3013:1: rule__TypeReference__Group_1__0 : rule__TypeReference__Group_1__0__Impl rule__TypeReference__Group_1__1 ;
    public final void rule__TypeReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3017:1: ( rule__TypeReference__Group_1__0__Impl rule__TypeReference__Group_1__1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3018:2: rule__TypeReference__Group_1__0__Impl rule__TypeReference__Group_1__1
            {
            pushFollow(FOLLOW_rule__TypeReference__Group_1__0__Impl_in_rule__TypeReference__Group_1__06145);
            rule__TypeReference__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypeReference__Group_1__1_in_rule__TypeReference__Group_1__06148);
            rule__TypeReference__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Group_1__0"


    // $ANTLR start "rule__TypeReference__Group_1__0__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3025:1: rule__TypeReference__Group_1__0__Impl : ( () ) ;
    public final void rule__TypeReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3029:1: ( ( () ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3030:1: ( () )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3030:1: ( () )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3031:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getTypeReferenceAction_1_0()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3032:1: ()
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3034:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getTypeReferenceAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Group_1__0__Impl"


    // $ANTLR start "rule__TypeReference__Group_1__1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3044:1: rule__TypeReference__Group_1__1 : rule__TypeReference__Group_1__1__Impl rule__TypeReference__Group_1__2 ;
    public final void rule__TypeReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3048:1: ( rule__TypeReference__Group_1__1__Impl rule__TypeReference__Group_1__2 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3049:2: rule__TypeReference__Group_1__1__Impl rule__TypeReference__Group_1__2
            {
            pushFollow(FOLLOW_rule__TypeReference__Group_1__1__Impl_in_rule__TypeReference__Group_1__16206);
            rule__TypeReference__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypeReference__Group_1__2_in_rule__TypeReference__Group_1__16209);
            rule__TypeReference__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Group_1__1"


    // $ANTLR start "rule__TypeReference__Group_1__1__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3056:1: rule__TypeReference__Group_1__1__Impl : ( ( rule__TypeReference__TypeAssignment_1_1 ) ) ;
    public final void rule__TypeReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3060:1: ( ( ( rule__TypeReference__TypeAssignment_1_1 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3061:1: ( ( rule__TypeReference__TypeAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3061:1: ( ( rule__TypeReference__TypeAssignment_1_1 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3062:1: ( rule__TypeReference__TypeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getTypeAssignment_1_1()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3063:1: ( rule__TypeReference__TypeAssignment_1_1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3063:2: rule__TypeReference__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TypeReference__TypeAssignment_1_1_in_rule__TypeReference__Group_1__1__Impl6236);
            rule__TypeReference__TypeAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getTypeAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Group_1__1__Impl"


    // $ANTLR start "rule__TypeReference__Group_1__2"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3073:1: rule__TypeReference__Group_1__2 : rule__TypeReference__Group_1__2__Impl ;
    public final void rule__TypeReference__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3077:1: ( rule__TypeReference__Group_1__2__Impl )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3078:2: rule__TypeReference__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeReference__Group_1__2__Impl_in_rule__TypeReference__Group_1__26266);
            rule__TypeReference__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Group_1__2"


    // $ANTLR start "rule__TypeReference__Group_1__2__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3084:1: rule__TypeReference__Group_1__2__Impl : ( ( rule__TypeReference__Group_1_2__0 )? ) ;
    public final void rule__TypeReference__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3088:1: ( ( ( rule__TypeReference__Group_1_2__0 )? ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3089:1: ( ( rule__TypeReference__Group_1_2__0 )? )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3089:1: ( ( rule__TypeReference__Group_1_2__0 )? )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3090:1: ( rule__TypeReference__Group_1_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getGroup_1_2()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3091:1: ( rule__TypeReference__Group_1_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3091:2: rule__TypeReference__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__TypeReference__Group_1_2__0_in_rule__TypeReference__Group_1__2__Impl6293);
                    rule__TypeReference__Group_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getGroup_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Group_1__2__Impl"


    // $ANTLR start "rule__TypeReference__Group_1_2__0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3107:1: rule__TypeReference__Group_1_2__0 : rule__TypeReference__Group_1_2__0__Impl rule__TypeReference__Group_1_2__1 ;
    public final void rule__TypeReference__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3111:1: ( rule__TypeReference__Group_1_2__0__Impl rule__TypeReference__Group_1_2__1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3112:2: rule__TypeReference__Group_1_2__0__Impl rule__TypeReference__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__TypeReference__Group_1_2__0__Impl_in_rule__TypeReference__Group_1_2__06330);
            rule__TypeReference__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypeReference__Group_1_2__1_in_rule__TypeReference__Group_1_2__06333);
            rule__TypeReference__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Group_1_2__0"


    // $ANTLR start "rule__TypeReference__Group_1_2__0__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3119:1: rule__TypeReference__Group_1_2__0__Impl : ( '.' ) ;
    public final void rule__TypeReference__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3123:1: ( ( '.' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3124:1: ( '.' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3124:1: ( '.' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3125:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getFullStopKeyword_1_2_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__TypeReference__Group_1_2__0__Impl6361); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getFullStopKeyword_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Group_1_2__0__Impl"


    // $ANTLR start "rule__TypeReference__Group_1_2__1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3138:1: rule__TypeReference__Group_1_2__1 : rule__TypeReference__Group_1_2__1__Impl ;
    public final void rule__TypeReference__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3142:1: ( rule__TypeReference__Group_1_2__1__Impl )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3143:2: rule__TypeReference__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeReference__Group_1_2__1__Impl_in_rule__TypeReference__Group_1_2__16392);
            rule__TypeReference__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Group_1_2__1"


    // $ANTLR start "rule__TypeReference__Group_1_2__1__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3149:1: rule__TypeReference__Group_1_2__1__Impl : ( ( rule__TypeReference__RemainderAssignment_1_2_1 ) ) ;
    public final void rule__TypeReference__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3153:1: ( ( ( rule__TypeReference__RemainderAssignment_1_2_1 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3154:1: ( ( rule__TypeReference__RemainderAssignment_1_2_1 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3154:1: ( ( rule__TypeReference__RemainderAssignment_1_2_1 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3155:1: ( rule__TypeReference__RemainderAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getRemainderAssignment_1_2_1()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3156:1: ( rule__TypeReference__RemainderAssignment_1_2_1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3156:2: rule__TypeReference__RemainderAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__TypeReference__RemainderAssignment_1_2_1_in_rule__TypeReference__Group_1_2__1__Impl6419);
            rule__TypeReference__RemainderAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getRemainderAssignment_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Group_1_2__1__Impl"


    // $ANTLR start "rule__DataModel__Group__0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3170:1: rule__DataModel__Group__0 : rule__DataModel__Group__0__Impl rule__DataModel__Group__1 ;
    public final void rule__DataModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3174:1: ( rule__DataModel__Group__0__Impl rule__DataModel__Group__1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3175:2: rule__DataModel__Group__0__Impl rule__DataModel__Group__1
            {
            pushFollow(FOLLOW_rule__DataModel__Group__0__Impl_in_rule__DataModel__Group__06453);
            rule__DataModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DataModel__Group__1_in_rule__DataModel__Group__06456);
            rule__DataModel__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__0"


    // $ANTLR start "rule__DataModel__Group__0__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3182:1: rule__DataModel__Group__0__Impl : ( () ) ;
    public final void rule__DataModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3186:1: ( ( () ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3187:1: ( () )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3187:1: ( () )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3188:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataModelAccess().getDataModelAction_0()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3189:1: ()
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3191:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataModelAccess().getDataModelAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__0__Impl"


    // $ANTLR start "rule__DataModel__Group__1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3201:1: rule__DataModel__Group__1 : rule__DataModel__Group__1__Impl rule__DataModel__Group__2 ;
    public final void rule__DataModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3205:1: ( rule__DataModel__Group__1__Impl rule__DataModel__Group__2 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3206:2: rule__DataModel__Group__1__Impl rule__DataModel__Group__2
            {
            pushFollow(FOLLOW_rule__DataModel__Group__1__Impl_in_rule__DataModel__Group__16514);
            rule__DataModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DataModel__Group__2_in_rule__DataModel__Group__16517);
            rule__DataModel__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__1"


    // $ANTLR start "rule__DataModel__Group__1__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3213:1: rule__DataModel__Group__1__Impl : ( 'model' ) ;
    public final void rule__DataModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3217:1: ( ( 'model' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3218:1: ( 'model' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3218:1: ( 'model' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3219:1: 'model'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataModelAccess().getModelKeyword_1()); 
            }
            match(input,43,FOLLOW_43_in_rule__DataModel__Group__1__Impl6545); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataModelAccess().getModelKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__1__Impl"


    // $ANTLR start "rule__DataModel__Group__2"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3232:1: rule__DataModel__Group__2 : rule__DataModel__Group__2__Impl rule__DataModel__Group__3 ;
    public final void rule__DataModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3236:1: ( rule__DataModel__Group__2__Impl rule__DataModel__Group__3 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3237:2: rule__DataModel__Group__2__Impl rule__DataModel__Group__3
            {
            pushFollow(FOLLOW_rule__DataModel__Group__2__Impl_in_rule__DataModel__Group__26576);
            rule__DataModel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DataModel__Group__3_in_rule__DataModel__Group__26579);
            rule__DataModel__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__2"


    // $ANTLR start "rule__DataModel__Group__2__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3244:1: rule__DataModel__Group__2__Impl : ( '{' ) ;
    public final void rule__DataModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3248:1: ( ( '{' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3249:1: ( '{' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3249:1: ( '{' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3250:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__DataModel__Group__2__Impl6607); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__2__Impl"


    // $ANTLR start "rule__DataModel__Group__3"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3263:1: rule__DataModel__Group__3 : rule__DataModel__Group__3__Impl rule__DataModel__Group__4 ;
    public final void rule__DataModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3267:1: ( rule__DataModel__Group__3__Impl rule__DataModel__Group__4 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3268:2: rule__DataModel__Group__3__Impl rule__DataModel__Group__4
            {
            pushFollow(FOLLOW_rule__DataModel__Group__3__Impl_in_rule__DataModel__Group__36638);
            rule__DataModel__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DataModel__Group__4_in_rule__DataModel__Group__36641);
            rule__DataModel__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__3"


    // $ANTLR start "rule__DataModel__Group__3__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3275:1: rule__DataModel__Group__3__Impl : ( ( rule__DataModel__InstancesAssignment_3 )* ) ;
    public final void rule__DataModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3279:1: ( ( ( rule__DataModel__InstancesAssignment_3 )* ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3280:1: ( ( rule__DataModel__InstancesAssignment_3 )* )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3280:1: ( ( rule__DataModel__InstancesAssignment_3 )* )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3281:1: ( rule__DataModel__InstancesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataModelAccess().getInstancesAssignment_3()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3282:1: ( rule__DataModel__InstancesAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==45) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3282:2: rule__DataModel__InstancesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__DataModel__InstancesAssignment_3_in_rule__DataModel__Group__3__Impl6668);
            	    rule__DataModel__InstancesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataModelAccess().getInstancesAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__3__Impl"


    // $ANTLR start "rule__DataModel__Group__4"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3292:1: rule__DataModel__Group__4 : rule__DataModel__Group__4__Impl rule__DataModel__Group__5 ;
    public final void rule__DataModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3296:1: ( rule__DataModel__Group__4__Impl rule__DataModel__Group__5 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3297:2: rule__DataModel__Group__4__Impl rule__DataModel__Group__5
            {
            pushFollow(FOLLOW_rule__DataModel__Group__4__Impl_in_rule__DataModel__Group__46699);
            rule__DataModel__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DataModel__Group__5_in_rule__DataModel__Group__46702);
            rule__DataModel__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__4"


    // $ANTLR start "rule__DataModel__Group__4__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3304:1: rule__DataModel__Group__4__Impl : ( 'start' ) ;
    public final void rule__DataModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3308:1: ( ( 'start' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3309:1: ( 'start' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3309:1: ( 'start' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3310:1: 'start'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataModelAccess().getStartKeyword_4()); 
            }
            match(input,44,FOLLOW_44_in_rule__DataModel__Group__4__Impl6730); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataModelAccess().getStartKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__4__Impl"


    // $ANTLR start "rule__DataModel__Group__5"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3323:1: rule__DataModel__Group__5 : rule__DataModel__Group__5__Impl rule__DataModel__Group__6 ;
    public final void rule__DataModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3327:1: ( rule__DataModel__Group__5__Impl rule__DataModel__Group__6 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3328:2: rule__DataModel__Group__5__Impl rule__DataModel__Group__6
            {
            pushFollow(FOLLOW_rule__DataModel__Group__5__Impl_in_rule__DataModel__Group__56761);
            rule__DataModel__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DataModel__Group__6_in_rule__DataModel__Group__56764);
            rule__DataModel__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__5"


    // $ANTLR start "rule__DataModel__Group__5__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3335:1: rule__DataModel__Group__5__Impl : ( ( rule__DataModel__ViewAssignment_5 ) ) ;
    public final void rule__DataModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3339:1: ( ( ( rule__DataModel__ViewAssignment_5 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3340:1: ( ( rule__DataModel__ViewAssignment_5 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3340:1: ( ( rule__DataModel__ViewAssignment_5 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3341:1: ( rule__DataModel__ViewAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataModelAccess().getViewAssignment_5()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3342:1: ( rule__DataModel__ViewAssignment_5 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3342:2: rule__DataModel__ViewAssignment_5
            {
            pushFollow(FOLLOW_rule__DataModel__ViewAssignment_5_in_rule__DataModel__Group__5__Impl6791);
            rule__DataModel__ViewAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataModelAccess().getViewAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__5__Impl"


    // $ANTLR start "rule__DataModel__Group__6"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3352:1: rule__DataModel__Group__6 : rule__DataModel__Group__6__Impl ;
    public final void rule__DataModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3356:1: ( rule__DataModel__Group__6__Impl )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3357:2: rule__DataModel__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__DataModel__Group__6__Impl_in_rule__DataModel__Group__66821);
            rule__DataModel__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__6"


    // $ANTLR start "rule__DataModel__Group__6__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3363:1: rule__DataModel__Group__6__Impl : ( '}' ) ;
    public final void rule__DataModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3367:1: ( ( '}' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3368:1: ( '}' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3368:1: ( '}' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3369:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,29,FOLLOW_29_in_rule__DataModel__Group__6__Impl6849); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__6__Impl"


    // $ANTLR start "rule__Instance__Group__0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3396:1: rule__Instance__Group__0 : rule__Instance__Group__0__Impl rule__Instance__Group__1 ;
    public final void rule__Instance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3400:1: ( rule__Instance__Group__0__Impl rule__Instance__Group__1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3401:2: rule__Instance__Group__0__Impl rule__Instance__Group__1
            {
            pushFollow(FOLLOW_rule__Instance__Group__0__Impl_in_rule__Instance__Group__06894);
            rule__Instance__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instance__Group__1_in_rule__Instance__Group__06897);
            rule__Instance__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__0"


    // $ANTLR start "rule__Instance__Group__0__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3408:1: rule__Instance__Group__0__Impl : ( 'new' ) ;
    public final void rule__Instance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3412:1: ( ( 'new' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3413:1: ( 'new' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3413:1: ( 'new' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3414:1: 'new'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getNewKeyword_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__Instance__Group__0__Impl6925); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getNewKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__0__Impl"


    // $ANTLR start "rule__Instance__Group__1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3427:1: rule__Instance__Group__1 : rule__Instance__Group__1__Impl rule__Instance__Group__2 ;
    public final void rule__Instance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3431:1: ( rule__Instance__Group__1__Impl rule__Instance__Group__2 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3432:2: rule__Instance__Group__1__Impl rule__Instance__Group__2
            {
            pushFollow(FOLLOW_rule__Instance__Group__1__Impl_in_rule__Instance__Group__16956);
            rule__Instance__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Instance__Group__2_in_rule__Instance__Group__16959);
            rule__Instance__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__1"


    // $ANTLR start "rule__Instance__Group__1__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3439:1: rule__Instance__Group__1__Impl : ( ( rule__Instance__TypeAssignment_1 ) ) ;
    public final void rule__Instance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3443:1: ( ( ( rule__Instance__TypeAssignment_1 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3444:1: ( ( rule__Instance__TypeAssignment_1 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3444:1: ( ( rule__Instance__TypeAssignment_1 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3445:1: ( rule__Instance__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getTypeAssignment_1()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3446:1: ( rule__Instance__TypeAssignment_1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3446:2: rule__Instance__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Instance__TypeAssignment_1_in_rule__Instance__Group__1__Impl6986);
            rule__Instance__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__1__Impl"


    // $ANTLR start "rule__Instance__Group__2"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3456:1: rule__Instance__Group__2 : rule__Instance__Group__2__Impl ;
    public final void rule__Instance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3460:1: ( rule__Instance__Group__2__Impl )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3461:2: rule__Instance__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Instance__Group__2__Impl_in_rule__Instance__Group__27016);
            rule__Instance__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__2"


    // $ANTLR start "rule__Instance__Group__2__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3467:1: rule__Instance__Group__2__Impl : ( ( rule__Instance__NameAssignment_2 ) ) ;
    public final void rule__Instance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3471:1: ( ( ( rule__Instance__NameAssignment_2 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3472:1: ( ( rule__Instance__NameAssignment_2 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3472:1: ( ( rule__Instance__NameAssignment_2 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3473:1: ( rule__Instance__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getNameAssignment_2()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3474:1: ( rule__Instance__NameAssignment_2 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3474:2: rule__Instance__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Instance__NameAssignment_2_in_rule__Instance__Group__2__Impl7043);
            rule__Instance__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__2__Impl"


    // $ANTLR start "rule__View__Group__0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3490:1: rule__View__Group__0 : rule__View__Group__0__Impl rule__View__Group__1 ;
    public final void rule__View__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3494:1: ( rule__View__Group__0__Impl rule__View__Group__1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3495:2: rule__View__Group__0__Impl rule__View__Group__1
            {
            pushFollow(FOLLOW_rule__View__Group__0__Impl_in_rule__View__Group__07079);
            rule__View__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__View__Group__1_in_rule__View__Group__07082);
            rule__View__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__0"


    // $ANTLR start "rule__View__Group__0__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3502:1: rule__View__Group__0__Impl : ( 'view' ) ;
    public final void rule__View__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3506:1: ( ( 'view' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3507:1: ( 'view' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3507:1: ( 'view' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3508:1: 'view'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewAccess().getViewKeyword_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__View__Group__0__Impl7110); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewAccess().getViewKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__0__Impl"


    // $ANTLR start "rule__View__Group__1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3521:1: rule__View__Group__1 : rule__View__Group__1__Impl rule__View__Group__2 ;
    public final void rule__View__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3525:1: ( rule__View__Group__1__Impl rule__View__Group__2 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3526:2: rule__View__Group__1__Impl rule__View__Group__2
            {
            pushFollow(FOLLOW_rule__View__Group__1__Impl_in_rule__View__Group__17141);
            rule__View__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__View__Group__2_in_rule__View__Group__17144);
            rule__View__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__1"


    // $ANTLR start "rule__View__Group__1__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3533:1: rule__View__Group__1__Impl : ( ( rule__View__NameAssignment_1 ) ) ;
    public final void rule__View__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3537:1: ( ( ( rule__View__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3538:1: ( ( rule__View__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3538:1: ( ( rule__View__NameAssignment_1 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3539:1: ( rule__View__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3540:1: ( rule__View__NameAssignment_1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3540:2: rule__View__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__View__NameAssignment_1_in_rule__View__Group__1__Impl7171);
            rule__View__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__1__Impl"


    // $ANTLR start "rule__View__Group__2"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3550:1: rule__View__Group__2 : rule__View__Group__2__Impl rule__View__Group__3 ;
    public final void rule__View__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3554:1: ( rule__View__Group__2__Impl rule__View__Group__3 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3555:2: rule__View__Group__2__Impl rule__View__Group__3
            {
            pushFollow(FOLLOW_rule__View__Group__2__Impl_in_rule__View__Group__27201);
            rule__View__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__View__Group__3_in_rule__View__Group__27204);
            rule__View__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__2"


    // $ANTLR start "rule__View__Group__2__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3562:1: rule__View__Group__2__Impl : ( '{' ) ;
    public final void rule__View__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3566:1: ( ( '{' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3567:1: ( '{' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3567:1: ( '{' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3568:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__View__Group__2__Impl7232); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__2__Impl"


    // $ANTLR start "rule__View__Group__3"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3581:1: rule__View__Group__3 : rule__View__Group__3__Impl rule__View__Group__4 ;
    public final void rule__View__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3585:1: ( rule__View__Group__3__Impl rule__View__Group__4 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3586:2: rule__View__Group__3__Impl rule__View__Group__4
            {
            pushFollow(FOLLOW_rule__View__Group__3__Impl_in_rule__View__Group__37263);
            rule__View__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__View__Group__4_in_rule__View__Group__37266);
            rule__View__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__3"


    // $ANTLR start "rule__View__Group__3__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3593:1: rule__View__Group__3__Impl : ( ( rule__View__LayoutAssignment_3 ) ) ;
    public final void rule__View__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3597:1: ( ( ( rule__View__LayoutAssignment_3 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3598:1: ( ( rule__View__LayoutAssignment_3 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3598:1: ( ( rule__View__LayoutAssignment_3 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3599:1: ( rule__View__LayoutAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewAccess().getLayoutAssignment_3()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3600:1: ( rule__View__LayoutAssignment_3 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3600:2: rule__View__LayoutAssignment_3
            {
            pushFollow(FOLLOW_rule__View__LayoutAssignment_3_in_rule__View__Group__3__Impl7293);
            rule__View__LayoutAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewAccess().getLayoutAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__3__Impl"


    // $ANTLR start "rule__View__Group__4"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3610:1: rule__View__Group__4 : rule__View__Group__4__Impl rule__View__Group__5 ;
    public final void rule__View__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3614:1: ( rule__View__Group__4__Impl rule__View__Group__5 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3615:2: rule__View__Group__4__Impl rule__View__Group__5
            {
            pushFollow(FOLLOW_rule__View__Group__4__Impl_in_rule__View__Group__47323);
            rule__View__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__View__Group__5_in_rule__View__Group__47326);
            rule__View__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__4"


    // $ANTLR start "rule__View__Group__4__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3622:1: rule__View__Group__4__Impl : ( ( rule__View__ContentsAssignment_4 )* ) ;
    public final void rule__View__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3626:1: ( ( ( rule__View__ContentsAssignment_4 )* ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3627:1: ( ( rule__View__ContentsAssignment_4 )* )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3627:1: ( ( rule__View__ContentsAssignment_4 )* )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3628:1: ( rule__View__ContentsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewAccess().getContentsAssignment_4()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3629:1: ( rule__View__ContentsAssignment_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=15 && LA23_0<=22)||LA23_0==47) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3629:2: rule__View__ContentsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__View__ContentsAssignment_4_in_rule__View__Group__4__Impl7353);
            	    rule__View__ContentsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewAccess().getContentsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__4__Impl"


    // $ANTLR start "rule__View__Group__5"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3639:1: rule__View__Group__5 : rule__View__Group__5__Impl ;
    public final void rule__View__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3643:1: ( rule__View__Group__5__Impl )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3644:2: rule__View__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__View__Group__5__Impl_in_rule__View__Group__57384);
            rule__View__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__5"


    // $ANTLR start "rule__View__Group__5__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3650:1: rule__View__Group__5__Impl : ( '}' ) ;
    public final void rule__View__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3654:1: ( ( '}' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3655:1: ( '}' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3655:1: ( '}' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3656:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,29,FOLLOW_29_in_rule__View__Group__5__Impl7412); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__5__Impl"


    // $ANTLR start "rule__ViewContainer__Group__0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3681:1: rule__ViewContainer__Group__0 : rule__ViewContainer__Group__0__Impl rule__ViewContainer__Group__1 ;
    public final void rule__ViewContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3685:1: ( rule__ViewContainer__Group__0__Impl rule__ViewContainer__Group__1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3686:2: rule__ViewContainer__Group__0__Impl rule__ViewContainer__Group__1
            {
            pushFollow(FOLLOW_rule__ViewContainer__Group__0__Impl_in_rule__ViewContainer__Group__07455);
            rule__ViewContainer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ViewContainer__Group__1_in_rule__ViewContainer__Group__07458);
            rule__ViewContainer__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewContainer__Group__0"


    // $ANTLR start "rule__ViewContainer__Group__0__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3693:1: rule__ViewContainer__Group__0__Impl : ( 'container' ) ;
    public final void rule__ViewContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3697:1: ( ( 'container' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3698:1: ( 'container' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3698:1: ( 'container' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3699:1: 'container'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewContainerAccess().getContainerKeyword_0()); 
            }
            match(input,47,FOLLOW_47_in_rule__ViewContainer__Group__0__Impl7486); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewContainerAccess().getContainerKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewContainer__Group__0__Impl"


    // $ANTLR start "rule__ViewContainer__Group__1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3712:1: rule__ViewContainer__Group__1 : rule__ViewContainer__Group__1__Impl rule__ViewContainer__Group__2 ;
    public final void rule__ViewContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3716:1: ( rule__ViewContainer__Group__1__Impl rule__ViewContainer__Group__2 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3717:2: rule__ViewContainer__Group__1__Impl rule__ViewContainer__Group__2
            {
            pushFollow(FOLLOW_rule__ViewContainer__Group__1__Impl_in_rule__ViewContainer__Group__17517);
            rule__ViewContainer__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ViewContainer__Group__2_in_rule__ViewContainer__Group__17520);
            rule__ViewContainer__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewContainer__Group__1"


    // $ANTLR start "rule__ViewContainer__Group__1__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3724:1: rule__ViewContainer__Group__1__Impl : ( '{' ) ;
    public final void rule__ViewContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3728:1: ( ( '{' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3729:1: ( '{' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3729:1: ( '{' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3730:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewContainerAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__ViewContainer__Group__1__Impl7548); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewContainerAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewContainer__Group__1__Impl"


    // $ANTLR start "rule__ViewContainer__Group__2"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3743:1: rule__ViewContainer__Group__2 : rule__ViewContainer__Group__2__Impl rule__ViewContainer__Group__3 ;
    public final void rule__ViewContainer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3747:1: ( rule__ViewContainer__Group__2__Impl rule__ViewContainer__Group__3 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3748:2: rule__ViewContainer__Group__2__Impl rule__ViewContainer__Group__3
            {
            pushFollow(FOLLOW_rule__ViewContainer__Group__2__Impl_in_rule__ViewContainer__Group__27579);
            rule__ViewContainer__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ViewContainer__Group__3_in_rule__ViewContainer__Group__27582);
            rule__ViewContainer__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewContainer__Group__2"


    // $ANTLR start "rule__ViewContainer__Group__2__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3755:1: rule__ViewContainer__Group__2__Impl : ( ( rule__ViewContainer__LayoutAssignment_2 ) ) ;
    public final void rule__ViewContainer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3759:1: ( ( ( rule__ViewContainer__LayoutAssignment_2 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3760:1: ( ( rule__ViewContainer__LayoutAssignment_2 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3760:1: ( ( rule__ViewContainer__LayoutAssignment_2 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3761:1: ( rule__ViewContainer__LayoutAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewContainerAccess().getLayoutAssignment_2()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3762:1: ( rule__ViewContainer__LayoutAssignment_2 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3762:2: rule__ViewContainer__LayoutAssignment_2
            {
            pushFollow(FOLLOW_rule__ViewContainer__LayoutAssignment_2_in_rule__ViewContainer__Group__2__Impl7609);
            rule__ViewContainer__LayoutAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewContainerAccess().getLayoutAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewContainer__Group__2__Impl"


    // $ANTLR start "rule__ViewContainer__Group__3"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3772:1: rule__ViewContainer__Group__3 : rule__ViewContainer__Group__3__Impl rule__ViewContainer__Group__4 ;
    public final void rule__ViewContainer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3776:1: ( rule__ViewContainer__Group__3__Impl rule__ViewContainer__Group__4 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3777:2: rule__ViewContainer__Group__3__Impl rule__ViewContainer__Group__4
            {
            pushFollow(FOLLOW_rule__ViewContainer__Group__3__Impl_in_rule__ViewContainer__Group__37639);
            rule__ViewContainer__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ViewContainer__Group__4_in_rule__ViewContainer__Group__37642);
            rule__ViewContainer__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewContainer__Group__3"


    // $ANTLR start "rule__ViewContainer__Group__3__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3784:1: rule__ViewContainer__Group__3__Impl : ( ( rule__ViewContainer__ContentsAssignment_3 )* ) ;
    public final void rule__ViewContainer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3788:1: ( ( ( rule__ViewContainer__ContentsAssignment_3 )* ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3789:1: ( ( rule__ViewContainer__ContentsAssignment_3 )* )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3789:1: ( ( rule__ViewContainer__ContentsAssignment_3 )* )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3790:1: ( rule__ViewContainer__ContentsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewContainerAccess().getContentsAssignment_3()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3791:1: ( rule__ViewContainer__ContentsAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=15 && LA24_0<=22)||LA24_0==47) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3791:2: rule__ViewContainer__ContentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ViewContainer__ContentsAssignment_3_in_rule__ViewContainer__Group__3__Impl7669);
            	    rule__ViewContainer__ContentsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewContainerAccess().getContentsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewContainer__Group__3__Impl"


    // $ANTLR start "rule__ViewContainer__Group__4"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3801:1: rule__ViewContainer__Group__4 : rule__ViewContainer__Group__4__Impl ;
    public final void rule__ViewContainer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3805:1: ( rule__ViewContainer__Group__4__Impl )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3806:2: rule__ViewContainer__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ViewContainer__Group__4__Impl_in_rule__ViewContainer__Group__47700);
            rule__ViewContainer__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewContainer__Group__4"


    // $ANTLR start "rule__ViewContainer__Group__4__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3812:1: rule__ViewContainer__Group__4__Impl : ( '}' ) ;
    public final void rule__ViewContainer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3816:1: ( ( '}' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3817:1: ( '}' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3817:1: ( '}' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3818:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewContainerAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,29,FOLLOW_29_in_rule__ViewContainer__Group__4__Impl7728); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewContainerAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewContainer__Group__4__Impl"


    // $ANTLR start "rule__ViewElement__Group__0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3841:1: rule__ViewElement__Group__0 : rule__ViewElement__Group__0__Impl rule__ViewElement__Group__1 ;
    public final void rule__ViewElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3845:1: ( rule__ViewElement__Group__0__Impl rule__ViewElement__Group__1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3846:2: rule__ViewElement__Group__0__Impl rule__ViewElement__Group__1
            {
            pushFollow(FOLLOW_rule__ViewElement__Group__0__Impl_in_rule__ViewElement__Group__07769);
            rule__ViewElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ViewElement__Group__1_in_rule__ViewElement__Group__07772);
            rule__ViewElement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewElement__Group__0"


    // $ANTLR start "rule__ViewElement__Group__0__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3853:1: rule__ViewElement__Group__0__Impl : ( ( rule__ViewElement__TypeAssignment_0 ) ) ;
    public final void rule__ViewElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3857:1: ( ( ( rule__ViewElement__TypeAssignment_0 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3858:1: ( ( rule__ViewElement__TypeAssignment_0 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3858:1: ( ( rule__ViewElement__TypeAssignment_0 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3859:1: ( rule__ViewElement__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewElementAccess().getTypeAssignment_0()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3860:1: ( rule__ViewElement__TypeAssignment_0 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3860:2: rule__ViewElement__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__ViewElement__TypeAssignment_0_in_rule__ViewElement__Group__0__Impl7799);
            rule__ViewElement__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewElementAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewElement__Group__0__Impl"


    // $ANTLR start "rule__ViewElement__Group__1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3870:1: rule__ViewElement__Group__1 : rule__ViewElement__Group__1__Impl rule__ViewElement__Group__2 ;
    public final void rule__ViewElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3874:1: ( rule__ViewElement__Group__1__Impl rule__ViewElement__Group__2 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3875:2: rule__ViewElement__Group__1__Impl rule__ViewElement__Group__2
            {
            pushFollow(FOLLOW_rule__ViewElement__Group__1__Impl_in_rule__ViewElement__Group__17829);
            rule__ViewElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ViewElement__Group__2_in_rule__ViewElement__Group__17832);
            rule__ViewElement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewElement__Group__1"


    // $ANTLR start "rule__ViewElement__Group__1__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3882:1: rule__ViewElement__Group__1__Impl : ( ( rule__ViewElement__NameAssignment_1 ) ) ;
    public final void rule__ViewElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3886:1: ( ( ( rule__ViewElement__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3887:1: ( ( rule__ViewElement__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3887:1: ( ( rule__ViewElement__NameAssignment_1 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3888:1: ( rule__ViewElement__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewElementAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3889:1: ( rule__ViewElement__NameAssignment_1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3889:2: rule__ViewElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ViewElement__NameAssignment_1_in_rule__ViewElement__Group__1__Impl7859);
            rule__ViewElement__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewElementAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewElement__Group__1__Impl"


    // $ANTLR start "rule__ViewElement__Group__2"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3899:1: rule__ViewElement__Group__2 : rule__ViewElement__Group__2__Impl rule__ViewElement__Group__3 ;
    public final void rule__ViewElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3903:1: ( rule__ViewElement__Group__2__Impl rule__ViewElement__Group__3 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3904:2: rule__ViewElement__Group__2__Impl rule__ViewElement__Group__3
            {
            pushFollow(FOLLOW_rule__ViewElement__Group__2__Impl_in_rule__ViewElement__Group__27889);
            rule__ViewElement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ViewElement__Group__3_in_rule__ViewElement__Group__27892);
            rule__ViewElement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewElement__Group__2"


    // $ANTLR start "rule__ViewElement__Group__2__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3911:1: rule__ViewElement__Group__2__Impl : ( '{' ) ;
    public final void rule__ViewElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3915:1: ( ( '{' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3916:1: ( '{' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3916:1: ( '{' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3917:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewElementAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__ViewElement__Group__2__Impl7920); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewElementAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewElement__Group__2__Impl"


    // $ANTLR start "rule__ViewElement__Group__3"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3930:1: rule__ViewElement__Group__3 : rule__ViewElement__Group__3__Impl ;
    public final void rule__ViewElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3934:1: ( rule__ViewElement__Group__3__Impl )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3935:2: rule__ViewElement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ViewElement__Group__3__Impl_in_rule__ViewElement__Group__37951);
            rule__ViewElement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewElement__Group__3"


    // $ANTLR start "rule__ViewElement__Group__3__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3941:1: rule__ViewElement__Group__3__Impl : ( '}' ) ;
    public final void rule__ViewElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3945:1: ( ( '}' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3946:1: ( '}' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3946:1: ( '}' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3947:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewElementAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,29,FOLLOW_29_in_rule__ViewElement__Group__3__Impl7979); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewElementAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewElement__Group__3__Impl"


    // $ANTLR start "rule__GridLayout__Group__0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3968:1: rule__GridLayout__Group__0 : rule__GridLayout__Group__0__Impl rule__GridLayout__Group__1 ;
    public final void rule__GridLayout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3972:1: ( rule__GridLayout__Group__0__Impl rule__GridLayout__Group__1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3973:2: rule__GridLayout__Group__0__Impl rule__GridLayout__Group__1
            {
            pushFollow(FOLLOW_rule__GridLayout__Group__0__Impl_in_rule__GridLayout__Group__08018);
            rule__GridLayout__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GridLayout__Group__1_in_rule__GridLayout__Group__08021);
            rule__GridLayout__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridLayout__Group__0"


    // $ANTLR start "rule__GridLayout__Group__0__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3980:1: rule__GridLayout__Group__0__Impl : ( ( rule__GridLayout__SizeAssignment_0 ) ) ;
    public final void rule__GridLayout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3984:1: ( ( ( rule__GridLayout__SizeAssignment_0 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3985:1: ( ( rule__GridLayout__SizeAssignment_0 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3985:1: ( ( rule__GridLayout__SizeAssignment_0 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3986:1: ( rule__GridLayout__SizeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGridLayoutAccess().getSizeAssignment_0()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3987:1: ( rule__GridLayout__SizeAssignment_0 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3987:2: rule__GridLayout__SizeAssignment_0
            {
            pushFollow(FOLLOW_rule__GridLayout__SizeAssignment_0_in_rule__GridLayout__Group__0__Impl8048);
            rule__GridLayout__SizeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGridLayoutAccess().getSizeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridLayout__Group__0__Impl"


    // $ANTLR start "rule__GridLayout__Group__1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:3997:1: rule__GridLayout__Group__1 : rule__GridLayout__Group__1__Impl ;
    public final void rule__GridLayout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4001:1: ( rule__GridLayout__Group__1__Impl )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4002:2: rule__GridLayout__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GridLayout__Group__1__Impl_in_rule__GridLayout__Group__18078);
            rule__GridLayout__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridLayout__Group__1"


    // $ANTLR start "rule__GridLayout__Group__1__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4008:1: rule__GridLayout__Group__1__Impl : ( ( rule__GridLayout__FieldsAssignment_1 ) ) ;
    public final void rule__GridLayout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4012:1: ( ( ( rule__GridLayout__FieldsAssignment_1 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4013:1: ( ( rule__GridLayout__FieldsAssignment_1 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4013:1: ( ( rule__GridLayout__FieldsAssignment_1 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4014:1: ( rule__GridLayout__FieldsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGridLayoutAccess().getFieldsAssignment_1()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4015:1: ( rule__GridLayout__FieldsAssignment_1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4015:2: rule__GridLayout__FieldsAssignment_1
            {
            pushFollow(FOLLOW_rule__GridLayout__FieldsAssignment_1_in_rule__GridLayout__Group__1__Impl8105);
            rule__GridLayout__FieldsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGridLayoutAccess().getFieldsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridLayout__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4029:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4033:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4034:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__08139);
            rule__Field__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__08142);
            rule__Field__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4041:1: rule__Field__Group__0__Impl : ( '<' ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4045:1: ( ( '<' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4046:1: ( '<' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4046:1: ( '<' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4047:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getLessThanSignKeyword_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__Field__Group__0__Impl8170); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getLessThanSignKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4060:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4064:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4065:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__18201);
            rule__Field__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__18204);
            rule__Field__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4072:1: rule__Field__Group__1__Impl : ( ( rule__Field__WidthAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4076:1: ( ( ( rule__Field__WidthAssignment_1 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4077:1: ( ( rule__Field__WidthAssignment_1 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4077:1: ( ( rule__Field__WidthAssignment_1 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4078:1: ( rule__Field__WidthAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getWidthAssignment_1()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4079:1: ( rule__Field__WidthAssignment_1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4079:2: rule__Field__WidthAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__WidthAssignment_1_in_rule__Field__Group__1__Impl8231);
            rule__Field__WidthAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getWidthAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4089:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4093:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4094:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__28261);
            rule__Field__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__28264);
            rule__Field__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4101:1: rule__Field__Group__2__Impl : ( ',' ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4105:1: ( ( ',' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4106:1: ( ',' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4106:1: ( ',' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4107:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getCommaKeyword_2()); 
            }
            match(input,34,FOLLOW_34_in_rule__Field__Group__2__Impl8292); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getCommaKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4120:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4124:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4125:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__38323);
            rule__Field__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__4_in_rule__Field__Group__38326);
            rule__Field__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4132:1: rule__Field__Group__3__Impl : ( ( rule__Field__HeightAssignment_3 ) ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4136:1: ( ( ( rule__Field__HeightAssignment_3 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4137:1: ( ( rule__Field__HeightAssignment_3 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4137:1: ( ( rule__Field__HeightAssignment_3 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4138:1: ( rule__Field__HeightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getHeightAssignment_3()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4139:1: ( rule__Field__HeightAssignment_3 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4139:2: rule__Field__HeightAssignment_3
            {
            pushFollow(FOLLOW_rule__Field__HeightAssignment_3_in_rule__Field__Group__3__Impl8353);
            rule__Field__HeightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getHeightAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Field__Group__4"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4149:1: rule__Field__Group__4 : rule__Field__Group__4__Impl ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4153:1: ( rule__Field__Group__4__Impl )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4154:2: rule__Field__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__48383);
            rule__Field__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__4"


    // $ANTLR start "rule__Field__Group__4__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4160:1: rule__Field__Group__4__Impl : ( '>' ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4164:1: ( ( '>' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4165:1: ( '>' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4165:1: ( '>' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4166:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getGreaterThanSignKeyword_4()); 
            }
            match(input,49,FOLLOW_49_in_rule__Field__Group__4__Impl8411); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getGreaterThanSignKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__4__Impl"


    // $ANTLR start "rule__StackLayout__Group__0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4189:1: rule__StackLayout__Group__0 : rule__StackLayout__Group__0__Impl rule__StackLayout__Group__1 ;
    public final void rule__StackLayout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4193:1: ( rule__StackLayout__Group__0__Impl rule__StackLayout__Group__1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4194:2: rule__StackLayout__Group__0__Impl rule__StackLayout__Group__1
            {
            pushFollow(FOLLOW_rule__StackLayout__Group__0__Impl_in_rule__StackLayout__Group__08452);
            rule__StackLayout__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StackLayout__Group__1_in_rule__StackLayout__Group__08455);
            rule__StackLayout__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StackLayout__Group__0"


    // $ANTLR start "rule__StackLayout__Group__0__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4201:1: rule__StackLayout__Group__0__Impl : ( ( rule__StackLayout__SizeAssignment_0 ) ) ;
    public final void rule__StackLayout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4205:1: ( ( ( rule__StackLayout__SizeAssignment_0 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4206:1: ( ( rule__StackLayout__SizeAssignment_0 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4206:1: ( ( rule__StackLayout__SizeAssignment_0 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4207:1: ( rule__StackLayout__SizeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStackLayoutAccess().getSizeAssignment_0()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4208:1: ( rule__StackLayout__SizeAssignment_0 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4208:2: rule__StackLayout__SizeAssignment_0
            {
            pushFollow(FOLLOW_rule__StackLayout__SizeAssignment_0_in_rule__StackLayout__Group__0__Impl8482);
            rule__StackLayout__SizeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStackLayoutAccess().getSizeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StackLayout__Group__0__Impl"


    // $ANTLR start "rule__StackLayout__Group__1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4218:1: rule__StackLayout__Group__1 : rule__StackLayout__Group__1__Impl ;
    public final void rule__StackLayout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4222:1: ( rule__StackLayout__Group__1__Impl )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4223:2: rule__StackLayout__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StackLayout__Group__1__Impl_in_rule__StackLayout__Group__18512);
            rule__StackLayout__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StackLayout__Group__1"


    // $ANTLR start "rule__StackLayout__Group__1__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4229:1: rule__StackLayout__Group__1__Impl : ( ( rule__StackLayout__DirectionAssignment_1 ) ) ;
    public final void rule__StackLayout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4233:1: ( ( ( rule__StackLayout__DirectionAssignment_1 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4234:1: ( ( rule__StackLayout__DirectionAssignment_1 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4234:1: ( ( rule__StackLayout__DirectionAssignment_1 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4235:1: ( rule__StackLayout__DirectionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStackLayoutAccess().getDirectionAssignment_1()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4236:1: ( rule__StackLayout__DirectionAssignment_1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4236:2: rule__StackLayout__DirectionAssignment_1
            {
            pushFollow(FOLLOW_rule__StackLayout__DirectionAssignment_1_in_rule__StackLayout__Group__1__Impl8539);
            rule__StackLayout__DirectionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStackLayoutAccess().getDirectionAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StackLayout__Group__1__Impl"


    // $ANTLR start "rule__Size__Group__0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4250:1: rule__Size__Group__0 : rule__Size__Group__0__Impl rule__Size__Group__1 ;
    public final void rule__Size__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4254:1: ( rule__Size__Group__0__Impl rule__Size__Group__1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4255:2: rule__Size__Group__0__Impl rule__Size__Group__1
            {
            pushFollow(FOLLOW_rule__Size__Group__0__Impl_in_rule__Size__Group__08573);
            rule__Size__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Size__Group__1_in_rule__Size__Group__08576);
            rule__Size__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__0"


    // $ANTLR start "rule__Size__Group__0__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4262:1: rule__Size__Group__0__Impl : ( '<' ) ;
    public final void rule__Size__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4266:1: ( ( '<' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4267:1: ( '<' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4267:1: ( '<' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4268:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeAccess().getLessThanSignKeyword_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__Size__Group__0__Impl8604); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSizeAccess().getLessThanSignKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__0__Impl"


    // $ANTLR start "rule__Size__Group__1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4281:1: rule__Size__Group__1 : rule__Size__Group__1__Impl rule__Size__Group__2 ;
    public final void rule__Size__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4285:1: ( rule__Size__Group__1__Impl rule__Size__Group__2 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4286:2: rule__Size__Group__1__Impl rule__Size__Group__2
            {
            pushFollow(FOLLOW_rule__Size__Group__1__Impl_in_rule__Size__Group__18635);
            rule__Size__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Size__Group__2_in_rule__Size__Group__18638);
            rule__Size__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__1"


    // $ANTLR start "rule__Size__Group__1__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4293:1: rule__Size__Group__1__Impl : ( ( rule__Size__WidthAssignment_1 ) ) ;
    public final void rule__Size__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4297:1: ( ( ( rule__Size__WidthAssignment_1 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4298:1: ( ( rule__Size__WidthAssignment_1 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4298:1: ( ( rule__Size__WidthAssignment_1 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4299:1: ( rule__Size__WidthAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeAccess().getWidthAssignment_1()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4300:1: ( rule__Size__WidthAssignment_1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4300:2: rule__Size__WidthAssignment_1
            {
            pushFollow(FOLLOW_rule__Size__WidthAssignment_1_in_rule__Size__Group__1__Impl8665);
            rule__Size__WidthAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSizeAccess().getWidthAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__1__Impl"


    // $ANTLR start "rule__Size__Group__2"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4310:1: rule__Size__Group__2 : rule__Size__Group__2__Impl rule__Size__Group__3 ;
    public final void rule__Size__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4314:1: ( rule__Size__Group__2__Impl rule__Size__Group__3 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4315:2: rule__Size__Group__2__Impl rule__Size__Group__3
            {
            pushFollow(FOLLOW_rule__Size__Group__2__Impl_in_rule__Size__Group__28695);
            rule__Size__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Size__Group__3_in_rule__Size__Group__28698);
            rule__Size__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__2"


    // $ANTLR start "rule__Size__Group__2__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4322:1: rule__Size__Group__2__Impl : ( ',' ) ;
    public final void rule__Size__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4326:1: ( ( ',' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4327:1: ( ',' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4327:1: ( ',' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4328:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeAccess().getCommaKeyword_2()); 
            }
            match(input,34,FOLLOW_34_in_rule__Size__Group__2__Impl8726); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSizeAccess().getCommaKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__2__Impl"


    // $ANTLR start "rule__Size__Group__3"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4341:1: rule__Size__Group__3 : rule__Size__Group__3__Impl rule__Size__Group__4 ;
    public final void rule__Size__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4345:1: ( rule__Size__Group__3__Impl rule__Size__Group__4 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4346:2: rule__Size__Group__3__Impl rule__Size__Group__4
            {
            pushFollow(FOLLOW_rule__Size__Group__3__Impl_in_rule__Size__Group__38757);
            rule__Size__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Size__Group__4_in_rule__Size__Group__38760);
            rule__Size__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__3"


    // $ANTLR start "rule__Size__Group__3__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4353:1: rule__Size__Group__3__Impl : ( ( rule__Size__HeightAssignment_3 ) ) ;
    public final void rule__Size__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4357:1: ( ( ( rule__Size__HeightAssignment_3 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4358:1: ( ( rule__Size__HeightAssignment_3 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4358:1: ( ( rule__Size__HeightAssignment_3 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4359:1: ( rule__Size__HeightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeAccess().getHeightAssignment_3()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4360:1: ( rule__Size__HeightAssignment_3 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4360:2: rule__Size__HeightAssignment_3
            {
            pushFollow(FOLLOW_rule__Size__HeightAssignment_3_in_rule__Size__Group__3__Impl8787);
            rule__Size__HeightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSizeAccess().getHeightAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__3__Impl"


    // $ANTLR start "rule__Size__Group__4"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4370:1: rule__Size__Group__4 : rule__Size__Group__4__Impl ;
    public final void rule__Size__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4374:1: ( rule__Size__Group__4__Impl )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4375:2: rule__Size__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Size__Group__4__Impl_in_rule__Size__Group__48817);
            rule__Size__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__4"


    // $ANTLR start "rule__Size__Group__4__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4381:1: rule__Size__Group__4__Impl : ( '>' ) ;
    public final void rule__Size__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4385:1: ( ( '>' ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4386:1: ( '>' )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4386:1: ( '>' )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4387:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeAccess().getGreaterThanSignKeyword_4()); 
            }
            match(input,49,FOLLOW_49_in_rule__Size__Group__4__Impl8845); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSizeAccess().getGreaterThanSignKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__4__Impl"


    // $ANTLR start "rule__SizeExpr__Group__0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4410:1: rule__SizeExpr__Group__0 : rule__SizeExpr__Group__0__Impl rule__SizeExpr__Group__1 ;
    public final void rule__SizeExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4414:1: ( rule__SizeExpr__Group__0__Impl rule__SizeExpr__Group__1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4415:2: rule__SizeExpr__Group__0__Impl rule__SizeExpr__Group__1
            {
            pushFollow(FOLLOW_rule__SizeExpr__Group__0__Impl_in_rule__SizeExpr__Group__08886);
            rule__SizeExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SizeExpr__Group__1_in_rule__SizeExpr__Group__08889);
            rule__SizeExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SizeExpr__Group__0"


    // $ANTLR start "rule__SizeExpr__Group__0__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4422:1: rule__SizeExpr__Group__0__Impl : ( ( rule__SizeExpr__ValueAssignment_0 ) ) ;
    public final void rule__SizeExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4426:1: ( ( ( rule__SizeExpr__ValueAssignment_0 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4427:1: ( ( rule__SizeExpr__ValueAssignment_0 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4427:1: ( ( rule__SizeExpr__ValueAssignment_0 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4428:1: ( rule__SizeExpr__ValueAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeExprAccess().getValueAssignment_0()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4429:1: ( rule__SizeExpr__ValueAssignment_0 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4429:2: rule__SizeExpr__ValueAssignment_0
            {
            pushFollow(FOLLOW_rule__SizeExpr__ValueAssignment_0_in_rule__SizeExpr__Group__0__Impl8916);
            rule__SizeExpr__ValueAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSizeExprAccess().getValueAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SizeExpr__Group__0__Impl"


    // $ANTLR start "rule__SizeExpr__Group__1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4439:1: rule__SizeExpr__Group__1 : rule__SizeExpr__Group__1__Impl ;
    public final void rule__SizeExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4443:1: ( rule__SizeExpr__Group__1__Impl )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4444:2: rule__SizeExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SizeExpr__Group__1__Impl_in_rule__SizeExpr__Group__18946);
            rule__SizeExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SizeExpr__Group__1"


    // $ANTLR start "rule__SizeExpr__Group__1__Impl"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4450:1: rule__SizeExpr__Group__1__Impl : ( ( rule__SizeExpr__UnitAssignment_1 ) ) ;
    public final void rule__SizeExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4454:1: ( ( ( rule__SizeExpr__UnitAssignment_1 ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4455:1: ( ( rule__SizeExpr__UnitAssignment_1 ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4455:1: ( ( rule__SizeExpr__UnitAssignment_1 ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4456:1: ( rule__SizeExpr__UnitAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeExprAccess().getUnitAssignment_1()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4457:1: ( rule__SizeExpr__UnitAssignment_1 )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4457:2: rule__SizeExpr__UnitAssignment_1
            {
            pushFollow(FOLLOW_rule__SizeExpr__UnitAssignment_1_in_rule__SizeExpr__Group__1__Impl8973);
            rule__SizeExpr__UnitAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSizeExprAccess().getUnitAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SizeExpr__Group__1__Impl"


    // $ANTLR start "rule__Model__ServicesAssignment_0_0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4472:1: rule__Model__ServicesAssignment_0_0 : ( ruleService ) ;
    public final void rule__Model__ServicesAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4476:1: ( ( ruleService ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4477:1: ( ruleService )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4477:1: ( ruleService )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4478:1: ruleService
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getServicesServiceParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleService_in_rule__Model__ServicesAssignment_0_09012);
            ruleService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getServicesServiceParserRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ServicesAssignment_0_0"


    // $ANTLR start "rule__Model__ViewsAssignment_0_1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4487:1: rule__Model__ViewsAssignment_0_1 : ( ruleView ) ;
    public final void rule__Model__ViewsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4491:1: ( ( ruleView ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4492:1: ( ruleView )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4492:1: ( ruleView )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4493:1: ruleView
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getViewsViewParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleView_in_rule__Model__ViewsAssignment_0_19043);
            ruleView();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getViewsViewParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ViewsAssignment_0_1"


    // $ANTLR start "rule__Model__ClassesAssignment_0_2"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4502:1: rule__Model__ClassesAssignment_0_2 : ( ruleClass ) ;
    public final void rule__Model__ClassesAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4506:1: ( ( ruleClass ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4507:1: ( ruleClass )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4507:1: ( ruleClass )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4508:1: ruleClass
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getClassesClassParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleClass_in_rule__Model__ClassesAssignment_0_29074);
            ruleClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getClassesClassParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ClassesAssignment_0_2"


    // $ANTLR start "rule__Model__ModelAssignment_1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4517:1: rule__Model__ModelAssignment_1 : ( ruleDataModel ) ;
    public final void rule__Model__ModelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4521:1: ( ( ruleDataModel ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4522:1: ( ruleDataModel )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4522:1: ( ruleDataModel )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4523:1: ruleDataModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getModelDataModelParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleDataModel_in_rule__Model__ModelAssignment_19105);
            ruleDataModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getModelDataModelParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ModelAssignment_1"


    // $ANTLR start "rule__Class__NameAssignment_1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4532:1: rule__Class__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4536:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4537:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4537:1: ( RULE_ID )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4538:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__NameAssignment_19136); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_1"


    // $ANTLR start "rule__Class__ParentAssignment_2_1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4547:1: rule__Class__ParentAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Class__ParentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4551:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4552:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4552:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4553:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getParentClassTypeCrossReference_2_1_0()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4554:1: ( RULE_ID )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4555:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getParentClassTypeIDTerminalRuleCall_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__ParentAssignment_2_19171); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getParentClassTypeIDTerminalRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getParentClassTypeCrossReference_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__ParentAssignment_2_1"


    // $ANTLR start "rule__Class__PropertiesAssignment_4"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4566:1: rule__Class__PropertiesAssignment_4 : ( ruleProperty ) ;
    public final void rule__Class__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4570:1: ( ( ruleProperty ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4571:1: ( ruleProperty )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4571:1: ( ruleProperty )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4572:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getPropertiesPropertyParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_rule__Class__PropertiesAssignment_49206);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getPropertiesPropertyParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__PropertiesAssignment_4"


    // $ANTLR start "rule__Service__NameAssignment_1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4581:1: rule__Service__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4585:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4586:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4586:1: ( RULE_ID )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4587:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__NameAssignment_19237); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__NameAssignment_1"


    // $ANTLR start "rule__Service__ConfigurationsAssignment_3"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4596:1: rule__Service__ConfigurationsAssignment_3 : ( ruleProperty ) ;
    public final void rule__Service__ConfigurationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4600:1: ( ( ruleProperty ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4601:1: ( ruleProperty )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4601:1: ( ruleProperty )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4602:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getConfigurationsPropertyParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_rule__Service__ConfigurationsAssignment_39268);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getConfigurationsPropertyParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__ConfigurationsAssignment_3"


    // $ANTLR start "rule__Service__ConfigurationsAssignment_4_1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4611:1: rule__Service__ConfigurationsAssignment_4_1 : ( ruleProperty ) ;
    public final void rule__Service__ConfigurationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4615:1: ( ( ruleProperty ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4616:1: ( ruleProperty )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4616:1: ( ruleProperty )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4617:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getConfigurationsPropertyParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_rule__Service__ConfigurationsAssignment_4_19299);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getConfigurationsPropertyParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__ConfigurationsAssignment_4_1"


    // $ANTLR start "rule__Service__OperationsAssignment_7"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4626:1: rule__Service__OperationsAssignment_7 : ( ruleOperation ) ;
    public final void rule__Service__OperationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4630:1: ( ( ruleOperation ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4631:1: ( ruleOperation )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4631:1: ( ruleOperation )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4632:1: ruleOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getOperationsOperationParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleOperation_in_rule__Service__OperationsAssignment_79330);
            ruleOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getOperationsOperationParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__OperationsAssignment_7"


    // $ANTLR start "rule__Operation__TypeAssignment_1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4641:1: rule__Operation__TypeAssignment_1 : ( ruleTypeReference ) ;
    public final void rule__Operation__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4645:1: ( ( ruleTypeReference ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4646:1: ( ruleTypeReference )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4646:1: ( ruleTypeReference )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4647:1: ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getTypeTypeReferenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleTypeReference_in_rule__Operation__TypeAssignment_19361);
            ruleTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getTypeTypeReferenceParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__TypeAssignment_1"


    // $ANTLR start "rule__Operation__NameAssignment_2"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4656:1: rule__Operation__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4660:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4661:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4661:1: ( RULE_ID )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4662:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_29392); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__NameAssignment_2"


    // $ANTLR start "rule__Operation__ParametersAssignment_4"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4671:1: rule__Operation__ParametersAssignment_4 : ( ruleProperty ) ;
    public final void rule__Operation__ParametersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4675:1: ( ( ruleProperty ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4676:1: ( ruleProperty )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4676:1: ( ruleProperty )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4677:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getParametersPropertyParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_rule__Operation__ParametersAssignment_49423);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getParametersPropertyParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ParametersAssignment_4"


    // $ANTLR start "rule__Operation__ParametersAssignment_5_1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4686:1: rule__Operation__ParametersAssignment_5_1 : ( ruleProperty ) ;
    public final void rule__Operation__ParametersAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4690:1: ( ( ruleProperty ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4691:1: ( ruleProperty )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4691:1: ( ruleProperty )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4692:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getParametersPropertyParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_rule__Operation__ParametersAssignment_5_19454);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getParametersPropertyParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ParametersAssignment_5_1"


    // $ANTLR start "rule__Operation__ExpressionAssignment_8"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4701:1: rule__Operation__ExpressionAssignment_8 : ( ruleExpression ) ;
    public final void rule__Operation__ExpressionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4705:1: ( ( ruleExpression ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4706:1: ( ruleExpression )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4706:1: ( ruleExpression )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4707:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getExpressionExpressionParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Operation__ExpressionAssignment_89485);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getExpressionExpressionParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ExpressionAssignment_8"


    // $ANTLR start "rule__Expression__RightAssignment_1_2"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4716:1: rule__Expression__RightAssignment_1_2 : ( ruleBaseExpression ) ;
    public final void rule__Expression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4720:1: ( ( ruleBaseExpression ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4721:1: ( ruleBaseExpression )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4721:1: ( ruleBaseExpression )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4722:1: ruleBaseExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getRightBaseExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleBaseExpression_in_rule__Expression__RightAssignment_1_29516);
            ruleBaseExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getRightBaseExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__RightAssignment_1_2"


    // $ANTLR start "rule__StringExpression__RightAssignment_1_2"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4731:1: rule__StringExpression__RightAssignment_1_2 : ( ruleStringValue ) ;
    public final void rule__StringExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4735:1: ( ( ruleStringValue ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4736:1: ( ruleStringValue )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4736:1: ( ruleStringValue )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4737:1: ruleStringValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringExpressionAccess().getRightStringValueParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_rule__StringExpression__RightAssignment_1_29547);
            ruleStringValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringExpressionAccess().getRightStringValueParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringExpression__RightAssignment_1_2"


    // $ANTLR start "rule__StringProperty__ReferenceAssignment"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4746:1: rule__StringProperty__ReferenceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__StringProperty__ReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4750:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4751:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4751:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4752:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPropertyAccess().getReferencePropertyCrossReference_0()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4753:1: ( RULE_ID )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4754:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPropertyAccess().getReferencePropertyIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringProperty__ReferenceAssignment9582); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringPropertyAccess().getReferencePropertyIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringPropertyAccess().getReferencePropertyCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringProperty__ReferenceAssignment"


    // $ANTLR start "rule__StringLiteral__LiteralAssignment"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4765:1: rule__StringLiteral__LiteralAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__LiteralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4769:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4770:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4770:1: ( RULE_STRING )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4771:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getLiteralSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__LiteralAssignment9617); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralAccess().getLiteralSTRINGTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__LiteralAssignment"


    // $ANTLR start "rule__Function__NameAssignment_0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4780:1: rule__Function__NameAssignment_0 : ( ruleFunctionEnum ) ;
    public final void rule__Function__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4784:1: ( ( ruleFunctionEnum ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4785:1: ( ruleFunctionEnum )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4785:1: ( ruleFunctionEnum )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4786:1: ruleFunctionEnum
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getNameFunctionEnumEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleFunctionEnum_in_rule__Function__NameAssignment_09648);
            ruleFunctionEnum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getNameFunctionEnumEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NameAssignment_0"


    // $ANTLR start "rule__Function__ExpressionsAssignment_2"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4795:1: rule__Function__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__Function__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4799:1: ( ( ruleExpression ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4800:1: ( ruleExpression )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4800:1: ( ruleExpression )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4801:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Function__ExpressionsAssignment_29679);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__ExpressionsAssignment_2"


    // $ANTLR start "rule__Function__ExpressionsAssignment_3_1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4810:1: rule__Function__ExpressionsAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__Function__ExpressionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4814:1: ( ( ruleExpression ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4815:1: ( ruleExpression )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4815:1: ( ruleExpression )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4816:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getExpressionsExpressionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Function__ExpressionsAssignment_3_19710);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getExpressionsExpressionParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__ExpressionsAssignment_3_1"


    // $ANTLR start "rule__Property__TypeAssignment_0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4825:1: rule__Property__TypeAssignment_0 : ( ruleTypeReference ) ;
    public final void rule__Property__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4829:1: ( ( ruleTypeReference ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4830:1: ( ruleTypeReference )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4830:1: ( ruleTypeReference )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4831:1: ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeTypeReferenceParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleTypeReference_in_rule__Property__TypeAssignment_09741);
            ruleTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getTypeTypeReferenceParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__TypeAssignment_0"


    // $ANTLR start "rule__Property__NameAssignment_1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4840:1: rule__Property__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4844:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4845:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4845:1: ( RULE_ID )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4846:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__NameAssignment_19772); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__NameAssignment_1"


    // $ANTLR start "rule__TypeReference__TypeAssignment_0_1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4855:1: rule__TypeReference__TypeAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeReference__TypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4859:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4860:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4860:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4861:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getTypeTypeCrossReference_0_1_0()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4862:1: ( RULE_ID )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4863:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getTypeTypeIDTerminalRuleCall_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeReference__TypeAssignment_0_19807); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getTypeTypeIDTerminalRuleCall_0_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getTypeTypeCrossReference_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__TypeAssignment_0_1"


    // $ANTLR start "rule__TypeReference__SizeAssignment_0_3"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4874:1: rule__TypeReference__SizeAssignment_0_3 : ( RULE_INT ) ;
    public final void rule__TypeReference__SizeAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4878:1: ( ( RULE_INT ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4879:1: ( RULE_INT )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4879:1: ( RULE_INT )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4880:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getSizeINTTerminalRuleCall_0_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TypeReference__SizeAssignment_0_39842); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getSizeINTTerminalRuleCall_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__SizeAssignment_0_3"


    // $ANTLR start "rule__TypeReference__TypeAssignment_1_1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4889:1: rule__TypeReference__TypeAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeReference__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4893:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4894:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4894:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4895:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getTypeTypeCrossReference_1_1_0()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4896:1: ( RULE_ID )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4897:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getTypeTypeIDTerminalRuleCall_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeReference__TypeAssignment_1_19877); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getTypeTypeIDTerminalRuleCall_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getTypeTypeCrossReference_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__TypeAssignment_1_1"


    // $ANTLR start "rule__TypeReference__RemainderAssignment_1_2_1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4908:1: rule__TypeReference__RemainderAssignment_1_2_1 : ( ruleTypeReference ) ;
    public final void rule__TypeReference__RemainderAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4912:1: ( ( ruleTypeReference ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4913:1: ( ruleTypeReference )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4913:1: ( ruleTypeReference )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4914:1: ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getRemainderTypeReferenceParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleTypeReference_in_rule__TypeReference__RemainderAssignment_1_2_19912);
            ruleTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getRemainderTypeReferenceParserRuleCall_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__RemainderAssignment_1_2_1"


    // $ANTLR start "rule__DataModel__InstancesAssignment_3"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4923:1: rule__DataModel__InstancesAssignment_3 : ( ruleInstance ) ;
    public final void rule__DataModel__InstancesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4927:1: ( ( ruleInstance ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4928:1: ( ruleInstance )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4928:1: ( ruleInstance )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4929:1: ruleInstance
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataModelAccess().getInstancesInstanceParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleInstance_in_rule__DataModel__InstancesAssignment_39943);
            ruleInstance();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataModelAccess().getInstancesInstanceParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__InstancesAssignment_3"


    // $ANTLR start "rule__DataModel__ViewAssignment_5"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4938:1: rule__DataModel__ViewAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__DataModel__ViewAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4942:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4943:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4943:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4944:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataModelAccess().getViewInstanceCrossReference_5_0()); 
            }
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4945:1: ( RULE_ID )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4946:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataModelAccess().getViewInstanceIDTerminalRuleCall_5_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataModel__ViewAssignment_59978); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataModelAccess().getViewInstanceIDTerminalRuleCall_5_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataModelAccess().getViewInstanceCrossReference_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__ViewAssignment_5"


    // $ANTLR start "rule__Instance__TypeAssignment_1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4957:1: rule__Instance__TypeAssignment_1 : ( ruleTypeReference ) ;
    public final void rule__Instance__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4961:1: ( ( ruleTypeReference ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4962:1: ( ruleTypeReference )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4962:1: ( ruleTypeReference )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4963:1: ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getTypeTypeReferenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleTypeReference_in_rule__Instance__TypeAssignment_110013);
            ruleTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getTypeTypeReferenceParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__TypeAssignment_1"


    // $ANTLR start "rule__Instance__NameAssignment_2"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4972:1: rule__Instance__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Instance__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4976:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4977:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4977:1: ( RULE_ID )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4978:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Instance__NameAssignment_210044); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__NameAssignment_2"


    // $ANTLR start "rule__View__NameAssignment_1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4987:1: rule__View__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__View__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4991:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4992:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4992:1: ( RULE_ID )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:4993:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__View__NameAssignment_110075); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__NameAssignment_1"


    // $ANTLR start "rule__View__LayoutAssignment_3"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5002:1: rule__View__LayoutAssignment_3 : ( ruleLayout ) ;
    public final void rule__View__LayoutAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5006:1: ( ( ruleLayout ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5007:1: ( ruleLayout )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5007:1: ( ruleLayout )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5008:1: ruleLayout
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewAccess().getLayoutLayoutParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleLayout_in_rule__View__LayoutAssignment_310106);
            ruleLayout();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewAccess().getLayoutLayoutParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__LayoutAssignment_3"


    // $ANTLR start "rule__View__ContentsAssignment_4"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5017:1: rule__View__ContentsAssignment_4 : ( ruleViewContent ) ;
    public final void rule__View__ContentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5021:1: ( ( ruleViewContent ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5022:1: ( ruleViewContent )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5022:1: ( ruleViewContent )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5023:1: ruleViewContent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewAccess().getContentsViewContentParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleViewContent_in_rule__View__ContentsAssignment_410137);
            ruleViewContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewAccess().getContentsViewContentParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__ContentsAssignment_4"


    // $ANTLR start "rule__ViewContainer__LayoutAssignment_2"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5032:1: rule__ViewContainer__LayoutAssignment_2 : ( ruleLayout ) ;
    public final void rule__ViewContainer__LayoutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5036:1: ( ( ruleLayout ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5037:1: ( ruleLayout )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5037:1: ( ruleLayout )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5038:1: ruleLayout
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewContainerAccess().getLayoutLayoutParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleLayout_in_rule__ViewContainer__LayoutAssignment_210168);
            ruleLayout();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewContainerAccess().getLayoutLayoutParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewContainer__LayoutAssignment_2"


    // $ANTLR start "rule__ViewContainer__ContentsAssignment_3"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5047:1: rule__ViewContainer__ContentsAssignment_3 : ( ruleViewContent ) ;
    public final void rule__ViewContainer__ContentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5051:1: ( ( ruleViewContent ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5052:1: ( ruleViewContent )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5052:1: ( ruleViewContent )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5053:1: ruleViewContent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewContainerAccess().getContentsViewContentParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleViewContent_in_rule__ViewContainer__ContentsAssignment_310199);
            ruleViewContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewContainerAccess().getContentsViewContentParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewContainer__ContentsAssignment_3"


    // $ANTLR start "rule__ViewElement__TypeAssignment_0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5062:1: rule__ViewElement__TypeAssignment_0 : ( ruleViewType ) ;
    public final void rule__ViewElement__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5066:1: ( ( ruleViewType ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5067:1: ( ruleViewType )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5067:1: ( ruleViewType )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5068:1: ruleViewType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewElementAccess().getTypeViewTypeEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleViewType_in_rule__ViewElement__TypeAssignment_010230);
            ruleViewType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewElementAccess().getTypeViewTypeEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewElement__TypeAssignment_0"


    // $ANTLR start "rule__ViewElement__NameAssignment_1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5077:1: rule__ViewElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ViewElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5081:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5082:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5082:1: ( RULE_ID )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5083:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getViewElementAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ViewElement__NameAssignment_110261); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getViewElementAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewElement__NameAssignment_1"


    // $ANTLR start "rule__GridLayout__SizeAssignment_0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5092:1: rule__GridLayout__SizeAssignment_0 : ( ruleSize ) ;
    public final void rule__GridLayout__SizeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5096:1: ( ( ruleSize ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5097:1: ( ruleSize )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5097:1: ( ruleSize )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5098:1: ruleSize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGridLayoutAccess().getSizeSizeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSize_in_rule__GridLayout__SizeAssignment_010292);
            ruleSize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGridLayoutAccess().getSizeSizeParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridLayout__SizeAssignment_0"


    // $ANTLR start "rule__GridLayout__FieldsAssignment_1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5107:1: rule__GridLayout__FieldsAssignment_1 : ( ruleField ) ;
    public final void rule__GridLayout__FieldsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5111:1: ( ( ruleField ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5112:1: ( ruleField )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5112:1: ( ruleField )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5113:1: ruleField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGridLayoutAccess().getFieldsFieldParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleField_in_rule__GridLayout__FieldsAssignment_110323);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGridLayoutAccess().getFieldsFieldParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridLayout__FieldsAssignment_1"


    // $ANTLR start "rule__Field__WidthAssignment_1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5122:1: rule__Field__WidthAssignment_1 : ( RULE_INT ) ;
    public final void rule__Field__WidthAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5126:1: ( ( RULE_INT ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5127:1: ( RULE_INT )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5127:1: ( RULE_INT )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5128:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getWidthINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Field__WidthAssignment_110354); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getWidthINTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__WidthAssignment_1"


    // $ANTLR start "rule__Field__HeightAssignment_3"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5137:1: rule__Field__HeightAssignment_3 : ( RULE_INT ) ;
    public final void rule__Field__HeightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5141:1: ( ( RULE_INT ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5142:1: ( RULE_INT )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5142:1: ( RULE_INT )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5143:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getHeightINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Field__HeightAssignment_310385); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getHeightINTTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__HeightAssignment_3"


    // $ANTLR start "rule__StackLayout__SizeAssignment_0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5152:1: rule__StackLayout__SizeAssignment_0 : ( ruleSize ) ;
    public final void rule__StackLayout__SizeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5156:1: ( ( ruleSize ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5157:1: ( ruleSize )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5157:1: ( ruleSize )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5158:1: ruleSize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStackLayoutAccess().getSizeSizeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSize_in_rule__StackLayout__SizeAssignment_010416);
            ruleSize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStackLayoutAccess().getSizeSizeParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StackLayout__SizeAssignment_0"


    // $ANTLR start "rule__StackLayout__DirectionAssignment_1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5167:1: rule__StackLayout__DirectionAssignment_1 : ( ruleDirection ) ;
    public final void rule__StackLayout__DirectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5171:1: ( ( ruleDirection ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5172:1: ( ruleDirection )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5172:1: ( ruleDirection )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5173:1: ruleDirection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStackLayoutAccess().getDirectionDirectionEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleDirection_in_rule__StackLayout__DirectionAssignment_110447);
            ruleDirection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStackLayoutAccess().getDirectionDirectionEnumRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StackLayout__DirectionAssignment_1"


    // $ANTLR start "rule__Size__WidthAssignment_1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5182:1: rule__Size__WidthAssignment_1 : ( ruleSizeExpr ) ;
    public final void rule__Size__WidthAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5186:1: ( ( ruleSizeExpr ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5187:1: ( ruleSizeExpr )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5187:1: ( ruleSizeExpr )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5188:1: ruleSizeExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeAccess().getWidthSizeExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSizeExpr_in_rule__Size__WidthAssignment_110478);
            ruleSizeExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSizeAccess().getWidthSizeExprParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__WidthAssignment_1"


    // $ANTLR start "rule__Size__HeightAssignment_3"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5197:1: rule__Size__HeightAssignment_3 : ( ruleSizeExpr ) ;
    public final void rule__Size__HeightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5201:1: ( ( ruleSizeExpr ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5202:1: ( ruleSizeExpr )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5202:1: ( ruleSizeExpr )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5203:1: ruleSizeExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeAccess().getHeightSizeExprParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleSizeExpr_in_rule__Size__HeightAssignment_310509);
            ruleSizeExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSizeAccess().getHeightSizeExprParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__HeightAssignment_3"


    // $ANTLR start "rule__SizeExpr__ValueAssignment_0"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5212:1: rule__SizeExpr__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__SizeExpr__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5216:1: ( ( RULE_INT ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5217:1: ( RULE_INT )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5217:1: ( RULE_INT )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5218:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeExprAccess().getValueINTTerminalRuleCall_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SizeExpr__ValueAssignment_010540); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSizeExprAccess().getValueINTTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SizeExpr__ValueAssignment_0"


    // $ANTLR start "rule__SizeExpr__UnitAssignment_1"
    // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5227:1: rule__SizeExpr__UnitAssignment_1 : ( ruleUnit ) ;
    public final void rule__SizeExpr__UnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5231:1: ( ( ruleUnit ) )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5232:1: ( ruleUnit )
            {
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5232:1: ( ruleUnit )
            // ../de.cau.cs.se.lad.ui/src-gen/de/cau/cs/se/lad/ui/contentassist/antlr/internal/InternalAppLang.g:5233:1: ruleUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeExprAccess().getUnitUnitEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleUnit_in_rule__SizeExpr__UnitAssignment_110571);
            ruleUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSizeExprAccess().getUnitUnitEnumRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SizeExpr__UnitAssignment_1"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\14\uffff";
    static final String DFA6_eofS =
        "\14\uffff";
    static final String DFA6_minS =
        "\1\60\1\6\1\27\2\42\1\6\1\27\2\61\1\31\2\uffff";
    static final String DFA6_maxS =
        "\1\60\1\6\1\30\2\42\1\6\1\30\2\61\1\60\2\uffff";
    static final String DFA6_acceptS =
        "\12\uffff\1\2\1\1";
    static final String DFA6_specialS =
        "\14\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4",
            "\1\5",
            "\1\5",
            "\1\6",
            "\1\7\1\10",
            "\1\11",
            "\1\11",
            "\2\13\25\uffff\1\12",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "987:1: rule__Layout__Alternatives : ( ( ruleStackLayout ) | ( ruleGridLayout ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0_in_ruleClass160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0_in_ruleService220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0_in_ruleOperation280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0_in_ruleExpression340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseExpression_in_entryRuleBaseExpression367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseExpression374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__Alternatives_in_ruleBaseExpression400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_entryRuleStringExpression427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringExpression434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringExpression__Group__0_in_ruleStringExpression460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Alternatives_in_ruleStringValue520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringProperty_in_entryRuleStringProperty547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringProperty554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__ReferenceAssignment_in_ruleStringProperty580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__LiteralAssignment_in_ruleStringLiteral640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullLiteral__Group__0_in_ruleNullLiteral700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0_in_ruleFunction760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_entryRuleTypeReference847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeReference854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeReference__Alternatives_in_ruleTypeReference880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataModel_in_entryRuleDataModel907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataModel914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__0_in_ruleDataModel940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstance_in_entryRuleInstance967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstance974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__0_in_ruleInstance1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_entryRuleView1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleView1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__0_in_ruleView1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewContent_in_entryRuleViewContent1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewContent1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewContent__Alternatives_in_ruleViewContent1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewContainer_in_entryRuleViewContainer1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewContainer1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewContainer__Group__0_in_ruleViewContainer1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewElement_in_entryRuleViewElement1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewElement1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewElement__Group__0_in_ruleViewElement1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayout1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layout__Alternatives_in_ruleLayout1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGridLayout_in_entryRuleGridLayout1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGridLayout1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridLayout__Group__0_in_ruleGridLayout1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStackLayout_in_entryRuleStackLayout1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStackLayout1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StackLayout__Group__0_in_ruleStackLayout1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_entryRuleSize1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSize1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group__0_in_ruleSize1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSizeExpr_in_entryRuleSizeExpr1567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSizeExpr1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SizeExpr__Group__0_in_ruleSizeExpr1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionEnum__Alternatives_in_ruleFunctionEnum1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewType__Alternatives_in_ruleViewType1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unit__Alternatives_in_ruleUnit1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Direction__Alternatives_in_ruleDirection1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ServicesAssignment_0_0_in_rule__Model__Alternatives_01780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ViewsAssignment_0_1_in_rule__Model__Alternatives_01798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ClassesAssignment_0_2_in_rule__Model__Alternatives_01816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__BaseExpression__Alternatives1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_rule__BaseExpression__Alternatives1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_rule__BaseExpression__Alternatives1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__StringValue__Alternatives1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringProperty_in_rule__StringValue__Alternatives1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeReference__Group_0__0_in_rule__TypeReference__Alternatives1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeReference__Group_1__0_in_rule__TypeReference__Alternatives1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewElement_in_rule__ViewContent__Alternatives2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewContainer_in_rule__ViewContent__Alternatives2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStackLayout_in_rule__Layout__Alternatives2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGridLayout_in_rule__Layout__Alternatives2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__FunctionEnum__Alternatives2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__FunctionEnum__Alternatives2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__FunctionEnum__Alternatives2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__FunctionEnum__Alternatives2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ViewType__Alternatives2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ViewType__Alternatives2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ViewType__Alternatives2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ViewType__Alternatives2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ViewType__Alternatives2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ViewType__Alternatives2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ViewType__Alternatives2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ViewType__Alternatives2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Unit__Alternatives2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Unit__Alternatives2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Direction__Alternatives2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Direction__Alternatives2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02507 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_0_in_rule__Model__Group__0__Impl2537 = new BitSet(new long[]{0x0000400088000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ModelAssignment_1_in_rule__Model__Group__1__Impl2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__02629 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class__Group__1_in_rule__Class__Group__02632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Class__Group__0__Impl2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__12691 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_rule__Class__Group__2_in_rule__Class__Group__12694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__NameAssignment_1_in_rule__Class__Group__1__Impl2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__22751 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_rule__Class__Group__3_in_rule__Class__Group__22754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_2__0_in_rule__Class__Group__2__Impl2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__32812 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class__Group__4_in_rule__Class__Group__32815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Class__Group__3__Impl2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__42874 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Class__Group__5_in_rule__Class__Group__42877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__PropertiesAssignment_4_in_rule__Class__Group__4__Impl2906 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Class__PropertiesAssignment_4_in_rule__Class__Group__4__Impl2918 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__52951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Class__Group__5__Impl2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_2__0__Impl_in_rule__Class__Group_2__03022 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class__Group_2__1_in_rule__Class__Group_2__03025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Class__Group_2__0__Impl3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_2__1__Impl_in_rule__Class__Group_2__13084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__ParentAssignment_2_1_in_rule__Class__Group_2__1__Impl3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__03145 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__1_in_rule__Service__Group__03148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Service__Group__0__Impl3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__13207 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Service__Group__2_in_rule__Service__Group__13210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__23267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__3_in_rule__Service__Group__23270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Service__Group__2__Impl3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__33329 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_rule__Service__Group__4_in_rule__Service__Group__33332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__ConfigurationsAssignment_3_in_rule__Service__Group__3__Impl3359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__43389 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_rule__Service__Group__5_in_rule__Service__Group__43392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_4__0_in_rule__Service__Group__4__Impl3419 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Service__Group__5__Impl_in_rule__Service__Group__53450 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Service__Group__6_in_rule__Service__Group__53453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Service__Group__5__Impl3481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__6__Impl_in_rule__Service__Group__63512 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Service__Group__7_in_rule__Service__Group__63515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Service__Group__6__Impl3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__7__Impl_in_rule__Service__Group__73574 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Service__Group__8_in_rule__Service__Group__73577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__OperationsAssignment_7_in_rule__Service__Group__7__Impl3606 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__Service__OperationsAssignment_7_in_rule__Service__Group__7__Impl3618 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__Service__Group__8__Impl_in_rule__Service__Group__83651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Service__Group__8__Impl3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_4__0__Impl_in_rule__Service__Group_4__03728 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group_4__1_in_rule__Service__Group_4__03731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Service__Group_4__0__Impl3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_4__1__Impl_in_rule__Service__Group_4__13790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__ConfigurationsAssignment_4_1_in_rule__Service__Group_4__1__Impl3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__03851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__03854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Operation__Group__0__Impl3882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__13913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__13916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__TypeAssignment_1_in_rule__Operation__Group__1__Impl3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__23973 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__23976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__NameAssignment_2_in_rule__Operation__Group__2__Impl4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__34033 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__34036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Operation__Group__3__Impl4064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__44095 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__44098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ParametersAssignment_4_in_rule__Operation__Group__4__Impl4125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__54155 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__6_in_rule__Operation__Group__54158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__0_in_rule__Operation__Group__5__Impl4185 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__6__Impl_in_rule__Operation__Group__64216 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__7_in_rule__Operation__Group__64219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Operation__Group__6__Impl4247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__7__Impl_in_rule__Operation__Group__74278 = new BitSet(new long[]{0x0000008000007830L});
    public static final BitSet FOLLOW_rule__Operation__Group__8_in_rule__Operation__Group__74281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Operation__Group__7__Impl4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__8__Impl_in_rule__Operation__Group__84340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ExpressionAssignment_8_in_rule__Operation__Group__8__Impl4367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__0__Impl_in_rule__Operation__Group_5__04415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__1_in_rule__Operation__Group_5__04418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Operation__Group_5__0__Impl4446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__1__Impl_in_rule__Operation__Group_5__14477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ParametersAssignment_5_1_in_rule__Operation__Group_5__1__Impl4504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__04538 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__04541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseExpression_in_rule__Expression__Group__0__Impl4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__14597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl4624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__04659 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__04662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__14720 = new BitSet(new long[]{0x0000008000007830L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__14723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Expression__Group_1__1__Impl4751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__24782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__RightAssignment_1_2_in_rule__Expression__Group_1__2__Impl4809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringExpression__Group__0__Impl_in_rule__StringExpression__Group__04845 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__StringExpression__Group__1_in_rule__StringExpression__Group__04848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__StringExpression__Group__0__Impl4875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringExpression__Group__1__Impl_in_rule__StringExpression__Group__14904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringExpression__Group_1__0_in_rule__StringExpression__Group__1__Impl4931 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__StringExpression__Group_1__0__Impl_in_rule__StringExpression__Group_1__04966 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__StringExpression__Group_1__1_in_rule__StringExpression__Group_1__04969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringExpression__Group_1__1__Impl_in_rule__StringExpression__Group_1__15027 = new BitSet(new long[]{0x0000008000007830L});
    public static final BitSet FOLLOW_rule__StringExpression__Group_1__2_in_rule__StringExpression__Group_1__15030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__StringExpression__Group_1__1__Impl5058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringExpression__Group_1__2__Impl_in_rule__StringExpression__Group_1__25089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringExpression__RightAssignment_1_2_in_rule__StringExpression__Group_1__2__Impl5116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullLiteral__Group__0__Impl_in_rule__NullLiteral__Group__05152 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__NullLiteral__Group__1_in_rule__NullLiteral__Group__05155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullLiteral__Group__1__Impl_in_rule__NullLiteral__Group__15213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__NullLiteral__Group__1__Impl5241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__05276 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__05279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NameAssignment_0_in_rule__Function__Group__0__Impl5306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__15336 = new BitSet(new long[]{0x0000008000007830L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__15339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Function__Group__1__Impl5367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__25398 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__25401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__ExpressionsAssignment_2_in_rule__Function__Group__2__Impl5428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__35458 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_rule__Function__Group__4_in_rule__Function__Group__35461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_3__0_in_rule__Function__Group__3__Impl5488 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__45519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Function__Group__4__Impl5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_3__0__Impl_in_rule__Function__Group_3__05588 = new BitSet(new long[]{0x0000008000007830L});
    public static final BitSet FOLLOW_rule__Function__Group_3__1_in_rule__Function__Group_3__05591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Function__Group_3__0__Impl5619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_3__1__Impl_in_rule__Function__Group_3__15650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__ExpressionsAssignment_3_1_in_rule__Function__Group_3__1__Impl5677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__05711 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__05714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__TypeAssignment_0_in_rule__Property__Group__0__Impl5741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__15771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NameAssignment_1_in_rule__Property__Group__1__Impl5798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeReference__Group_0__0__Impl_in_rule__TypeReference__Group_0__05832 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TypeReference__Group_0__1_in_rule__TypeReference__Group_0__05835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeReference__Group_0__1__Impl_in_rule__TypeReference__Group_0__15893 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__TypeReference__Group_0__2_in_rule__TypeReference__Group_0__15896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeReference__TypeAssignment_0_1_in_rule__TypeReference__Group_0__1__Impl5923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeReference__Group_0__2__Impl_in_rule__TypeReference__Group_0__25953 = new BitSet(new long[]{0x0000020000000040L});
    public static final BitSet FOLLOW_rule__TypeReference__Group_0__3_in_rule__TypeReference__Group_0__25956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__TypeReference__Group_0__2__Impl5984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeReference__Group_0__3__Impl_in_rule__TypeReference__Group_0__36015 = new BitSet(new long[]{0x0000020000000040L});
    public static final BitSet FOLLOW_rule__TypeReference__Group_0__4_in_rule__TypeReference__Group_0__36018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeReference__SizeAssignment_0_3_in_rule__TypeReference__Group_0__3__Impl6045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeReference__Group_0__4__Impl_in_rule__TypeReference__Group_0__46076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__TypeReference__Group_0__4__Impl6104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeReference__Group_1__0__Impl_in_rule__TypeReference__Group_1__06145 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TypeReference__Group_1__1_in_rule__TypeReference__Group_1__06148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeReference__Group_1__1__Impl_in_rule__TypeReference__Group_1__16206 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__TypeReference__Group_1__2_in_rule__TypeReference__Group_1__16209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeReference__TypeAssignment_1_1_in_rule__TypeReference__Group_1__1__Impl6236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeReference__Group_1__2__Impl_in_rule__TypeReference__Group_1__26266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeReference__Group_1_2__0_in_rule__TypeReference__Group_1__2__Impl6293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeReference__Group_1_2__0__Impl_in_rule__TypeReference__Group_1_2__06330 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TypeReference__Group_1_2__1_in_rule__TypeReference__Group_1_2__06333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__TypeReference__Group_1_2__0__Impl6361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeReference__Group_1_2__1__Impl_in_rule__TypeReference__Group_1_2__16392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeReference__RemainderAssignment_1_2_1_in_rule__TypeReference__Group_1_2__1__Impl6419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__0__Impl_in_rule__DataModel__Group__06453 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__1_in_rule__DataModel__Group__06456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__1__Impl_in_rule__DataModel__Group__16514 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__2_in_rule__DataModel__Group__16517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__DataModel__Group__1__Impl6545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__2__Impl_in_rule__DataModel__Group__26576 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__3_in_rule__DataModel__Group__26579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DataModel__Group__2__Impl6607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__3__Impl_in_rule__DataModel__Group__36638 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__4_in_rule__DataModel__Group__36641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__InstancesAssignment_3_in_rule__DataModel__Group__3__Impl6668 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__4__Impl_in_rule__DataModel__Group__46699 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataModel__Group__5_in_rule__DataModel__Group__46702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__DataModel__Group__4__Impl6730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__5__Impl_in_rule__DataModel__Group__56761 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__6_in_rule__DataModel__Group__56764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__ViewAssignment_5_in_rule__DataModel__Group__5__Impl6791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__6__Impl_in_rule__DataModel__Group__66821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__DataModel__Group__6__Impl6849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__0__Impl_in_rule__Instance__Group__06894 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Instance__Group__1_in_rule__Instance__Group__06897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Instance__Group__0__Impl6925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__1__Impl_in_rule__Instance__Group__16956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Instance__Group__2_in_rule__Instance__Group__16959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__TypeAssignment_1_in_rule__Instance__Group__1__Impl6986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__Group__2__Impl_in_rule__Instance__Group__27016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instance__NameAssignment_2_in_rule__Instance__Group__2__Impl7043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__0__Impl_in_rule__View__Group__07079 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__View__Group__1_in_rule__View__Group__07082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__View__Group__0__Impl7110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__1__Impl_in_rule__View__Group__17141 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__View__Group__2_in_rule__View__Group__17144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__NameAssignment_1_in_rule__View__Group__1__Impl7171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__2__Impl_in_rule__View__Group__27201 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__View__Group__3_in_rule__View__Group__27204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__View__Group__2__Impl7232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__3__Impl_in_rule__View__Group__37263 = new BitSet(new long[]{0x00008000207F8000L});
    public static final BitSet FOLLOW_rule__View__Group__4_in_rule__View__Group__37266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__LayoutAssignment_3_in_rule__View__Group__3__Impl7293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__4__Impl_in_rule__View__Group__47323 = new BitSet(new long[]{0x00008000207F8000L});
    public static final BitSet FOLLOW_rule__View__Group__5_in_rule__View__Group__47326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__ContentsAssignment_4_in_rule__View__Group__4__Impl7353 = new BitSet(new long[]{0x00008000007F8002L});
    public static final BitSet FOLLOW_rule__View__Group__5__Impl_in_rule__View__Group__57384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__View__Group__5__Impl7412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewContainer__Group__0__Impl_in_rule__ViewContainer__Group__07455 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ViewContainer__Group__1_in_rule__ViewContainer__Group__07458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__ViewContainer__Group__0__Impl7486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewContainer__Group__1__Impl_in_rule__ViewContainer__Group__17517 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__ViewContainer__Group__2_in_rule__ViewContainer__Group__17520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ViewContainer__Group__1__Impl7548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewContainer__Group__2__Impl_in_rule__ViewContainer__Group__27579 = new BitSet(new long[]{0x00008000207F8000L});
    public static final BitSet FOLLOW_rule__ViewContainer__Group__3_in_rule__ViewContainer__Group__27582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewContainer__LayoutAssignment_2_in_rule__ViewContainer__Group__2__Impl7609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewContainer__Group__3__Impl_in_rule__ViewContainer__Group__37639 = new BitSet(new long[]{0x00008000207F8000L});
    public static final BitSet FOLLOW_rule__ViewContainer__Group__4_in_rule__ViewContainer__Group__37642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewContainer__ContentsAssignment_3_in_rule__ViewContainer__Group__3__Impl7669 = new BitSet(new long[]{0x00008000007F8002L});
    public static final BitSet FOLLOW_rule__ViewContainer__Group__4__Impl_in_rule__ViewContainer__Group__47700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ViewContainer__Group__4__Impl7728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewElement__Group__0__Impl_in_rule__ViewElement__Group__07769 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ViewElement__Group__1_in_rule__ViewElement__Group__07772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewElement__TypeAssignment_0_in_rule__ViewElement__Group__0__Impl7799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewElement__Group__1__Impl_in_rule__ViewElement__Group__17829 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ViewElement__Group__2_in_rule__ViewElement__Group__17832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewElement__NameAssignment_1_in_rule__ViewElement__Group__1__Impl7859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewElement__Group__2__Impl_in_rule__ViewElement__Group__27889 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ViewElement__Group__3_in_rule__ViewElement__Group__27892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ViewElement__Group__2__Impl7920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewElement__Group__3__Impl_in_rule__ViewElement__Group__37951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ViewElement__Group__3__Impl7979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridLayout__Group__0__Impl_in_rule__GridLayout__Group__08018 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__GridLayout__Group__1_in_rule__GridLayout__Group__08021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridLayout__SizeAssignment_0_in_rule__GridLayout__Group__0__Impl8048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridLayout__Group__1__Impl_in_rule__GridLayout__Group__18078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridLayout__FieldsAssignment_1_in_rule__GridLayout__Group__1__Impl8105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__08139 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__08142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Field__Group__0__Impl8170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__18201 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__18204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__WidthAssignment_1_in_rule__Field__Group__1__Impl8231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__28261 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__28264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Field__Group__2__Impl8292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__38323 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Field__Group__4_in_rule__Field__Group__38326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__HeightAssignment_3_in_rule__Field__Group__3__Impl8353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__48383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Field__Group__4__Impl8411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StackLayout__Group__0__Impl_in_rule__StackLayout__Group__08452 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__StackLayout__Group__1_in_rule__StackLayout__Group__08455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StackLayout__SizeAssignment_0_in_rule__StackLayout__Group__0__Impl8482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StackLayout__Group__1__Impl_in_rule__StackLayout__Group__18512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StackLayout__DirectionAssignment_1_in_rule__StackLayout__Group__1__Impl8539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group__0__Impl_in_rule__Size__Group__08573 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Size__Group__1_in_rule__Size__Group__08576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Size__Group__0__Impl8604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group__1__Impl_in_rule__Size__Group__18635 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Size__Group__2_in_rule__Size__Group__18638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__WidthAssignment_1_in_rule__Size__Group__1__Impl8665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group__2__Impl_in_rule__Size__Group__28695 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Size__Group__3_in_rule__Size__Group__28698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Size__Group__2__Impl8726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group__3__Impl_in_rule__Size__Group__38757 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Size__Group__4_in_rule__Size__Group__38760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__HeightAssignment_3_in_rule__Size__Group__3__Impl8787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group__4__Impl_in_rule__Size__Group__48817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Size__Group__4__Impl8845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SizeExpr__Group__0__Impl_in_rule__SizeExpr__Group__08886 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__SizeExpr__Group__1_in_rule__SizeExpr__Group__08889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SizeExpr__ValueAssignment_0_in_rule__SizeExpr__Group__0__Impl8916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SizeExpr__Group__1__Impl_in_rule__SizeExpr__Group__18946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SizeExpr__UnitAssignment_1_in_rule__SizeExpr__Group__1__Impl8973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__Model__ServicesAssignment_0_09012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_rule__Model__ViewsAssignment_0_19043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__Model__ClassesAssignment_0_29074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataModel_in_rule__Model__ModelAssignment_19105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__NameAssignment_19136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__ParentAssignment_2_19171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Class__PropertiesAssignment_49206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__NameAssignment_19237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Service__ConfigurationsAssignment_39268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Service__ConfigurationsAssignment_4_19299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__Service__OperationsAssignment_79330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_rule__Operation__TypeAssignment_19361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_29392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Operation__ParametersAssignment_49423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Operation__ParametersAssignment_5_19454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Operation__ExpressionAssignment_89485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseExpression_in_rule__Expression__RightAssignment_1_29516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__StringExpression__RightAssignment_1_29547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringProperty__ReferenceAssignment9582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__LiteralAssignment9617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionEnum_in_rule__Function__NameAssignment_09648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Function__ExpressionsAssignment_29679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Function__ExpressionsAssignment_3_19710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_rule__Property__TypeAssignment_09741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__NameAssignment_19772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeReference__TypeAssignment_0_19807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TypeReference__SizeAssignment_0_39842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeReference__TypeAssignment_1_19877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_rule__TypeReference__RemainderAssignment_1_2_19912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstance_in_rule__DataModel__InstancesAssignment_39943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataModel__ViewAssignment_59978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_rule__Instance__TypeAssignment_110013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Instance__NameAssignment_210044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__View__NameAssignment_110075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayout_in_rule__View__LayoutAssignment_310106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewContent_in_rule__View__ContentsAssignment_410137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayout_in_rule__ViewContainer__LayoutAssignment_210168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewContent_in_rule__ViewContainer__ContentsAssignment_310199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewType_in_rule__ViewElement__TypeAssignment_010230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ViewElement__NameAssignment_110261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_rule__GridLayout__SizeAssignment_010292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__GridLayout__FieldsAssignment_110323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Field__WidthAssignment_110354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Field__HeightAssignment_310385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_rule__StackLayout__SizeAssignment_010416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_rule__StackLayout__DirectionAssignment_110447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSizeExpr_in_rule__Size__WidthAssignment_110478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSizeExpr_in_rule__Size__HeightAssignment_310509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SizeExpr__ValueAssignment_010540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnit_in_rule__SizeExpr__UnitAssignment_110571 = new BitSet(new long[]{0x0000000000000002L});

}