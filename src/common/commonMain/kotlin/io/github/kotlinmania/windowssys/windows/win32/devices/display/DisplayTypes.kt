package io.github.kotlinmania.windowssys.windows.win32.devices.display

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.Pointl
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rectl
import io.github.kotlinmania.windowssys.windows.win32.foundation.Size
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Coloradjustment
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Designvector
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Devmodew
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Trivertex
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Ttpolygonheader
import io.github.kotlinmania.windowssys.windows.win32.graphics.opengl.Pixelformatdescriptor
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.Logcolorspacew

public typealias ArState = Int

public typealias BacklightOptimizationLevel = Int

public typealias BrightnessInterfaceVersion = Int

public typealias BlackScreenDiagnosticsCalloutParam = Int

public typealias ColorspaceTransformDataType = Int

public typealias ColorspaceTransformStageControl = Int

public typealias ColorspaceTransformTargetCapsVersion = Int

public typealias ColorspaceTransformType = Int

public typealias Dhpdev = MutPtr<CVoid>

public typealias Dhsurf = MutPtr<CVoid>

public typealias DisplayconfigDeviceInfoType = Int

public typealias DisplayconfigModeInfoType = Int

public typealias DisplayconfigPixelformat = Int

public typealias DisplayconfigRotation = Int

public typealias DisplayconfigScaling = Int

public typealias DisplayconfigScanlineOrdering = Int

public typealias DisplayconfigTopologyId = Int

public typealias DisplayconfigVideoOutputTechnology = Int

public typealias DsiControlTransmissionMode = Int

public typealias EngDeviceAttribute = Int

public typealias EngSystemAttribute = Int

public fun interface FreeobjprocFn {
    public operator fun invoke(pdriverobj: MutPtr<Driverobj>): Bool
}

public typealias Freeobjproc = FreeobjprocFn?

public typealias Hbm = MutPtr<CVoid>

public typealias Hdev = MutPtr<CVoid>

public typealias Hdrvobj = MutPtr<CVoid>

public typealias Hfastmutex = MutPtr<CVoid>

public typealias Hsemaphore = MutPtr<CVoid>

public typealias Hsurf = MutPtr<CVoid>

public typealias McColorTemperature = Int

public typealias McDisplayTechnologyType = Int

public typealias McDriveType = Int

public typealias McGainType = Int

public typealias McPositionType = Int

public typealias McSizeType = Int

public typealias McVcpCodeType = Int

public typealias OrientationPreference = Int

public typealias OutputColorEncoding = Int

public typealias OutputWireColorSpaceType = Int

public fun interface PfnFn {
    public operator fun invoke(): Long
}

public typealias Pfn = PfnFn?

public fun interface PfnDrvAccumulateD3DdirtyRectFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, param1: MutPtr<CdddxgkRedirbitmappresentinfo>): Bool
}

public typealias PfnDrvAccumulateD3DdirtyRect = PfnDrvAccumulateD3DdirtyRectFn?

public fun interface PfnDrvAlphaBlendFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, param1: MutPtr<Surfobj>, param2: MutPtr<Clipobj>, param3: MutPtr<Xlateobj>, param4: MutPtr<Rectl>, param5: MutPtr<Rectl>, param6: MutPtr<Blendobj>): Bool
}

public typealias PfnDrvAlphaBlend = PfnDrvAlphaBlendFn?

public fun interface PfnDrvAssertModeFn {
    public operator fun invoke(param0: Dhpdev, param1: Bool): Bool
}

public typealias PfnDrvAssertMode = PfnDrvAssertModeFn?

public fun interface PfnDrvAssociateSharedSurfaceFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, param1: Handle, param2: Handle, param3: Size): Bool
}

public typealias PfnDrvAssociateSharedSurface = PfnDrvAssociateSharedSurfaceFn?

public fun interface PfnDrvBitBltFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, param1: MutPtr<Surfobj>, param2: MutPtr<Surfobj>, param3: MutPtr<Clipobj>, param4: MutPtr<Xlateobj>, param5: MutPtr<Rectl>, param6: MutPtr<Pointl>, param7: MutPtr<Pointl>, param8: MutPtr<Brushobj>, param9: MutPtr<Pointl>, param10: UInt): Bool
}

public typealias PfnDrvBitBlt = PfnDrvBitBltFn?

