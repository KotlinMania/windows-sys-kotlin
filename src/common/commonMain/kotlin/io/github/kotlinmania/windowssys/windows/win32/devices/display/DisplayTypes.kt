package io.github.kotlinmania.windowssys.windows.win32.devices.display

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.Size
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap

public typealias ArState = Int

public typealias BacklightOptimizationLevel = Int

public typealias BrightnessInterfaceVersion = Int

public typealias BlackScreenDiagnosticsCalloutParam = Int

public typealias ColorspaceTransformDataType = Int

public typealias ColorspaceTransformStageControl = Int

public typealias ColorspaceTransformTargetCapsVersion = Int

public typealias ColorspaceTransformType = Int

public typealias Dhpdev = COpaquePointer?

public typealias Dhsurf = COpaquePointer?

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
    public operator fun invoke(pdriverobj: COpaquePointer?): Bool
}

public typealias Freeobjproc = FreeobjprocFn?

public typealias Hbm = COpaquePointer?

public typealias Hdev = COpaquePointer?

public typealias Hdrvobj = COpaquePointer?

public typealias Hfastmutex = COpaquePointer?

public typealias Hsemaphore = COpaquePointer?

public typealias Hsurf = COpaquePointer?

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
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?): Bool
}

public typealias PfnDrvAccumulateD3DdirtyRect = PfnDrvAccumulateD3DdirtyRectFn?

public fun interface PfnDrvAlphaBlendFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?, param5: COpaquePointer?, param6: COpaquePointer?): Bool
}

public typealias PfnDrvAlphaBlend = PfnDrvAlphaBlendFn?

public fun interface PfnDrvAssertModeFn {
    public operator fun invoke(param0: Dhpdev, param1: Bool): Bool
}

public typealias PfnDrvAssertMode = PfnDrvAssertModeFn?

public fun interface PfnDrvAssociateSharedSurfaceFn {
    public operator fun invoke(param0: COpaquePointer?, param1: Handle, param2: Handle, param3: Size): Bool
}

public typealias PfnDrvAssociateSharedSurface = PfnDrvAssociateSharedSurfaceFn?

public fun interface PfnDrvBitBltFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?, param5: COpaquePointer?, param6: COpaquePointer?, param7: COpaquePointer?, param8: COpaquePointer?, param9: COpaquePointer?, param10: UInt): Bool
}

public typealias PfnDrvBitBlt = PfnDrvBitBltFn?

public fun interface PfnDrvCompletePdevFn {
    public operator fun invoke(param0: Dhpdev, param1: Hdev)
}

public typealias PfnDrvCompletePdev = PfnDrvCompletePdevFn?

public fun interface PfnDrvCopyBitsFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?, param5: COpaquePointer?): Bool
}

public typealias PfnDrvCopyBits = PfnDrvCopyBitsFn?

public fun interface PfnDrvCreateDeviceBitmapFn {
    public operator fun invoke(param0: Dhpdev, param1: Size, param2: UInt): Hbitmap
}

public typealias PfnDrvCreateDeviceBitmap = PfnDrvCreateDeviceBitmapFn?

public fun interface PfnDrvCreateDeviceBitmapExFn {
    public operator fun invoke(param0: Dhpdev, param1: Size, param2: UInt, param3: UInt, param4: Dhsurf, param5: UInt, param6: UInt, param7: COpaquePointer?): Hbitmap
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
    public operator fun invoke(param0: Dhpdev, param1: Int, param2: UInt, param3: COpaquePointer?): Int
}

public typealias PfnDrvDescribePixelFormat = PfnDrvDescribePixelFormatFn?

public fun interface PfnDrvDestroyFontFn {
    public operator fun invoke(param0: COpaquePointer?)
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
    public operator fun invoke(param0: Dhpdev, param1: UInt, param2: UInt, param3: COpaquePointer?): UInt
}

public typealias PfnDrvDitherColor = PfnDrvDitherColorFn?

public fun interface PfnDrvDrawEscapeFn {
    public operator fun invoke(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?, param3: COpaquePointer?, param4: UInt, param5: COpaquePointer?): UInt
}

public typealias PfnDrvDrawEscape = PfnDrvDrawEscapeFn?

public fun interface PfnDrvEnableDriverFn {
    public operator fun invoke(param0: UInt, param1: UInt, param2: COpaquePointer?): Bool
}

