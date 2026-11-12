package io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hrgn

public expect fun gdipScaleTextureTransform(brush: MutPtr, sx: Float, sy: Float, order: MatrixOrder): Status

public expect fun gdipScaleWorldTransform(graphics: MutPtr, sx: Float, sy: Float, order: MatrixOrder): Status

public expect fun gdipSetAdjustableArrowCapFillState(cap: MutPtr, fillstate: Bool): Status

public expect fun gdipSetAdjustableArrowCapHeight(cap: MutPtr, height: Float): Status

public expect fun gdipSetAdjustableArrowCapMiddleInset(cap: MutPtr, middleinset: Float): Status

public expect fun gdipSetAdjustableArrowCapWidth(cap: MutPtr, width: Float): Status

public expect fun gdipSetClipGraphics(graphics: MutPtr, srcgraphics: MutPtr, combinemode: CombineMode): Status

public expect fun gdipSetClipHrgn(graphics: MutPtr, hrgn: Hrgn, combinemode: CombineMode): Status

public expect fun gdipSetClipPath(graphics: MutPtr, path: MutPtr, combinemode: CombineMode): Status

public expect fun gdipSetClipRect(graphics: MutPtr, x: Float, y: Float, width: Float, height: Float, combinemode: CombineMode): Status

public expect fun gdipSetClipRectI(graphics: MutPtr, x: Int, y: Int, width: Int, height: Int, combinemode: CombineMode): Status

public expect fun gdipSetClipRegion(graphics: MutPtr, region: MutPtr, combinemode: CombineMode): Status

public expect fun gdipSetCompositingMode(graphics: MutPtr, compositingmode: CompositingMode): Status

public expect fun gdipSetCompositingQuality(graphics: MutPtr, compositingquality: CompositingQuality): Status

public expect fun gdipSetCustomLineCapBaseCap(customcap: MutPtr, basecap: LineCap): Status

public expect fun gdipSetCustomLineCapBaseInset(customcap: MutPtr, inset: Float): Status

public expect fun gdipSetCustomLineCapStrokeCaps(customcap: MutPtr, startcap: LineCap, endcap: LineCap): Status

public expect fun gdipSetCustomLineCapStrokeJoin(customcap: MutPtr, linejoin: LineJoin): Status

public expect fun gdipSetCustomLineCapWidthScale(customcap: MutPtr, widthscale: Float): Status

public expect fun gdipSetEffectParameters(effect: MutPtr, params: ConstPtr, size: UInt): Status

public expect fun gdipSetEmpty(region: MutPtr): Status

public expect fun gdipSetImageAttributesCachedBackground(imageattr: MutPtr, enableflag: Bool): Status

public expect fun gdipSetImageAttributesColorKeys(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool, colorlow: UInt, colorhigh: UInt): Status

public expect fun gdipSetImageAttributesColorMatrix(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool, colormatrix: ConstPtr, graymatrix: ConstPtr, flags: ColorMatrixFlags): Status

public expect fun gdipSetImageAttributesGamma(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool, gamma: Float): Status

public expect fun gdipSetImageAttributesNoOp(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool): Status

public expect fun gdipSetImageAttributesOutputChannel(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool, channelflags: ColorChannelFlags): Status

public expect fun gdipSetImageAttributesOutputChannelColorProfile(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool, colorprofilefilename: Pcwstr): Status

public expect fun gdipSetImageAttributesRemapTable(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool, mapsize: UInt, map: ConstPtr): Status

public expect fun gdipSetImageAttributesThreshold(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool, threshold: Float): Status

public expect fun gdipSetImageAttributesToIdentity(imageattr: MutPtr, type: ColorAdjustType): Status

public expect fun gdipSetImageAttributesWrapMode(imageattr: MutPtr, wrap: WrapMode, argb: UInt, clamp: Bool): Status

public expect fun gdipSetImagePalette(image: MutPtr, palette: ConstPtr): Status

public expect fun gdipSetInfinite(region: MutPtr): Status

public expect fun gdipSetInterpolationMode(graphics: MutPtr, interpolationmode: InterpolationMode): Status

public expect fun gdipSetLineBlend(brush: MutPtr, blend: ConstPtr, positions: ConstPtr, count: Int): Status

public expect fun gdipSetLineColors(brush: MutPtr, color1: UInt, color2: UInt): Status

public expect fun gdipSetLineGammaCorrection(brush: MutPtr, usegammacorrection: Bool): Status

public expect fun gdipSetLineLinearBlend(brush: MutPtr, focus: Float, scale: Float): Status

public expect fun gdipSetLinePresetBlend(brush: MutPtr, blend: ConstPtr, positions: ConstPtr, count: Int): Status

