package io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hrgn

public expect fun gdipScaleTextureTransform(brush: COpaquePointer?, sx: Float, sy: Float, order: MatrixOrder): Status

public expect fun gdipScaleWorldTransform(graphics: COpaquePointer?, sx: Float, sy: Float, order: MatrixOrder): Status

public expect fun gdipSetAdjustableArrowCapFillState(cap: COpaquePointer?, fillstate: Bool): Status

public expect fun gdipSetAdjustableArrowCapHeight(cap: COpaquePointer?, height: Float): Status

public expect fun gdipSetAdjustableArrowCapMiddleInset(cap: COpaquePointer?, middleinset: Float): Status

public expect fun gdipSetAdjustableArrowCapWidth(cap: COpaquePointer?, width: Float): Status

public expect fun gdipSetClipGraphics(graphics: COpaquePointer?, srcgraphics: COpaquePointer?, combinemode: CombineMode): Status

public expect fun gdipSetClipHrgn(graphics: COpaquePointer?, hrgn: Hrgn, combinemode: CombineMode): Status

public expect fun gdipSetClipPath(graphics: COpaquePointer?, path: COpaquePointer?, combinemode: CombineMode): Status

public expect fun gdipSetClipRect(graphics: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, combinemode: CombineMode): Status

public expect fun gdipSetClipRectI(graphics: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, combinemode: CombineMode): Status

public expect fun gdipSetClipRegion(graphics: COpaquePointer?, region: COpaquePointer?, combinemode: CombineMode): Status

public expect fun gdipSetCompositingMode(graphics: COpaquePointer?, compositingmode: CompositingMode): Status

public expect fun gdipSetCompositingQuality(graphics: COpaquePointer?, compositingquality: CompositingQuality): Status

public expect fun gdipSetCustomLineCapBaseCap(customcap: COpaquePointer?, basecap: LineCap): Status

public expect fun gdipSetCustomLineCapBaseInset(customcap: COpaquePointer?, inset: Float): Status

public expect fun gdipSetCustomLineCapStrokeCaps(customcap: COpaquePointer?, startcap: LineCap, endcap: LineCap): Status

public expect fun gdipSetCustomLineCapStrokeJoin(customcap: COpaquePointer?, linejoin: LineJoin): Status

public expect fun gdipSetCustomLineCapWidthScale(customcap: COpaquePointer?, widthscale: Float): Status

public expect fun gdipSetEffectParameters(effect: COpaquePointer?, params: COpaquePointer?, size: UInt): Status

public expect fun gdipSetEmpty(region: COpaquePointer?): Status

public expect fun gdipSetImageAttributesCachedBackground(imageattr: COpaquePointer?, enableflag: Bool): Status

public expect fun gdipSetImageAttributesColorKeys(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool, colorlow: UInt, colorhigh: UInt): Status

public expect fun gdipSetImageAttributesColorMatrix(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool, colormatrix: COpaquePointer?, graymatrix: COpaquePointer?, flags: ColorMatrixFlags): Status

public expect fun gdipSetImageAttributesGamma(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool, gamma: Float): Status

public expect fun gdipSetImageAttributesNoOp(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool): Status

public expect fun gdipSetImageAttributesOutputChannel(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool, channelflags: ColorChannelFlags): Status

public expect fun gdipSetImageAttributesOutputChannelColorProfile(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool, colorprofilefilename: Pcwstr): Status

public expect fun gdipSetImageAttributesRemapTable(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool, mapsize: UInt, map: COpaquePointer?): Status

public expect fun gdipSetImageAttributesThreshold(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool, threshold: Float): Status

public expect fun gdipSetImageAttributesToIdentity(imageattr: COpaquePointer?, type: ColorAdjustType): Status

public expect fun gdipSetImageAttributesWrapMode(imageattr: COpaquePointer?, wrap: WrapMode, argb: UInt, clamp: Bool): Status

public expect fun gdipSetImagePalette(image: COpaquePointer?, palette: COpaquePointer?): Status

public expect fun gdipSetInfinite(region: COpaquePointer?): Status

public expect fun gdipSetInterpolationMode(graphics: COpaquePointer?, interpolationmode: InterpolationMode): Status

public expect fun gdipSetLineBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status

public expect fun gdipSetLineColors(brush: COpaquePointer?, color1: UInt, color2: UInt): Status

public expect fun gdipSetLineGammaCorrection(brush: COpaquePointer?, usegammacorrection: Bool): Status

public expect fun gdipSetLineLinearBlend(brush: COpaquePointer?, focus: Float, scale: Float): Status

public expect fun gdipSetLinePresetBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status

public expect fun gdipSetLineSigmaBlend(brush: COpaquePointer?, focus: Float, scale: Float): Status

public expect fun gdipSetLineTransform(brush: COpaquePointer?, matrix: COpaquePointer?): Status

public expect fun gdipSetLineWrapMode(brush: COpaquePointer?, wrapmode: WrapMode): Status