public typealias PfnDrvEnableDriver = PfnDrvEnableDriverFn?

public fun interface PfnDrvEnablePdevFn {
    public operator fun invoke(param0: COpaquePointer?, param1: Pcwstr, param2: UInt, param3: COpaquePointer?, param4: UInt, param5: COpaquePointer?, param6: UInt, param7: COpaquePointer?, param8: Hdev, param9: Pcwstr, param10: Handle): Dhpdev
}

public typealias PfnDrvEnablePdev = PfnDrvEnablePdevFn?

public fun interface PfnDrvEnableSurfaceFn {
    public operator fun invoke(param0: Dhpdev): Hsurf
}

public typealias PfnDrvEnableSurface = PfnDrvEnableSurfaceFn?

public fun interface PfnDrvEndDocFn {
    public operator fun invoke(pso: COpaquePointer?, fl: UInt): Bool
}

public typealias PfnDrvEndDoc = PfnDrvEndDocFn?

public fun interface PfnDrvEndDxInteropFn {
    public operator fun invoke(param0: COpaquePointer?, param1: Bool, param2: COpaquePointer?, kernelmodedevicehandle: COpaquePointer?): Bool
}

public typealias PfnDrvEndDxInterop = PfnDrvEndDxInteropFn?

public fun interface PfnDrvEscapeFn {
    public operator fun invoke(param0: COpaquePointer?, param1: UInt, param2: UInt, param3: COpaquePointer?, param4: UInt, param5: COpaquePointer?): UInt
}

public typealias PfnDrvEscape = PfnDrvEscapeFn?

public fun interface PfnDrvFillPathFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?, param5: UInt, param6: UInt): Bool
}

public typealias PfnDrvFillPath = PfnDrvFillPathFn?

public fun interface PfnDrvFontManagementFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: UInt, param3: UInt, param4: COpaquePointer?, param5: UInt, param6: COpaquePointer?): UInt
}

public typealias PfnDrvFontManagement = PfnDrvFontManagementFn?

public fun interface PfnDrvFreeFn {
    public operator fun invoke(param0: COpaquePointer?, param1: ULong)
}

public typealias PfnDrvFree = PfnDrvFreeFn?

public fun interface PfnDrvGetGlyphModeFn {
    public operator fun invoke(dhpdev: Dhpdev, pfo: COpaquePointer?): UInt
}

public typealias PfnDrvGetGlyphMode = PfnDrvGetGlyphModeFn?

public fun interface PfnDrvGetModesFn {
    public operator fun invoke(param0: Handle, param1: UInt, param2: COpaquePointer?): UInt
}

public typealias PfnDrvGetModes = PfnDrvGetModesFn?

public fun interface PfnDrvGetTrueTypeFileFn {
    public operator fun invoke(param0: ULong, param1: COpaquePointer?): COpaquePointer?
}

public typealias PfnDrvGetTrueTypeFile = PfnDrvGetTrueTypeFileFn?

public fun interface PfnDrvGradientFillFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?, param4: UInt, param5: COpaquePointer?, param6: UInt, param7: COpaquePointer?, param8: COpaquePointer?, param9: UInt): Bool
}

public typealias PfnDrvGradientFill = PfnDrvGradientFillFn?

public fun interface PfnDrvIcmCheckBitmapBitsFn {
    public operator fun invoke(param0: Dhpdev, param1: Handle, param2: COpaquePointer?, param3: COpaquePointer?): Bool
}

public typealias PfnDrvIcmCheckBitmapBits = PfnDrvIcmCheckBitmapBitsFn?

public fun interface PfnDrvIcmCreateColorTransformFn {
    public operator fun invoke(param0: Dhpdev, param1: COpaquePointer?, param2: COpaquePointer?, param3: UInt, param4: COpaquePointer?, param5: UInt, param6: COpaquePointer?, param7: UInt, param8: UInt): Handle
}

public typealias PfnDrvIcmCreateColorTransform = PfnDrvIcmCreateColorTransformFn?

public fun interface PfnDrvIcmDeleteColorTransformFn {
    public operator fun invoke(param0: Dhpdev, param1: Handle): Bool
}

public typealias PfnDrvIcmDeleteColorTransform = PfnDrvIcmDeleteColorTransformFn?

public fun interface PfnDrvIcmSetDeviceGammaRampFn {
    public operator fun invoke(param0: Dhpdev, param1: UInt, param2: COpaquePointer?): Bool
}