public fun interface PfnDrvCompletePdevFn {
    public operator fun invoke(param0: Dhpdev, param1: Hdev)
}

public typealias PfnDrvCompletePdev = PfnDrvCompletePdevFn?

public fun interface PfnDrvCopyBitsFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, param1: MutPtr<Surfobj>, param2: MutPtr<Clipobj>, param3: MutPtr<Xlateobj>, param4: MutPtr<Rectl>, param5: MutPtr<Pointl>): Bool
}

public typealias PfnDrvCopyBits = PfnDrvCopyBitsFn?

public fun interface PfnDrvCreateDeviceBitmapFn {
    public operator fun invoke(param0: Dhpdev, param1: Size, param2: UInt): Hbitmap
}

public typealias PfnDrvCreateDeviceBitmap = PfnDrvCreateDeviceBitmapFn?

public fun interface PfnDrvCreateDeviceBitmapExFn {
    public operator fun invoke(param0: Dhpdev, param1: Size, param2: UInt, param3: UInt, param4: Dhsurf, param5: UInt, param6: UInt, param7: MutPtr<Handle>): Hbitmap
}

public typealias PfnDrvCreateDeviceBitmapEx = PfnDrvCreateDeviceBitmapExFn?

public fun interface PfnDrvDeleteDeviceBitmapFn {
    public operator fun invoke(param0: Dhsurf)
}

public typealias PfnDrvDeleteDeviceBitmap = PfnDrvDeleteDeviceBitmapFn?

public fun interface PfnDrvDeleteDeviceBitmapExFn {
    public operator fun invoke(param0: Dhsurf)
}

public typealias PfnDrvDeleteDeviceBitmapEx = PfnDrvDeleteDeviceBitmapExFn?

public fun interface PfnDrvDescribePixelFormatFn {
    public operator fun invoke(param0: Dhpdev, param1: Int, param2: UInt, param3: MutPtr<Pixelformatdescriptor>): Int
}

public typealias PfnDrvDescribePixelFormat = PfnDrvDescribePixelFormatFn?

public fun interface PfnDrvDestroyFontFn {
    public operator fun invoke(param0: MutPtr<Fontobj>)
}

public typealias PfnDrvDestroyFont = PfnDrvDestroyFontFn?

public fun interface PfnDrvDisableDirectDrawFn {
    public operator fun invoke(param0: Dhpdev)
}

public typealias PfnDrvDisableDirectDraw = PfnDrvDisableDirectDrawFn?

public fun interface PfnDrvDisableDriverFn {
    public operator fun invoke()
}

public typealias PfnDrvDisableDriver = PfnDrvDisableDriverFn?

public fun interface PfnDrvDisablePdevFn {
    public operator fun invoke(param0: Dhpdev)
}

public typealias PfnDrvDisablePdev = PfnDrvDisablePdevFn?

public fun interface PfnDrvDisableSurfaceFn {
    public operator fun invoke(param0: Dhpdev)
}

public typealias PfnDrvDisableSurface = PfnDrvDisableSurfaceFn?

public fun interface PfnDrvDitherColorFn {
    public operator fun invoke(param0: Dhpdev, param1: UInt, param2: UInt, param3: MutPtr<UInt>): UInt
}

public typealias PfnDrvDitherColor = PfnDrvDitherColorFn?

public fun interface PfnDrvDrawEscapeFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, param1: UInt, param2: MutPtr<Clipobj>, param3: MutPtr<Rectl>, param4: UInt, param5: MutPtr<CVoid>): UInt
}

public typealias PfnDrvDrawEscape = PfnDrvDrawEscapeFn?

public fun interface PfnDrvEnableDriverFn {
    public operator fun invoke(param0: UInt, param1: UInt, param2: MutPtr<Drvenabledata>): Bool
}

public typealias PfnDrvEnableDriver = PfnDrvEnableDriverFn?

public fun interface PfnDrvEnablePdevFn {
    public operator fun invoke(param0: MutPtr<Devmodew>, param1: Pcwstr, param2: UInt, param3: MutPtr<Hsurf>, param4: UInt, param5: MutPtr<Gdiinfo>, param6: UInt, param7: MutPtr<Devinfo>, param8: Hdev, param9: Pcwstr, param10: Handle): Dhpdev
}

public typealias PfnDrvEnablePdev = PfnDrvEnablePdevFn?