public expect fun gdipSetMatrixElements(matrix: COpaquePointer?, m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float): Status

public expect fun gdipSetMetafileDownLevelRasterizationLimit(metafile: COpaquePointer?, metafilerasterizationlimitdpi: UInt): Status

public expect fun gdipSetPageScale(graphics: COpaquePointer?, scale: Float): Status

public expect fun gdipSetPageUnit(graphics: COpaquePointer?, unit: Unit): Status

public expect fun gdipSetPathFillMode(path: COpaquePointer?, fillmode: FillMode): Status

public expect fun gdipSetPathGradientBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status

public expect fun gdipSetPathGradientCenterColor(brush: COpaquePointer?, colors: UInt): Status

public expect fun gdipSetPathGradientCenterPoint(brush: COpaquePointer?, points: COpaquePointer?): Status

public expect fun gdipSetPathGradientCenterPointI(brush: COpaquePointer?, points: COpaquePointer?): Status

public expect fun gdipSetPathGradientFocusScales(brush: COpaquePointer?, xscale: Float, yscale: Float): Status

public expect fun gdipSetPathGradientGammaCorrection(brush: COpaquePointer?, usegammacorrection: Bool): Status

public expect fun gdipSetPathGradientLinearBlend(brush: COpaquePointer?, focus: Float, scale: Float): Status

public expect fun gdipSetPathGradientPath(brush: COpaquePointer?, path: COpaquePointer?): Status

public expect fun gdipSetPathGradientPresetBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status

public expect fun gdipSetPathGradientSigmaBlend(brush: COpaquePointer?, focus: Float, scale: Float): Status

public expect fun gdipSetPathGradientSurroundColorsWithCount(brush: COpaquePointer?, color: COpaquePointer?, count: COpaquePointer?): Status

public expect fun gdipSetPathGradientTransform(brush: COpaquePointer?, matrix: COpaquePointer?): Status

public expect fun gdipSetPathGradientWrapMode(brush: COpaquePointer?, wrapmode: WrapMode): Status

public expect fun gdipSetPathMarker(path: COpaquePointer?): Status

public expect fun gdipSetPenBrushFill(pen: COpaquePointer?, brush: COpaquePointer?): Status

public expect fun gdipSetPenColor(pen: COpaquePointer?, argb: UInt): Status

public expect fun gdipSetPenCompoundArray(pen: COpaquePointer?, dash: COpaquePointer?, count: Int): Status

public expect fun gdipSetPenCustomEndCap(pen: COpaquePointer?, customcap: COpaquePointer?): Status

public expect fun gdipSetPenCustomStartCap(pen: COpaquePointer?, customcap: COpaquePointer?): Status

public expect fun gdipSetPenDashArray(pen: COpaquePointer?, dash: COpaquePointer?, count: Int): Status

public expect fun gdipSetPenDashCap197819(pen: COpaquePointer?, dashcap: DashCap): Status

public expect fun gdipSetPenDashOffset(pen: COpaquePointer?, offset: Float): Status

public expect fun gdipSetPenDashStyle(pen: COpaquePointer?, dashstyle: DashStyle): Status

public expect fun gdipSetPenEndCap(pen: COpaquePointer?, endcap: LineCap): Status

public expect fun gdipSetPenLineCap197819(pen: COpaquePointer?, startcap: LineCap, endcap: LineCap, dashcap: DashCap): Status

public expect fun gdipSetPenLineJoin(pen: COpaquePointer?, linejoin: LineJoin): Status

public expect fun gdipSetPenMiterLimit(pen: COpaquePointer?, miterlimit: Float): Status

public expect fun gdipSetPenMode(pen: COpaquePointer?, penmode: PenAlignment): Status

public expect fun gdipSetPenStartCap(pen: COpaquePointer?, startcap: LineCap): Status

public expect fun gdipSetPenTransform(pen: COpaquePointer?, matrix: COpaquePointer?): Status

public expect fun gdipSetPenUnit(pen: COpaquePointer?, unit: Unit): Status

public expect fun gdipSetPenWidth(pen: COpaquePointer?, width: Float): Status

public expect fun gdipSetPixelOffsetMode(graphics: COpaquePointer?, pixeloffsetmode: PixelOffsetMode): Status

public expect fun gdipSetPropertyItem(image: COpaquePointer?, item: COpaquePointer?): Status

public expect fun gdipSetRenderingOrigin(graphics: COpaquePointer?, x: Int, y: Int): Status

public expect fun gdipSetSmoothingMode(graphics: COpaquePointer?, smoothingmode: SmoothingMode): Status

public expect fun gdipSetSolidFillColor(brush: COpaquePointer?, color: UInt): Status

public expect fun gdipSetStringFormatAlign(format: COpaquePointer?, align: StringAlignment): Status

public expect fun gdipSetStringFormatDigitSubstitution(format: COpaquePointer?, language: UShort, substitute: StringDigitSubstitute): Status