public expect fun gdipSetLineSigmaBlend(brush: MutPtr, focus: Float, scale: Float): Status

public expect fun gdipSetLineTransform(brush: MutPtr, matrix: ConstPtr): Status

public expect fun gdipSetLineWrapMode(brush: MutPtr, wrapmode: WrapMode): Status

public expect fun gdipSetMatrixElements(matrix: MutPtr, m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float): Status

public expect fun gdipSetMetafileDownLevelRasterizationLimit(metafile: MutPtr, metafilerasterizationlimitdpi: UInt): Status

public expect fun gdipSetPageScale(graphics: MutPtr, scale: Float): Status

public expect fun gdipSetPageUnit(graphics: MutPtr, unit: Unit): Status

public expect fun gdipSetPathFillMode(path: MutPtr, fillmode: FillMode): Status

public expect fun gdipSetPathGradientBlend(brush: MutPtr, blend: ConstPtr, positions: ConstPtr, count: Int): Status

public expect fun gdipSetPathGradientCenterColor(brush: MutPtr, colors: UInt): Status

public expect fun gdipSetPathGradientCenterPoint(brush: MutPtr, points: ConstPtr): Status

public expect fun gdipSetPathGradientCenterPointI(brush: MutPtr, points: ConstPtr): Status

public expect fun gdipSetPathGradientFocusScales(brush: MutPtr, xscale: Float, yscale: Float): Status

public expect fun gdipSetPathGradientGammaCorrection(brush: MutPtr, usegammacorrection: Bool): Status

public expect fun gdipSetPathGradientLinearBlend(brush: MutPtr, focus: Float, scale: Float): Status

public expect fun gdipSetPathGradientPath(brush: MutPtr, path: ConstPtr): Status

public expect fun gdipSetPathGradientPresetBlend(brush: MutPtr, blend: ConstPtr, positions: ConstPtr, count: Int): Status

public expect fun gdipSetPathGradientSigmaBlend(brush: MutPtr, focus: Float, scale: Float): Status

public expect fun gdipSetPathGradientSurroundColorsWithCount(brush: MutPtr, color: ConstPtr, count: MutPtr): Status

public expect fun gdipSetPathGradientTransform(brush: MutPtr, matrix: MutPtr): Status

public expect fun gdipSetPathGradientWrapMode(brush: MutPtr, wrapmode: WrapMode): Status

public expect fun gdipSetPathMarker(path: MutPtr): Status

public expect fun gdipSetPenBrushFill(pen: MutPtr, brush: MutPtr): Status

public expect fun gdipSetPenColor(pen: MutPtr, argb: UInt): Status

public expect fun gdipSetPenCompoundArray(pen: MutPtr, dash: ConstPtr, count: Int): Status

public expect fun gdipSetPenCustomEndCap(pen: MutPtr, customcap: MutPtr): Status

public expect fun gdipSetPenCustomStartCap(pen: MutPtr, customcap: MutPtr): Status

public expect fun gdipSetPenDashArray(pen: MutPtr, dash: ConstPtr, count: Int): Status

public expect fun gdipSetPenDashCap197819(pen: MutPtr, dashcap: DashCap): Status

public expect fun gdipSetPenDashOffset(pen: MutPtr, offset: Float): Status

public expect fun gdipSetPenDashStyle(pen: MutPtr, dashstyle: DashStyle): Status

public expect fun gdipSetPenEndCap(pen: MutPtr, endcap: LineCap): Status

public expect fun gdipSetPenLineCap197819(pen: MutPtr, startcap: LineCap, endcap: LineCap, dashcap: DashCap): Status

public expect fun gdipSetPenLineJoin(pen: MutPtr, linejoin: LineJoin): Status

public expect fun gdipSetPenMiterLimit(pen: MutPtr, miterlimit: Float): Status

public expect fun gdipSetPenMode(pen: MutPtr, penmode: PenAlignment): Status

public expect fun gdipSetPenStartCap(pen: MutPtr, startcap: LineCap): Status

public expect fun gdipSetPenTransform(pen: MutPtr, matrix: MutPtr): Status

public expect fun gdipSetPenUnit(pen: MutPtr, unit: Unit): Status

public expect fun gdipSetPenWidth(pen: MutPtr, width: Float): Status

public expect fun gdipSetPixelOffsetMode(graphics: MutPtr, pixeloffsetmode: PixelOffsetMode): Status

public expect fun gdipSetPropertyItem(image: MutPtr, item: ConstPtr): Status

public expect fun gdipSetRenderingOrigin(graphics: MutPtr, x: Int, y: Int): Status

public expect fun gdipSetSmoothingMode(graphics: MutPtr, smoothingmode: SmoothingMode): Status

public expect fun gdipSetSolidFillColor(brush: MutPtr, color: UInt): Status