public fun interface PfnDrvEnableSurfaceFn {
    public operator fun invoke(param0: Dhpdev): Hsurf
}

public typealias PfnDrvEnableSurface = PfnDrvEnableSurfaceFn?

public fun interface PfnDrvEndDocFn {
    public operator fun invoke(pso: MutPtr<Surfobj>, fl: UInt): Bool
}

public typealias PfnDrvEndDoc = PfnDrvEndDocFn?

public fun interface PfnDrvEndDxInteropFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, param1: Bool, param2: MutPtr<Bool>, kernelmodedevicehandle: MutPtr<CVoid>): Bool
}

public typealias PfnDrvEndDxInterop = PfnDrvEndDxInteropFn?

public fun interface PfnDrvEscapeFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, param1: UInt, param2: UInt, param3: MutPtr<CVoid>, param4: UInt, param5: MutPtr<CVoid>): UInt
}

public typealias PfnDrvEscape = PfnDrvEscapeFn?

public fun interface PfnDrvFillPathFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, param1: MutPtr<Pathobj>, param2: MutPtr<Clipobj>, param3: MutPtr<Brushobj>, param4: MutPtr<Pointl>, param5: UInt, param6: UInt): Bool
}

public typealias PfnDrvFillPath = PfnDrvFillPathFn?

public fun interface PfnDrvFontManagementFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, param1: MutPtr<Fontobj>, param2: UInt, param3: UInt, param4: MutPtr<CVoid>, param5: UInt, param6: MutPtr<CVoid>): UInt
}

public typealias PfnDrvFontManagement = PfnDrvFontManagementFn?

public fun interface PfnDrvFreeFn {
    public operator fun invoke(param0: MutPtr<CVoid>, param1: ULong)
}

public typealias PfnDrvFree = PfnDrvFreeFn?

public fun interface PfnDrvGetGlyphModeFn {
    public operator fun invoke(dhpdev: Dhpdev, pfo: MutPtr<Fontobj>): UInt
}

public typealias PfnDrvGetGlyphMode = PfnDrvGetGlyphModeFn?

public fun interface PfnDrvGetModesFn {
    public operator fun invoke(param0: Handle, param1: UInt, param2: MutPtr<Devmodew>): UInt
}

public typealias PfnDrvGetModes = PfnDrvGetModesFn?

public fun interface PfnDrvGetTrueTypeFileFn {
    public operator fun invoke(param0: ULong, param1: MutPtr<UInt>): MutPtr<CVoid>
}

public typealias PfnDrvGetTrueTypeFile = PfnDrvGetTrueTypeFileFn?

public fun interface PfnDrvGradientFillFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, param1: MutPtr<Clipobj>, param2: MutPtr<Xlateobj>, param3: MutPtr<Trivertex>, param4: UInt, param5: MutPtr<CVoid>, param6: UInt, param7: MutPtr<Rectl>, param8: MutPtr<Pointl>, param9: UInt): Bool
}

public typealias PfnDrvGradientFill = PfnDrvGradientFillFn?

public fun interface PfnDrvIcmCheckBitmapBitsFn {
    public operator fun invoke(param0: Dhpdev, param1: Handle, param2: MutPtr<Surfobj>, param3: MutPtr<UByte>): Bool
}

public typealias PfnDrvIcmCheckBitmapBits = PfnDrvIcmCheckBitmapBitsFn?

public fun interface PfnDrvIcmCreateColorTransformFn {
    public operator fun invoke(param0: Dhpdev, param1: MutPtr<Logcolorspacew>, param2: MutPtr<CVoid>, param3: UInt, param4: MutPtr<CVoid>, param5: UInt, param6: MutPtr<CVoid>, param7: UInt, param8: UInt): Handle
}

public typealias PfnDrvIcmCreateColorTransform = PfnDrvIcmCreateColorTransformFn?

public fun interface PfnDrvIcmDeleteColorTransformFn {
    public operator fun invoke(param0: Dhpdev, param1: Handle): Bool
}

public typealias PfnDrvIcmDeleteColorTransform = PfnDrvIcmDeleteColorTransformFn?

public fun interface PfnDrvIcmSetDeviceGammaRampFn {
    public operator fun invoke(param0: Dhpdev, param1: UInt, param2: MutPtr<CVoid>): Bool
}

public typealias PfnDrvIcmSetDeviceGammaRamp = PfnDrvIcmSetDeviceGammaRampFn?

