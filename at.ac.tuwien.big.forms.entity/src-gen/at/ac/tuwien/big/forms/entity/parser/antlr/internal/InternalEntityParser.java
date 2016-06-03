package at.ac.tuwien.big.forms.entity.parser.antlr.internal; 

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
import at.ac.tuwien.big.forms.entity.services.EntityGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEntityParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entity'", "'extends'", "'{'", "'id'", "','", "'}'", "'reference'", "':'", "'['", "'..'", "']'", "'opposite-of'", "'attribute'", "'*'", "'enum'", "'='", "'-'", "'.'", "'String'", "'Integer'", "'Text'", "'Date'", "'Time'", "'Email'", "'Boolean'", "'Year'", "'None'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalEntityParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEntityParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEntityParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEntity.g"; }



     	private EntityGrammarAccess grammarAccess;
     	
        public InternalEntityParser(TokenStream input, EntityGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "EntityModel";	
       	}
       	
       	@Override
       	protected EntityGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleEntityModel"
    // InternalEntity.g:68:1: entryRuleEntityModel returns [EObject current=null] : iv_ruleEntityModel= ruleEntityModel EOF ;
    public final EObject entryRuleEntityModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityModel = null;


        try {
            // InternalEntity.g:69:2: (iv_ruleEntityModel= ruleEntityModel EOF )
            // InternalEntity.g:70:2: iv_ruleEntityModel= ruleEntityModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntityModelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEntityModel=ruleEntityModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntityModel; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEntityModel"


    // $ANTLR start "ruleEntityModel"
    // InternalEntity.g:77:1: ruleEntityModel returns [EObject current=null] : ( ( (lv_entityModelElements_0_0= ruleEntityModelElement ) ) ( (lv_entityModelElements_1_0= ruleEntityModelElement ) )* )? ;
    public final EObject ruleEntityModel() throws RecognitionException {
        EObject current = null;

        EObject lv_entityModelElements_0_0 = null;

        EObject lv_entityModelElements_1_0 = null;


         enterRule(); 
            
        try {
            // InternalEntity.g:80:28: ( ( ( (lv_entityModelElements_0_0= ruleEntityModelElement ) ) ( (lv_entityModelElements_1_0= ruleEntityModelElement ) )* )? )
            // InternalEntity.g:81:1: ( ( (lv_entityModelElements_0_0= ruleEntityModelElement ) ) ( (lv_entityModelElements_1_0= ruleEntityModelElement ) )* )?
            {
            // InternalEntity.g:81:1: ( ( (lv_entityModelElements_0_0= ruleEntityModelElement ) ) ( (lv_entityModelElements_1_0= ruleEntityModelElement ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11||LA2_0==25) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEntity.g:81:2: ( (lv_entityModelElements_0_0= ruleEntityModelElement ) ) ( (lv_entityModelElements_1_0= ruleEntityModelElement ) )*
                    {
                    // InternalEntity.g:81:2: ( (lv_entityModelElements_0_0= ruleEntityModelElement ) )
                    // InternalEntity.g:82:1: (lv_entityModelElements_0_0= ruleEntityModelElement )
                    {
                    // InternalEntity.g:82:1: (lv_entityModelElements_0_0= ruleEntityModelElement )
                    // InternalEntity.g:83:3: lv_entityModelElements_0_0= ruleEntityModelElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEntityModelAccess().getEntityModelElementsEntityModelElementParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_3);
                    lv_entityModelElements_0_0=ruleEntityModelElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEntityModelRule());
                      	        }
                             		add(
                             			current, 
                             			"entityModelElements",
                              		lv_entityModelElements_0_0, 
                              		"at.ac.tuwien.big.forms.entity.Entity.EntityModelElement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalEntity.g:99:2: ( (lv_entityModelElements_1_0= ruleEntityModelElement ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==11||LA1_0==25) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalEntity.g:100:1: (lv_entityModelElements_1_0= ruleEntityModelElement )
                    	    {
                    	    // InternalEntity.g:100:1: (lv_entityModelElements_1_0= ruleEntityModelElement )
                    	    // InternalEntity.g:101:3: lv_entityModelElements_1_0= ruleEntityModelElement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEntityModelAccess().getEntityModelElementsEntityModelElementParserRuleCall_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_3);
                    	    lv_entityModelElements_1_0=ruleEntityModelElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEntityModelRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"entityModelElements",
                    	              		lv_entityModelElements_1_0, 
                    	              		"at.ac.tuwien.big.forms.entity.Entity.EntityModelElement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


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
    // $ANTLR end "ruleEntityModel"


    // $ANTLR start "entryRuleEntityModelElement"
    // InternalEntity.g:125:1: entryRuleEntityModelElement returns [EObject current=null] : iv_ruleEntityModelElement= ruleEntityModelElement EOF ;
    public final EObject entryRuleEntityModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityModelElement = null;


        try {
            // InternalEntity.g:126:2: (iv_ruleEntityModelElement= ruleEntityModelElement EOF )
            // InternalEntity.g:127:2: iv_ruleEntityModelElement= ruleEntityModelElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntityModelElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEntityModelElement=ruleEntityModelElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntityModelElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEntityModelElement"


    // $ANTLR start "ruleEntityModelElement"
    // InternalEntity.g:134:1: ruleEntityModelElement returns [EObject current=null] : (this_Entity_0= ruleEntity | this_Enumeration_1= ruleEnumeration ) ;
    public final EObject ruleEntityModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_Enumeration_1 = null;


         enterRule(); 
            
        try {
            // InternalEntity.g:137:28: ( (this_Entity_0= ruleEntity | this_Enumeration_1= ruleEnumeration ) )
            // InternalEntity.g:138:1: (this_Entity_0= ruleEntity | this_Enumeration_1= ruleEnumeration )
            {
            // InternalEntity.g:138:1: (this_Entity_0= ruleEntity | this_Enumeration_1= ruleEnumeration )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==25) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEntity.g:139:5: this_Entity_0= ruleEntity
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEntityModelElementAccess().getEntityParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Entity_0=ruleEntity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Entity_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalEntity.g:149:5: this_Enumeration_1= ruleEnumeration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEntityModelElementAccess().getEnumerationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Enumeration_1=ruleEnumeration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Enumeration_1; 
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
    // $ANTLR end "ruleEntityModelElement"


    // $ANTLR start "entryRuleEntity"
    // InternalEntity.g:165:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalEntity.g:166:2: (iv_ruleEntity= ruleEntity EOF )
            // InternalEntity.g:167:2: iv_ruleEntity= ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntityRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntity; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalEntity.g:174:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' otherlv_5= 'id' ( ( ruleQualifiedName ) ) otherlv_7= ',' ( ( (lv_features_8_0= ruleFeature ) ) (otherlv_9= ',' ( (lv_features_10_0= ruleFeature ) ) )* )? otherlv_11= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_features_8_0 = null;

        EObject lv_features_10_0 = null;


         enterRule(); 
            
        try {
            // InternalEntity.g:177:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' otherlv_5= 'id' ( ( ruleQualifiedName ) ) otherlv_7= ',' ( ( (lv_features_8_0= ruleFeature ) ) (otherlv_9= ',' ( (lv_features_10_0= ruleFeature ) ) )* )? otherlv_11= '}' ) )
            // InternalEntity.g:178:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' otherlv_5= 'id' ( ( ruleQualifiedName ) ) otherlv_7= ',' ( ( (lv_features_8_0= ruleFeature ) ) (otherlv_9= ',' ( (lv_features_10_0= ruleFeature ) ) )* )? otherlv_11= '}' )
            {
            // InternalEntity.g:178:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' otherlv_5= 'id' ( ( ruleQualifiedName ) ) otherlv_7= ',' ( ( (lv_features_8_0= ruleFeature ) ) (otherlv_9= ',' ( (lv_features_10_0= ruleFeature ) ) )* )? otherlv_11= '}' )
            // InternalEntity.g:178:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' otherlv_5= 'id' ( ( ruleQualifiedName ) ) otherlv_7= ',' ( ( (lv_features_8_0= ruleFeature ) ) (otherlv_9= ',' ( (lv_features_10_0= ruleFeature ) ) )* )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                  
            }
            // InternalEntity.g:182:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalEntity.g:183:1: (lv_name_1_0= RULE_ID )
            {
            // InternalEntity.g:183:1: (lv_name_1_0= RULE_ID )
            // InternalEntity.g:184:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEntityRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalEntity.g:200:2: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEntity.g:200:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                          
                    }
                    // InternalEntity.g:204:1: ( ( ruleQualifiedName ) )
                    // InternalEntity.g:205:1: ( ruleQualifiedName )
                    {
                    // InternalEntity.g:205:1: ( ruleQualifiedName )
                    // InternalEntity.g:206:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEntityRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getIdKeyword_4());
                  
            }
            // InternalEntity.g:227:1: ( ( ruleQualifiedName ) )
            // InternalEntity.g:228:1: ( ruleQualifiedName )
            {
            // InternalEntity.g:228:1: ( ruleQualifiedName )
            // InternalEntity.g:229:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEntityRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEntityAccess().getIdAttributeCrossReference_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_8);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getCommaKeyword_6());
                  
            }
            // InternalEntity.g:246:1: ( ( (lv_features_8_0= ruleFeature ) ) (otherlv_9= ',' ( (lv_features_10_0= ruleFeature ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17||LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEntity.g:246:2: ( (lv_features_8_0= ruleFeature ) ) (otherlv_9= ',' ( (lv_features_10_0= ruleFeature ) ) )*
                    {
                    // InternalEntity.g:246:2: ( (lv_features_8_0= ruleFeature ) )
                    // InternalEntity.g:247:1: (lv_features_8_0= ruleFeature )
                    {
                    // InternalEntity.g:247:1: (lv_features_8_0= ruleFeature )
                    // InternalEntity.g:248:3: lv_features_8_0= ruleFeature
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_7_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_10);
                    lv_features_8_0=ruleFeature();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEntityRule());
                      	        }
                             		add(
                             			current, 
                             			"features",
                              		lv_features_8_0, 
                              		"at.ac.tuwien.big.forms.entity.Entity.Feature");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalEntity.g:264:2: (otherlv_9= ',' ( (lv_features_10_0= ruleFeature ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalEntity.g:264:4: otherlv_9= ',' ( (lv_features_10_0= ruleFeature ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getCommaKeyword_7_1_0());
                    	          
                    	    }
                    	    // InternalEntity.g:268:1: ( (lv_features_10_0= ruleFeature ) )
                    	    // InternalEntity.g:269:1: (lv_features_10_0= ruleFeature )
                    	    {
                    	    // InternalEntity.g:269:1: (lv_features_10_0= ruleFeature )
                    	    // InternalEntity.g:270:3: lv_features_10_0= ruleFeature
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_7_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_10);
                    	    lv_features_10_0=ruleFeature();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"features",
                    	              		lv_features_10_0, 
                    	              		"at.ac.tuwien.big.forms.entity.Entity.Feature");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8());
                  
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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // InternalEntity.g:298:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalEntity.g:299:2: (iv_ruleFeature= ruleFeature EOF )
            // InternalEntity.g:300:2: iv_ruleFeature= ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeature; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalEntity.g:307:1: ruleFeature returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Relationship_1= ruleRelationship ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Relationship_1 = null;


         enterRule(); 
            
        try {
            // InternalEntity.g:310:28: ( (this_Attribute_0= ruleAttribute | this_Relationship_1= ruleRelationship ) )
            // InternalEntity.g:311:1: (this_Attribute_0= ruleAttribute | this_Relationship_1= ruleRelationship )
            {
            // InternalEntity.g:311:1: (this_Attribute_0= ruleAttribute | this_Relationship_1= ruleRelationship )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalEntity.g:312:5: this_Attribute_0= ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getAttributeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Attribute_0=ruleAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Attribute_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalEntity.g:322:5: this_Relationship_1= ruleRelationship
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getRelationshipParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Relationship_1=ruleRelationship();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Relationship_1; 
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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleRelationship"
    // InternalEntity.g:338:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalEntity.g:339:2: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalEntity.g:340:2: iv_ruleRelationship= ruleRelationship EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationshipRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationship; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalEntity.g:347:1: ruleRelationship returns [EObject current=null] : (otherlv_0= 'reference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' (otherlv_9= 'opposite-of' ( ( ruleQualifiedName ) ) )? ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_lowerBound_5_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_7_0 = null;


         enterRule(); 
            
        try {
            // InternalEntity.g:350:28: ( (otherlv_0= 'reference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' (otherlv_9= 'opposite-of' ( ( ruleQualifiedName ) ) )? ) )
            // InternalEntity.g:351:1: (otherlv_0= 'reference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' (otherlv_9= 'opposite-of' ( ( ruleQualifiedName ) ) )? )
            {
            // InternalEntity.g:351:1: (otherlv_0= 'reference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' (otherlv_9= 'opposite-of' ( ( ruleQualifiedName ) ) )? )
            // InternalEntity.g:351:3: otherlv_0= 'reference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' (otherlv_9= 'opposite-of' ( ( ruleQualifiedName ) ) )?
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRelationshipAccess().getReferenceKeyword_0());
                  
            }
            // InternalEntity.g:355:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalEntity.g:356:1: (lv_name_1_0= RULE_ID )
            {
            // InternalEntity.g:356:1: (lv_name_1_0= RULE_ID )
            // InternalEntity.g:357:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getRelationshipAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRelationshipRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRelationshipAccess().getColonKeyword_2());
                  
            }
            // InternalEntity.g:377:1: ( ( ruleQualifiedName ) )
            // InternalEntity.g:378:1: ( ruleQualifiedName )
            {
            // InternalEntity.g:378:1: ( ruleQualifiedName )
            // InternalEntity.g:379:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getRelationshipRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationshipAccess().getTargetEntityCrossReference_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_13);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRelationshipAccess().getLeftSquareBracketKeyword_4());
                  
            }
            // InternalEntity.g:396:1: ( (lv_lowerBound_5_0= ruleEInt ) )
            // InternalEntity.g:397:1: (lv_lowerBound_5_0= ruleEInt )
            {
            // InternalEntity.g:397:1: (lv_lowerBound_5_0= ruleEInt )
            // InternalEntity.g:398:3: lv_lowerBound_5_0= ruleEInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationshipAccess().getLowerBoundEIntParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_lowerBound_5_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
              	        }
                     		set(
                     			current, 
                     			"lowerBound",
                      		lv_lowerBound_5_0, 
                      		"at.ac.tuwien.big.forms.entity.Entity.EInt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getRelationshipAccess().getFullStopFullStopKeyword_6());
                  
            }
            // InternalEntity.g:418:1: ( (lv_upperBound_7_0= ruleEInt ) )
            // InternalEntity.g:419:1: (lv_upperBound_7_0= ruleEInt )
            {
            // InternalEntity.g:419:1: (lv_upperBound_7_0= ruleEInt )
            // InternalEntity.g:420:3: lv_upperBound_7_0= ruleEInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationshipAccess().getUpperBoundEIntParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_16);
            lv_upperBound_7_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
              	        }
                     		set(
                     			current, 
                     			"upperBound",
                      		lv_upperBound_7_0, 
                      		"at.ac.tuwien.big.forms.entity.Entity.EInt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getRelationshipAccess().getRightSquareBracketKeyword_8());
                  
            }
            // InternalEntity.g:440:1: (otherlv_9= 'opposite-of' ( ( ruleQualifiedName ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEntity.g:440:3: otherlv_9= 'opposite-of' ( ( ruleQualifiedName ) )
                    {
                    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getRelationshipAccess().getOppositeOfKeyword_9_0());
                          
                    }
                    // InternalEntity.g:444:1: ( ( ruleQualifiedName ) )
                    // InternalEntity.g:445:1: ( ruleQualifiedName )
                    {
                    // InternalEntity.g:445:1: ( ruleQualifiedName )
                    // InternalEntity.g:446:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getRelationshipRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelationshipAccess().getOppositeRelationshipCrossReference_9_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
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
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleAttribute"
    // InternalEntity.g:467:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalEntity.g:468:2: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalEntity.g:469:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalEntity.g:476:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_mandatory_2_0= '*' ) )? otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= ':' ( ( ruleQualifiedName ) ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_mandatory_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // InternalEntity.g:479:28: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_mandatory_2_0= '*' ) )? otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= ':' ( ( ruleQualifiedName ) ) )? ) )
            // InternalEntity.g:480:1: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_mandatory_2_0= '*' ) )? otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= ':' ( ( ruleQualifiedName ) ) )? )
            {
            // InternalEntity.g:480:1: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_mandatory_2_0= '*' ) )? otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= ':' ( ( ruleQualifiedName ) ) )? )
            // InternalEntity.g:480:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_mandatory_2_0= '*' ) )? otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= ':' ( ( ruleQualifiedName ) ) )?
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                  
            }
            // InternalEntity.g:484:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalEntity.g:485:1: (lv_name_1_0= RULE_ID )
            {
            // InternalEntity.g:485:1: (lv_name_1_0= RULE_ID )
            // InternalEntity.g:486:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalEntity.g:502:2: ( (lv_mandatory_2_0= '*' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEntity.g:503:1: (lv_mandatory_2_0= '*' )
                    {
                    // InternalEntity.g:503:1: (lv_mandatory_2_0= '*' )
                    // InternalEntity.g:504:3: lv_mandatory_2_0= '*'
                    {
                    lv_mandatory_2_0=(Token)match(input,24,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_mandatory_2_0, grammarAccess.getAttributeAccess().getMandatoryAsteriskKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAttributeRule());
                      	        }
                             		setWithLastConsumed(current, "mandatory", true, "*");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getColonKeyword_3());
                  
            }
            // InternalEntity.g:521:1: ( (lv_type_4_0= ruleAttributeType ) )
            // InternalEntity.g:522:1: (lv_type_4_0= ruleAttributeType )
            {
            // InternalEntity.g:522:1: (lv_type_4_0= ruleAttributeType )
            // InternalEntity.g:523:3: lv_type_4_0= ruleAttributeType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeTypeEnumRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_20);
            lv_type_4_0=ruleAttributeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_4_0, 
                      		"at.ac.tuwien.big.forms.entity.Entity.AttributeType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalEntity.g:539:2: (otherlv_5= ':' ( ( ruleQualifiedName ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalEntity.g:539:4: otherlv_5= ':' ( ( ruleQualifiedName ) )
                    {
                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getColonKeyword_5_0());
                          
                    }
                    // InternalEntity.g:543:1: ( ( ruleQualifiedName ) )
                    // InternalEntity.g:544:1: ( ruleQualifiedName )
                    {
                    // InternalEntity.g:544:1: ( ruleQualifiedName )
                    // InternalEntity.g:545:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAttributeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeAccess().getEnumerationEnumerationCrossReference_5_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEnumeration"
    // InternalEntity.g:566:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalEntity.g:567:2: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalEntity.g:568:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumeration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalEntity.g:575:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleLiteral ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_literals_3_0 = null;

        EObject lv_literals_5_0 = null;


         enterRule(); 
            
        try {
            // InternalEntity.g:578:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleLiteral ) ) )* otherlv_6= '}' ) )
            // InternalEntity.g:579:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleLiteral ) ) )* otherlv_6= '}' )
            {
            // InternalEntity.g:579:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleLiteral ) ) )* otherlv_6= '}' )
            // InternalEntity.g:579:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleLiteral ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumKeyword_0());
                  
            }
            // InternalEntity.g:583:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalEntity.g:584:1: (lv_name_1_0= RULE_ID )
            {
            // InternalEntity.g:584:1: (lv_name_1_0= RULE_ID )
            // InternalEntity.g:585:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumerationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalEntity.g:605:1: ( (lv_literals_3_0= ruleLiteral ) )
            // InternalEntity.g:606:1: (lv_literals_3_0= ruleLiteral )
            {
            // InternalEntity.g:606:1: (lv_literals_3_0= ruleLiteral )
            // InternalEntity.g:607:3: lv_literals_3_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnumerationAccess().getLiteralsLiteralParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_10);
            lv_literals_3_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEnumerationRule());
              	        }
                     		add(
                     			current, 
                     			"literals",
                      		lv_literals_3_0, 
                      		"at.ac.tuwien.big.forms.entity.Entity.Literal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalEntity.g:623:2: (otherlv_4= ',' ( (lv_literals_5_0= ruleLiteral ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalEntity.g:623:4: otherlv_4= ',' ( (lv_literals_5_0= ruleLiteral ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // InternalEntity.g:627:1: ( (lv_literals_5_0= ruleLiteral ) )
            	    // InternalEntity.g:628:1: (lv_literals_5_0= ruleLiteral )
            	    {
            	    // InternalEntity.g:628:1: (lv_literals_5_0= ruleLiteral )
            	    // InternalEntity.g:629:3: lv_literals_5_0= ruleLiteral
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumerationAccess().getLiteralsLiteralParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    lv_literals_5_0=ruleLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"literals",
            	              		lv_literals_5_0, 
            	              		"at.ac.tuwien.big.forms.entity.Entity.Literal");
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

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleLiteral"
    // InternalEntity.g:657:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalEntity.g:658:2: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalEntity.g:659:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalEntity.g:666:1: ruleLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // InternalEntity.g:669:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalEntity.g:670:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalEntity.g:670:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalEntity.g:670:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalEntity.g:670:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalEntity.g:671:1: (lv_name_0_0= RULE_ID )
            {
            // InternalEntity.g:671:1: (lv_name_0_0= RULE_ID )
            // InternalEntity.g:672:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLiteralAccess().getEqualsSignKeyword_1());
                  
            }
            // InternalEntity.g:692:1: ( (lv_value_2_0= RULE_STRING ) )
            // InternalEntity.g:693:1: (lv_value_2_0= RULE_STRING )
            {
            // InternalEntity.g:693:1: (lv_value_2_0= RULE_STRING )
            // InternalEntity.g:694:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getLiteralAccess().getValueSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleEInt"
    // InternalEntity.g:718:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalEntity.g:719:2: (iv_ruleEInt= ruleEInt EOF )
            // InternalEntity.g:720:2: iv_ruleEInt= ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEIntRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEInt.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalEntity.g:727:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // InternalEntity.g:730:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalEntity.g:731:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalEntity.g:731:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalEntity.g:731:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalEntity.g:731:2: (kw= '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEntity.g:732:2: kw= '-'
                    {
                    kw=(Token)match(input,27,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                  
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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalEntity.g:752:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalEntity.g:753:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalEntity.g:754:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalEntity.g:761:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalEntity.g:764:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // InternalEntity.g:765:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // InternalEntity.g:765:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // InternalEntity.g:765:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalEntity.g:772:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) && (synpred1_InternalEntity())) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalEntity.g:772:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // InternalEntity.g:772:2: ( ( '.' )=>kw= '.' )
            	    // InternalEntity.g:772:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleAttributeType"
    // InternalEntity.g:795:1: ruleAttributeType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Text' ) | (enumLiteral_3= 'Date' ) | (enumLiteral_4= 'Time' ) | (enumLiteral_5= 'Email' ) | (enumLiteral_6= 'Boolean' ) | (enumLiteral_7= 'Year' ) | (enumLiteral_8= 'None' ) ) ;
    public final Enumerator ruleAttributeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;

         enterRule(); 
        try {
            // InternalEntity.g:797:28: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Text' ) | (enumLiteral_3= 'Date' ) | (enumLiteral_4= 'Time' ) | (enumLiteral_5= 'Email' ) | (enumLiteral_6= 'Boolean' ) | (enumLiteral_7= 'Year' ) | (enumLiteral_8= 'None' ) ) )
            // InternalEntity.g:798:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Text' ) | (enumLiteral_3= 'Date' ) | (enumLiteral_4= 'Time' ) | (enumLiteral_5= 'Email' ) | (enumLiteral_6= 'Boolean' ) | (enumLiteral_7= 'Year' ) | (enumLiteral_8= 'None' ) )
            {
            // InternalEntity.g:798:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Text' ) | (enumLiteral_3= 'Date' ) | (enumLiteral_4= 'Time' ) | (enumLiteral_5= 'Email' ) | (enumLiteral_6= 'Boolean' ) | (enumLiteral_7= 'Year' ) | (enumLiteral_8= 'None' ) )
            int alt14=9;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt14=1;
                }
                break;
            case 30:
                {
                alt14=2;
                }
                break;
            case 31:
                {
                alt14=3;
                }
                break;
            case 32:
                {
                alt14=4;
                }
                break;
            case 33:
                {
                alt14=5;
                }
                break;
            case 34:
                {
                alt14=6;
                }
                break;
            case 35:
                {
                alt14=7;
                }
                break;
            case 36:
                {
                alt14=8;
                }
                break;
            case 37:
                {
                alt14=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalEntity.g:798:2: (enumLiteral_0= 'String' )
                    {
                    // InternalEntity.g:798:2: (enumLiteral_0= 'String' )
                    // InternalEntity.g:798:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEntity.g:804:6: (enumLiteral_1= 'Integer' )
                    {
                    // InternalEntity.g:804:6: (enumLiteral_1= 'Integer' )
                    // InternalEntity.g:804:8: enumLiteral_1= 'Integer'
                    {
                    enumLiteral_1=(Token)match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEntity.g:810:6: (enumLiteral_2= 'Text' )
                    {
                    // InternalEntity.g:810:6: (enumLiteral_2= 'Text' )
                    // InternalEntity.g:810:8: enumLiteral_2= 'Text'
                    {
                    enumLiteral_2=(Token)match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getTextEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAttributeTypeAccess().getTextEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEntity.g:816:6: (enumLiteral_3= 'Date' )
                    {
                    // InternalEntity.g:816:6: (enumLiteral_3= 'Date' )
                    // InternalEntity.g:816:8: enumLiteral_3= 'Date'
                    {
                    enumLiteral_3=(Token)match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getDateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAttributeTypeAccess().getDateEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalEntity.g:822:6: (enumLiteral_4= 'Time' )
                    {
                    // InternalEntity.g:822:6: (enumLiteral_4= 'Time' )
                    // InternalEntity.g:822:8: enumLiteral_4= 'Time'
                    {
                    enumLiteral_4=(Token)match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getTimeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAttributeTypeAccess().getTimeEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalEntity.g:828:6: (enumLiteral_5= 'Email' )
                    {
                    // InternalEntity.g:828:6: (enumLiteral_5= 'Email' )
                    // InternalEntity.g:828:8: enumLiteral_5= 'Email'
                    {
                    enumLiteral_5=(Token)match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getEmailEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAttributeTypeAccess().getEmailEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalEntity.g:834:6: (enumLiteral_6= 'Boolean' )
                    {
                    // InternalEntity.g:834:6: (enumLiteral_6= 'Boolean' )
                    // InternalEntity.g:834:8: enumLiteral_6= 'Boolean'
                    {
                    enumLiteral_6=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalEntity.g:840:6: (enumLiteral_7= 'Year' )
                    {
                    // InternalEntity.g:840:6: (enumLiteral_7= 'Year' )
                    // InternalEntity.g:840:8: enumLiteral_7= 'Year'
                    {
                    enumLiteral_7=(Token)match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getYearEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAttributeTypeAccess().getYearEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalEntity.g:846:6: (enumLiteral_8= 'None' )
                    {
                    // InternalEntity.g:846:6: (enumLiteral_8= 'None' )
                    // InternalEntity.g:846:8: enumLiteral_8= 'None'
                    {
                    enumLiteral_8=(Token)match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getNoneEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAttributeTypeAccess().getNoneEnumLiteralDeclaration_8()); 
                          
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
    // $ANTLR end "ruleAttributeType"

    // $ANTLR start synpred1_InternalEntity
    public final void synpred1_InternalEntity_fragment() throws RecognitionException {   
        // InternalEntity.g:772:3: ( '.' )
        // InternalEntity.g:773:2: '.'
        {
        match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalEntity

    // Delegated rules

    public final boolean synpred1_InternalEntity() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalEntity_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002000802L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000830000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001040000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000003FE0000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000002L});
    }


}