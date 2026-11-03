package io.github.kotlinmania.windowssys.windows.win32.ui.input.touch

public data class GESTURECONFIG(
    public var dwID: GESTURECONFIG_ID = 0u,
    public var dwWant: UInt = 0u,
    public var dwBlock: UInt = 0u,
)

public data class GESTUREINFO(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwID: UInt = 0u,
    public var hwndTarget: Foundation.HWND = Foundation.HWND(),
    public var ptsLocation: Foundation.POINTS = Foundation.POINTS(),
    public var dwInstanceID: UInt = 0u,
    public var dwSequenceID: UInt = 0u,
    public var ullArguments: ULong = 0uL,
    public var cbExtraArgs: UInt = 0u,
)

public data class GESTURENOTIFYSTRUCT(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hwndTarget: Foundation.HWND = Foundation.HWND(),
    public var ptsLocation: Foundation.POINTS = Foundation.POINTS(),
    public var dwInstanceID: UInt = 0u,
)

public data class TOUCHINPUT(
    public var x: Int = 0,
    public var y: Int = 0,
    public var hSource: Foundation.HANDLE = Foundation.HANDLE(),
    public var dwID: UInt = 0u,
    public var dwFlags: TOUCHEVENTF_FLAGS = 0u,
    public var dwMask: TOUCHINPUTMASKF_MASK = 0u,
    public var dwTime: UInt = 0u,
    public var dwExtraInfo: ULong = 0uL,
    public var cxContact: UInt = 0u,
    public var cyContact: UInt = 0u,
)