public fun interface PfnDrvLineToFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, param1: MutPtr<Clipobj>, param2: MutPtr<Brushobj>, param3: Int, param4: Int, param5: Int, param6: Int, param7: MutPtr<Rectl>, param8: UInt): Bool
}

public typealias PfnDrvLineTo = PfnDrvLineToFn?

public fun interface PfnDrvLoadFontFileFn {
    public operator fun invoke(param0: UInt, param1: MutPtr<ULong>, param2: MutPtr<MutPtr<CVoid>>, param3: MutPtr<UInt>, param4: MutPtr<Designvector>, param5: UInt, param6: UInt): ULong
}

public typealias PfnDrvLoadFontFile = PfnDrvLoadFontFileFn?

public fun interface PfnDrvLockDisplayAreaFn {
    public operator fun invoke(param0: Dhpdev, param1: MutPtr<Rectl>)
}

public typealias PfnDrvLockDisplayArea = PfnDrvLockDisplayAreaFn?

public fun interface PfnDrvMovePointerFn {
    public operator fun invoke(pso: MutPtr<Surfobj>, x: Int, y: Int, prcl: MutPtr<Rectl>)
}

public typealias PfnDrvMovePointer = PfnDrvMovePointerFn?

public fun interface PfnDrvNextBandFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, ppointl: MutPtr<Pointl>): Bool
}

public typealias PfnDrvNextBand = PfnDrvNextBandFn?

public fun interface PfnDrvNotifyFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, param1: UInt, param2: MutPtr<CVoid>)
}

public typealias PfnDrvNotify = PfnDrvNotifyFn?

public fun interface PfnDrvPaintFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, param1: MutPtr<Clipobj>, param2: MutPtr<Brushobj>, param3: MutPtr<Pointl>, param4: UInt): Bool
}

public typealias PfnDrvPaint = PfnDrvPaintFn?

public fun interface PfnDrvPlgBltFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, param1: MutPtr<Surfobj>, param2: MutPtr<Surfobj>, param3: MutPtr<Clipobj>, param4: MutPtr<Xlateobj>, param5: MutPtr<Coloradjustment>, param6: MutPtr<Pointl>, param7: MutPtr<Pointfix>, param8: MutPtr<Rectl>, param9: MutPtr<Pointl>, param10: UInt): Bool
}

public typealias PfnDrvPlgBlt = PfnDrvPlgBltFn?

public fun interface PfnDrvQueryAdvanceWidthsFn {
    public operator fun invoke(param0: Dhpdev, param1: MutPtr<Fontobj>, param2: UInt, param3: MutPtr<UInt>, param4: MutPtr<CVoid>, param5: UInt): Bool
}

public typealias PfnDrvQueryAdvanceWidths = PfnDrvQueryAdvanceWidthsFn?

public fun interface PfnDrvQueryDeviceSupportFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, param1: MutPtr<Xlateobj>, param2: MutPtr<Xformobj>, param3: UInt, param4: UInt, param5: MutPtr<CVoid>, param6: UInt, param7: MutPtr<CVoid>): Bool
}

public typealias PfnDrvQueryDeviceSupport = PfnDrvQueryDeviceSupportFn?

public fun interface PfnDrvQueryFontFn {
    public operator fun invoke(param0: Dhpdev, param1: ULong, param2: UInt, param3: MutPtr<ULong>): MutPtr<Ifimetrics>
}

public typealias PfnDrvQueryFont = PfnDrvQueryFontFn?

public fun interface PfnDrvQueryFontCapsFn {
    public operator fun invoke(param0: UInt, param1: MutPtr<UInt>): Int
}

public typealias PfnDrvQueryFontCaps = PfnDrvQueryFontCapsFn?

public fun interface PfnDrvQueryFontDataFn {
    public operator fun invoke(param0: Dhpdev, param1: MutPtr<Fontobj>, param2: UInt, param3: UInt, param4: MutPtr<Glyphdata>, param5: MutPtr<CVoid>, param6: UInt): Int
}

public typealias PfnDrvQueryFontData = PfnDrvQueryFontDataFn?

public fun interface PfnDrvQueryFontFileFn {
    public operator fun invoke(param0: ULong, param1: UInt, param2: UInt, param3: MutPtr<UInt>): Int
}

public typealias PfnDrvQueryFontFile = PfnDrvQueryFontFileFn?