public typealias PfnDrvIcmSetDeviceGammaRamp = PfnDrvIcmSetDeviceGammaRampFn?

public fun interface PfnDrvLineToFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: Int, param4: Int, param5: Int, param6: Int, param7: COpaquePointer?, param8: UInt): Bool
}

public typealias PfnDrvLineTo = PfnDrvLineToFn?

public fun interface PfnDrvLoadFontFileFn {
    public operator fun invoke(param0: UInt, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?, param5: UInt, param6: UInt): ULong
}

public typealias PfnDrvLoadFontFile = PfnDrvLoadFontFileFn?

public fun interface PfnDrvLockDisplayAreaFn {
    public operator fun invoke(param0: Dhpdev, param1: COpaquePointer?)
}

public typealias PfnDrvLockDisplayArea = PfnDrvLockDisplayAreaFn?

public fun interface PfnDrvMovePointerFn {
    public operator fun invoke(pso: COpaquePointer?, x: Int, y: Int, prcl: COpaquePointer?)
}

public typealias PfnDrvMovePointer = PfnDrvMovePointerFn?

public fun interface PfnDrvNextBandFn {
    public operator fun invoke(param0: COpaquePointer?, ppointl: COpaquePointer?): Bool
}

public typealias PfnDrvNextBand = PfnDrvNextBandFn?

public fun interface PfnDrvNotifyFn {
    public operator fun invoke(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?)
}

public typealias PfnDrvNotify = PfnDrvNotifyFn?

public fun interface PfnDrvPaintFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?, param4: UInt): Bool
}

public typealias PfnDrvPaint = PfnDrvPaintFn?

public fun interface PfnDrvPlgBltFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?, param5: COpaquePointer?, param6: COpaquePointer?, param7: COpaquePointer?, param8: COpaquePointer?, param9: COpaquePointer?, param10: UInt): Bool
}

public typealias PfnDrvPlgBlt = PfnDrvPlgBltFn?

public fun interface PfnDrvQueryAdvanceWidthsFn {
    public operator fun invoke(param0: Dhpdev, param1: COpaquePointer?, param2: UInt, param3: COpaquePointer?, param4: COpaquePointer?, param5: UInt): Bool
}

public typealias PfnDrvQueryAdvanceWidths = PfnDrvQueryAdvanceWidthsFn?

public fun interface PfnDrvQueryDeviceSupportFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: UInt, param4: UInt, param5: COpaquePointer?, param6: UInt, param7: COpaquePointer?): Bool
}

public typealias PfnDrvQueryDeviceSupport = PfnDrvQueryDeviceSupportFn?

public fun interface PfnDrvQueryFontFn {
    public operator fun invoke(param0: Dhpdev, param1: ULong, param2: UInt, param3: COpaquePointer?): COpaquePointer?
}

public typealias PfnDrvQueryFont = PfnDrvQueryFontFn?

public fun interface PfnDrvQueryFontCapsFn {
    public operator fun invoke(param0: UInt, param1: COpaquePointer?): Int
}

public typealias PfnDrvQueryFontCaps = PfnDrvQueryFontCapsFn?

public fun interface PfnDrvQueryFontDataFn {
    public operator fun invoke(param0: Dhpdev, param1: COpaquePointer?, param2: UInt, param3: UInt, param4: COpaquePointer?, param5: COpaquePointer?, param6: UInt): Int
}

public typealias PfnDrvQueryFontData = PfnDrvQueryFontDataFn?

public fun interface PfnDrvQueryFontFileFn {
    public operator fun invoke(param0: ULong, param1: UInt, param2: UInt, param3: COpaquePointer?): Int
}

public typealias PfnDrvQueryFontFile = PfnDrvQueryFontFileFn?

public fun interface PfnDrvQueryFontTreeFn {
    public operator fun invoke(param0: Dhpdev, param1: ULong, param2: UInt, param3: UInt, param4: COpaquePointer?): COpaquePointer?
}

public typealias PfnDrvQueryFontTree = PfnDrvQueryFontTreeFn?

public fun interface PfnDrvQueryGlyphAttrsFn {
    public operator fun invoke(param0: COpaquePointer?, param1: UInt): COpaquePointer?
}

public typealias PfnDrvQueryGlyphAttrs = PfnDrvQueryGlyphAttrsFn?

