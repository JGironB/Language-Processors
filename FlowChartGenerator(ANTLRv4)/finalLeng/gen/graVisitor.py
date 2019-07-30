# Generated from C:/Users/juamp/Desktop/finalLengV2/finalLeng\gra.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .graParser import graParser
else:
    from graParser import graParser

# This class defines a complete generic visitor for a parse tree produced by graParser.

class graVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by graParser#translationunit.
    def visitTranslationunit(self, ctx:graParser.TranslationunitContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#primaryexpression.
    def visitPrimaryexpression(self, ctx:graParser.PrimaryexpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#idexpression.
    def visitIdexpression(self, ctx:graParser.IdexpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#unqualifiedid.
    def visitUnqualifiedid(self, ctx:graParser.UnqualifiedidContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#qualifiedid.
    def visitQualifiedid(self, ctx:graParser.QualifiedidContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#nestednamespecifier.
    def visitNestednamespecifier(self, ctx:graParser.NestednamespecifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#lambdaexpression.
    def visitLambdaexpression(self, ctx:graParser.LambdaexpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#lambdaintroducer.
    def visitLambdaintroducer(self, ctx:graParser.LambdaintroducerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#lambdacapture.
    def visitLambdacapture(self, ctx:graParser.LambdacaptureContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#capturedefault.
    def visitCapturedefault(self, ctx:graParser.CapturedefaultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#capturelist.
    def visitCapturelist(self, ctx:graParser.CapturelistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#capture.
    def visitCapture(self, ctx:graParser.CaptureContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#simplecapture.
    def visitSimplecapture(self, ctx:graParser.SimplecaptureContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#initcapture.
    def visitInitcapture(self, ctx:graParser.InitcaptureContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#lambdadeclarator.
    def visitLambdadeclarator(self, ctx:graParser.LambdadeclaratorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#postfixexpression.
    def visitPostfixexpression(self, ctx:graParser.PostfixexpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#typeidofexpr.
    def visitTypeidofexpr(self, ctx:graParser.TypeidofexprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#typeidofthetypeid.
    def visitTypeidofthetypeid(self, ctx:graParser.TypeidofthetypeidContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#expressionlist.
    def visitExpressionlist(self, ctx:graParser.ExpressionlistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#pseudodestructorname.
    def visitPseudodestructorname(self, ctx:graParser.PseudodestructornameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#unaryexpression.
    def visitUnaryexpression(self, ctx:graParser.UnaryexpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#unaryoperator.
    def visitUnaryoperator(self, ctx:graParser.UnaryoperatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#newexpression.
    def visitNewexpression(self, ctx:graParser.NewexpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#newplacement.
    def visitNewplacement(self, ctx:graParser.NewplacementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#newtypeid.
    def visitNewtypeid(self, ctx:graParser.NewtypeidContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#newdeclarator.
    def visitNewdeclarator(self, ctx:graParser.NewdeclaratorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#noptrnewdeclarator.
    def visitNoptrnewdeclarator(self, ctx:graParser.NoptrnewdeclaratorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#newinitializer.
    def visitNewinitializer(self, ctx:graParser.NewinitializerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#deleteexpression.
    def visitDeleteexpression(self, ctx:graParser.DeleteexpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#noexceptexpression.
    def visitNoexceptexpression(self, ctx:graParser.NoexceptexpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#castexpression.
    def visitCastexpression(self, ctx:graParser.CastexpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#pmexpression.
    def visitPmexpression(self, ctx:graParser.PmexpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#multiplicativeexpression.
    def visitMultiplicativeexpression(self, ctx:graParser.MultiplicativeexpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#additiveexpression.
    def visitAdditiveexpression(self, ctx:graParser.AdditiveexpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#shiftexpression.
    def visitShiftexpression(self, ctx:graParser.ShiftexpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#shiftoperator.
    def visitShiftoperator(self, ctx:graParser.ShiftoperatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#relationalexpression.
    def visitRelationalexpression(self, ctx:graParser.RelationalexpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#equalityexpression.
    def visitEqualityexpression(self, ctx:graParser.EqualityexpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#andexpression.
    def visitAndexpression(self, ctx:graParser.AndexpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#exclusiveorexpression.
    def visitExclusiveorexpression(self, ctx:graParser.ExclusiveorexpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#inclusiveorexpression.
    def visitInclusiveorexpression(self, ctx:graParser.InclusiveorexpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#logicalandexpression.
    def visitLogicalandexpression(self, ctx:graParser.LogicalandexpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#logicalorexpression.
    def visitLogicalorexpression(self, ctx:graParser.LogicalorexpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#conditionalexpression.
    def visitConditionalexpression(self, ctx:graParser.ConditionalexpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#assignmentexpression.
    def visitAssignmentexpression(self, ctx:graParser.AssignmentexpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#assignmentoperator.
    def visitAssignmentoperator(self, ctx:graParser.AssignmentoperatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#expression.
    def visitExpression(self, ctx:graParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#constantexpression.
    def visitConstantexpression(self, ctx:graParser.ConstantexpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#statement.
    def visitStatement(self, ctx:graParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#labeledstatement.
    def visitLabeledstatement(self, ctx:graParser.LabeledstatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#expressionstatement.
    def visitExpressionstatement(self, ctx:graParser.ExpressionstatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#compoundstatement.
    def visitCompoundstatement(self, ctx:graParser.CompoundstatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#statementseq.
    def visitStatementseq(self, ctx:graParser.StatementseqContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#selectionstatement.
    def visitSelectionstatement(self, ctx:graParser.SelectionstatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#condition.
    def visitCondition(self, ctx:graParser.ConditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#iterationstatement.
    def visitIterationstatement(self, ctx:graParser.IterationstatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#forinitstatement.
    def visitForinitstatement(self, ctx:graParser.ForinitstatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#forrangedeclaration.
    def visitForrangedeclaration(self, ctx:graParser.ForrangedeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#forrangeinitializer.
    def visitForrangeinitializer(self, ctx:graParser.ForrangeinitializerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#jumpstatement.
    def visitJumpstatement(self, ctx:graParser.JumpstatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#declarationstatement.
    def visitDeclarationstatement(self, ctx:graParser.DeclarationstatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#declarationseq.
    def visitDeclarationseq(self, ctx:graParser.DeclarationseqContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#declaration.
    def visitDeclaration(self, ctx:graParser.DeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#blockdeclaration.
    def visitBlockdeclaration(self, ctx:graParser.BlockdeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#aliasdeclaration.
    def visitAliasdeclaration(self, ctx:graParser.AliasdeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#simpledeclaration.
    def visitSimpledeclaration(self, ctx:graParser.SimpledeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#static_assertdeclaration.
    def visitStatic_assertdeclaration(self, ctx:graParser.Static_assertdeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#emptydeclaration.
    def visitEmptydeclaration(self, ctx:graParser.EmptydeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#attributedeclaration.
    def visitAttributedeclaration(self, ctx:graParser.AttributedeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#declspecifier.
    def visitDeclspecifier(self, ctx:graParser.DeclspecifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#declspecifierseq.
    def visitDeclspecifierseq(self, ctx:graParser.DeclspecifierseqContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#storageclassspecifier.
    def visitStorageclassspecifier(self, ctx:graParser.StorageclassspecifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#functionspecifier.
    def visitFunctionspecifier(self, ctx:graParser.FunctionspecifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#typedefname.
    def visitTypedefname(self, ctx:graParser.TypedefnameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#typespecifier.
    def visitTypespecifier(self, ctx:graParser.TypespecifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#trailingtypespecifier.
    def visitTrailingtypespecifier(self, ctx:graParser.TrailingtypespecifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#typespecifierseq.
    def visitTypespecifierseq(self, ctx:graParser.TypespecifierseqContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#trailingtypespecifierseq.
    def visitTrailingtypespecifierseq(self, ctx:graParser.TrailingtypespecifierseqContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#simpletypespecifier.
    def visitSimpletypespecifier(self, ctx:graParser.SimpletypespecifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#thetypename.
    def visitThetypename(self, ctx:graParser.ThetypenameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#decltypespecifier.
    def visitDecltypespecifier(self, ctx:graParser.DecltypespecifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#elaboratedtypespecifier.
    def visitElaboratedtypespecifier(self, ctx:graParser.ElaboratedtypespecifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#enumname.
    def visitEnumname(self, ctx:graParser.EnumnameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#enumspecifier.
    def visitEnumspecifier(self, ctx:graParser.EnumspecifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#enumhead.
    def visitEnumhead(self, ctx:graParser.EnumheadContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#opaqueenumdeclaration.
    def visitOpaqueenumdeclaration(self, ctx:graParser.OpaqueenumdeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#enumkey.
    def visitEnumkey(self, ctx:graParser.EnumkeyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#enumbase.
    def visitEnumbase(self, ctx:graParser.EnumbaseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#enumeratorlist.
    def visitEnumeratorlist(self, ctx:graParser.EnumeratorlistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#enumeratordefinition.
    def visitEnumeratordefinition(self, ctx:graParser.EnumeratordefinitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#enumerator.
    def visitEnumerator(self, ctx:graParser.EnumeratorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#namespacename.
    def visitNamespacename(self, ctx:graParser.NamespacenameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#originalnamespacename.
    def visitOriginalnamespacename(self, ctx:graParser.OriginalnamespacenameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#namespacedefinition.
    def visitNamespacedefinition(self, ctx:graParser.NamespacedefinitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#namednamespacedefinition.
    def visitNamednamespacedefinition(self, ctx:graParser.NamednamespacedefinitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#originalnamespacedefinition.
    def visitOriginalnamespacedefinition(self, ctx:graParser.OriginalnamespacedefinitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#extensionnamespacedefinition.
    def visitExtensionnamespacedefinition(self, ctx:graParser.ExtensionnamespacedefinitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#unnamednamespacedefinition.
    def visitUnnamednamespacedefinition(self, ctx:graParser.UnnamednamespacedefinitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#namespacebody.
    def visitNamespacebody(self, ctx:graParser.NamespacebodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#namespacealias.
    def visitNamespacealias(self, ctx:graParser.NamespacealiasContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#namespacealiasdefinition.
    def visitNamespacealiasdefinition(self, ctx:graParser.NamespacealiasdefinitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#qualifiednamespacespecifier.
    def visitQualifiednamespacespecifier(self, ctx:graParser.QualifiednamespacespecifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#usingdeclaration.
    def visitUsingdeclaration(self, ctx:graParser.UsingdeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#usingdirective.
    def visitUsingdirective(self, ctx:graParser.UsingdirectiveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#asmdefinition.
    def visitAsmdefinition(self, ctx:graParser.AsmdefinitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#linkagespecification.
    def visitLinkagespecification(self, ctx:graParser.LinkagespecificationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#attributespecifierseq.
    def visitAttributespecifierseq(self, ctx:graParser.AttributespecifierseqContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#attributespecifier.
    def visitAttributespecifier(self, ctx:graParser.AttributespecifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#alignmentspecifier.
    def visitAlignmentspecifier(self, ctx:graParser.AlignmentspecifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#attributelist.
    def visitAttributelist(self, ctx:graParser.AttributelistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#attribute.
    def visitAttribute(self, ctx:graParser.AttributeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#attributetoken.
    def visitAttributetoken(self, ctx:graParser.AttributetokenContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#attributescopedtoken.
    def visitAttributescopedtoken(self, ctx:graParser.AttributescopedtokenContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#attributenamespace.
    def visitAttributenamespace(self, ctx:graParser.AttributenamespaceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#attributeargumentclause.
    def visitAttributeargumentclause(self, ctx:graParser.AttributeargumentclauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#balancedtokenseq.
    def visitBalancedtokenseq(self, ctx:graParser.BalancedtokenseqContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#balancedtoken.
    def visitBalancedtoken(self, ctx:graParser.BalancedtokenContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#initdeclaratorlist.
    def visitInitdeclaratorlist(self, ctx:graParser.InitdeclaratorlistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#initdeclarator.
    def visitInitdeclarator(self, ctx:graParser.InitdeclaratorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#declarator.
    def visitDeclarator(self, ctx:graParser.DeclaratorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#ptrdeclarator.
    def visitPtrdeclarator(self, ctx:graParser.PtrdeclaratorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#noptrdeclarator.
    def visitNoptrdeclarator(self, ctx:graParser.NoptrdeclaratorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#parametersandqualifiers.
    def visitParametersandqualifiers(self, ctx:graParser.ParametersandqualifiersContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#trailingreturntype.
    def visitTrailingreturntype(self, ctx:graParser.TrailingreturntypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#ptroperator.
    def visitPtroperator(self, ctx:graParser.PtroperatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#cvqualifierseq.
    def visitCvqualifierseq(self, ctx:graParser.CvqualifierseqContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#cvqualifier.
    def visitCvqualifier(self, ctx:graParser.CvqualifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#refqualifier.
    def visitRefqualifier(self, ctx:graParser.RefqualifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#declaratorid.
    def visitDeclaratorid(self, ctx:graParser.DeclaratoridContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#thetypeid.
    def visitThetypeid(self, ctx:graParser.ThetypeidContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#abstractdeclarator.
    def visitAbstractdeclarator(self, ctx:graParser.AbstractdeclaratorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#ptrabstractdeclarator.
    def visitPtrabstractdeclarator(self, ctx:graParser.PtrabstractdeclaratorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#noptrabstractdeclarator.
    def visitNoptrabstractdeclarator(self, ctx:graParser.NoptrabstractdeclaratorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#abstractpackdeclarator.
    def visitAbstractpackdeclarator(self, ctx:graParser.AbstractpackdeclaratorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#noptrabstractpackdeclarator.
    def visitNoptrabstractpackdeclarator(self, ctx:graParser.NoptrabstractpackdeclaratorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#parameterdeclarationclause.
    def visitParameterdeclarationclause(self, ctx:graParser.ParameterdeclarationclauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#parameterdeclarationlist.
    def visitParameterdeclarationlist(self, ctx:graParser.ParameterdeclarationlistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#parameterdeclaration.
    def visitParameterdeclaration(self, ctx:graParser.ParameterdeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#functiondefinition.
    def visitFunctiondefinition(self, ctx:graParser.FunctiondefinitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#functionbody.
    def visitFunctionbody(self, ctx:graParser.FunctionbodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#initializer.
    def visitInitializer(self, ctx:graParser.InitializerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#braceorequalinitializer.
    def visitBraceorequalinitializer(self, ctx:graParser.BraceorequalinitializerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#initializerclause.
    def visitInitializerclause(self, ctx:graParser.InitializerclauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#initializerlist.
    def visitInitializerlist(self, ctx:graParser.InitializerlistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#bracedinitlist.
    def visitBracedinitlist(self, ctx:graParser.BracedinitlistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#classname.
    def visitClassname(self, ctx:graParser.ClassnameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#classspecifier.
    def visitClassspecifier(self, ctx:graParser.ClassspecifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#classhead.
    def visitClasshead(self, ctx:graParser.ClassheadContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#classheadname.
    def visitClassheadname(self, ctx:graParser.ClassheadnameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#classvirtspecifier.
    def visitClassvirtspecifier(self, ctx:graParser.ClassvirtspecifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#classkey.
    def visitClasskey(self, ctx:graParser.ClasskeyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#memberspecification.
    def visitMemberspecification(self, ctx:graParser.MemberspecificationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#memberdeclaration.
    def visitMemberdeclaration(self, ctx:graParser.MemberdeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#memberdeclaratorlist.
    def visitMemberdeclaratorlist(self, ctx:graParser.MemberdeclaratorlistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#memberdeclarator.
    def visitMemberdeclarator(self, ctx:graParser.MemberdeclaratorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#virtspecifierseq.
    def visitVirtspecifierseq(self, ctx:graParser.VirtspecifierseqContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#virtspecifier.
    def visitVirtspecifier(self, ctx:graParser.VirtspecifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#purespecifier.
    def visitPurespecifier(self, ctx:graParser.PurespecifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#baseclause.
    def visitBaseclause(self, ctx:graParser.BaseclauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#basespecifierlist.
    def visitBasespecifierlist(self, ctx:graParser.BasespecifierlistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#basespecifier.
    def visitBasespecifier(self, ctx:graParser.BasespecifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#classordecltype.
    def visitClassordecltype(self, ctx:graParser.ClassordecltypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#basetypespecifier.
    def visitBasetypespecifier(self, ctx:graParser.BasetypespecifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#accessspecifier.
    def visitAccessspecifier(self, ctx:graParser.AccessspecifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#conversionfunctionid.
    def visitConversionfunctionid(self, ctx:graParser.ConversionfunctionidContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#conversiontypeid.
    def visitConversiontypeid(self, ctx:graParser.ConversiontypeidContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#conversiondeclarator.
    def visitConversiondeclarator(self, ctx:graParser.ConversiondeclaratorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#ctorinitializer.
    def visitCtorinitializer(self, ctx:graParser.CtorinitializerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#meminitializerlist.
    def visitMeminitializerlist(self, ctx:graParser.MeminitializerlistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#meminitializer.
    def visitMeminitializer(self, ctx:graParser.MeminitializerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#meminitializerid.
    def visitMeminitializerid(self, ctx:graParser.MeminitializeridContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#operatorfunctionid.
    def visitOperatorfunctionid(self, ctx:graParser.OperatorfunctionidContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#literaloperatorid.
    def visitLiteraloperatorid(self, ctx:graParser.LiteraloperatoridContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#templatedeclaration.
    def visitTemplatedeclaration(self, ctx:graParser.TemplatedeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#templateparameterlist.
    def visitTemplateparameterlist(self, ctx:graParser.TemplateparameterlistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#templateparameter.
    def visitTemplateparameter(self, ctx:graParser.TemplateparameterContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#typeparameter.
    def visitTypeparameter(self, ctx:graParser.TypeparameterContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#simpletemplateid.
    def visitSimpletemplateid(self, ctx:graParser.SimpletemplateidContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#templateid.
    def visitTemplateid(self, ctx:graParser.TemplateidContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#templatename.
    def visitTemplatename(self, ctx:graParser.TemplatenameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#templateargumentlist.
    def visitTemplateargumentlist(self, ctx:graParser.TemplateargumentlistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#templateargument.
    def visitTemplateargument(self, ctx:graParser.TemplateargumentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#typenamespecifier.
    def visitTypenamespecifier(self, ctx:graParser.TypenamespecifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#explicitinstantiation.
    def visitExplicitinstantiation(self, ctx:graParser.ExplicitinstantiationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#explicitspecialization.
    def visitExplicitspecialization(self, ctx:graParser.ExplicitspecializationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#tryblock.
    def visitTryblock(self, ctx:graParser.TryblockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#functiontryblock.
    def visitFunctiontryblock(self, ctx:graParser.FunctiontryblockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#handlerseq.
    def visitHandlerseq(self, ctx:graParser.HandlerseqContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#handler.
    def visitHandler(self, ctx:graParser.HandlerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#exceptiondeclaration.
    def visitExceptiondeclaration(self, ctx:graParser.ExceptiondeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#throwexpression.
    def visitThrowexpression(self, ctx:graParser.ThrowexpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#exceptionspecification.
    def visitExceptionspecification(self, ctx:graParser.ExceptionspecificationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#dynamicexceptionspecification.
    def visitDynamicexceptionspecification(self, ctx:graParser.DynamicexceptionspecificationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#typeidlist.
    def visitTypeidlist(self, ctx:graParser.TypeidlistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#noexceptspecification.
    def visitNoexceptspecification(self, ctx:graParser.NoexceptspecificationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#theoperator.
    def visitTheoperator(self, ctx:graParser.TheoperatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#literal.
    def visitLiteral(self, ctx:graParser.LiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#booleanliteral.
    def visitBooleanliteral(self, ctx:graParser.BooleanliteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#pointerliteral.
    def visitPointerliteral(self, ctx:graParser.PointerliteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by graParser#userdefinedliteral.
    def visitUserdefinedliteral(self, ctx:graParser.UserdefinedliteralContext):
        return self.visitChildren(ctx)



del graParser