public fun interface PfnDrvQueryFontTreeFn {
    public operator fun invoke(param0: Dhpdev, param1: ULong, param2: UInt, param3: UInt, param4: MutPtr<ULong>): MutPtr<CVoid>
}

public typealias PfnDrvQueryFontTree = PfnDrvQueryFontTreeFn?

public fun interface PfnDrvQueryGlyphAttrsFn {
    public operator fun invoke(param0: MutPtr<Fontobj>, param1: UInt): MutPtr<FdGlyphattr>
}

public typealias PfnDrvQueryGlyphAttrs = PfnDrvQueryGlyphAttrsFn?

public fun interface PfnDrvQueryPerBandInfoFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, param1: MutPtr<Perbandinfo>): Bool
}

public typealias PfnDrvQueryPerBandInfo = PfnDrvQueryPerBandInfoFn?

public fun interface PfnDrvQuerySpoolTypeFn {
    public operator fun invoke(dhpdev: Dhpdev, pwchtype: Pcwstr): Bool
}

public typealias PfnDrvQuerySpoolType = PfnDrvQuerySpoolTypeFn?

public fun interface PfnDrvQueryTrueTypeOutlineFn {
    public operator fun invoke(param0: Dhpdev, param1: MutPtr<Fontobj>, param2: UInt, param3: Bool, param4: MutPtr<Glyphdata>, param5: UInt, param6: MutPtr<Ttpolygonheader>): Int
}

public typealias PfnDrvQueryTrueTypeOutline = PfnDrvQueryTrueTypeOutlineFn?

public fun interface PfnDrvQueryTrueTypeSectionFn {
    public operator fun invoke(param0: UInt, param1: UInt, param2: UInt, param3: MutPtr<Handle>, param4: MutPtr<Int>): Int
}

public typealias PfnDrvQueryTrueTypeSection = PfnDrvQueryTrueTypeSectionFn?

public fun interface PfnDrvQueryTrueTypeTableFn {
    public operator fun invoke(param0: ULong, param1: UInt, param2: UInt, param3: Int, param4: UInt, param5: MutPtr<UByte>, param6: MutPtr<MutPtr<UByte>>, param7: MutPtr<UInt>): Int
}

public typealias PfnDrvQueryTrueTypeTable = PfnDrvQueryTrueTypeTableFn?

public fun interface PfnDrvRealizeBrushFn {
    public operator fun invoke(param0: MutPtr<Brushobj>, param1: MutPtr<Surfobj>, param2: MutPtr<Surfobj>, param3: MutPtr<Surfobj>, param4: MutPtr<Xlateobj>, param5: UInt): Bool
}

public typealias PfnDrvRealizeBrush = PfnDrvRealizeBrushFn?

public fun interface PfnDrvRenderHintFn {
    public operator fun invoke(dhpdev: Dhpdev, notifycode: UInt, length: ULong, data: ConstPtr<CVoid>): Int
}

public typealias PfnDrvRenderHint = PfnDrvRenderHintFn?

public fun interface PfnDrvResetDeviceFn {
    public operator fun invoke(param0: Dhpdev, param1: MutPtr<CVoid>): UInt
}

public typealias PfnDrvResetDevice = PfnDrvResetDeviceFn?

public fun interface PfnDrvResetPdevFn {
    public operator fun invoke(dhpdevold: Dhpdev, dhpdevnew: Dhpdev): Bool
}

public typealias PfnDrvResetPdev = PfnDrvResetPdevFn?

public fun interface PfnDrvSaveScreenBitsFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, param1: UInt, param2: ULong, param3: MutPtr<Rectl>): ULong
}

public typealias PfnDrvSaveScreenBits = PfnDrvSaveScreenBitsFn?

public fun interface PfnDrvSendPageFn {
    public operator fun invoke(param0: MutPtr<Surfobj>): Bool
}

public typealias PfnDrvSendPage = PfnDrvSendPageFn?

public fun interface PfnDrvSetPaletteFn {
    public operator fun invoke(param0: Dhpdev, param1: MutPtr<Palobj>, param2: UInt, param3: UInt, param4: UInt): Bool
}

public typealias PfnDrvSetPalette = PfnDrvSetPaletteFn?

public fun interface PfnDrvSetPixelFormatFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, param1: Int, param2: Hwnd): Bool
}