public fun interface PfnDrvQueryPerBandInfoFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?): Bool
}

public typealias PfnDrvQueryPerBandInfo = PfnDrvQueryPerBandInfoFn?

public fun interface PfnDrvQuerySpoolTypeFn {
    public operator fun invoke(dhpdev: Dhpdev, pwchtype: Pcwstr): Bool
}

public typealias PfnDrvQuerySpoolType = PfnDrvQuerySpoolTypeFn?

public fun interface PfnDrvQueryTrueTypeOutlineFn {
    public operator fun invoke(param0: Dhpdev, param1: COpaquePointer?, param2: UInt, param3: Bool, param4: COpaquePointer?, param5: UInt, param6: COpaquePointer?): Int
}

public typealias PfnDrvQueryTrueTypeOutline = PfnDrvQueryTrueTypeOutlineFn?

public fun interface PfnDrvQueryTrueTypeSectionFn {
    public operator fun invoke(param0: UInt, param1: UInt, param2: UInt, param3: COpaquePointer?, param4: COpaquePointer?): Int
}

public typealias PfnDrvQueryTrueTypeSection = PfnDrvQueryTrueTypeSectionFn?

public fun interface PfnDrvQueryTrueTypeTableFn {
    public operator fun invoke(param0: ULong, param1: UInt, param2: UInt, param3: Int, param4: UInt, param5: COpaquePointer?, param6: COpaquePointer?, param7: COpaquePointer?): Int
}

public typealias PfnDrvQueryTrueTypeTable = PfnDrvQueryTrueTypeTableFn?

public fun interface PfnDrvRealizeBrushFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?, param5: UInt): Bool
}

public typealias PfnDrvRealizeBrush = PfnDrvRealizeBrushFn?

public fun interface PfnDrvRenderHintFn {
    public operator fun invoke(dhpdev: Dhpdev, notifycode: UInt, length: ULong, data: COpaquePointer?): Int
}

public typealias PfnDrvRenderHint = PfnDrvRenderHintFn?

public fun interface PfnDrvResetDeviceFn {
    public operator fun invoke(param0: Dhpdev, param1: COpaquePointer?): UInt
}

public typealias PfnDrvResetDevice = PfnDrvResetDeviceFn?

public fun interface PfnDrvResetPdevFn {
    public operator fun invoke(dhpdevold: Dhpdev, dhpdevnew: Dhpdev): Bool
}

public typealias PfnDrvResetPdev = PfnDrvResetPdevFn?

public fun interface PfnDrvSaveScreenBitsFn {
    public operator fun invoke(param0: COpaquePointer?, param1: UInt, param2: ULong, param3: COpaquePointer?): ULong
}

public typealias PfnDrvSaveScreenBits = PfnDrvSaveScreenBitsFn?

public fun interface PfnDrvSendPageFn {
    public operator fun invoke(param0: COpaquePointer?): Bool
}

public typealias PfnDrvSendPage = PfnDrvSendPageFn?

public fun interface PfnDrvSetPaletteFn {
    public operator fun invoke(param0: Dhpdev, param1: COpaquePointer?, param2: UInt, param3: UInt, param4: UInt): Bool
}

public typealias PfnDrvSetPalette = PfnDrvSetPaletteFn?

public fun interface PfnDrvSetPixelFormatFn {
    public operator fun invoke(param0: COpaquePointer?, param1: Int, param2: Hwnd): Bool
}

public typealias PfnDrvSetPixelFormat = PfnDrvSetPixelFormatFn?

public fun interface PfnDrvSetPointerShapeFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?, param4: Int, param5: Int, param6: Int, param7: Int, param8: COpaquePointer?, param9: UInt): UInt
}

public typealias PfnDrvSetPointerShape = PfnDrvSetPointerShapeFn?

public fun interface PfnDrvStartBandingFn {
    public operator fun invoke(param0: COpaquePointer?, ppointl: COpaquePointer?): Bool
}

public typealias PfnDrvStartBanding = PfnDrvStartBandingFn?

public fun interface PfnDrvStartDocFn {
    public operator fun invoke(pso: COpaquePointer?, pwszdocname: Pcwstr, dwjobid: UInt): Bool
}

public typealias PfnDrvStartDoc = PfnDrvStartDocFn?