public expect fun gdipSetStringFormatAlign(format: MutPtr, align: StringAlignment): Status

public expect fun gdipSetStringFormatDigitSubstitution(format: MutPtr, language: UShort, substitute: StringDigitSubstitute): Status

public expect fun gdipSetStringFormatFlags(format: MutPtr, flags: Int): Status

public expect fun gdipSetStringFormatHotkeyPrefix(format: MutPtr, hotkeyprefix: Int): Status

public expect fun gdipSetStringFormatLineAlign(format: MutPtr, align: StringAlignment): Status

public expect fun gdipSetStringFormatMeasurableCharacterRanges(format: MutPtr, rangecount: Int, ranges: ConstPtr): Status

public expect fun gdipSetStringFormatTabStops(format: MutPtr, firsttaboffset: Float, count: Int, tabstops: ConstPtr): Status

public expect fun gdipSetStringFormatTrimming(format: MutPtr, trimming: StringTrimming): Status

public expect fun gdipSetTextContrast(graphics: MutPtr, contrast: UInt): Status

public expect fun gdipSetTextRenderingHint(graphics: MutPtr, mode: TextRenderingHint): Status

public expect fun gdipSetTextureTransform(brush: MutPtr, matrix: ConstPtr): Status

public expect fun gdipSetTextureWrapMode(brush: MutPtr, wrapmode: WrapMode): Status

public expect fun gdipSetWorldTransform(graphics: MutPtr, matrix: MutPtr): Status

public expect fun gdipShearMatrix(matrix: MutPtr, shearx: Float, sheary: Float, order: MatrixOrder): Status

public expect fun gdipStartPathFigure(path: MutPtr): Status

public expect fun gdipStringFormatGetGenericDefault(format: MutPtr): Status

public expect fun gdipStringFormatGetGenericTypographic(format: MutPtr): Status

public expect fun gdipTestControl(control: GpTestControlEnum, param1: MutPtr): Status

public expect fun gdipTransformMatrixPoints(matrix: MutPtr, pts: MutPtr, count: Int): Status

public expect fun gdipTransformMatrixPointsI(matrix: MutPtr, pts: MutPtr, count: Int): Status

public expect fun gdipTransformPath(path: MutPtr, matrix: MutPtr): Status

public expect fun gdipTransformPoints(graphics: MutPtr, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: MutPtr, count: Int): Status

public expect fun gdipTransformPointsI(graphics: MutPtr, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: MutPtr, count: Int): Status

public expect fun gdipTransformRegion(region: MutPtr, matrix: MutPtr): Status

public expect fun gdipTranslateClip(graphics: MutPtr, dx: Float, dy: Float): Status

public expect fun gdipTranslateClipI(graphics: MutPtr, dx: Int, dy: Int): Status

public expect fun gdipTranslateLineTransform(brush: MutPtr, dx: Float, dy: Float, order: MatrixOrder): Status

public expect fun gdipTranslateMatrix(matrix: MutPtr, offsetx: Float, offsety: Float, order: MatrixOrder): Status

public expect fun gdipTranslatePathGradientTransform(brush: MutPtr, dx: Float, dy: Float, order: MatrixOrder): Status

public expect fun gdipTranslatePenTransform(pen: MutPtr, dx: Float, dy: Float, order: MatrixOrder): Status

public expect fun gdipTranslateRegion(region: MutPtr, dx: Float, dy: Float): Status

public expect fun gdipTranslateRegionI(region: MutPtr, dx: Int, dy: Int): Status

public expect fun gdipTranslateTextureTransform(brush: MutPtr, dx: Float, dy: Float, order: MatrixOrder): Status

public expect fun gdipTranslateWorldTransform(graphics: MutPtr, dx: Float, dy: Float, order: MatrixOrder): Status

public expect fun gdipVectorTransformMatrixPoints(matrix: MutPtr, pts: MutPtr, count: Int): Status

public expect fun gdipVectorTransformMatrixPointsI(matrix: MutPtr, pts: MutPtr, count: Int): Status

public expect fun gdipWarpPath(path: MutPtr, matrix: MutPtr, points: ConstPtr, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, warpmode: WarpMode, flatness: Float): Status

public expect fun gdipWidenPath(nativepath: MutPtr, pen: MutPtr, matrix: MutPtr, flatness: Float): Status

public expect fun gdipWindingModeOutline(path: MutPtr, matrix: MutPtr, flatness: Float): Status

public expect fun gdiplusNotificationHook(token: MutPtr): Status

public expect fun gdiplusNotificationUnhook(token: ULong)

public expect fun gdiplusShutdown(token: ULong)

public expect fun gdiplusStartup(token: MutPtr, input: ConstPtr, output: MutPtr): Status