public typealias PfnDrvSetPixelFormat = PfnDrvSetPixelFormatFn?

public fun interface PfnDrvSetPointerShapeFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, param1: MutPtr<Surfobj>, param2: MutPtr<Surfobj>, param3: MutPtr<Xlateobj>, param4: Int, param5: Int, param6: Int, param7: Int, param8: MutPtr<Rectl>, param9: UInt): UInt
}

public typealias PfnDrvSetPointerShape = PfnDrvSetPointerShapeFn?

public fun interface PfnDrvStartBandingFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, ppointl: MutPtr<Pointl>): Bool
}

public typealias PfnDrvStartBanding = PfnDrvStartBandingFn?

public fun interface PfnDrvStartDocFn {
    public operator fun invoke(pso: MutPtr<Surfobj>, pwszdocname: Pcwstr, dwjobid: UInt): Bool
}

public typealias PfnDrvStartDoc = PfnDrvStartDocFn?

public fun interface PfnDrvStartDxInteropFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, param1: Bool, kernelmodedevicehandle: MutPtr<CVoid>): Bool
}

public typealias PfnDrvStartDxInterop = PfnDrvStartDxInteropFn?

public fun interface PfnDrvStartPageFn {
    public operator fun invoke(pso: MutPtr<Surfobj>): Bool
}

public typealias PfnDrvStartPage = PfnDrvStartPageFn?

public fun interface PfnDrvStretchBltFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, param1: MutPtr<Surfobj>, param2: MutPtr<Surfobj>, param3: MutPtr<Clipobj>, param4: MutPtr<Xlateobj>, param5: MutPtr<Coloradjustment>, param6: MutPtr<Pointl>, param7: MutPtr<Rectl>, param8: MutPtr<Rectl>, param9: MutPtr<Pointl>, param10: UInt): Bool
}

public typealias PfnDrvStretchBlt = PfnDrvStretchBltFn?

public fun interface PfnDrvStretchBltRopFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, param1: MutPtr<Surfobj>, param2: MutPtr<Surfobj>, param3: MutPtr<Clipobj>, param4: MutPtr<Xlateobj>, param5: MutPtr<Coloradjustment>, param6: MutPtr<Pointl>, param7: MutPtr<Rectl>, param8: MutPtr<Rectl>, param9: MutPtr<Pointl>, param10: UInt, param11: MutPtr<Brushobj>, param12: UInt): Bool
}

public typealias PfnDrvStretchBltRop = PfnDrvStretchBltRopFn?

public fun interface PfnDrvStrokeAndFillPathFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, param1: MutPtr<Pathobj>, param2: MutPtr<Clipobj>, param3: MutPtr<Xformobj>, param4: MutPtr<Brushobj>, param5: MutPtr<Lineattrs>, param6: MutPtr<Brushobj>, param7: MutPtr<Pointl>, param8: UInt, param9: UInt): Bool
}

public typealias PfnDrvStrokeAndFillPath = PfnDrvStrokeAndFillPathFn?

public fun interface PfnDrvStrokePathFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, param1: MutPtr<Pathobj>, param2: MutPtr<Clipobj>, param3: MutPtr<Xformobj>, param4: MutPtr<Brushobj>, param5: MutPtr<Pointl>, param6: MutPtr<Lineattrs>, param7: UInt): Bool
}

public typealias PfnDrvStrokePath = PfnDrvStrokePathFn?

public fun interface PfnDrvSurfaceCompleteFn {
    public operator fun invoke(param0: Dhpdev, param1: Handle): Bool
}

public typealias PfnDrvSurfaceComplete = PfnDrvSurfaceCompleteFn?

public fun interface PfnDrvSwapBuffersFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, param1: MutPtr<Wndobj>): Bool
}

public typealias PfnDrvSwapBuffers = PfnDrvSwapBuffersFn?

public fun interface PfnDrvSynchronizeFn {
    public operator fun invoke(param0: Dhpdev, param1: MutPtr<Rectl>)
}

public typealias PfnDrvSynchronize = PfnDrvSynchronizeFn?

public fun interface PfnDrvSynchronizeRedirectionBitmapsFn {
    public operator fun invoke(param0: Dhpdev, param1: MutPtr<ULong>): Ntstatus
}

public typealias PfnDrvSynchronizeRedirectionBitmaps = PfnDrvSynchronizeRedirectionBitmapsFn?