public fun interface PfnDrvStartDxInteropFn {
    public operator fun invoke(param0: COpaquePointer?, param1: Bool, kernelmodedevicehandle: COpaquePointer?): Bool
}

public typealias PfnDrvStartDxInterop = PfnDrvStartDxInteropFn?

public fun interface PfnDrvStartPageFn {
    public operator fun invoke(pso: COpaquePointer?): Bool
}

public typealias PfnDrvStartPage = PfnDrvStartPageFn?

public fun interface PfnDrvStretchBltFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?, param5: COpaquePointer?, param6: COpaquePointer?, param7: COpaquePointer?, param8: COpaquePointer?, param9: COpaquePointer?, param10: UInt): Bool
}

public typealias PfnDrvStretchBlt = PfnDrvStretchBltFn?

public fun interface PfnDrvStretchBltRopFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?, param5: COpaquePointer?, param6: COpaquePointer?, param7: COpaquePointer?, param8: COpaquePointer?, param9: COpaquePointer?, param10: UInt, param11: COpaquePointer?, param12: UInt): Bool
}

public typealias PfnDrvStretchBltRop = PfnDrvStretchBltRopFn?

public fun interface PfnDrvStrokeAndFillPathFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?, param5: COpaquePointer?, param6: COpaquePointer?, param7: COpaquePointer?, param8: UInt, param9: UInt): Bool
}

public typealias PfnDrvStrokeAndFillPath = PfnDrvStrokeAndFillPathFn?

public fun interface PfnDrvStrokePathFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?, param5: COpaquePointer?, param6: COpaquePointer?, param7: UInt): Bool
}

public typealias PfnDrvStrokePath = PfnDrvStrokePathFn?

public fun interface PfnDrvSurfaceCompleteFn {
    public operator fun invoke(param0: Dhpdev, param1: Handle): Bool
}

public typealias PfnDrvSurfaceComplete = PfnDrvSurfaceCompleteFn?

public fun interface PfnDrvSwapBuffersFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?): Bool
}

public typealias PfnDrvSwapBuffers = PfnDrvSwapBuffersFn?

public fun interface PfnDrvSynchronizeFn {
    public operator fun invoke(param0: Dhpdev, param1: COpaquePointer?)
}

public typealias PfnDrvSynchronize = PfnDrvSynchronizeFn?

public fun interface PfnDrvSynchronizeRedirectionBitmapsFn {
    public operator fun invoke(param0: Dhpdev, param1: COpaquePointer?): Ntstatus
}

public typealias PfnDrvSynchronizeRedirectionBitmaps = PfnDrvSynchronizeRedirectionBitmapsFn?

public fun interface PfnDrvSynchronizeSurfaceFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: UInt)
}

public typealias PfnDrvSynchronizeSurface = PfnDrvSynchronizeSurfaceFn?

public fun interface PfnDrvTextOutFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?, param5: COpaquePointer?, param6: COpaquePointer?, param7: COpaquePointer?, param8: COpaquePointer?, param9: UInt): Bool
}

public typealias PfnDrvTextOut = PfnDrvTextOutFn?

public fun interface PfnDrvTransparentBltFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?, param5: COpaquePointer?, param6: UInt, param7: UInt): Bool
}

public typealias PfnDrvTransparentBlt = PfnDrvTransparentBltFn?

public fun interface PfnDrvUnloadFontFileFn {
    public operator fun invoke(param0: ULong): Bool
}

public typealias PfnDrvUnloadFontFile = PfnDrvUnloadFontFileFn?

public fun interface PfnDrvUnlockDisplayAreaFn {
    public operator fun invoke(param0: Dhpdev, param1: COpaquePointer?)
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
    public operator fun invoke(params: COpaquePointer?)
}

public typealias PvideoWin32kCallout = PvideoWin32kCalloutFn?

public typealias QueryDisplayConfigFlags = UInt

public typealias SetDisplayConfigFlags = UInt

public fun interface SortcompFn {
    public operator fun invoke(pv1: COpaquePointer?, pv2: COpaquePointer?): Int
}

public typealias Sortcomp = SortcompFn?

public typealias VideoBankType = Int

public typealias VideoPowerState = Int

public typealias VideoWin32kCallbacksParamsType = Int

public fun interface WndobjchangeprocFn {
    public operator fun invoke(pwo: COpaquePointer?, fl: UInt)
}

public typealias Wndobjchangeproc = WndobjchangeprocFn?