public expect fun gdipSetStringFormatFlags(format: COpaquePointer?, flags: Int): Status

public expect fun gdipSetStringFormatHotkeyPrefix(format: COpaquePointer?, hotkeyprefix: Int): Status

public expect fun gdipSetStringFormatLineAlign(format: COpaquePointer?, align: StringAlignment): Status

public expect fun gdipSetStringFormatMeasurableCharacterRanges(format: COpaquePointer?, rangecount: Int, ranges: COpaquePointer?): Status

public expect fun gdipSetStringFormatTabStops(format: COpaquePointer?, firsttaboffset: Float, count: Int, tabstops: COpaquePointer?): Status

public expect fun gdipSetStringFormatTrimming(format: COpaquePointer?, trimming: StringTrimming): Status

public expect fun gdipSetTextContrast(graphics: COpaquePointer?, contrast: UInt): Status

public expect fun gdipSetTextRenderingHint(graphics: COpaquePointer?, mode: TextRenderingHint): Status

public expect fun gdipSetTextureTransform(brush: COpaquePointer?, matrix: COpaquePointer?): Status

public expect fun gdipSetTextureWrapMode(brush: COpaquePointer?, wrapmode: WrapMode): Status

public expect fun gdipSetWorldTransform(graphics: COpaquePointer?, matrix: COpaquePointer?): Status

public expect fun gdipShearMatrix(matrix: COpaquePointer?, shearx: Float, sheary: Float, order: MatrixOrder): Status

public expect fun gdipStartPathFigure(path: COpaquePointer?): Status

public expect fun gdipStringFormatGetGenericDefault(format: COpaquePointer?): Status

public expect fun gdipStringFormatGetGenericTypographic(format: COpaquePointer?): Status

public expect fun gdipTestControl(control: GpTestControlEnum, param1: COpaquePointer?): Status

public expect fun gdipTransformMatrixPoints(matrix: COpaquePointer?, pts: COpaquePointer?, count: Int): Status

public expect fun gdipTransformMatrixPointsI(matrix: COpaquePointer?, pts: COpaquePointer?, count: Int): Status

public expect fun gdipTransformPath(path: COpaquePointer?, matrix: COpaquePointer?): Status

public expect fun gdipTransformPoints(graphics: COpaquePointer?, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: COpaquePointer?, count: Int): Status

public expect fun gdipTransformPointsI(graphics: COpaquePointer?, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: COpaquePointer?, count: Int): Status

public expect fun gdipTransformRegion(region: COpaquePointer?, matrix: COpaquePointer?): Status

public expect fun gdipTranslateClip(graphics: COpaquePointer?, dx: Float, dy: Float): Status

public expect fun gdipTranslateClipI(graphics: COpaquePointer?, dx: Int, dy: Int): Status

public expect fun gdipTranslateLineTransform(brush: COpaquePointer?, dx: Float, dy: Float, order: MatrixOrder): Status

public expect fun gdipTranslateMatrix(matrix: COpaquePointer?, offsetx: Float, offsety: Float, order: MatrixOrder): Status

public expect fun gdipTranslatePathGradientTransform(brush: COpaquePointer?, dx: Float, dy: Float, order: MatrixOrder): Status

public expect fun gdipTranslatePenTransform(pen: COpaquePointer?, dx: Float, dy: Float, order: MatrixOrder): Status

public expect fun gdipTranslateRegion(region: COpaquePointer?, dx: Float, dy: Float): Status

public expect fun gdipTranslateRegionI(region: COpaquePointer?, dx: Int, dy: Int): Status

public expect fun gdipTranslateTextureTransform(brush: COpaquePointer?, dx: Float, dy: Float, order: MatrixOrder): Status

public expect fun gdipTranslateWorldTransform(graphics: COpaquePointer?, dx: Float, dy: Float, order: MatrixOrder): Status

public expect fun gdipVectorTransformMatrixPoints(matrix: COpaquePointer?, pts: COpaquePointer?, count: Int): Status

public expect fun gdipVectorTransformMatrixPointsI(matrix: COpaquePointer?, pts: COpaquePointer?, count: Int): Status

public expect fun gdipWarpPath(path: COpaquePointer?, matrix: COpaquePointer?, points: COpaquePointer?, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, warpmode: WarpMode, flatness: Float): Status

public expect fun gdipWidenPath(nativepath: COpaquePointer?, pen: COpaquePointer?, matrix: COpaquePointer?, flatness: Float): Status

public expect fun gdipWindingModeOutline(path: COpaquePointer?, matrix: COpaquePointer?, flatness: Float): Status

public expect fun gdiplusNotificationHook(token: COpaquePointer?): Status

public expect fun gdiplusNotificationUnhook(token: ULong)

public expect fun gdiplusShutdown(token: ULong)

public expect fun gdiplusStartup(token: COpaquePointer?, input: COpaquePointer?, output: COpaquePointer?): Status