public fun interface PfnDrvSynchronizeSurfaceFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, param1: MutPtr<Rectl>, param2: UInt)
}

public typealias PfnDrvSynchronizeSurface = PfnDrvSynchronizeSurfaceFn?

public fun interface PfnDrvTextOutFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, param1: MutPtr<Strobj>, param2: MutPtr<Fontobj>, param3: MutPtr<Clipobj>, param4: MutPtr<Rectl>, param5: MutPtr<Rectl>, param6: MutPtr<Brushobj>, param7: MutPtr<Brushobj>, param8: MutPtr<Pointl>, param9: UInt): Bool
}

public typealias PfnDrvTextOut = PfnDrvTextOutFn?

public fun interface PfnDrvTransparentBltFn {
    public operator fun invoke(param0: MutPtr<Surfobj>, param1: MutPtr<Surfobj>, param2: MutPtr<Clipobj>, param3: MutPtr<Xlateobj>, param4: MutPtr<Rectl>, param5: MutPtr<Rectl>, param6: UInt, param7: UInt): Bool
}

public typealias PfnDrvTransparentBlt = PfnDrvTransparentBltFn?

public fun interface PfnDrvUnloadFontFileFn {
    public operator fun invoke(param0: ULong): Bool
}

public typealias PfnDrvUnloadFontFile = PfnDrvUnloadFontFileFn?

public fun interface PfnDrvUnlockDisplayAreaFn {
    public operator fun invoke(param0: Dhpdev, param1: MutPtr<Rectl>)
}

public typealias PfnDrvUnlockDisplayArea = PfnDrvUnlockDisplayAreaFn?

public fun interface PfnEngCombineRgnFn {
    public operator fun invoke(hrgntrg: Handle, hrgnsrc1: Handle, hrgnsrc2: Handle, imode: Int): Int
}

public typealias PfnEngCombineRgn = PfnEngCombineRgnFn?

public fun interface PfnEngCopyRgnFn {
    public operator fun invoke(hrgndst: Handle, hrgnsrc: Handle): Int
}

public typealias PfnEngCopyRgn = PfnEngCopyRgnFn?

public fun interface PfnEngCreateRectRgnFn {
    public operator fun invoke(left: Int, top: Int, right: Int, bottom: Int): Handle
}

public typealias PfnEngCreateRectRgn = PfnEngCreateRectRgnFn?

public fun interface PfnEngDeleteRgnFn {
    public operator fun invoke(hrgn: Handle)
}

public typealias PfnEngDeleteRgn = PfnEngDeleteRgnFn?

public fun interface PfnEngIntersectRgnFn {
    public operator fun invoke(hrgnresult: Handle, hrgna: Handle, hrgnb: Handle): Int
}

public typealias PfnEngIntersectRgn = PfnEngIntersectRgnFn?

public fun interface PfnEngSubtractRgnFn {
    public operator fun invoke(hrgnresult: Handle, hrgna: Handle, hrgnb: Handle): Int
}

public typealias PfnEngSubtractRgn = PfnEngSubtractRgnFn?

public fun interface PfnEngUnionRgnFn {
    public operator fun invoke(hrgnresult: Handle, hrgna: Handle, hrgnb: Handle): Int
}

public typealias PfnEngUnionRgn = PfnEngUnionRgnFn?

public fun interface PfnEngXorRgnFn {
    public operator fun invoke(hrgnresult: Handle, hrgna: Handle, hrgnb: Handle): Int
}

public typealias PfnEngXorRgn = PfnEngXorRgnFn?

public fun interface PvideoWin32kCalloutFn {
    public operator fun invoke(params: ConstPtr<CVoid>)
}

public typealias PvideoWin32kCallout = PvideoWin32kCalloutFn?

public typealias QueryDisplayConfigFlags = UInt

public typealias SetDisplayConfigFlags = UInt

public fun interface SortcompFn {
    public operator fun invoke(pv1: ConstPtr<CVoid>, pv2: ConstPtr<CVoid>): Int
}

public typealias Sortcomp = SortcompFn?

public typealias VideoBankType = Int

public typealias VideoPowerState = Int

public typealias VideoWin32kCallbacksParamsType = Int

public fun interface WndobjchangeprocFn {
    public operator fun invoke(pwo: MutPtr<Wndobj>, fl: UInt)
}

public typealias Wndobjchangeproc = WndobjchangeprocFn?
