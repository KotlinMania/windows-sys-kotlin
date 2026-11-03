package io.github.kotlinmania.windowssys.windows.win32.storage.xps

import io.github.kotlinmania.windowssys.core.BOOL

public fun interface ABORTPROCFn {
    public operator fun invoke(param0: Graphics.Gdi.HDC, param1: Int): BOOL
}

public typealias ABORTPROC = ABORTPROCFn?

public typealias PRINTER_DEVICE_CAPABILITIES = UShort

public typealias PRINT_WINDOW_FLAGS = UInt

public typealias PSINJECT_POINT = UShort

public typealias XPS_COLOR_INTERPOLATION = Int

public typealias XPS_COLOR_TYPE = Int

public typealias XPS_DASH_CAP = Int

public typealias XPS_DOCUMENT_TYPE = Int

public typealias XPS_FILL_RULE = Int

public typealias XPS_FONT_EMBEDDING = Int

public typealias XPS_IMAGE_TYPE = Int

public typealias XPS_INTERLEAVING = Int

public typealias XPS_LINE_CAP = Int

public typealias XPS_LINE_JOIN = Int

public typealias XPS_OBJECT_TYPE = Int

public typealias XPS_SEGMENT_STROKE_PATTERN = Int

public typealias XPS_SEGMENT_TYPE = Int

public typealias XPS_SIGNATURE_STATUS = Int

public typealias XPS_SIGN_FLAGS = Int

public typealias XPS_SIGN_POLICY = Int

public typealias XPS_SPREAD_METHOD = Int

public typealias XPS_STYLE_SIMULATION = Int

public typealias XPS_THUMBNAIL_SIZE = Int

public typealias XPS_TILE_MODE = Int
