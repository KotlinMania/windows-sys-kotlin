package io.github.kotlinmania.windowssys.windows.win32.ui.input.touch

import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Points

public data class Gestureconfig(
    public var dwID: GestureconfigId = 0u,
    public var dwWant: UInt = 0u,
    public var dwBlock: UInt = 0u,
)

public data class Gestureinfo(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwID: UInt = 0u,
    public var hwndTarget: Hwnd = null,
    public var ptsLocation: Points = Points(),
    public var dwInstanceID: UInt = 0u,
    public var dwSequenceID: UInt = 0u,
    public var ullArguments: ULong = 0uL,
    public var cbExtraArgs: UInt = 0u,
)

public data class Gesturenotifystruct(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hwndTarget: Hwnd = null,
    public var ptsLocation: Points = Points(),
    public var dwInstanceID: UInt = 0u,
)

public data class Touchinput(
    public var x: Int = 0,
    public var y: Int = 0,
    public var hSource: Handle = null,
    public var dwID: UInt = 0u,
    public var dwFlags: ToucheventfFlags = 0u,
    public var dwMask: TouchinputmaskfMask = 0u,
    public var dwTime: UInt = 0u,
    public var dwExtraInfo: Int = 0,
    public var cxContact: UInt = 0u,
    public var cyContact: UInt = 0u,
)
