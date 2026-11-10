package io.github.kotlinmania.windowssys.windows.win32.storage.xps

import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc

public fun interface AbortprocFn {
    public operator fun invoke(param0: Hdc, param1: Int): Bool
}

public typealias Abortproc = AbortprocFn?

public typealias PrinterDeviceCapabilities = UShort

public typealias PrintWindowFlags = UInt

public typealias PsinjectPoint = UShort

public typealias XpsColorInterpolation = Int

public typealias XpsColorType = Int

public typealias XpsDashCap = Int

public typealias XpsDocumentType = Int

public typealias XpsFillRule = Int

public typealias XpsFontEmbedding = Int

public typealias XpsImageType = Int

public typealias XpsInterleaving = Int

public typealias XpsLineCap = Int

public typealias XpsLineJoin = Int

public typealias XpsObjectType = Int

public typealias XpsSegmentStrokePattern = Int

public typealias XpsSegmentType = Int

public typealias XpsSignatureStatus = Int

public typealias XpsSignFlags = Int

public typealias XpsSignPolicy = Int

public typealias XpsSpreadMethod = Int

public typealias XpsStyleSimulation = Int

public typealias XpsThumbnailSize = Int

public typealias XpsTileMode = Int
