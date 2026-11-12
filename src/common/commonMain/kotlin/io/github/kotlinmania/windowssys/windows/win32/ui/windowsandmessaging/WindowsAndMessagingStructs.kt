@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Colorref
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.Size
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Blendfunction
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbrush
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Logfonta
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Logfontw

public data class Accel(
    public var fVirt: AccelVirtFlags = 0u,
    public var key: UShort = 0u,
    public var cmd: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Accel> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Accel> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): Accel =
                    Accel(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Accel) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.fVirt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.key)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.cmd)
                }
            }
    }
}

public data class Alttabinfo(
    public var cbSize: UInt = 0u,
    public var cItems: Int = 0,
    public var cColumns: Int = 0,
    public var cRows: Int = 0,
    public var iColFocus: Int = 0,
    public var iRowFocus: Int = 0,
    public var cxItem: Int = 0,
    public var cyItem: Int = 0,
    public var ptStart: Point = Point(),
)

public data class Animationinfo(
    public var cbSize: UInt = 0u,
    public var iMinAnimate: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Animationinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Animationinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Animationinfo =
                    Animationinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Animationinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.iMinAnimate)
                }
            }
    }
}

public data class Audiodescription(
    public var cbSize: UInt = 0u,
    public var enabled: Bool = 0,
    public var locale: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Audiodescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Audiodescription> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Audiodescription =
                    Audiodescription(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Audiodescription) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.enabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.locale)
                }
            }
    }
}

public class Cbtactivatestruct internal constructor(
    public var fMouse: Bool,
    hWndActiveCtorArg: Hwnd,
) {
    public var hWndActive: Hwnd = hWndActiveCtorArg
        internal set

    public constructor() : this(
        fMouse = 0,
        hWndActiveCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Bool = this.fMouse

    public operator fun component2(): Hwnd = this.hWndActive

    public fun copy(fMouse: Bool = this.fMouse, hWndActive: Hwnd = this.hWndActive): Cbtactivatestruct = Cbtactivatestruct(fMouse = fMouse, hWndActiveCtorArg = hWndActive)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cbtactivatestruct) return false
        if (this.fMouse != other.fMouse) return false
        if (this.hWndActive != other.hWndActive) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fMouse.hashCode()
        result = 31 * result + this.hWndActive.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fMouse: Bool = 0,
            hWndActive: Hwnd = MutPtr(0L),
        ): Cbtactivatestruct =
            Cbtactivatestruct(
                fMouse = fMouse,
                hWndActiveCtorArg = hWndActive,
            )
    }
}

public class CbtCreatewnda internal constructor(
    lpcsCtorArg: MutPtr<Createstructa>,
    hwndInsertAfterCtorArg: Hwnd,
) {
    public var lpcs: MutPtr<Createstructa> = lpcsCtorArg
        internal set

    public var hwndInsertAfter: Hwnd = hwndInsertAfterCtorArg
        internal set

    public constructor() : this(
        lpcsCtorArg = MutPtr(0L),
        hwndInsertAfterCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Createstructa> = this.lpcs

    public operator fun component2(): Hwnd = this.hwndInsertAfter

    public fun copy(lpcs: MutPtr<Createstructa> = this.lpcs, hwndInsertAfter: Hwnd = this.hwndInsertAfter): CbtCreatewnda = CbtCreatewnda(lpcsCtorArg = lpcs, hwndInsertAfterCtorArg = hwndInsertAfter)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CbtCreatewnda) return false
        if (this.lpcs != other.lpcs) return false
        if (this.hwndInsertAfter != other.hwndInsertAfter) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpcs.hashCode()
        result = 31 * result + this.hwndInsertAfter.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpcs: MutPtr<Createstructa> = MutPtr(0L),
            hwndInsertAfter: Hwnd = MutPtr(0L),
        ): CbtCreatewnda =
            CbtCreatewnda(
                lpcsCtorArg = lpcs,
                hwndInsertAfterCtorArg = hwndInsertAfter,
            )
    }
}

public class CbtCreatewndw internal constructor(
    lpcsCtorArg: MutPtr<Createstructw>,
    hwndInsertAfterCtorArg: Hwnd,
) {
    public var lpcs: MutPtr<Createstructw> = lpcsCtorArg
        internal set

    public var hwndInsertAfter: Hwnd = hwndInsertAfterCtorArg
        internal set

    public constructor() : this(
        lpcsCtorArg = MutPtr(0L),
        hwndInsertAfterCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Createstructw> = this.lpcs

    public operator fun component2(): Hwnd = this.hwndInsertAfter

    public fun copy(lpcs: MutPtr<Createstructw> = this.lpcs, hwndInsertAfter: Hwnd = this.hwndInsertAfter): CbtCreatewndw = CbtCreatewndw(lpcsCtorArg = lpcs, hwndInsertAfterCtorArg = hwndInsertAfter)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CbtCreatewndw) return false
        if (this.lpcs != other.lpcs) return false
        if (this.hwndInsertAfter != other.hwndInsertAfter) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpcs.hashCode()
        result = 31 * result + this.hwndInsertAfter.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpcs: MutPtr<Createstructw> = MutPtr(0L),
            hwndInsertAfter: Hwnd = MutPtr(0L),
        ): CbtCreatewndw =
            CbtCreatewndw(
                lpcsCtorArg = lpcs,
                hwndInsertAfterCtorArg = hwndInsertAfter,
            )
    }
}

public data class Changefilterstruct(
    public var cbSize: UInt = 0u,
    public var extStatus: MsgfltinfoStatus = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Changefilterstruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Changefilterstruct> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Changefilterstruct =
                    Changefilterstruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Changefilterstruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.extStatus)
                }
            }
    }
}

public class Clientcreatestruct internal constructor(
    hWindowMenuCtorArg: Handle,
    public var idFirstChild: UInt,
) {
    public var hWindowMenu: Handle = hWindowMenuCtorArg
        internal set

    public constructor() : this(
        hWindowMenuCtorArg = MutPtr(0L),
        idFirstChild = 0u,
    )

    public operator fun component1(): Handle = this.hWindowMenu

    public operator fun component2(): UInt = this.idFirstChild

    public fun copy(hWindowMenu: Handle = this.hWindowMenu, idFirstChild: UInt = this.idFirstChild): Clientcreatestruct = Clientcreatestruct(hWindowMenuCtorArg = hWindowMenu, idFirstChild = idFirstChild)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Clientcreatestruct) return false
        if (this.hWindowMenu != other.hWindowMenu) return false
        if (this.idFirstChild != other.idFirstChild) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hWindowMenu.hashCode()
        result = 31 * result + this.idFirstChild.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hWindowMenu: Handle = MutPtr(0L),
            idFirstChild: UInt = 0u,
        ): Clientcreatestruct =
            Clientcreatestruct(
                hWindowMenuCtorArg = hWindowMenu,
                idFirstChild = idFirstChild,
            )
    }
}

public class Createstructa internal constructor(
    lpCreateParamsCtorArg: MutPtr<CVoid>,
    hInstanceCtorArg: Hinstance,
    hMenuCtorArg: Hmenu,
    hwndParentCtorArg: Hwnd,
    public var cy: Int,
    public var cx: Int,
    public var y: Int,
    public var x: Int,
    public var style: Int,
    lpszNameCtorArg: Pcstr,
    lpszClassCtorArg: Pcstr,
    public var dwExStyle: WindowExStyle,
) {
    public var lpCreateParams: MutPtr<CVoid> = lpCreateParamsCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var hMenu: Hmenu = hMenuCtorArg
        internal set

    public var hwndParent: Hwnd = hwndParentCtorArg
        internal set

    public var lpszName: Pcstr = lpszNameCtorArg
        internal set

    public var lpszClass: Pcstr = lpszClassCtorArg
        internal set

    public constructor() : this(
        lpCreateParamsCtorArg = MutPtr(0L),
        hInstanceCtorArg = MutPtr(0L),
        hMenuCtorArg = MutPtr(0L),
        hwndParentCtorArg = MutPtr(0L),
        cy = 0,
        cx = 0,
        y = 0,
        x = 0,
        style = 0,
        lpszNameCtorArg = ConstPtr(0L),
        lpszClassCtorArg = ConstPtr(0L),
        dwExStyle = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.lpCreateParams

    public operator fun component2(): Hinstance = this.hInstance

    public operator fun component3(): Hmenu = this.hMenu

    public operator fun component4(): Hwnd = this.hwndParent

    public operator fun component5(): Int = this.cy

    public operator fun component6(): Int = this.cx

    public operator fun component7(): Int = this.y

    public operator fun component8(): Int = this.x

    public operator fun component9(): Int = this.style

    public operator fun component10(): Pcstr = this.lpszName

    public operator fun component11(): Pcstr = this.lpszClass

    public operator fun component12(): WindowExStyle = this.dwExStyle

    public fun copy(lpCreateParams: MutPtr<CVoid> = this.lpCreateParams, hInstance: Hinstance = this.hInstance, hMenu: Hmenu = this.hMenu, hwndParent: Hwnd = this.hwndParent, cy: Int = this.cy, cx: Int = this.cx, y: Int = this.y, x: Int = this.x, style: Int = this.style, lpszName: Pcstr = this.lpszName, lpszClass: Pcstr = this.lpszClass, dwExStyle: WindowExStyle = this.dwExStyle): Createstructa = Createstructa(lpCreateParamsCtorArg = lpCreateParams, hInstanceCtorArg = hInstance, hMenuCtorArg = hMenu, hwndParentCtorArg = hwndParent, cy = cy, cx = cx, y = y, x = x, style = style, lpszNameCtorArg = lpszName, lpszClassCtorArg = lpszClass, dwExStyle = dwExStyle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Createstructa) return false
        if (this.lpCreateParams != other.lpCreateParams) return false
        if (this.hInstance != other.hInstance) return false
        if (this.hMenu != other.hMenu) return false
        if (this.hwndParent != other.hwndParent) return false
        if (this.cy != other.cy) return false
        if (this.cx != other.cx) return false
        if (this.y != other.y) return false
        if (this.x != other.x) return false
        if (this.style != other.style) return false
        if (this.lpszName != other.lpszName) return false
        if (this.lpszClass != other.lpszClass) return false
        if (this.dwExStyle != other.dwExStyle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpCreateParams.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.hMenu.hashCode()
        result = 31 * result + this.hwndParent.hashCode()
        result = 31 * result + this.cy.hashCode()
        result = 31 * result + this.cx.hashCode()
        result = 31 * result + this.y.hashCode()
        result = 31 * result + this.x.hashCode()
        result = 31 * result + this.style.hashCode()
        result = 31 * result + this.lpszName.hashCode()
        result = 31 * result + this.lpszClass.hashCode()
        result = 31 * result + this.dwExStyle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpCreateParams: MutPtr<CVoid> = MutPtr(0L),
            hInstance: Hinstance = MutPtr(0L),
            hMenu: Hmenu = MutPtr(0L),
            hwndParent: Hwnd = MutPtr(0L),
            cy: Int = 0,
            cx: Int = 0,
            y: Int = 0,
            x: Int = 0,
            style: Int = 0,
            lpszName: Pcstr = ConstPtr(0L),
            lpszClass: Pcstr = ConstPtr(0L),
            dwExStyle: WindowExStyle = 0u,
        ): Createstructa =
            Createstructa(
                lpCreateParamsCtorArg = lpCreateParams,
                hInstanceCtorArg = hInstance,
                hMenuCtorArg = hMenu,
                hwndParentCtorArg = hwndParent,
                cy = cy,
                cx = cx,
                y = y,
                x = x,
                style = style,
                lpszNameCtorArg = lpszName,
                lpszClassCtorArg = lpszClass,
                dwExStyle = dwExStyle,
            )
    }
}

public class Createstructw internal constructor(
    lpCreateParamsCtorArg: MutPtr<CVoid>,
    hInstanceCtorArg: Hinstance,
    hMenuCtorArg: Hmenu,
    hwndParentCtorArg: Hwnd,
    public var cy: Int,
    public var cx: Int,
    public var y: Int,
    public var x: Int,
    public var style: Int,
    lpszNameCtorArg: Pcwstr,
    lpszClassCtorArg: Pcwstr,
    public var dwExStyle: WindowExStyle,
) {
    public var lpCreateParams: MutPtr<CVoid> = lpCreateParamsCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var hMenu: Hmenu = hMenuCtorArg
        internal set

    public var hwndParent: Hwnd = hwndParentCtorArg
        internal set

    public var lpszName: Pcwstr = lpszNameCtorArg
        internal set

    public var lpszClass: Pcwstr = lpszClassCtorArg
        internal set

    public constructor() : this(
        lpCreateParamsCtorArg = MutPtr(0L),
        hInstanceCtorArg = MutPtr(0L),
        hMenuCtorArg = MutPtr(0L),
        hwndParentCtorArg = MutPtr(0L),
        cy = 0,
        cx = 0,
        y = 0,
        x = 0,
        style = 0,
        lpszNameCtorArg = ConstPtr(0L),
        lpszClassCtorArg = ConstPtr(0L),
        dwExStyle = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.lpCreateParams

    public operator fun component2(): Hinstance = this.hInstance

    public operator fun component3(): Hmenu = this.hMenu

    public operator fun component4(): Hwnd = this.hwndParent

    public operator fun component5(): Int = this.cy

    public operator fun component6(): Int = this.cx

    public operator fun component7(): Int = this.y

    public operator fun component8(): Int = this.x

    public operator fun component9(): Int = this.style

    public operator fun component10(): Pcwstr = this.lpszName

    public operator fun component11(): Pcwstr = this.lpszClass

    public operator fun component12(): WindowExStyle = this.dwExStyle

    public fun copy(lpCreateParams: MutPtr<CVoid> = this.lpCreateParams, hInstance: Hinstance = this.hInstance, hMenu: Hmenu = this.hMenu, hwndParent: Hwnd = this.hwndParent, cy: Int = this.cy, cx: Int = this.cx, y: Int = this.y, x: Int = this.x, style: Int = this.style, lpszName: Pcwstr = this.lpszName, lpszClass: Pcwstr = this.lpszClass, dwExStyle: WindowExStyle = this.dwExStyle): Createstructw = Createstructw(lpCreateParamsCtorArg = lpCreateParams, hInstanceCtorArg = hInstance, hMenuCtorArg = hMenu, hwndParentCtorArg = hwndParent, cy = cy, cx = cx, y = y, x = x, style = style, lpszNameCtorArg = lpszName, lpszClassCtorArg = lpszClass, dwExStyle = dwExStyle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Createstructw) return false
        if (this.lpCreateParams != other.lpCreateParams) return false
        if (this.hInstance != other.hInstance) return false
        if (this.hMenu != other.hMenu) return false
        if (this.hwndParent != other.hwndParent) return false
        if (this.cy != other.cy) return false
        if (this.cx != other.cx) return false
        if (this.y != other.y) return false
        if (this.x != other.x) return false
        if (this.style != other.style) return false
        if (this.lpszName != other.lpszName) return false
        if (this.lpszClass != other.lpszClass) return false
        if (this.dwExStyle != other.dwExStyle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpCreateParams.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.hMenu.hashCode()
        result = 31 * result + this.hwndParent.hashCode()
        result = 31 * result + this.cy.hashCode()
        result = 31 * result + this.cx.hashCode()
        result = 31 * result + this.y.hashCode()
        result = 31 * result + this.x.hashCode()
        result = 31 * result + this.style.hashCode()
        result = 31 * result + this.lpszName.hashCode()
        result = 31 * result + this.lpszClass.hashCode()
        result = 31 * result + this.dwExStyle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpCreateParams: MutPtr<CVoid> = MutPtr(0L),
            hInstance: Hinstance = MutPtr(0L),
            hMenu: Hmenu = MutPtr(0L),
            hwndParent: Hwnd = MutPtr(0L),
            cy: Int = 0,
            cx: Int = 0,
            y: Int = 0,
            x: Int = 0,
            style: Int = 0,
            lpszName: Pcwstr = ConstPtr(0L),
            lpszClass: Pcwstr = ConstPtr(0L),
            dwExStyle: WindowExStyle = 0u,
        ): Createstructw =
            Createstructw(
                lpCreateParamsCtorArg = lpCreateParams,
                hInstanceCtorArg = hInstance,
                hMenuCtorArg = hMenu,
                hwndParentCtorArg = hwndParent,
                cy = cy,
                cx = cx,
                y = y,
                x = x,
                style = style,
                lpszNameCtorArg = lpszName,
                lpszClassCtorArg = lpszClass,
                dwExStyle = dwExStyle,
            )
    }
}

public class Cursorinfo internal constructor(
    public var cbSize: UInt,
    public var flags: CursorinfoFlags,
    hCursorCtorArg: Hcursor,
    public var ptScreenPos: Point,
) {
    public var hCursor: Hcursor = hCursorCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        flags = 0u,
        hCursorCtorArg = MutPtr(0L),
        ptScreenPos = Point(),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): CursorinfoFlags = this.flags

    public operator fun component3(): Hcursor = this.hCursor

    public operator fun component4(): Point = this.ptScreenPos

    public fun copy(cbSize: UInt = this.cbSize, flags: CursorinfoFlags = this.flags, hCursor: Hcursor = this.hCursor, ptScreenPos: Point = this.ptScreenPos): Cursorinfo = Cursorinfo(cbSize = cbSize, flags = flags, hCursorCtorArg = hCursor, ptScreenPos = ptScreenPos)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cursorinfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.flags != other.flags) return false
        if (this.hCursor != other.hCursor) return false
        if (this.ptScreenPos != other.ptScreenPos) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.hCursor.hashCode()
        result = 31 * result + this.ptScreenPos.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            flags: CursorinfoFlags = 0u,
            hCursor: Hcursor = MutPtr(0L),
            ptScreenPos: Point = Point(),
        ): Cursorinfo =
            Cursorinfo(
                cbSize = cbSize,
                flags = flags,
                hCursorCtorArg = hCursor,
                ptScreenPos = ptScreenPos,
            )
    }
}

public data class Cursorshape(
    public var xHotSpot: Int = 0,
    public var yHotSpot: Int = 0,
    public var cx: Int = 0,
    public var cy: Int = 0,
    public var cbWidth: Int = 0,
    public var planes: UByte = 0u,
    public var bitsPixel: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cursorshape> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cursorshape> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Cursorshape =
                    Cursorshape(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 21L),
                    )
                override fun writeNative(addr: Long, value: Cursorshape) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.xHotSpot)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.yHotSpot)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.cx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.cy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.cbWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 20L, value.planes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 21L, value.bitsPixel)
                }
            }
    }
}

public class Cwpretstruct internal constructor(
    public var lResult: Lresult,
    public var lParam: Lparam,
    public var wParam: Wparam,
    public var message: UInt,
    hwndCtorArg: Hwnd,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public constructor() : this(
        lResult = 0L,
        lParam = 0L,
        wParam = 0uL,
        message = 0u,
        hwndCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Lresult = this.lResult

    public operator fun component2(): Lparam = this.lParam

    public operator fun component3(): Wparam = this.wParam

    public operator fun component4(): UInt = this.message

    public operator fun component5(): Hwnd = this.hwnd

    public fun copy(lResult: Lresult = this.lResult, lParam: Lparam = this.lParam, wParam: Wparam = this.wParam, message: UInt = this.message, hwnd: Hwnd = this.hwnd): Cwpretstruct = Cwpretstruct(lResult = lResult, lParam = lParam, wParam = wParam, message = message, hwndCtorArg = hwnd)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cwpretstruct) return false
        if (this.lResult != other.lResult) return false
        if (this.lParam != other.lParam) return false
        if (this.wParam != other.wParam) return false
        if (this.message != other.message) return false
        if (this.hwnd != other.hwnd) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lResult.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.wParam.hashCode()
        result = 31 * result + this.message.hashCode()
        result = 31 * result + this.hwnd.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lResult: Lresult = 0L,
            lParam: Lparam = 0L,
            wParam: Wparam = 0uL,
            message: UInt = 0u,
            hwnd: Hwnd = MutPtr(0L),
        ): Cwpretstruct =
            Cwpretstruct(
                lResult = lResult,
                lParam = lParam,
                wParam = wParam,
                message = message,
                hwndCtorArg = hwnd,
            )
    }
}

public class Cwpstruct internal constructor(
    public var lParam: Lparam,
    public var wParam: Wparam,
    public var message: UInt,
    hwndCtorArg: Hwnd,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public constructor() : this(
        lParam = 0L,
        wParam = 0uL,
        message = 0u,
        hwndCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Lparam = this.lParam

    public operator fun component2(): Wparam = this.wParam

    public operator fun component3(): UInt = this.message

    public operator fun component4(): Hwnd = this.hwnd

    public fun copy(lParam: Lparam = this.lParam, wParam: Wparam = this.wParam, message: UInt = this.message, hwnd: Hwnd = this.hwnd): Cwpstruct = Cwpstruct(lParam = lParam, wParam = wParam, message = message, hwndCtorArg = hwnd)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cwpstruct) return false
        if (this.lParam != other.lParam) return false
        if (this.wParam != other.wParam) return false
        if (this.message != other.message) return false
        if (this.hwnd != other.hwnd) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lParam.hashCode()
        result = 31 * result + this.wParam.hashCode()
        result = 31 * result + this.message.hashCode()
        result = 31 * result + this.hwnd.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lParam: Lparam = 0L,
            wParam: Wparam = 0uL,
            message: UInt = 0u,
            hwnd: Hwnd = MutPtr(0L),
        ): Cwpstruct =
            Cwpstruct(
                lParam = lParam,
                wParam = wParam,
                message = message,
                hwndCtorArg = hwnd,
            )
    }
}

public data class Debughookinfo(
    public var idThread: UInt = 0u,
    public var idThreadInstaller: UInt = 0u,
    public var lParam: Lparam = 0L,
    public var wParam: Wparam = 0uL,
    public var code: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Debughookinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Debughookinfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Debughookinfo =
                    Debughookinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Debughookinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.idThread)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.idThreadInstaller)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.lParam)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.wParam)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.code)
                }
            }
    }
}

public data class DeviceEventBecomingReady(
    public var version: UInt = 0u,
    public var reason: UInt = 0u,
    public var estimated100msToReady: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceEventBecomingReady> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceEventBecomingReady> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): DeviceEventBecomingReady =
                    DeviceEventBecomingReady(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DeviceEventBecomingReady) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reason)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.estimated100msToReady)
                }
            }
    }
}

public data class DeviceEventExternalRequest(
    public var version: UInt = 0u,
    public var deviceClass: UInt = 0u,
    public var buttonStatus: UShort = 0u,
    public var request: UShort = 0u,
    public var systemTime: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceEventExternalRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceEventExternalRequest> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): DeviceEventExternalRequest =
                    DeviceEventExternalRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DeviceEventExternalRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.deviceClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.buttonStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.request)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.systemTime)
                }
            }
    }
}

public data class DeviceEventGenericData(
    public var eventNumber: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceEventGenericData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceEventGenericData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DeviceEventGenericData =
                    DeviceEventGenericData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DeviceEventGenericData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.eventNumber)
                }
            }
    }
}

public data class DeviceEventMount(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var fileSystemNameLength: UInt = 0u,
    public var fileSystemNameOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceEventMount> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceEventMount> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DeviceEventMount =
                    DeviceEventMount(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: DeviceEventMount) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.fileSystemNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.fileSystemNameOffset)
                }
            }
    }
}

public data class DeviceEventRbcData(
    public var eventNumber: UInt = 0u,
    public var senseQualifier: UByte = 0u,
    public var senseCode: UByte = 0u,
    public var senseKey: UByte = 0u,
    public var reserved: UByte = 0u,
    public var information: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceEventRbcData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceEventRbcData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): DeviceEventRbcData =
                    DeviceEventRbcData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DeviceEventRbcData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.eventNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.senseQualifier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.senseCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.senseKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.information)
                }
            }
    }
}

public data class DevBroadcastDeviceinterfaceA(
    public var dbccSize: UInt = 0u,
    public var dbccDevicetype: UInt = 0u,
    public var dbccReserved: UInt = 0u,
    public var dbccClassguid: Guid = Guid(),
    public var dbccName: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevBroadcastDeviceinterfaceA) return false
        if (this.dbccSize != other.dbccSize) return false
        if (this.dbccDevicetype != other.dbccDevicetype) return false
        if (this.dbccReserved != other.dbccReserved) return false
        if (this.dbccClassguid != other.dbccClassguid) return false
        if (!this.dbccName.contentEquals(other.dbccName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dbccSize.hashCode()
        result = 31 * result + this.dbccDevicetype.hashCode()
        result = 31 * result + this.dbccReserved.hashCode()
        result = 31 * result + this.dbccClassguid.hashCode()
        result = 31 * result + this.dbccName.contentHashCode()
        return result
    }
}

public data class DevBroadcastDeviceinterfaceW(
    public var dbccSize: UInt = 0u,
    public var dbccDevicetype: UInt = 0u,
    public var dbccReserved: UInt = 0u,
    public var dbccClassguid: Guid = Guid(),
    public var dbccName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevBroadcastDeviceinterfaceW) return false
        if (this.dbccSize != other.dbccSize) return false
        if (this.dbccDevicetype != other.dbccDevicetype) return false
        if (this.dbccReserved != other.dbccReserved) return false
        if (this.dbccClassguid != other.dbccClassguid) return false
        if (!this.dbccName.contentEquals(other.dbccName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dbccSize.hashCode()
        result = 31 * result + this.dbccDevicetype.hashCode()
        result = 31 * result + this.dbccReserved.hashCode()
        result = 31 * result + this.dbccClassguid.hashCode()
        result = 31 * result + this.dbccName.contentHashCode()
        return result
    }
}

public data class DevBroadcastDevnode(
    public var dbcdSize: UInt = 0u,
    public var dbcdDevicetype: UInt = 0u,
    public var dbcdReserved: UInt = 0u,
    public var dbcdDevnode: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevBroadcastDevnode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevBroadcastDevnode> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DevBroadcastDevnode =
                    DevBroadcastDevnode(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: DevBroadcastDevnode) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dbcdSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dbcdDevicetype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dbcdReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dbcdDevnode)
                }
            }
    }
}

public class DevBroadcastHandle internal constructor(
    public var dbchSize: UInt,
    public var dbchDevicetype: UInt,
    public var dbchReserved: UInt,
    dbchHandleCtorArg: Handle,
    dbchHdevnotifyCtorArg: Hdevnotify,
    public var dbchEventguid: Guid,
    public var dbchNameoffset: Int,
    public var dbchData: UByteArray,
) {
    public var dbchHandle: Handle = dbchHandleCtorArg
        internal set

    public var dbchHdevnotify: Hdevnotify = dbchHdevnotifyCtorArg
        internal set

    public constructor() : this(
        dbchSize = 0u,
        dbchDevicetype = 0u,
        dbchReserved = 0u,
        dbchHandleCtorArg = MutPtr(0L),
        dbchHdevnotifyCtorArg = MutPtr(0L),
        dbchEventguid = Guid(),
        dbchNameoffset = 0,
        dbchData = UByteArray(1),
    )

    public operator fun component1(): UInt = this.dbchSize

    public operator fun component2(): UInt = this.dbchDevicetype

    public operator fun component3(): UInt = this.dbchReserved

    public operator fun component4(): Handle = this.dbchHandle

    public operator fun component5(): Hdevnotify = this.dbchHdevnotify

    public operator fun component6(): Guid = this.dbchEventguid

    public operator fun component7(): Int = this.dbchNameoffset

    public operator fun component8(): UByteArray = this.dbchData

    public fun copy(dbchSize: UInt = this.dbchSize, dbchDevicetype: UInt = this.dbchDevicetype, dbchReserved: UInt = this.dbchReserved, dbchHandle: Handle = this.dbchHandle, dbchHdevnotify: Hdevnotify = this.dbchHdevnotify, dbchEventguid: Guid = this.dbchEventguid, dbchNameoffset: Int = this.dbchNameoffset, dbchData: UByteArray = this.dbchData): DevBroadcastHandle = DevBroadcastHandle(dbchSize = dbchSize, dbchDevicetype = dbchDevicetype, dbchReserved = dbchReserved, dbchHandleCtorArg = dbchHandle, dbchHdevnotifyCtorArg = dbchHdevnotify, dbchEventguid = dbchEventguid, dbchNameoffset = dbchNameoffset, dbchData = dbchData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevBroadcastHandle) return false
        if (this.dbchSize != other.dbchSize) return false
        if (this.dbchDevicetype != other.dbchDevicetype) return false
        if (this.dbchReserved != other.dbchReserved) return false
        if (this.dbchHandle != other.dbchHandle) return false
        if (this.dbchHdevnotify != other.dbchHdevnotify) return false
        if (this.dbchEventguid != other.dbchEventguid) return false
        if (this.dbchNameoffset != other.dbchNameoffset) return false
        if (!this.dbchData.contentEquals(other.dbchData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dbchSize.hashCode()
        result = 31 * result + this.dbchDevicetype.hashCode()
        result = 31 * result + this.dbchReserved.hashCode()
        result = 31 * result + this.dbchHandle.hashCode()
        result = 31 * result + this.dbchHdevnotify.hashCode()
        result = 31 * result + this.dbchEventguid.hashCode()
        result = 31 * result + this.dbchNameoffset.hashCode()
        result = 31 * result + this.dbchData.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dbchSize: UInt = 0u,
            dbchDevicetype: UInt = 0u,
            dbchReserved: UInt = 0u,
            dbchHandle: Handle = MutPtr(0L),
            dbchHdevnotify: Hdevnotify = MutPtr(0L),
            dbchEventguid: Guid = Guid(),
            dbchNameoffset: Int = 0,
            dbchData: UByteArray = UByteArray(1),
        ): DevBroadcastHandle =
            DevBroadcastHandle(
                dbchSize = dbchSize,
                dbchDevicetype = dbchDevicetype,
                dbchReserved = dbchReserved,
                dbchHandleCtorArg = dbchHandle,
                dbchHdevnotifyCtorArg = dbchHdevnotify,
                dbchEventguid = dbchEventguid,
                dbchNameoffset = dbchNameoffset,
                dbchData = dbchData,
            )
    }
}

public data class DevBroadcastHandle32(
    public var dbchSize: UInt = 0u,
    public var dbchDevicetype: UInt = 0u,
    public var dbchReserved: UInt = 0u,
    public var dbchHandle: UInt = 0u,
    public var dbchHdevnotify: UInt = 0u,
    public var dbchEventguid: Guid = Guid(),
    public var dbchNameoffset: Int = 0,
    public var dbchData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevBroadcastHandle32) return false
        if (this.dbchSize != other.dbchSize) return false
        if (this.dbchDevicetype != other.dbchDevicetype) return false
        if (this.dbchReserved != other.dbchReserved) return false
        if (this.dbchHandle != other.dbchHandle) return false
        if (this.dbchHdevnotify != other.dbchHdevnotify) return false
        if (this.dbchEventguid != other.dbchEventguid) return false
        if (this.dbchNameoffset != other.dbchNameoffset) return false
        if (!this.dbchData.contentEquals(other.dbchData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dbchSize.hashCode()
        result = 31 * result + this.dbchDevicetype.hashCode()
        result = 31 * result + this.dbchReserved.hashCode()
        result = 31 * result + this.dbchHandle.hashCode()
        result = 31 * result + this.dbchHdevnotify.hashCode()
        result = 31 * result + this.dbchEventguid.hashCode()
        result = 31 * result + this.dbchNameoffset.hashCode()
        result = 31 * result + this.dbchData.contentHashCode()
        return result
    }
}

public data class DevBroadcastHandle64(
    public var dbchSize: UInt = 0u,
    public var dbchDevicetype: UInt = 0u,
    public var dbchReserved: UInt = 0u,
    public var dbchHandle: ULong = 0uL,
    public var dbchHdevnotify: ULong = 0uL,
    public var dbchEventguid: Guid = Guid(),
    public var dbchNameoffset: Int = 0,
    public var dbchData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevBroadcastHandle64) return false
        if (this.dbchSize != other.dbchSize) return false
        if (this.dbchDevicetype != other.dbchDevicetype) return false
        if (this.dbchReserved != other.dbchReserved) return false
        if (this.dbchHandle != other.dbchHandle) return false
        if (this.dbchHdevnotify != other.dbchHdevnotify) return false
        if (this.dbchEventguid != other.dbchEventguid) return false
        if (this.dbchNameoffset != other.dbchNameoffset) return false
        if (!this.dbchData.contentEquals(other.dbchData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dbchSize.hashCode()
        result = 31 * result + this.dbchDevicetype.hashCode()
        result = 31 * result + this.dbchReserved.hashCode()
        result = 31 * result + this.dbchHandle.hashCode()
        result = 31 * result + this.dbchHdevnotify.hashCode()
        result = 31 * result + this.dbchEventguid.hashCode()
        result = 31 * result + this.dbchNameoffset.hashCode()
        result = 31 * result + this.dbchData.contentHashCode()
        return result
    }
}

public data class DevBroadcastHdr(
    public var dbchSize: UInt = 0u,
    public var dbchDevicetype: DevBroadcastHdrDeviceType = 0u,
    public var dbchReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevBroadcastHdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevBroadcastHdr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): DevBroadcastHdr =
                    DevBroadcastHdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DevBroadcastHdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dbchSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dbchDevicetype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dbchReserved)
                }
            }
    }
}

public data class DevBroadcastNet(
    public var dbcnSize: UInt = 0u,
    public var dbcnDevicetype: UInt = 0u,
    public var dbcnReserved: UInt = 0u,
    public var dbcnResource: UInt = 0u,
    public var dbcnFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevBroadcastNet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevBroadcastNet> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): DevBroadcastNet =
                    DevBroadcastNet(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DevBroadcastNet) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dbcnSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dbcnDevicetype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dbcnReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dbcnResource)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dbcnFlags)
                }
            }
    }
}

public data class DevBroadcastOem(
    public var dbcoSize: UInt = 0u,
    public var dbcoDevicetype: UInt = 0u,
    public var dbcoReserved: UInt = 0u,
    public var dbcoIdentifier: UInt = 0u,
    public var dbcoSuppfunc: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevBroadcastOem> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevBroadcastOem> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): DevBroadcastOem =
                    DevBroadcastOem(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DevBroadcastOem) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dbcoSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dbcoDevicetype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dbcoReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dbcoIdentifier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dbcoSuppfunc)
                }
            }
    }
}

public data class DevBroadcastPortA(
    public var dbcpSize: UInt = 0u,
    public var dbcpDevicetype: UInt = 0u,
    public var dbcpReserved: UInt = 0u,
    public var dbcpName: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevBroadcastPortA) return false
        if (this.dbcpSize != other.dbcpSize) return false
        if (this.dbcpDevicetype != other.dbcpDevicetype) return false
        if (this.dbcpReserved != other.dbcpReserved) return false
        if (!this.dbcpName.contentEquals(other.dbcpName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dbcpSize.hashCode()
        result = 31 * result + this.dbcpDevicetype.hashCode()
        result = 31 * result + this.dbcpReserved.hashCode()
        result = 31 * result + this.dbcpName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevBroadcastPortA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevBroadcastPortA> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DevBroadcastPortA =
                    DevBroadcastPortA(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                        ).readNative(addr + 12L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: DevBroadcastPortA) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dbcpSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dbcpDevicetype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dbcpReserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                    ).writeNative(addr + 12L, value.dbcpName.toList())
                }
            }
    }
}

public data class DevBroadcastPortW(
    public var dbcpSize: UInt = 0u,
    public var dbcpDevicetype: UInt = 0u,
    public var dbcpReserved: UInt = 0u,
    public var dbcpName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevBroadcastPortW) return false
        if (this.dbcpSize != other.dbcpSize) return false
        if (this.dbcpDevicetype != other.dbcpDevicetype) return false
        if (this.dbcpReserved != other.dbcpReserved) return false
        if (!this.dbcpName.contentEquals(other.dbcpName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dbcpSize.hashCode()
        result = 31 * result + this.dbcpDevicetype.hashCode()
        result = 31 * result + this.dbcpReserved.hashCode()
        result = 31 * result + this.dbcpName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevBroadcastPortW> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevBroadcastPortW> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DevBroadcastPortW =
                    DevBroadcastPortW(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 12L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: DevBroadcastPortW) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dbcpSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dbcpDevicetype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dbcpReserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 12L, value.dbcpName.toList())
                }
            }
    }
}

public data class DevBroadcastVolume(
    public var dbcvSize: UInt = 0u,
    public var dbcvDevicetype: UInt = 0u,
    public var dbcvReserved: UInt = 0u,
    public var dbcvUnitmask: UInt = 0u,
    public var dbcvFlags: DevBroadcastVolumeFlags = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevBroadcastVolume> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevBroadcastVolume> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): DevBroadcastVolume =
                    DevBroadcastVolume(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DevBroadcastVolume) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dbcvSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dbcvDevicetype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dbcvReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dbcvUnitmask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.dbcvFlags)
                }
            }
    }
}

public data class DiskHealthNotificationData(
    public var deviceGuid: Guid = Guid(),
)

public data class Dlgitemtemplate(
    public var style: UInt = 0u,
    public var dwExtendedStyle: UInt = 0u,
    public var x: Short = 0,
    public var y: Short = 0,
    public var cx: Short = 0,
    public var cy: Short = 0,
    public var id: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dlgitemtemplate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dlgitemtemplate> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 18L
                override fun readNative(addr: Long): Dlgitemtemplate =
                    Dlgitemtemplate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Dlgitemtemplate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.style)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwExtendedStyle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 8L, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 10L, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 12L, value.cx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 14L, value.cy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.id)
                }
            }
    }
}

public data class Dlgtemplate(
    public var style: UInt = 0u,
    public var dwExtendedStyle: UInt = 0u,
    public var cdit: UShort = 0u,
    public var x: Short = 0,
    public var y: Short = 0,
    public var cx: Short = 0,
    public var cy: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dlgtemplate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dlgtemplate> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 18L
                override fun readNative(addr: Long): Dlgtemplate =
                    Dlgtemplate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Dlgtemplate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.style)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwExtendedStyle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.cdit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 10L, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 12L, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 14L, value.cx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 16L, value.cy)
                }
            }
    }
}

public class Dropstruct internal constructor(
    hwndSourceCtorArg: Hwnd,
    hwndSinkCtorArg: Hwnd,
    public var wFmt: UInt,
    public var dwData: Int,
    public var ptDrop: Point,
    public var dwControlData: UInt,
) {
    public var hwndSource: Hwnd = hwndSourceCtorArg
        internal set

    public var hwndSink: Hwnd = hwndSinkCtorArg
        internal set

    public constructor() : this(
        hwndSourceCtorArg = MutPtr(0L),
        hwndSinkCtorArg = MutPtr(0L),
        wFmt = 0u,
        dwData = 0,
        ptDrop = Point(),
        dwControlData = 0u,
    )

    public operator fun component1(): Hwnd = this.hwndSource

    public operator fun component2(): Hwnd = this.hwndSink

    public operator fun component3(): UInt = this.wFmt

    public operator fun component4(): Int = this.dwData

    public operator fun component5(): Point = this.ptDrop

    public operator fun component6(): UInt = this.dwControlData

    public fun copy(hwndSource: Hwnd = this.hwndSource, hwndSink: Hwnd = this.hwndSink, wFmt: UInt = this.wFmt, dwData: Int = this.dwData, ptDrop: Point = this.ptDrop, dwControlData: UInt = this.dwControlData): Dropstruct = Dropstruct(hwndSourceCtorArg = hwndSource, hwndSinkCtorArg = hwndSink, wFmt = wFmt, dwData = dwData, ptDrop = ptDrop, dwControlData = dwControlData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dropstruct) return false
        if (this.hwndSource != other.hwndSource) return false
        if (this.hwndSink != other.hwndSink) return false
        if (this.wFmt != other.wFmt) return false
        if (this.dwData != other.dwData) return false
        if (this.ptDrop != other.ptDrop) return false
        if (this.dwControlData != other.dwControlData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hwndSource.hashCode()
        result = 31 * result + this.hwndSink.hashCode()
        result = 31 * result + this.wFmt.hashCode()
        result = 31 * result + this.dwData.hashCode()
        result = 31 * result + this.ptDrop.hashCode()
        result = 31 * result + this.dwControlData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hwndSource: Hwnd = MutPtr(0L),
            hwndSink: Hwnd = MutPtr(0L),
            wFmt: UInt = 0u,
            dwData: Int = 0,
            ptDrop: Point = Point(),
            dwControlData: UInt = 0u,
        ): Dropstruct =
            Dropstruct(
                hwndSourceCtorArg = hwndSource,
                hwndSinkCtorArg = hwndSink,
                wFmt = wFmt,
                dwData = dwData,
                ptDrop = ptDrop,
                dwControlData = dwControlData,
            )
    }
}

public class Eventmsg internal constructor(
    public var message: UInt,
    public var paramL: UInt,
    public var paramH: UInt,
    public var time: UInt,
    hwndCtorArg: Hwnd,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public constructor() : this(
        message = 0u,
        paramL = 0u,
        paramH = 0u,
        time = 0u,
        hwndCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.message

    public operator fun component2(): UInt = this.paramL

    public operator fun component3(): UInt = this.paramH

    public operator fun component4(): UInt = this.time

    public operator fun component5(): Hwnd = this.hwnd

    public fun copy(message: UInt = this.message, paramL: UInt = this.paramL, paramH: UInt = this.paramH, time: UInt = this.time, hwnd: Hwnd = this.hwnd): Eventmsg = Eventmsg(message = message, paramL = paramL, paramH = paramH, time = time, hwndCtorArg = hwnd)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Eventmsg) return false
        if (this.message != other.message) return false
        if (this.paramL != other.paramL) return false
        if (this.paramH != other.paramH) return false
        if (this.time != other.time) return false
        if (this.hwnd != other.hwnd) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.message.hashCode()
        result = 31 * result + this.paramL.hashCode()
        result = 31 * result + this.paramH.hashCode()
        result = 31 * result + this.time.hashCode()
        result = 31 * result + this.hwnd.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            message: UInt = 0u,
            paramL: UInt = 0u,
            paramH: UInt = 0u,
            time: UInt = 0u,
            hwnd: Hwnd = MutPtr(0L),
        ): Eventmsg =
            Eventmsg(
                message = message,
                paramL = paramL,
                paramH = paramH,
                time = time,
                hwndCtorArg = hwnd,
            )
    }
}

public class Flashwinfo internal constructor(
    public var cbSize: UInt,
    hwndCtorArg: Hwnd,
    public var dwFlags: FlashwinfoFlags,
    public var uCount: UInt,
    public var dwTimeout: UInt,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hwndCtorArg = MutPtr(0L),
        dwFlags = 0u,
        uCount = 0u,
        dwTimeout = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Hwnd = this.hwnd

    public operator fun component3(): FlashwinfoFlags = this.dwFlags

    public operator fun component4(): UInt = this.uCount

    public operator fun component5(): UInt = this.dwTimeout

    public fun copy(cbSize: UInt = this.cbSize, hwnd: Hwnd = this.hwnd, dwFlags: FlashwinfoFlags = this.dwFlags, uCount: UInt = this.uCount, dwTimeout: UInt = this.dwTimeout): Flashwinfo = Flashwinfo(cbSize = cbSize, hwndCtorArg = hwnd, dwFlags = dwFlags, uCount = uCount, dwTimeout = dwTimeout)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Flashwinfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hwnd != other.hwnd) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.uCount != other.uCount) return false
        if (this.dwTimeout != other.dwTimeout) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hwnd.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.uCount.hashCode()
        result = 31 * result + this.dwTimeout.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            hwnd: Hwnd = MutPtr(0L),
            dwFlags: FlashwinfoFlags = 0u,
            uCount: UInt = 0u,
            dwTimeout: UInt = 0u,
        ): Flashwinfo =
            Flashwinfo(
                cbSize = cbSize,
                hwndCtorArg = hwnd,
                dwFlags = dwFlags,
                uCount = uCount,
                dwTimeout = dwTimeout,
            )
    }
}

public data class Getclipbmetadata(
    public var version: UInt = 0u,
    public var isDelayRendered: Bool = 0,
    public var isSynthetic: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Getclipbmetadata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Getclipbmetadata> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Getclipbmetadata =
                    Getclipbmetadata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Getclipbmetadata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.isDelayRendered)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.isSynthetic)
                }
            }
    }
}

public data class GuidIoDiskCloneArrivalInformation(
    public var diskNumber: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GuidIoDiskCloneArrivalInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GuidIoDiskCloneArrivalInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): GuidIoDiskCloneArrivalInformation =
                    GuidIoDiskCloneArrivalInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GuidIoDiskCloneArrivalInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.diskNumber)
                }
            }
    }
}

public class Guithreadinfo internal constructor(
    public var cbSize: UInt,
    public var flags: GuithreadinfoFlags,
    hwndActiveCtorArg: Hwnd,
    hwndFocusCtorArg: Hwnd,
    hwndCaptureCtorArg: Hwnd,
    hwndMenuOwnerCtorArg: Hwnd,
    hwndMoveSizeCtorArg: Hwnd,
    hwndCaretCtorArg: Hwnd,
    public var rcCaret: Rect,
) {
    public var hwndActive: Hwnd = hwndActiveCtorArg
        internal set

    public var hwndFocus: Hwnd = hwndFocusCtorArg
        internal set

    public var hwndCapture: Hwnd = hwndCaptureCtorArg
        internal set

    public var hwndMenuOwner: Hwnd = hwndMenuOwnerCtorArg
        internal set

    public var hwndMoveSize: Hwnd = hwndMoveSizeCtorArg
        internal set

    public var hwndCaret: Hwnd = hwndCaretCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        flags = 0u,
        hwndActiveCtorArg = MutPtr(0L),
        hwndFocusCtorArg = MutPtr(0L),
        hwndCaptureCtorArg = MutPtr(0L),
        hwndMenuOwnerCtorArg = MutPtr(0L),
        hwndMoveSizeCtorArg = MutPtr(0L),
        hwndCaretCtorArg = MutPtr(0L),
        rcCaret = Rect(),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): GuithreadinfoFlags = this.flags

    public operator fun component3(): Hwnd = this.hwndActive

    public operator fun component4(): Hwnd = this.hwndFocus

    public operator fun component5(): Hwnd = this.hwndCapture

    public operator fun component6(): Hwnd = this.hwndMenuOwner

    public operator fun component7(): Hwnd = this.hwndMoveSize

    public operator fun component8(): Hwnd = this.hwndCaret

    public operator fun component9(): Rect = this.rcCaret

    public fun copy(cbSize: UInt = this.cbSize, flags: GuithreadinfoFlags = this.flags, hwndActive: Hwnd = this.hwndActive, hwndFocus: Hwnd = this.hwndFocus, hwndCapture: Hwnd = this.hwndCapture, hwndMenuOwner: Hwnd = this.hwndMenuOwner, hwndMoveSize: Hwnd = this.hwndMoveSize, hwndCaret: Hwnd = this.hwndCaret, rcCaret: Rect = this.rcCaret): Guithreadinfo = Guithreadinfo(cbSize = cbSize, flags = flags, hwndActiveCtorArg = hwndActive, hwndFocusCtorArg = hwndFocus, hwndCaptureCtorArg = hwndCapture, hwndMenuOwnerCtorArg = hwndMenuOwner, hwndMoveSizeCtorArg = hwndMoveSize, hwndCaretCtorArg = hwndCaret, rcCaret = rcCaret)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Guithreadinfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.flags != other.flags) return false
        if (this.hwndActive != other.hwndActive) return false
        if (this.hwndFocus != other.hwndFocus) return false
        if (this.hwndCapture != other.hwndCapture) return false
        if (this.hwndMenuOwner != other.hwndMenuOwner) return false
        if (this.hwndMoveSize != other.hwndMoveSize) return false
        if (this.hwndCaret != other.hwndCaret) return false
        if (this.rcCaret != other.rcCaret) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.hwndActive.hashCode()
        result = 31 * result + this.hwndFocus.hashCode()
        result = 31 * result + this.hwndCapture.hashCode()
        result = 31 * result + this.hwndMenuOwner.hashCode()
        result = 31 * result + this.hwndMoveSize.hashCode()
        result = 31 * result + this.hwndCaret.hashCode()
        result = 31 * result + this.rcCaret.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            flags: GuithreadinfoFlags = 0u,
            hwndActive: Hwnd = MutPtr(0L),
            hwndFocus: Hwnd = MutPtr(0L),
            hwndCapture: Hwnd = MutPtr(0L),
            hwndMenuOwner: Hwnd = MutPtr(0L),
            hwndMoveSize: Hwnd = MutPtr(0L),
            hwndCaret: Hwnd = MutPtr(0L),
            rcCaret: Rect = Rect(),
        ): Guithreadinfo =
            Guithreadinfo(
                cbSize = cbSize,
                flags = flags,
                hwndActiveCtorArg = hwndActive,
                hwndFocusCtorArg = hwndFocus,
                hwndCaptureCtorArg = hwndCapture,
                hwndMenuOwnerCtorArg = hwndMenuOwner,
                hwndMoveSizeCtorArg = hwndMoveSize,
                hwndCaretCtorArg = hwndCaret,
                rcCaret = rcCaret,
            )
    }
}

public class Hardwarehookstruct internal constructor(
    hwndCtorArg: Hwnd,
    public var message: UInt,
    public var wParam: Wparam,
    public var lParam: Lparam,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public constructor() : this(
        hwndCtorArg = MutPtr(0L),
        message = 0u,
        wParam = 0uL,
        lParam = 0L,
    )

    public operator fun component1(): Hwnd = this.hwnd

    public operator fun component2(): UInt = this.message

    public operator fun component3(): Wparam = this.wParam

    public operator fun component4(): Lparam = this.lParam

    public fun copy(hwnd: Hwnd = this.hwnd, message: UInt = this.message, wParam: Wparam = this.wParam, lParam: Lparam = this.lParam): Hardwarehookstruct = Hardwarehookstruct(hwndCtorArg = hwnd, message = message, wParam = wParam, lParam = lParam)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Hardwarehookstruct) return false
        if (this.hwnd != other.hwnd) return false
        if (this.message != other.message) return false
        if (this.wParam != other.wParam) return false
        if (this.lParam != other.lParam) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hwnd.hashCode()
        result = 31 * result + this.message.hashCode()
        result = 31 * result + this.wParam.hashCode()
        result = 31 * result + this.lParam.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hwnd: Hwnd = MutPtr(0L),
            message: UInt = 0u,
            wParam: Wparam = 0uL,
            lParam: Lparam = 0L,
        ): Hardwarehookstruct =
            Hardwarehookstruct(
                hwndCtorArg = hwnd,
                message = message,
                wParam = wParam,
                lParam = lParam,
            )
    }
}

public class Iconinfo internal constructor(
    public var fIcon: Bool,
    public var xHotspot: UInt,
    public var yHotspot: UInt,
    hbmMaskCtorArg: Hbitmap,
    hbmColorCtorArg: Hbitmap,
) {
    public var hbmMask: Hbitmap = hbmMaskCtorArg
        internal set

    public var hbmColor: Hbitmap = hbmColorCtorArg
        internal set

    public constructor() : this(
        fIcon = 0,
        xHotspot = 0u,
        yHotspot = 0u,
        hbmMaskCtorArg = MutPtr(0L),
        hbmColorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Bool = this.fIcon

    public operator fun component2(): UInt = this.xHotspot

    public operator fun component3(): UInt = this.yHotspot

    public operator fun component4(): Hbitmap = this.hbmMask

    public operator fun component5(): Hbitmap = this.hbmColor

    public fun copy(fIcon: Bool = this.fIcon, xHotspot: UInt = this.xHotspot, yHotspot: UInt = this.yHotspot, hbmMask: Hbitmap = this.hbmMask, hbmColor: Hbitmap = this.hbmColor): Iconinfo = Iconinfo(fIcon = fIcon, xHotspot = xHotspot, yHotspot = yHotspot, hbmMaskCtorArg = hbmMask, hbmColorCtorArg = hbmColor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Iconinfo) return false
        if (this.fIcon != other.fIcon) return false
        if (this.xHotspot != other.xHotspot) return false
        if (this.yHotspot != other.yHotspot) return false
        if (this.hbmMask != other.hbmMask) return false
        if (this.hbmColor != other.hbmColor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fIcon.hashCode()
        result = 31 * result + this.xHotspot.hashCode()
        result = 31 * result + this.yHotspot.hashCode()
        result = 31 * result + this.hbmMask.hashCode()
        result = 31 * result + this.hbmColor.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fIcon: Bool = 0,
            xHotspot: UInt = 0u,
            yHotspot: UInt = 0u,
            hbmMask: Hbitmap = MutPtr(0L),
            hbmColor: Hbitmap = MutPtr(0L),
        ): Iconinfo =
            Iconinfo(
                fIcon = fIcon,
                xHotspot = xHotspot,
                yHotspot = yHotspot,
                hbmMaskCtorArg = hbmMask,
                hbmColorCtorArg = hbmColor,
            )
    }
}

public class Iconinfoexa internal constructor(
    public var cbSize: UInt,
    public var fIcon: Bool,
    public var xHotspot: UInt,
    public var yHotspot: UInt,
    hbmMaskCtorArg: Hbitmap,
    hbmColorCtorArg: Hbitmap,
    public var wResID: UShort,
    public var szModName: ByteArray,
    public var szResName: ByteArray,
) {
    public var hbmMask: Hbitmap = hbmMaskCtorArg
        internal set

    public var hbmColor: Hbitmap = hbmColorCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        fIcon = 0,
        xHotspot = 0u,
        yHotspot = 0u,
        hbmMaskCtorArg = MutPtr(0L),
        hbmColorCtorArg = MutPtr(0L),
        wResID = 0u,
        szModName = ByteArray(260),
        szResName = ByteArray(260),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Bool = this.fIcon

    public operator fun component3(): UInt = this.xHotspot

    public operator fun component4(): UInt = this.yHotspot

    public operator fun component5(): Hbitmap = this.hbmMask

    public operator fun component6(): Hbitmap = this.hbmColor

    public operator fun component7(): UShort = this.wResID

    public operator fun component8(): ByteArray = this.szModName

    public operator fun component9(): ByteArray = this.szResName

    public fun copy(cbSize: UInt = this.cbSize, fIcon: Bool = this.fIcon, xHotspot: UInt = this.xHotspot, yHotspot: UInt = this.yHotspot, hbmMask: Hbitmap = this.hbmMask, hbmColor: Hbitmap = this.hbmColor, wResID: UShort = this.wResID, szModName: ByteArray = this.szModName, szResName: ByteArray = this.szResName): Iconinfoexa = Iconinfoexa(cbSize = cbSize, fIcon = fIcon, xHotspot = xHotspot, yHotspot = yHotspot, hbmMaskCtorArg = hbmMask, hbmColorCtorArg = hbmColor, wResID = wResID, szModName = szModName, szResName = szResName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Iconinfoexa) return false
        if (this.cbSize != other.cbSize) return false
        if (this.fIcon != other.fIcon) return false
        if (this.xHotspot != other.xHotspot) return false
        if (this.yHotspot != other.yHotspot) return false
        if (this.hbmMask != other.hbmMask) return false
        if (this.hbmColor != other.hbmColor) return false
        if (this.wResID != other.wResID) return false
        if (!this.szModName.contentEquals(other.szModName)) return false
        if (!this.szResName.contentEquals(other.szResName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fIcon.hashCode()
        result = 31 * result + this.xHotspot.hashCode()
        result = 31 * result + this.yHotspot.hashCode()
        result = 31 * result + this.hbmMask.hashCode()
        result = 31 * result + this.hbmColor.hashCode()
        result = 31 * result + this.wResID.hashCode()
        result = 31 * result + this.szModName.contentHashCode()
        result = 31 * result + this.szResName.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            fIcon: Bool = 0,
            xHotspot: UInt = 0u,
            yHotspot: UInt = 0u,
            hbmMask: Hbitmap = MutPtr(0L),
            hbmColor: Hbitmap = MutPtr(0L),
            wResID: UShort = 0u,
            szModName: ByteArray = ByteArray(260),
            szResName: ByteArray = ByteArray(260),
        ): Iconinfoexa =
            Iconinfoexa(
                cbSize = cbSize,
                fIcon = fIcon,
                xHotspot = xHotspot,
                yHotspot = yHotspot,
                hbmMaskCtorArg = hbmMask,
                hbmColorCtorArg = hbmColor,
                wResID = wResID,
                szModName = szModName,
                szResName = szResName,
            )
    }
}

public class Iconinfoexw internal constructor(
    public var cbSize: UInt,
    public var fIcon: Bool,
    public var xHotspot: UInt,
    public var yHotspot: UInt,
    hbmMaskCtorArg: Hbitmap,
    hbmColorCtorArg: Hbitmap,
    public var wResID: UShort,
    public var szModName: UShortArray,
    public var szResName: UShortArray,
) {
    public var hbmMask: Hbitmap = hbmMaskCtorArg
        internal set

    public var hbmColor: Hbitmap = hbmColorCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        fIcon = 0,
        xHotspot = 0u,
        yHotspot = 0u,
        hbmMaskCtorArg = MutPtr(0L),
        hbmColorCtorArg = MutPtr(0L),
        wResID = 0u,
        szModName = UShortArray(260),
        szResName = UShortArray(260),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Bool = this.fIcon

    public operator fun component3(): UInt = this.xHotspot

    public operator fun component4(): UInt = this.yHotspot

    public operator fun component5(): Hbitmap = this.hbmMask

    public operator fun component6(): Hbitmap = this.hbmColor

    public operator fun component7(): UShort = this.wResID

    public operator fun component8(): UShortArray = this.szModName

    public operator fun component9(): UShortArray = this.szResName

    public fun copy(cbSize: UInt = this.cbSize, fIcon: Bool = this.fIcon, xHotspot: UInt = this.xHotspot, yHotspot: UInt = this.yHotspot, hbmMask: Hbitmap = this.hbmMask, hbmColor: Hbitmap = this.hbmColor, wResID: UShort = this.wResID, szModName: UShortArray = this.szModName, szResName: UShortArray = this.szResName): Iconinfoexw = Iconinfoexw(cbSize = cbSize, fIcon = fIcon, xHotspot = xHotspot, yHotspot = yHotspot, hbmMaskCtorArg = hbmMask, hbmColorCtorArg = hbmColor, wResID = wResID, szModName = szModName, szResName = szResName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Iconinfoexw) return false
        if (this.cbSize != other.cbSize) return false
        if (this.fIcon != other.fIcon) return false
        if (this.xHotspot != other.xHotspot) return false
        if (this.yHotspot != other.yHotspot) return false
        if (this.hbmMask != other.hbmMask) return false
        if (this.hbmColor != other.hbmColor) return false
        if (this.wResID != other.wResID) return false
        if (!this.szModName.contentEquals(other.szModName)) return false
        if (!this.szResName.contentEquals(other.szResName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fIcon.hashCode()
        result = 31 * result + this.xHotspot.hashCode()
        result = 31 * result + this.yHotspot.hashCode()
        result = 31 * result + this.hbmMask.hashCode()
        result = 31 * result + this.hbmColor.hashCode()
        result = 31 * result + this.wResID.hashCode()
        result = 31 * result + this.szModName.contentHashCode()
        result = 31 * result + this.szResName.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            fIcon: Bool = 0,
            xHotspot: UInt = 0u,
            yHotspot: UInt = 0u,
            hbmMask: Hbitmap = MutPtr(0L),
            hbmColor: Hbitmap = MutPtr(0L),
            wResID: UShort = 0u,
            szModName: UShortArray = UShortArray(260),
            szResName: UShortArray = UShortArray(260),
        ): Iconinfoexw =
            Iconinfoexw(
                cbSize = cbSize,
                fIcon = fIcon,
                xHotspot = xHotspot,
                yHotspot = yHotspot,
                hbmMaskCtorArg = hbmMask,
                hbmColorCtorArg = hbmColor,
                wResID = wResID,
                szModName = szModName,
                szResName = szResName,
            )
    }
}

public data class Iconmetricsa(
    public var cbSize: UInt = 0u,
    public var iHorzSpacing: Int = 0,
    public var iVertSpacing: Int = 0,
    public var iTitleWrap: Int = 0,
    public var lfFont: Logfonta = Logfonta(),
)

public data class Iconmetricsw(
    public var cbSize: UInt = 0u,
    public var iHorzSpacing: Int = 0,
    public var iVertSpacing: Int = 0,
    public var iTitleWrap: Int = 0,
    public var lfFont: Logfontw = Logfontw(),
)

public class IndexedResourceQualifier internal constructor(
    nameCtorArg: Pwstr,
    valueCtorArg: Pwstr,
) {
    public var name: Pwstr = nameCtorArg
        internal set

    public var value: Pwstr = valueCtorArg
        internal set

    public constructor() : this(
        nameCtorArg = MutPtr(0L),
        valueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.name

    public operator fun component2(): Pwstr = this.value

    public fun copy(name: Pwstr = this.name, value: Pwstr = this.value): IndexedResourceQualifier = IndexedResourceQualifier(nameCtorArg = name, valueCtorArg = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IndexedResourceQualifier) return false
        if (this.name != other.name) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            name: Pwstr = MutPtr(0L),
            value: Pwstr = MutPtr(0L),
        ): IndexedResourceQualifier =
            IndexedResourceQualifier(
                nameCtorArg = name,
                valueCtorArg = value,
            )
    }
}

public data class Kbdllhookstruct(
    public var vkCode: UInt = 0u,
    public var scanCode: UInt = 0u,
    public var flags: KbdllhookstructFlags = 0u,
    public var time: UInt = 0u,
    public var dwExtraInfo: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kbdllhookstruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kbdllhookstruct> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Kbdllhookstruct =
                    Kbdllhookstruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Kbdllhookstruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.vkCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.scanCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.time)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.dwExtraInfo)
                }
            }
    }
}

public class Mdicreatestructa internal constructor(
    szClassCtorArg: Pcstr,
    szTitleCtorArg: Pcstr,
    hOwnerCtorArg: Handle,
    public var x: Int,
    public var y: Int,
    public var cx: Int,
    public var cy: Int,
    public var style: WindowStyle,
    public var lParam: Lparam,
) {
    public var szClass: Pcstr = szClassCtorArg
        internal set

    public var szTitle: Pcstr = szTitleCtorArg
        internal set

    public var hOwner: Handle = hOwnerCtorArg
        internal set

    public constructor() : this(
        szClassCtorArg = ConstPtr(0L),
        szTitleCtorArg = ConstPtr(0L),
        hOwnerCtorArg = MutPtr(0L),
        x = 0,
        y = 0,
        cx = 0,
        cy = 0,
        style = 0u,
        lParam = 0L,
    )

    public operator fun component1(): Pcstr = this.szClass

    public operator fun component2(): Pcstr = this.szTitle

    public operator fun component3(): Handle = this.hOwner

    public operator fun component4(): Int = this.x

    public operator fun component5(): Int = this.y

    public operator fun component6(): Int = this.cx

    public operator fun component7(): Int = this.cy

    public operator fun component8(): WindowStyle = this.style

    public operator fun component9(): Lparam = this.lParam

    public fun copy(szClass: Pcstr = this.szClass, szTitle: Pcstr = this.szTitle, hOwner: Handle = this.hOwner, x: Int = this.x, y: Int = this.y, cx: Int = this.cx, cy: Int = this.cy, style: WindowStyle = this.style, lParam: Lparam = this.lParam): Mdicreatestructa = Mdicreatestructa(szClassCtorArg = szClass, szTitleCtorArg = szTitle, hOwnerCtorArg = hOwner, x = x, y = y, cx = cx, cy = cy, style = style, lParam = lParam)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mdicreatestructa) return false
        if (this.szClass != other.szClass) return false
        if (this.szTitle != other.szTitle) return false
        if (this.hOwner != other.hOwner) return false
        if (this.x != other.x) return false
        if (this.y != other.y) return false
        if (this.cx != other.cx) return false
        if (this.cy != other.cy) return false
        if (this.style != other.style) return false
        if (this.lParam != other.lParam) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szClass.hashCode()
        result = 31 * result + this.szTitle.hashCode()
        result = 31 * result + this.hOwner.hashCode()
        result = 31 * result + this.x.hashCode()
        result = 31 * result + this.y.hashCode()
        result = 31 * result + this.cx.hashCode()
        result = 31 * result + this.cy.hashCode()
        result = 31 * result + this.style.hashCode()
        result = 31 * result + this.lParam.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szClass: Pcstr = ConstPtr(0L),
            szTitle: Pcstr = ConstPtr(0L),
            hOwner: Handle = MutPtr(0L),
            x: Int = 0,
            y: Int = 0,
            cx: Int = 0,
            cy: Int = 0,
            style: WindowStyle = 0u,
            lParam: Lparam = 0L,
        ): Mdicreatestructa =
            Mdicreatestructa(
                szClassCtorArg = szClass,
                szTitleCtorArg = szTitle,
                hOwnerCtorArg = hOwner,
                x = x,
                y = y,
                cx = cx,
                cy = cy,
                style = style,
                lParam = lParam,
            )
    }
}

public class Mdicreatestructw internal constructor(
    szClassCtorArg: Pcwstr,
    szTitleCtorArg: Pcwstr,
    hOwnerCtorArg: Handle,
    public var x: Int,
    public var y: Int,
    public var cx: Int,
    public var cy: Int,
    public var style: WindowStyle,
    public var lParam: Lparam,
) {
    public var szClass: Pcwstr = szClassCtorArg
        internal set

    public var szTitle: Pcwstr = szTitleCtorArg
        internal set

    public var hOwner: Handle = hOwnerCtorArg
        internal set

    public constructor() : this(
        szClassCtorArg = ConstPtr(0L),
        szTitleCtorArg = ConstPtr(0L),
        hOwnerCtorArg = MutPtr(0L),
        x = 0,
        y = 0,
        cx = 0,
        cy = 0,
        style = 0u,
        lParam = 0L,
    )

    public operator fun component1(): Pcwstr = this.szClass

    public operator fun component2(): Pcwstr = this.szTitle

    public operator fun component3(): Handle = this.hOwner

    public operator fun component4(): Int = this.x

    public operator fun component5(): Int = this.y

    public operator fun component6(): Int = this.cx

    public operator fun component7(): Int = this.cy

    public operator fun component8(): WindowStyle = this.style

    public operator fun component9(): Lparam = this.lParam

    public fun copy(szClass: Pcwstr = this.szClass, szTitle: Pcwstr = this.szTitle, hOwner: Handle = this.hOwner, x: Int = this.x, y: Int = this.y, cx: Int = this.cx, cy: Int = this.cy, style: WindowStyle = this.style, lParam: Lparam = this.lParam): Mdicreatestructw = Mdicreatestructw(szClassCtorArg = szClass, szTitleCtorArg = szTitle, hOwnerCtorArg = hOwner, x = x, y = y, cx = cx, cy = cy, style = style, lParam = lParam)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mdicreatestructw) return false
        if (this.szClass != other.szClass) return false
        if (this.szTitle != other.szTitle) return false
        if (this.hOwner != other.hOwner) return false
        if (this.x != other.x) return false
        if (this.y != other.y) return false
        if (this.cx != other.cx) return false
        if (this.cy != other.cy) return false
        if (this.style != other.style) return false
        if (this.lParam != other.lParam) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szClass.hashCode()
        result = 31 * result + this.szTitle.hashCode()
        result = 31 * result + this.hOwner.hashCode()
        result = 31 * result + this.x.hashCode()
        result = 31 * result + this.y.hashCode()
        result = 31 * result + this.cx.hashCode()
        result = 31 * result + this.cy.hashCode()
        result = 31 * result + this.style.hashCode()
        result = 31 * result + this.lParam.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szClass: Pcwstr = ConstPtr(0L),
            szTitle: Pcwstr = ConstPtr(0L),
            hOwner: Handle = MutPtr(0L),
            x: Int = 0,
            y: Int = 0,
            cx: Int = 0,
            cy: Int = 0,
            style: WindowStyle = 0u,
            lParam: Lparam = 0L,
        ): Mdicreatestructw =
            Mdicreatestructw(
                szClassCtorArg = szClass,
                szTitleCtorArg = szTitle,
                hOwnerCtorArg = hOwner,
                x = x,
                y = y,
                cx = cx,
                cy = cy,
                style = style,
                lParam = lParam,
            )
    }
}

public class Mdinextmenu internal constructor(
    hmenuInCtorArg: Hmenu,
    hmenuNextCtorArg: Hmenu,
    hwndNextCtorArg: Hwnd,
) {
    public var hmenuIn: Hmenu = hmenuInCtorArg
        internal set

    public var hmenuNext: Hmenu = hmenuNextCtorArg
        internal set

    public var hwndNext: Hwnd = hwndNextCtorArg
        internal set

    public constructor() : this(
        hmenuInCtorArg = MutPtr(0L),
        hmenuNextCtorArg = MutPtr(0L),
        hwndNextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Hmenu = this.hmenuIn

    public operator fun component2(): Hmenu = this.hmenuNext

    public operator fun component3(): Hwnd = this.hwndNext

    public fun copy(hmenuIn: Hmenu = this.hmenuIn, hmenuNext: Hmenu = this.hmenuNext, hwndNext: Hwnd = this.hwndNext): Mdinextmenu = Mdinextmenu(hmenuInCtorArg = hmenuIn, hmenuNextCtorArg = hmenuNext, hwndNextCtorArg = hwndNext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mdinextmenu) return false
        if (this.hmenuIn != other.hmenuIn) return false
        if (this.hmenuNext != other.hmenuNext) return false
        if (this.hwndNext != other.hwndNext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hmenuIn.hashCode()
        result = 31 * result + this.hmenuNext.hashCode()
        result = 31 * result + this.hwndNext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hmenuIn: Hmenu = MutPtr(0L),
            hmenuNext: Hmenu = MutPtr(0L),
            hwndNext: Hwnd = MutPtr(0L),
        ): Mdinextmenu =
            Mdinextmenu(
                hmenuInCtorArg = hmenuIn,
                hmenuNextCtorArg = hmenuNext,
                hwndNextCtorArg = hwndNext,
            )
    }
}

public class Menubarinfo internal constructor(
    public var cbSize: UInt,
    public var rcBar: Rect,
    hMenuCtorArg: Hmenu,
    hwndMenuCtorArg: Hwnd,
    public var bitfield: Int,
) {
    public var hMenu: Hmenu = hMenuCtorArg
        internal set

    public var hwndMenu: Hwnd = hwndMenuCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        rcBar = Rect(),
        hMenuCtorArg = MutPtr(0L),
        hwndMenuCtorArg = MutPtr(0L),
        bitfield = 0,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Rect = this.rcBar

    public operator fun component3(): Hmenu = this.hMenu

    public operator fun component4(): Hwnd = this.hwndMenu

    public operator fun component5(): Int = this.bitfield

    public fun copy(cbSize: UInt = this.cbSize, rcBar: Rect = this.rcBar, hMenu: Hmenu = this.hMenu, hwndMenu: Hwnd = this.hwndMenu, bitfield: Int = this.bitfield): Menubarinfo = Menubarinfo(cbSize = cbSize, rcBar = rcBar, hMenuCtorArg = hMenu, hwndMenuCtorArg = hwndMenu, bitfield = bitfield)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Menubarinfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.rcBar != other.rcBar) return false
        if (this.hMenu != other.hMenu) return false
        if (this.hwndMenu != other.hwndMenu) return false
        if (this.bitfield != other.bitfield) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.rcBar.hashCode()
        result = 31 * result + this.hMenu.hashCode()
        result = 31 * result + this.hwndMenu.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            rcBar: Rect = Rect(),
            hMenu: Hmenu = MutPtr(0L),
            hwndMenu: Hwnd = MutPtr(0L),
            bitfield: Int = 0,
        ): Menubarinfo =
            Menubarinfo(
                cbSize = cbSize,
                rcBar = rcBar,
                hMenuCtorArg = hMenu,
                hwndMenuCtorArg = hwndMenu,
                bitfield = bitfield,
            )
    }
}

public data class MenuexTemplateHeader(
    public var wVersion: UShort = 0u,
    public var wOffset: UShort = 0u,
    public var dwHelpId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MenuexTemplateHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MenuexTemplateHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MenuexTemplateHeader =
                    MenuexTemplateHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MenuexTemplateHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwHelpId)
                }
            }
    }
}

public data class MenuexTemplateItem(
    public var dwType: UInt = 0u,
    public var dwState: UInt = 0u,
    public var uId: UInt = 0u,
    public var wFlags: UShort = 0u,
    public var szText: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MenuexTemplateItem) return false
        if (this.dwType != other.dwType) return false
        if (this.dwState != other.dwState) return false
        if (this.uId != other.uId) return false
        if (this.wFlags != other.wFlags) return false
        if (!this.szText.contentEquals(other.szText)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwType.hashCode()
        result = 31 * result + this.dwState.hashCode()
        result = 31 * result + this.uId.hashCode()
        result = 31 * result + this.wFlags.hashCode()
        result = 31 * result + this.szText.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MenuexTemplateItem> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MenuexTemplateItem> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MenuexTemplateItem =
                    MenuexTemplateItem(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 14L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: MenuexTemplateItem) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.uId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.wFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 14L, value.szText.toList())
                }
            }
    }
}

public class Menugetobjectinfo internal constructor(
    public var dwFlags: MenugetobjectinfoFlags,
    public var uPos: UInt,
    hmenuCtorArg: Hmenu,
    riidCtorArg: MutPtr<CVoid>,
    pvObjCtorArg: MutPtr<CVoid>,
) {
    public var hmenu: Hmenu = hmenuCtorArg
        internal set

    public var riid: MutPtr<CVoid> = riidCtorArg
        internal set

    public var pvObj: MutPtr<CVoid> = pvObjCtorArg
        internal set

    public constructor() : this(
        dwFlags = 0u,
        uPos = 0u,
        hmenuCtorArg = MutPtr(0L),
        riidCtorArg = MutPtr(0L),
        pvObjCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MenugetobjectinfoFlags = this.dwFlags

    public operator fun component2(): UInt = this.uPos

    public operator fun component3(): Hmenu = this.hmenu

    public operator fun component4(): MutPtr<CVoid> = this.riid

    public operator fun component5(): MutPtr<CVoid> = this.pvObj

    public fun copy(dwFlags: MenugetobjectinfoFlags = this.dwFlags, uPos: UInt = this.uPos, hmenu: Hmenu = this.hmenu, riid: MutPtr<CVoid> = this.riid, pvObj: MutPtr<CVoid> = this.pvObj): Menugetobjectinfo = Menugetobjectinfo(dwFlags = dwFlags, uPos = uPos, hmenuCtorArg = hmenu, riidCtorArg = riid, pvObjCtorArg = pvObj)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Menugetobjectinfo) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.uPos != other.uPos) return false
        if (this.hmenu != other.hmenu) return false
        if (this.riid != other.riid) return false
        if (this.pvObj != other.pvObj) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.uPos.hashCode()
        result = 31 * result + this.hmenu.hashCode()
        result = 31 * result + this.riid.hashCode()
        result = 31 * result + this.pvObj.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Menugetobjectinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Menugetobjectinfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Menugetobjectinfo =
                    Menugetobjectinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Menugetobjectinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uPos)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.hmenu)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.riid)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.pvObj)
                }
            }

        public operator fun invoke(
            dwFlags: MenugetobjectinfoFlags = 0u,
            uPos: UInt = 0u,
            hmenu: Hmenu = MutPtr(0L),
            riid: MutPtr<CVoid> = MutPtr(0L),
            pvObj: MutPtr<CVoid> = MutPtr(0L),
        ): Menugetobjectinfo =
            Menugetobjectinfo(
                dwFlags = dwFlags,
                uPos = uPos,
                hmenuCtorArg = hmenu,
                riidCtorArg = riid,
                pvObjCtorArg = pvObj,
            )
    }
}

public class Menuinfo internal constructor(
    public var cbSize: UInt,
    public var fMask: MenuinfoMask,
    public var dwStyle: MenuinfoStyle,
    public var cyMax: UInt,
    hbrBackCtorArg: Hbrush,
    public var dwContextHelpID: UInt,
    public var dwMenuData: Int,
) {
    public var hbrBack: Hbrush = hbrBackCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        fMask = 0u,
        dwStyle = 0u,
        cyMax = 0u,
        hbrBackCtorArg = MutPtr(0L),
        dwContextHelpID = 0u,
        dwMenuData = 0,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MenuinfoMask = this.fMask

    public operator fun component3(): MenuinfoStyle = this.dwStyle

    public operator fun component4(): UInt = this.cyMax

    public operator fun component5(): Hbrush = this.hbrBack

    public operator fun component6(): UInt = this.dwContextHelpID

    public operator fun component7(): Int = this.dwMenuData

    public fun copy(cbSize: UInt = this.cbSize, fMask: MenuinfoMask = this.fMask, dwStyle: MenuinfoStyle = this.dwStyle, cyMax: UInt = this.cyMax, hbrBack: Hbrush = this.hbrBack, dwContextHelpID: UInt = this.dwContextHelpID, dwMenuData: Int = this.dwMenuData): Menuinfo = Menuinfo(cbSize = cbSize, fMask = fMask, dwStyle = dwStyle, cyMax = cyMax, hbrBackCtorArg = hbrBack, dwContextHelpID = dwContextHelpID, dwMenuData = dwMenuData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Menuinfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.fMask != other.fMask) return false
        if (this.dwStyle != other.dwStyle) return false
        if (this.cyMax != other.cyMax) return false
        if (this.hbrBack != other.hbrBack) return false
        if (this.dwContextHelpID != other.dwContextHelpID) return false
        if (this.dwMenuData != other.dwMenuData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fMask.hashCode()
        result = 31 * result + this.dwStyle.hashCode()
        result = 31 * result + this.cyMax.hashCode()
        result = 31 * result + this.hbrBack.hashCode()
        result = 31 * result + this.dwContextHelpID.hashCode()
        result = 31 * result + this.dwMenuData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            fMask: MenuinfoMask = 0u,
            dwStyle: MenuinfoStyle = 0u,
            cyMax: UInt = 0u,
            hbrBack: Hbrush = MutPtr(0L),
            dwContextHelpID: UInt = 0u,
            dwMenuData: Int = 0,
        ): Menuinfo =
            Menuinfo(
                cbSize = cbSize,
                fMask = fMask,
                dwStyle = dwStyle,
                cyMax = cyMax,
                hbrBackCtorArg = hbrBack,
                dwContextHelpID = dwContextHelpID,
                dwMenuData = dwMenuData,
            )
    }
}

public class Menuiteminfoa internal constructor(
    public var cbSize: UInt,
    public var fMask: MenuItemMask,
    public var fType: MenuItemType,
    public var fState: MenuItemState,
    public var wID: UInt,
    hSubMenuCtorArg: Hmenu,
    hbmpCheckedCtorArg: Hbitmap,
    hbmpUncheckedCtorArg: Hbitmap,
    public var dwItemData: Int,
    dwTypeDataCtorArg: Pstr,
    public var cch: UInt,
    hbmpItemCtorArg: Hbitmap,
) {
    public var hSubMenu: Hmenu = hSubMenuCtorArg
        internal set

    public var hbmpChecked: Hbitmap = hbmpCheckedCtorArg
        internal set

    public var hbmpUnchecked: Hbitmap = hbmpUncheckedCtorArg
        internal set

    public var dwTypeData: Pstr = dwTypeDataCtorArg
        internal set

    public var hbmpItem: Hbitmap = hbmpItemCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        fMask = 0u,
        fType = 0u,
        fState = 0u,
        wID = 0u,
        hSubMenuCtorArg = MutPtr(0L),
        hbmpCheckedCtorArg = MutPtr(0L),
        hbmpUncheckedCtorArg = MutPtr(0L),
        dwItemData = 0,
        dwTypeDataCtorArg = MutPtr(0L),
        cch = 0u,
        hbmpItemCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MenuItemMask = this.fMask

    public operator fun component3(): MenuItemType = this.fType

    public operator fun component4(): MenuItemState = this.fState

    public operator fun component5(): UInt = this.wID

    public operator fun component6(): Hmenu = this.hSubMenu

    public operator fun component7(): Hbitmap = this.hbmpChecked

    public operator fun component8(): Hbitmap = this.hbmpUnchecked

    public operator fun component9(): Int = this.dwItemData

    public operator fun component10(): Pstr = this.dwTypeData

    public operator fun component11(): UInt = this.cch

    public operator fun component12(): Hbitmap = this.hbmpItem

    public fun copy(cbSize: UInt = this.cbSize, fMask: MenuItemMask = this.fMask, fType: MenuItemType = this.fType, fState: MenuItemState = this.fState, wID: UInt = this.wID, hSubMenu: Hmenu = this.hSubMenu, hbmpChecked: Hbitmap = this.hbmpChecked, hbmpUnchecked: Hbitmap = this.hbmpUnchecked, dwItemData: Int = this.dwItemData, dwTypeData: Pstr = this.dwTypeData, cch: UInt = this.cch, hbmpItem: Hbitmap = this.hbmpItem): Menuiteminfoa = Menuiteminfoa(cbSize = cbSize, fMask = fMask, fType = fType, fState = fState, wID = wID, hSubMenuCtorArg = hSubMenu, hbmpCheckedCtorArg = hbmpChecked, hbmpUncheckedCtorArg = hbmpUnchecked, dwItemData = dwItemData, dwTypeDataCtorArg = dwTypeData, cch = cch, hbmpItemCtorArg = hbmpItem)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Menuiteminfoa) return false
        if (this.cbSize != other.cbSize) return false
        if (this.fMask != other.fMask) return false
        if (this.fType != other.fType) return false
        if (this.fState != other.fState) return false
        if (this.wID != other.wID) return false
        if (this.hSubMenu != other.hSubMenu) return false
        if (this.hbmpChecked != other.hbmpChecked) return false
        if (this.hbmpUnchecked != other.hbmpUnchecked) return false
        if (this.dwItemData != other.dwItemData) return false
        if (this.dwTypeData != other.dwTypeData) return false
        if (this.cch != other.cch) return false
        if (this.hbmpItem != other.hbmpItem) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fMask.hashCode()
        result = 31 * result + this.fType.hashCode()
        result = 31 * result + this.fState.hashCode()
        result = 31 * result + this.wID.hashCode()
        result = 31 * result + this.hSubMenu.hashCode()
        result = 31 * result + this.hbmpChecked.hashCode()
        result = 31 * result + this.hbmpUnchecked.hashCode()
        result = 31 * result + this.dwItemData.hashCode()
        result = 31 * result + this.dwTypeData.hashCode()
        result = 31 * result + this.cch.hashCode()
        result = 31 * result + this.hbmpItem.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            fMask: MenuItemMask = 0u,
            fType: MenuItemType = 0u,
            fState: MenuItemState = 0u,
            wID: UInt = 0u,
            hSubMenu: Hmenu = MutPtr(0L),
            hbmpChecked: Hbitmap = MutPtr(0L),
            hbmpUnchecked: Hbitmap = MutPtr(0L),
            dwItemData: Int = 0,
            dwTypeData: Pstr = MutPtr(0L),
            cch: UInt = 0u,
            hbmpItem: Hbitmap = MutPtr(0L),
        ): Menuiteminfoa =
            Menuiteminfoa(
                cbSize = cbSize,
                fMask = fMask,
                fType = fType,
                fState = fState,
                wID = wID,
                hSubMenuCtorArg = hSubMenu,
                hbmpCheckedCtorArg = hbmpChecked,
                hbmpUncheckedCtorArg = hbmpUnchecked,
                dwItemData = dwItemData,
                dwTypeDataCtorArg = dwTypeData,
                cch = cch,
                hbmpItemCtorArg = hbmpItem,
            )
    }
}

public class Menuiteminfow internal constructor(
    public var cbSize: UInt,
    public var fMask: MenuItemMask,
    public var fType: MenuItemType,
    public var fState: MenuItemState,
    public var wID: UInt,
    hSubMenuCtorArg: Hmenu,
    hbmpCheckedCtorArg: Hbitmap,
    hbmpUncheckedCtorArg: Hbitmap,
    public var dwItemData: Int,
    dwTypeDataCtorArg: Pwstr,
    public var cch: UInt,
    hbmpItemCtorArg: Hbitmap,
) {
    public var hSubMenu: Hmenu = hSubMenuCtorArg
        internal set

    public var hbmpChecked: Hbitmap = hbmpCheckedCtorArg
        internal set

    public var hbmpUnchecked: Hbitmap = hbmpUncheckedCtorArg
        internal set

    public var dwTypeData: Pwstr = dwTypeDataCtorArg
        internal set

    public var hbmpItem: Hbitmap = hbmpItemCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        fMask = 0u,
        fType = 0u,
        fState = 0u,
        wID = 0u,
        hSubMenuCtorArg = MutPtr(0L),
        hbmpCheckedCtorArg = MutPtr(0L),
        hbmpUncheckedCtorArg = MutPtr(0L),
        dwItemData = 0,
        dwTypeDataCtorArg = MutPtr(0L),
        cch = 0u,
        hbmpItemCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MenuItemMask = this.fMask

    public operator fun component3(): MenuItemType = this.fType

    public operator fun component4(): MenuItemState = this.fState

    public operator fun component5(): UInt = this.wID

    public operator fun component6(): Hmenu = this.hSubMenu

    public operator fun component7(): Hbitmap = this.hbmpChecked

    public operator fun component8(): Hbitmap = this.hbmpUnchecked

    public operator fun component9(): Int = this.dwItemData

    public operator fun component10(): Pwstr = this.dwTypeData

    public operator fun component11(): UInt = this.cch

    public operator fun component12(): Hbitmap = this.hbmpItem

    public fun copy(cbSize: UInt = this.cbSize, fMask: MenuItemMask = this.fMask, fType: MenuItemType = this.fType, fState: MenuItemState = this.fState, wID: UInt = this.wID, hSubMenu: Hmenu = this.hSubMenu, hbmpChecked: Hbitmap = this.hbmpChecked, hbmpUnchecked: Hbitmap = this.hbmpUnchecked, dwItemData: Int = this.dwItemData, dwTypeData: Pwstr = this.dwTypeData, cch: UInt = this.cch, hbmpItem: Hbitmap = this.hbmpItem): Menuiteminfow = Menuiteminfow(cbSize = cbSize, fMask = fMask, fType = fType, fState = fState, wID = wID, hSubMenuCtorArg = hSubMenu, hbmpCheckedCtorArg = hbmpChecked, hbmpUncheckedCtorArg = hbmpUnchecked, dwItemData = dwItemData, dwTypeDataCtorArg = dwTypeData, cch = cch, hbmpItemCtorArg = hbmpItem)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Menuiteminfow) return false
        if (this.cbSize != other.cbSize) return false
        if (this.fMask != other.fMask) return false
        if (this.fType != other.fType) return false
        if (this.fState != other.fState) return false
        if (this.wID != other.wID) return false
        if (this.hSubMenu != other.hSubMenu) return false
        if (this.hbmpChecked != other.hbmpChecked) return false
        if (this.hbmpUnchecked != other.hbmpUnchecked) return false
        if (this.dwItemData != other.dwItemData) return false
        if (this.dwTypeData != other.dwTypeData) return false
        if (this.cch != other.cch) return false
        if (this.hbmpItem != other.hbmpItem) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fMask.hashCode()
        result = 31 * result + this.fType.hashCode()
        result = 31 * result + this.fState.hashCode()
        result = 31 * result + this.wID.hashCode()
        result = 31 * result + this.hSubMenu.hashCode()
        result = 31 * result + this.hbmpChecked.hashCode()
        result = 31 * result + this.hbmpUnchecked.hashCode()
        result = 31 * result + this.dwItemData.hashCode()
        result = 31 * result + this.dwTypeData.hashCode()
        result = 31 * result + this.cch.hashCode()
        result = 31 * result + this.hbmpItem.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            fMask: MenuItemMask = 0u,
            fType: MenuItemType = 0u,
            fState: MenuItemState = 0u,
            wID: UInt = 0u,
            hSubMenu: Hmenu = MutPtr(0L),
            hbmpChecked: Hbitmap = MutPtr(0L),
            hbmpUnchecked: Hbitmap = MutPtr(0L),
            dwItemData: Int = 0,
            dwTypeData: Pwstr = MutPtr(0L),
            cch: UInt = 0u,
            hbmpItem: Hbitmap = MutPtr(0L),
        ): Menuiteminfow =
            Menuiteminfow(
                cbSize = cbSize,
                fMask = fMask,
                fType = fType,
                fState = fState,
                wID = wID,
                hSubMenuCtorArg = hSubMenu,
                hbmpCheckedCtorArg = hbmpChecked,
                hbmpUncheckedCtorArg = hbmpUnchecked,
                dwItemData = dwItemData,
                dwTypeDataCtorArg = dwTypeData,
                cch = cch,
                hbmpItemCtorArg = hbmpItem,
            )
    }
}

public data class Menuitemtemplate(
    public var mtOption: UShort = 0u,
    public var mtID: UShort = 0u,
    public var mtString: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Menuitemtemplate) return false
        if (this.mtOption != other.mtOption) return false
        if (this.mtID != other.mtID) return false
        if (!this.mtString.contentEquals(other.mtString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mtOption.hashCode()
        result = 31 * result + this.mtID.hashCode()
        result = 31 * result + this.mtString.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Menuitemtemplate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Menuitemtemplate> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): Menuitemtemplate =
                    Menuitemtemplate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Menuitemtemplate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.mtOption)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.mtID)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 4L, value.mtString.toList())
                }
            }
    }
}

public data class Menuitemtemplateheader(
    public var versionNumber: UShort = 0u,
    public var offset: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Menuitemtemplateheader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Menuitemtemplateheader> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Menuitemtemplateheader =
                    Menuitemtemplateheader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Menuitemtemplateheader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.versionNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.offset)
                }
            }
    }
}

public data class Menutemplateex(
    public var anonymous: Menutemplateex0 = Menutemplateex0(),
)

public data class Menutemplateex0(
    public var menu: Menutemplateex00 = Menutemplateex00(),
    public var menuEx: Menutemplateex01 = Menutemplateex01(),
)

public data class Menutemplateex01(
    public var mexHeader: MenuexTemplateHeader = MenuexTemplateHeader(),
    public var mexItem: List<MenuexTemplateItem> = List(1) { MenuexTemplateItem() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Menutemplateex01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Menutemplateex01> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Menutemplateex01 =
                    Menutemplateex01(
                        (MenuexTemplateHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(MenuexTemplateItem.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Menutemplateex01) {
                    (MenuexTemplateHeader.typeLayout()).writeNative(addr, value.mexHeader)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(MenuexTemplateItem.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.mexItem)
                }
            }
    }
}

public data class Menutemplateex00(
    public var mitHeader: Menuitemtemplateheader = Menuitemtemplateheader(),
    public var miTemplate: List<Menuitemtemplate> = List(1) { Menuitemtemplate() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Menutemplateex00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Menutemplateex00> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 10L
                override fun readNative(addr: Long): Menutemplateex00 =
                    Menutemplateex00(
                        (Menuitemtemplateheader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Menuitemtemplate.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Menutemplateex00) {
                    (Menuitemtemplateheader.typeLayout()).writeNative(addr, value.mitHeader)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Menuitemtemplate.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.miTemplate)
                }
            }
    }
}

public data class MessageResourceBlock(
    public var lowId: UInt = 0u,
    public var highId: UInt = 0u,
    public var offsetToEntries: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MessageResourceBlock> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MessageResourceBlock> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): MessageResourceBlock =
                    MessageResourceBlock(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MessageResourceBlock) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.lowId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.highId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.offsetToEntries)
                }
            }
    }
}

public data class MessageResourceData(
    public var numberOfBlocks: UInt = 0u,
    public var blocks: List<MessageResourceBlock> = List(1) { MessageResourceBlock() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MessageResourceData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MessageResourceData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MessageResourceData =
                    MessageResourceData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(MessageResourceBlock.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MessageResourceData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfBlocks)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(MessageResourceBlock.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.blocks)
                }
            }
    }
}

public data class MessageResourceEntry(
    public var length: UShort = 0u,
    public var flags: UShort = 0u,
    public var text: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MessageResourceEntry) return false
        if (this.length != other.length) return false
        if (this.flags != other.flags) return false
        if (!this.text.contentEquals(other.text)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.text.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MessageResourceEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MessageResourceEntry> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): MessageResourceEntry =
                    MessageResourceEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: MessageResourceEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.text.toList())
                }
            }
    }
}

public data class Minimizedmetrics(
    public var cbSize: UInt = 0u,
    public var iWidth: Int = 0,
    public var iHorzGap: Int = 0,
    public var iVertGap: Int = 0,
    public var iArrange: MinimizedmetricsArrange = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Minimizedmetrics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Minimizedmetrics> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Minimizedmetrics =
                    Minimizedmetrics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Minimizedmetrics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.iWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.iHorzGap)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.iVertGap)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.iArrange)
                }
            }
    }
}

public data class Minmaxinfo(
    public var ptReserved: Point = Point(),
    public var ptMaxSize: Point = Point(),
    public var ptMaxPosition: Point = Point(),
    public var ptMinTrackSize: Point = Point(),
    public var ptMaxTrackSize: Point = Point(),
)

public class Mousehookstruct internal constructor(
    public var pt: Point,
    hwndCtorArg: Hwnd,
    public var wHitTestCode: UInt,
    public var dwExtraInfo: Int,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public constructor() : this(
        pt = Point(),
        hwndCtorArg = MutPtr(0L),
        wHitTestCode = 0u,
        dwExtraInfo = 0,
    )

    public operator fun component1(): Point = this.pt

    public operator fun component2(): Hwnd = this.hwnd

    public operator fun component3(): UInt = this.wHitTestCode

    public operator fun component4(): Int = this.dwExtraInfo

    public fun copy(pt: Point = this.pt, hwnd: Hwnd = this.hwnd, wHitTestCode: UInt = this.wHitTestCode, dwExtraInfo: Int = this.dwExtraInfo): Mousehookstruct = Mousehookstruct(pt = pt, hwndCtorArg = hwnd, wHitTestCode = wHitTestCode, dwExtraInfo = dwExtraInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mousehookstruct) return false
        if (this.pt != other.pt) return false
        if (this.hwnd != other.hwnd) return false
        if (this.wHitTestCode != other.wHitTestCode) return false
        if (this.dwExtraInfo != other.dwExtraInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pt.hashCode()
        result = 31 * result + this.hwnd.hashCode()
        result = 31 * result + this.wHitTestCode.hashCode()
        result = 31 * result + this.dwExtraInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pt: Point = Point(),
            hwnd: Hwnd = MutPtr(0L),
            wHitTestCode: UInt = 0u,
            dwExtraInfo: Int = 0,
        ): Mousehookstruct =
            Mousehookstruct(
                pt = pt,
                hwndCtorArg = hwnd,
                wHitTestCode = wHitTestCode,
                dwExtraInfo = dwExtraInfo,
            )
    }
}

public data class Mousehookstructex(
    public var base: Mousehookstruct = Mousehookstruct(),
    public var mouseData: UInt = 0u,
)

public class Msg internal constructor(
    hwndCtorArg: Hwnd,
    public var message: UInt,
    public var wParam: Wparam,
    public var lParam: Lparam,
    public var time: UInt,
    public var pt: Point,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public constructor() : this(
        hwndCtorArg = MutPtr(0L),
        message = 0u,
        wParam = 0uL,
        lParam = 0L,
        time = 0u,
        pt = Point(),
    )

    public operator fun component1(): Hwnd = this.hwnd

    public operator fun component2(): UInt = this.message

    public operator fun component3(): Wparam = this.wParam

    public operator fun component4(): Lparam = this.lParam

    public operator fun component5(): UInt = this.time

    public operator fun component6(): Point = this.pt

    public fun copy(hwnd: Hwnd = this.hwnd, message: UInt = this.message, wParam: Wparam = this.wParam, lParam: Lparam = this.lParam, time: UInt = this.time, pt: Point = this.pt): Msg = Msg(hwndCtorArg = hwnd, message = message, wParam = wParam, lParam = lParam, time = time, pt = pt)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msg) return false
        if (this.hwnd != other.hwnd) return false
        if (this.message != other.message) return false
        if (this.wParam != other.wParam) return false
        if (this.lParam != other.lParam) return false
        if (this.time != other.time) return false
        if (this.pt != other.pt) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hwnd.hashCode()
        result = 31 * result + this.message.hashCode()
        result = 31 * result + this.wParam.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.time.hashCode()
        result = 31 * result + this.pt.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hwnd: Hwnd = MutPtr(0L),
            message: UInt = 0u,
            wParam: Wparam = 0uL,
            lParam: Lparam = 0L,
            time: UInt = 0u,
            pt: Point = Point(),
        ): Msg =
            Msg(
                hwndCtorArg = hwnd,
                message = message,
                wParam = wParam,
                lParam = lParam,
                time = time,
                pt = pt,
            )
    }
}

public class Msgboxparamsa internal constructor(
    public var cbSize: UInt,
    hwndOwnerCtorArg: Hwnd,
    hInstanceCtorArg: Hinstance,
    lpszTextCtorArg: Pcstr,
    lpszCaptionCtorArg: Pcstr,
    public var dwStyle: MessageboxStyle,
    lpszIconCtorArg: Pcstr,
    public var dwContextHelpId: Int,
    public var lpfnMsgBoxCallback: Msgboxcallback,
    public var dwLanguageId: UInt,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpszText: Pcstr = lpszTextCtorArg
        internal set

    public var lpszCaption: Pcstr = lpszCaptionCtorArg
        internal set

    public var lpszIcon: Pcstr = lpszIconCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        hInstanceCtorArg = MutPtr(0L),
        lpszTextCtorArg = ConstPtr(0L),
        lpszCaptionCtorArg = ConstPtr(0L),
        dwStyle = 0u,
        lpszIconCtorArg = ConstPtr(0L),
        dwContextHelpId = 0,
        lpfnMsgBoxCallback = null,
        dwLanguageId = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Hwnd = this.hwndOwner

    public operator fun component3(): Hinstance = this.hInstance

    public operator fun component4(): Pcstr = this.lpszText

    public operator fun component5(): Pcstr = this.lpszCaption

    public operator fun component6(): MessageboxStyle = this.dwStyle

    public operator fun component7(): Pcstr = this.lpszIcon

    public operator fun component8(): Int = this.dwContextHelpId

    public operator fun component9(): Msgboxcallback = this.lpfnMsgBoxCallback

    public operator fun component10(): UInt = this.dwLanguageId

    public fun copy(cbSize: UInt = this.cbSize, hwndOwner: Hwnd = this.hwndOwner, hInstance: Hinstance = this.hInstance, lpszText: Pcstr = this.lpszText, lpszCaption: Pcstr = this.lpszCaption, dwStyle: MessageboxStyle = this.dwStyle, lpszIcon: Pcstr = this.lpszIcon, dwContextHelpId: Int = this.dwContextHelpId, lpfnMsgBoxCallback: Msgboxcallback = this.lpfnMsgBoxCallback, dwLanguageId: UInt = this.dwLanguageId): Msgboxparamsa = Msgboxparamsa(cbSize = cbSize, hwndOwnerCtorArg = hwndOwner, hInstanceCtorArg = hInstance, lpszTextCtorArg = lpszText, lpszCaptionCtorArg = lpszCaption, dwStyle = dwStyle, lpszIconCtorArg = lpszIcon, dwContextHelpId = dwContextHelpId, lpfnMsgBoxCallback = lpfnMsgBoxCallback, dwLanguageId = dwLanguageId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msgboxparamsa) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.hInstance != other.hInstance) return false
        if (this.lpszText != other.lpszText) return false
        if (this.lpszCaption != other.lpszCaption) return false
        if (this.dwStyle != other.dwStyle) return false
        if (this.lpszIcon != other.lpszIcon) return false
        if (this.dwContextHelpId != other.dwContextHelpId) return false
        if (this.lpfnMsgBoxCallback != other.lpfnMsgBoxCallback) return false
        if (this.dwLanguageId != other.dwLanguageId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hwndOwner.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.lpszText.hashCode()
        result = 31 * result + this.lpszCaption.hashCode()
        result = 31 * result + this.dwStyle.hashCode()
        result = 31 * result + this.lpszIcon.hashCode()
        result = 31 * result + this.dwContextHelpId.hashCode()
        result = 31 * result + this.lpfnMsgBoxCallback.hashCode()
        result = 31 * result + this.dwLanguageId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            hInstance: Hinstance = MutPtr(0L),
            lpszText: Pcstr = ConstPtr(0L),
            lpszCaption: Pcstr = ConstPtr(0L),
            dwStyle: MessageboxStyle = 0u,
            lpszIcon: Pcstr = ConstPtr(0L),
            dwContextHelpId: Int = 0,
            lpfnMsgBoxCallback: Msgboxcallback = null,
            dwLanguageId: UInt = 0u,
        ): Msgboxparamsa =
            Msgboxparamsa(
                cbSize = cbSize,
                hwndOwnerCtorArg = hwndOwner,
                hInstanceCtorArg = hInstance,
                lpszTextCtorArg = lpszText,
                lpszCaptionCtorArg = lpszCaption,
                dwStyle = dwStyle,
                lpszIconCtorArg = lpszIcon,
                dwContextHelpId = dwContextHelpId,
                lpfnMsgBoxCallback = lpfnMsgBoxCallback,
                dwLanguageId = dwLanguageId,
            )
    }
}

public class Msgboxparamsw internal constructor(
    public var cbSize: UInt,
    hwndOwnerCtorArg: Hwnd,
    hInstanceCtorArg: Hinstance,
    lpszTextCtorArg: Pcwstr,
    lpszCaptionCtorArg: Pcwstr,
    public var dwStyle: MessageboxStyle,
    lpszIconCtorArg: Pcwstr,
    public var dwContextHelpId: Int,
    public var lpfnMsgBoxCallback: Msgboxcallback,
    public var dwLanguageId: UInt,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var lpszText: Pcwstr = lpszTextCtorArg
        internal set

    public var lpszCaption: Pcwstr = lpszCaptionCtorArg
        internal set

    public var lpszIcon: Pcwstr = lpszIconCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        hInstanceCtorArg = MutPtr(0L),
        lpszTextCtorArg = ConstPtr(0L),
        lpszCaptionCtorArg = ConstPtr(0L),
        dwStyle = 0u,
        lpszIconCtorArg = ConstPtr(0L),
        dwContextHelpId = 0,
        lpfnMsgBoxCallback = null,
        dwLanguageId = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Hwnd = this.hwndOwner

    public operator fun component3(): Hinstance = this.hInstance

    public operator fun component4(): Pcwstr = this.lpszText

    public operator fun component5(): Pcwstr = this.lpszCaption

    public operator fun component6(): MessageboxStyle = this.dwStyle

    public operator fun component7(): Pcwstr = this.lpszIcon

    public operator fun component8(): Int = this.dwContextHelpId

    public operator fun component9(): Msgboxcallback = this.lpfnMsgBoxCallback

    public operator fun component10(): UInt = this.dwLanguageId

    public fun copy(cbSize: UInt = this.cbSize, hwndOwner: Hwnd = this.hwndOwner, hInstance: Hinstance = this.hInstance, lpszText: Pcwstr = this.lpszText, lpszCaption: Pcwstr = this.lpszCaption, dwStyle: MessageboxStyle = this.dwStyle, lpszIcon: Pcwstr = this.lpszIcon, dwContextHelpId: Int = this.dwContextHelpId, lpfnMsgBoxCallback: Msgboxcallback = this.lpfnMsgBoxCallback, dwLanguageId: UInt = this.dwLanguageId): Msgboxparamsw = Msgboxparamsw(cbSize = cbSize, hwndOwnerCtorArg = hwndOwner, hInstanceCtorArg = hInstance, lpszTextCtorArg = lpszText, lpszCaptionCtorArg = lpszCaption, dwStyle = dwStyle, lpszIconCtorArg = lpszIcon, dwContextHelpId = dwContextHelpId, lpfnMsgBoxCallback = lpfnMsgBoxCallback, dwLanguageId = dwLanguageId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msgboxparamsw) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.hInstance != other.hInstance) return false
        if (this.lpszText != other.lpszText) return false
        if (this.lpszCaption != other.lpszCaption) return false
        if (this.dwStyle != other.dwStyle) return false
        if (this.lpszIcon != other.lpszIcon) return false
        if (this.dwContextHelpId != other.dwContextHelpId) return false
        if (this.lpfnMsgBoxCallback != other.lpfnMsgBoxCallback) return false
        if (this.dwLanguageId != other.dwLanguageId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hwndOwner.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.lpszText.hashCode()
        result = 31 * result + this.lpszCaption.hashCode()
        result = 31 * result + this.dwStyle.hashCode()
        result = 31 * result + this.lpszIcon.hashCode()
        result = 31 * result + this.dwContextHelpId.hashCode()
        result = 31 * result + this.lpfnMsgBoxCallback.hashCode()
        result = 31 * result + this.dwLanguageId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            hInstance: Hinstance = MutPtr(0L),
            lpszText: Pcwstr = ConstPtr(0L),
            lpszCaption: Pcwstr = ConstPtr(0L),
            dwStyle: MessageboxStyle = 0u,
            lpszIcon: Pcwstr = ConstPtr(0L),
            dwContextHelpId: Int = 0,
            lpfnMsgBoxCallback: Msgboxcallback = null,
            dwLanguageId: UInt = 0u,
        ): Msgboxparamsw =
            Msgboxparamsw(
                cbSize = cbSize,
                hwndOwnerCtorArg = hwndOwner,
                hInstanceCtorArg = hInstance,
                lpszTextCtorArg = lpszText,
                lpszCaptionCtorArg = lpszCaption,
                dwStyle = dwStyle,
                lpszIconCtorArg = lpszIcon,
                dwContextHelpId = dwContextHelpId,
                lpfnMsgBoxCallback = lpfnMsgBoxCallback,
                dwLanguageId = dwLanguageId,
            )
    }
}

public data class Msllhookstruct(
    public var pt: Point = Point(),
    public var mouseData: UInt = 0u,
    public var flags: UInt = 0u,
    public var time: UInt = 0u,
    public var dwExtraInfo: Int = 0,
)

public class MrmResourceIndexerHandle internal constructor(
    handleCtorArg: MutPtr<CVoid>,
) {
    public var handle: MutPtr<CVoid> = handleCtorArg
        internal set

    public constructor() : this(
        handleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.handle

    public fun copy(handle: MutPtr<CVoid> = this.handle): MrmResourceIndexerHandle = MrmResourceIndexerHandle(handleCtorArg = handle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MrmResourceIndexerHandle) return false
        if (this.handle != other.handle) return false
        return true
    }

    override fun hashCode(): Int = this.handle.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MrmResourceIndexerHandle> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MrmResourceIndexerHandle> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MrmResourceIndexerHandle =
                    MrmResourceIndexerHandle(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MrmResourceIndexerHandle) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.handle)
                }
            }

        public operator fun invoke(
            handle: MutPtr<CVoid> = MutPtr(0L),
        ): MrmResourceIndexerHandle =
            MrmResourceIndexerHandle(
                handleCtorArg = handle,
            )
    }
}

public class MrmResourceIndexerMessage internal constructor(
    public var severity: MrmResourceIndexerMessageSeverity,
    public var id: UInt,
    textCtorArg: Pcwstr,
) {
    public var text: Pcwstr = textCtorArg
        internal set

    public constructor() : this(
        severity = 0,
        id = 0u,
        textCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): MrmResourceIndexerMessageSeverity = this.severity

    public operator fun component2(): UInt = this.id

    public operator fun component3(): Pcwstr = this.text

    public fun copy(severity: MrmResourceIndexerMessageSeverity = this.severity, id: UInt = this.id, text: Pcwstr = this.text): MrmResourceIndexerMessage = MrmResourceIndexerMessage(severity = severity, id = id, textCtorArg = text)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MrmResourceIndexerMessage) return false
        if (this.severity != other.severity) return false
        if (this.id != other.id) return false
        if (this.text != other.text) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.severity.hashCode()
        result = 31 * result + this.id.hashCode()
        result = 31 * result + this.text.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            severity: MrmResourceIndexerMessageSeverity = 0,
            id: UInt = 0u,
            text: Pcwstr = ConstPtr(0L),
        ): MrmResourceIndexerMessage =
            MrmResourceIndexerMessage(
                severity = severity,
                id = id,
                textCtorArg = text,
            )
    }
}

public class NccalcsizeParams internal constructor(
    public var rgrc: List<Rect>,
    lpposCtorArg: MutPtr<Windowpos>,
) {
    public var lppos: MutPtr<Windowpos> = lpposCtorArg
        internal set

    public constructor() : this(
        rgrc = List(3) { Rect() },
        lpposCtorArg = MutPtr(0L),
    )

    public operator fun component1(): List<Rect> = this.rgrc

    public operator fun component2(): MutPtr<Windowpos> = this.lppos

    public fun copy(rgrc: List<Rect> = this.rgrc, lppos: MutPtr<Windowpos> = this.lppos): NccalcsizeParams = NccalcsizeParams(rgrc = rgrc, lpposCtorArg = lppos)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NccalcsizeParams) return false
        if (this.rgrc != other.rgrc) return false
        if (this.lppos != other.lppos) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rgrc.hashCode()
        result = 31 * result + this.lppos.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            rgrc: List<Rect> = List(3) { Rect() },
            lppos: MutPtr<Windowpos> = MutPtr(0L),
        ): NccalcsizeParams =
            NccalcsizeParams(
                rgrc = rgrc,
                lpposCtorArg = lppos,
            )
    }
}

public data class Nonclientmetricsa(
    public var cbSize: UInt = 0u,
    public var iBorderWidth: Int = 0,
    public var iScrollWidth: Int = 0,
    public var iScrollHeight: Int = 0,
    public var iCaptionWidth: Int = 0,
    public var iCaptionHeight: Int = 0,
    public var lfCaptionFont: Logfonta = Logfonta(),
    public var iSmCaptionWidth: Int = 0,
    public var iSmCaptionHeight: Int = 0,
    public var lfSmCaptionFont: Logfonta = Logfonta(),
    public var iMenuWidth: Int = 0,
    public var iMenuHeight: Int = 0,
    public var lfMenuFont: Logfonta = Logfonta(),
    public var lfStatusFont: Logfonta = Logfonta(),
    public var lfMessageFont: Logfonta = Logfonta(),
    public var iPaddedBorderWidth: Int = 0,
)

public data class Nonclientmetricsw(
    public var cbSize: UInt = 0u,
    public var iBorderWidth: Int = 0,
    public var iScrollWidth: Int = 0,
    public var iScrollHeight: Int = 0,
    public var iCaptionWidth: Int = 0,
    public var iCaptionHeight: Int = 0,
    public var lfCaptionFont: Logfontw = Logfontw(),
    public var iSmCaptionWidth: Int = 0,
    public var iSmCaptionHeight: Int = 0,
    public var lfSmCaptionFont: Logfontw = Logfontw(),
    public var iMenuWidth: Int = 0,
    public var iMenuHeight: Int = 0,
    public var lfMenuFont: Logfontw = Logfontw(),
    public var lfStatusFont: Logfontw = Logfontw(),
    public var lfMessageFont: Logfontw = Logfontw(),
    public var iPaddedBorderWidth: Int = 0,
)

public data class Scrollbarinfo(
    public var cbSize: UInt = 0u,
    public var rcScrollBar: Rect = Rect(),
    public var dxyLineButton: Int = 0,
    public var xyThumbTop: Int = 0,
    public var xyThumbBottom: Int = 0,
    public var reserved: Int = 0,
    public var rgstate: UIntArray = UIntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Scrollbarinfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.rcScrollBar != other.rcScrollBar) return false
        if (this.dxyLineButton != other.dxyLineButton) return false
        if (this.xyThumbTop != other.xyThumbTop) return false
        if (this.xyThumbBottom != other.xyThumbBottom) return false
        if (this.reserved != other.reserved) return false
        if (!this.rgstate.contentEquals(other.rgstate)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.rcScrollBar.hashCode()
        result = 31 * result + this.dxyLineButton.hashCode()
        result = 31 * result + this.xyThumbTop.hashCode()
        result = 31 * result + this.xyThumbBottom.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.rgstate.contentHashCode()
        return result
    }
}

public data class Scrollinfo(
    public var cbSize: UInt = 0u,
    public var fMask: ScrollinfoMask = 0u,
    public var nMin: Int = 0,
    public var nMax: Int = 0,
    public var nPage: UInt = 0u,
    public var nPos: Int = 0,
    public var nTrackPos: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Scrollinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Scrollinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): Scrollinfo =
                    Scrollinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Scrollinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.nMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.nMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.nPage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.nPos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.nTrackPos)
                }
            }
    }
}

public class Shellhookinfo internal constructor(
    hwndCtorArg: Hwnd,
    public var rc: Rect,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public constructor() : this(
        hwndCtorArg = MutPtr(0L),
        rc = Rect(),
    )

    public operator fun component1(): Hwnd = this.hwnd

    public operator fun component2(): Rect = this.rc

    public fun copy(hwnd: Hwnd = this.hwnd, rc: Rect = this.rc): Shellhookinfo = Shellhookinfo(hwndCtorArg = hwnd, rc = rc)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Shellhookinfo) return false
        if (this.hwnd != other.hwnd) return false
        if (this.rc != other.rc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hwnd.hashCode()
        result = 31 * result + this.rc.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hwnd: Hwnd = MutPtr(0L),
            rc: Rect = Rect(),
        ): Shellhookinfo =
            Shellhookinfo(
                hwndCtorArg = hwnd,
                rc = rc,
            )
    }
}

public data class Stylestruct(
    public var styleOld: UInt = 0u,
    public var styleNew: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stylestruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stylestruct> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Stylestruct =
                    Stylestruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Stylestruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.styleOld)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.styleNew)
                }
            }
    }
}

public data class Titlebarinfo(
    public var cbSize: UInt = 0u,
    public var rcTitleBar: Rect = Rect(),
    public var rgstate: UIntArray = UIntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Titlebarinfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.rcTitleBar != other.rcTitleBar) return false
        if (!this.rgstate.contentEquals(other.rgstate)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.rcTitleBar.hashCode()
        result = 31 * result + this.rgstate.contentHashCode()
        return result
    }
}

public data class Titlebarinfoex(
    public var cbSize: UInt = 0u,
    public var rcTitleBar: Rect = Rect(),
    public var rgstate: UIntArray = UIntArray(6),
    public var rgrect: List<Rect> = List(6) { Rect() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Titlebarinfoex) return false
        if (this.cbSize != other.cbSize) return false
        if (this.rcTitleBar != other.rcTitleBar) return false
        if (!this.rgstate.contentEquals(other.rgstate)) return false
        if (this.rgrect != other.rgrect) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.rcTitleBar.hashCode()
        result = 31 * result + this.rgstate.contentHashCode()
        result = 31 * result + this.rgrect.hashCode()
        return result
    }
}

public data class Touchpredictionparameters(
    public var cbSize: UInt = 0u,
    public var dwLatency: UInt = 0u,
    public var dwSampleTime: UInt = 0u,
    public var bUseHWTimeStamp: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Touchpredictionparameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Touchpredictionparameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Touchpredictionparameters =
                    Touchpredictionparameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Touchpredictionparameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwLatency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwSampleTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.bUseHWTimeStamp)
                }
            }
    }
}

public data class Tpmparams(
    public var cbSize: UInt = 0u,
    public var rcExclude: Rect = Rect(),
)

public class Updatelayeredwindowinfo internal constructor(
    public var cbSize: UInt,
    hdcDstCtorArg: Hdc,
    pptDstCtorArg: ConstPtr<Point>,
    psizeCtorArg: ConstPtr<Size>,
    hdcSrcCtorArg: Hdc,
    pptSrcCtorArg: ConstPtr<Point>,
    public var crKey: Colorref,
    pblendCtorArg: ConstPtr<Blendfunction>,
    public var dwFlags: UpdateLayeredWindowFlags,
    prcDirtyCtorArg: ConstPtr<Rect>,
) {
    public var hdcDst: Hdc = hdcDstCtorArg
        internal set

    public var pptDst: ConstPtr<Point> = pptDstCtorArg
        internal set

    public var psize: ConstPtr<Size> = psizeCtorArg
        internal set

    public var hdcSrc: Hdc = hdcSrcCtorArg
        internal set

    public var pptSrc: ConstPtr<Point> = pptSrcCtorArg
        internal set

    public var pblend: ConstPtr<Blendfunction> = pblendCtorArg
        internal set

    public var prcDirty: ConstPtr<Rect> = prcDirtyCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hdcDstCtorArg = MutPtr(0L),
        pptDstCtorArg = ConstPtr(0L),
        psizeCtorArg = ConstPtr(0L),
        hdcSrcCtorArg = MutPtr(0L),
        pptSrcCtorArg = ConstPtr(0L),
        crKey = 0u,
        pblendCtorArg = ConstPtr(0L),
        dwFlags = 0u,
        prcDirtyCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Hdc = this.hdcDst

    public operator fun component3(): ConstPtr<Point> = this.pptDst

    public operator fun component4(): ConstPtr<Size> = this.psize

    public operator fun component5(): Hdc = this.hdcSrc

    public operator fun component6(): ConstPtr<Point> = this.pptSrc

    public operator fun component7(): Colorref = this.crKey

    public operator fun component8(): ConstPtr<Blendfunction> = this.pblend

    public operator fun component9(): UpdateLayeredWindowFlags = this.dwFlags

    public operator fun component10(): ConstPtr<Rect> = this.prcDirty

    public fun copy(cbSize: UInt = this.cbSize, hdcDst: Hdc = this.hdcDst, pptDst: ConstPtr<Point> = this.pptDst, psize: ConstPtr<Size> = this.psize, hdcSrc: Hdc = this.hdcSrc, pptSrc: ConstPtr<Point> = this.pptSrc, crKey: Colorref = this.crKey, pblend: ConstPtr<Blendfunction> = this.pblend, dwFlags: UpdateLayeredWindowFlags = this.dwFlags, prcDirty: ConstPtr<Rect> = this.prcDirty): Updatelayeredwindowinfo = Updatelayeredwindowinfo(cbSize = cbSize, hdcDstCtorArg = hdcDst, pptDstCtorArg = pptDst, psizeCtorArg = psize, hdcSrcCtorArg = hdcSrc, pptSrcCtorArg = pptSrc, crKey = crKey, pblendCtorArg = pblend, dwFlags = dwFlags, prcDirtyCtorArg = prcDirty)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Updatelayeredwindowinfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hdcDst != other.hdcDst) return false
        if (this.pptDst != other.pptDst) return false
        if (this.psize != other.psize) return false
        if (this.hdcSrc != other.hdcSrc) return false
        if (this.pptSrc != other.pptSrc) return false
        if (this.crKey != other.crKey) return false
        if (this.pblend != other.pblend) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.prcDirty != other.prcDirty) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hdcDst.hashCode()
        result = 31 * result + this.pptDst.hashCode()
        result = 31 * result + this.psize.hashCode()
        result = 31 * result + this.hdcSrc.hashCode()
        result = 31 * result + this.pptSrc.hashCode()
        result = 31 * result + this.crKey.hashCode()
        result = 31 * result + this.pblend.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.prcDirty.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            hdcDst: Hdc = MutPtr(0L),
            pptDst: ConstPtr<Point> = ConstPtr(0L),
            psize: ConstPtr<Size> = ConstPtr(0L),
            hdcSrc: Hdc = MutPtr(0L),
            pptSrc: ConstPtr<Point> = ConstPtr(0L),
            crKey: Colorref = 0u,
            pblend: ConstPtr<Blendfunction> = ConstPtr(0L),
            dwFlags: UpdateLayeredWindowFlags = 0u,
            prcDirty: ConstPtr<Rect> = ConstPtr(0L),
        ): Updatelayeredwindowinfo =
            Updatelayeredwindowinfo(
                cbSize = cbSize,
                hdcDstCtorArg = hdcDst,
                pptDstCtorArg = pptDst,
                psizeCtorArg = psize,
                hdcSrcCtorArg = hdcSrc,
                pptSrcCtorArg = pptSrc,
                crKey = crKey,
                pblendCtorArg = pblend,
                dwFlags = dwFlags,
                prcDirtyCtorArg = prcDirty,
            )
    }
}

public data class VolLockBroadcast(
    public var vlbDbh: DevBroadcastHdr = DevBroadcastHdr(),
    public var vlbOwner: UInt = 0u,
    public var vlbPerms: UByte = 0u,
    public var vlbLockType: UByte = 0u,
    public var vlbDrive: UByte = 0u,
    public var vlbFlags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolLockBroadcast> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolLockBroadcast> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): VolLockBroadcast =
                    VolLockBroadcast(
                        (DevBroadcastHdr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 19L),
                    )
                override fun writeNative(addr: Long, value: VolLockBroadcast) {
                    (DevBroadcastHdr.typeLayout()).writeNative(addr, value.vlbDbh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.vlbOwner)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.vlbPerms)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.vlbLockType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 18L, value.vlbDrive)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 19L, value.vlbFlags)
                }
            }
    }
}

public data class Windowinfo(
    public var cbSize: UInt = 0u,
    public var rcWindow: Rect = Rect(),
    public var rcClient: Rect = Rect(),
    public var dwStyle: WindowStyle = 0u,
    public var dwExStyle: WindowExStyle = 0u,
    public var dwWindowStatus: UInt = 0u,
    public var cxWindowBorders: UInt = 0u,
    public var cyWindowBorders: UInt = 0u,
    public var atomWindowType: UShort = 0u,
    public var wCreatorVersion: UShort = 0u,
)

public data class Windowplacement(
    public var length: UInt = 0u,
    public var flags: WindowplacementFlags = 0u,
    public var showCmd: UInt = 0u,
    public var ptMinPosition: Point = Point(),
    public var ptMaxPosition: Point = Point(),
    public var rcNormalPosition: Rect = Rect(),
)

public class Windowpos internal constructor(
    hwndCtorArg: Hwnd,
    hwndInsertAfterCtorArg: Hwnd,
    public var x: Int,
    public var y: Int,
    public var cx: Int,
    public var cy: Int,
    public var flags: SetWindowPosFlags,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public var hwndInsertAfter: Hwnd = hwndInsertAfterCtorArg
        internal set

    public constructor() : this(
        hwndCtorArg = MutPtr(0L),
        hwndInsertAfterCtorArg = MutPtr(0L),
        x = 0,
        y = 0,
        cx = 0,
        cy = 0,
        flags = 0u,
    )

    public operator fun component1(): Hwnd = this.hwnd

    public operator fun component2(): Hwnd = this.hwndInsertAfter

    public operator fun component3(): Int = this.x

    public operator fun component4(): Int = this.y

    public operator fun component5(): Int = this.cx

    public operator fun component6(): Int = this.cy

    public operator fun component7(): SetWindowPosFlags = this.flags

    public fun copy(hwnd: Hwnd = this.hwnd, hwndInsertAfter: Hwnd = this.hwndInsertAfter, x: Int = this.x, y: Int = this.y, cx: Int = this.cx, cy: Int = this.cy, flags: SetWindowPosFlags = this.flags): Windowpos = Windowpos(hwndCtorArg = hwnd, hwndInsertAfterCtorArg = hwndInsertAfter, x = x, y = y, cx = cx, cy = cy, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Windowpos) return false
        if (this.hwnd != other.hwnd) return false
        if (this.hwndInsertAfter != other.hwndInsertAfter) return false
        if (this.x != other.x) return false
        if (this.y != other.y) return false
        if (this.cx != other.cx) return false
        if (this.cy != other.cy) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hwnd.hashCode()
        result = 31 * result + this.hwndInsertAfter.hashCode()
        result = 31 * result + this.x.hashCode()
        result = 31 * result + this.y.hashCode()
        result = 31 * result + this.cx.hashCode()
        result = 31 * result + this.cy.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hwnd: Hwnd = MutPtr(0L),
            hwndInsertAfter: Hwnd = MutPtr(0L),
            x: Int = 0,
            y: Int = 0,
            cx: Int = 0,
            cy: Int = 0,
            flags: SetWindowPosFlags = 0u,
        ): Windowpos =
            Windowpos(
                hwndCtorArg = hwnd,
                hwndInsertAfterCtorArg = hwndInsertAfter,
                x = x,
                y = y,
                cx = cx,
                cy = cy,
                flags = flags,
            )
    }
}

public class Wndclassa internal constructor(
    public var style: WndclassStyles,
    public var lpfnWndProc: Wndproc,
    public var cbClsExtra: Int,
    public var cbWndExtra: Int,
    hInstanceCtorArg: Hinstance,
    hIconCtorArg: Hicon,
    hCursorCtorArg: Hcursor,
    hbrBackgroundCtorArg: Hbrush,
    lpszMenuNameCtorArg: Pcstr,
    lpszClassNameCtorArg: Pcstr,
) {
    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var hIcon: Hicon = hIconCtorArg
        internal set

    public var hCursor: Hcursor = hCursorCtorArg
        internal set

    public var hbrBackground: Hbrush = hbrBackgroundCtorArg
        internal set

    public var lpszMenuName: Pcstr = lpszMenuNameCtorArg
        internal set

    public var lpszClassName: Pcstr = lpszClassNameCtorArg
        internal set

    public constructor() : this(
        style = 0u,
        lpfnWndProc = null,
        cbClsExtra = 0,
        cbWndExtra = 0,
        hInstanceCtorArg = MutPtr(0L),
        hIconCtorArg = MutPtr(0L),
        hCursorCtorArg = MutPtr(0L),
        hbrBackgroundCtorArg = MutPtr(0L),
        lpszMenuNameCtorArg = ConstPtr(0L),
        lpszClassNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): WndclassStyles = this.style

    public operator fun component2(): Wndproc = this.lpfnWndProc

    public operator fun component3(): Int = this.cbClsExtra

    public operator fun component4(): Int = this.cbWndExtra

    public operator fun component5(): Hinstance = this.hInstance

    public operator fun component6(): Hicon = this.hIcon

    public operator fun component7(): Hcursor = this.hCursor

    public operator fun component8(): Hbrush = this.hbrBackground

    public operator fun component9(): Pcstr = this.lpszMenuName

    public operator fun component10(): Pcstr = this.lpszClassName

    public fun copy(style: WndclassStyles = this.style, lpfnWndProc: Wndproc = this.lpfnWndProc, cbClsExtra: Int = this.cbClsExtra, cbWndExtra: Int = this.cbWndExtra, hInstance: Hinstance = this.hInstance, hIcon: Hicon = this.hIcon, hCursor: Hcursor = this.hCursor, hbrBackground: Hbrush = this.hbrBackground, lpszMenuName: Pcstr = this.lpszMenuName, lpszClassName: Pcstr = this.lpszClassName): Wndclassa = Wndclassa(style = style, lpfnWndProc = lpfnWndProc, cbClsExtra = cbClsExtra, cbWndExtra = cbWndExtra, hInstanceCtorArg = hInstance, hIconCtorArg = hIcon, hCursorCtorArg = hCursor, hbrBackgroundCtorArg = hbrBackground, lpszMenuNameCtorArg = lpszMenuName, lpszClassNameCtorArg = lpszClassName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wndclassa) return false
        if (this.style != other.style) return false
        if (this.lpfnWndProc != other.lpfnWndProc) return false
        if (this.cbClsExtra != other.cbClsExtra) return false
        if (this.cbWndExtra != other.cbWndExtra) return false
        if (this.hInstance != other.hInstance) return false
        if (this.hIcon != other.hIcon) return false
        if (this.hCursor != other.hCursor) return false
        if (this.hbrBackground != other.hbrBackground) return false
        if (this.lpszMenuName != other.lpszMenuName) return false
        if (this.lpszClassName != other.lpszClassName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.style.hashCode()
        result = 31 * result + this.lpfnWndProc.hashCode()
        result = 31 * result + this.cbClsExtra.hashCode()
        result = 31 * result + this.cbWndExtra.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.hIcon.hashCode()
        result = 31 * result + this.hCursor.hashCode()
        result = 31 * result + this.hbrBackground.hashCode()
        result = 31 * result + this.lpszMenuName.hashCode()
        result = 31 * result + this.lpszClassName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            style: WndclassStyles = 0u,
            lpfnWndProc: Wndproc = null,
            cbClsExtra: Int = 0,
            cbWndExtra: Int = 0,
            hInstance: Hinstance = MutPtr(0L),
            hIcon: Hicon = MutPtr(0L),
            hCursor: Hcursor = MutPtr(0L),
            hbrBackground: Hbrush = MutPtr(0L),
            lpszMenuName: Pcstr = ConstPtr(0L),
            lpszClassName: Pcstr = ConstPtr(0L),
        ): Wndclassa =
            Wndclassa(
                style = style,
                lpfnWndProc = lpfnWndProc,
                cbClsExtra = cbClsExtra,
                cbWndExtra = cbWndExtra,
                hInstanceCtorArg = hInstance,
                hIconCtorArg = hIcon,
                hCursorCtorArg = hCursor,
                hbrBackgroundCtorArg = hbrBackground,
                lpszMenuNameCtorArg = lpszMenuName,
                lpszClassNameCtorArg = lpszClassName,
            )
    }
}

public class Wndclassexa internal constructor(
    public var cbSize: UInt,
    public var style: WndclassStyles,
    public var lpfnWndProc: Wndproc,
    public var cbClsExtra: Int,
    public var cbWndExtra: Int,
    hInstanceCtorArg: Hinstance,
    hIconCtorArg: Hicon,
    hCursorCtorArg: Hcursor,
    hbrBackgroundCtorArg: Hbrush,
    lpszMenuNameCtorArg: Pcstr,
    lpszClassNameCtorArg: Pcstr,
    hIconSmCtorArg: Hicon,
) {
    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var hIcon: Hicon = hIconCtorArg
        internal set

    public var hCursor: Hcursor = hCursorCtorArg
        internal set

    public var hbrBackground: Hbrush = hbrBackgroundCtorArg
        internal set

    public var lpszMenuName: Pcstr = lpszMenuNameCtorArg
        internal set

    public var lpszClassName: Pcstr = lpszClassNameCtorArg
        internal set

    public var hIconSm: Hicon = hIconSmCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        style = 0u,
        lpfnWndProc = null,
        cbClsExtra = 0,
        cbWndExtra = 0,
        hInstanceCtorArg = MutPtr(0L),
        hIconCtorArg = MutPtr(0L),
        hCursorCtorArg = MutPtr(0L),
        hbrBackgroundCtorArg = MutPtr(0L),
        lpszMenuNameCtorArg = ConstPtr(0L),
        lpszClassNameCtorArg = ConstPtr(0L),
        hIconSmCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): WndclassStyles = this.style

    public operator fun component3(): Wndproc = this.lpfnWndProc

    public operator fun component4(): Int = this.cbClsExtra

    public operator fun component5(): Int = this.cbWndExtra

    public operator fun component6(): Hinstance = this.hInstance

    public operator fun component7(): Hicon = this.hIcon

    public operator fun component8(): Hcursor = this.hCursor

    public operator fun component9(): Hbrush = this.hbrBackground

    public operator fun component10(): Pcstr = this.lpszMenuName

    public operator fun component11(): Pcstr = this.lpszClassName

    public operator fun component12(): Hicon = this.hIconSm

    public fun copy(cbSize: UInt = this.cbSize, style: WndclassStyles = this.style, lpfnWndProc: Wndproc = this.lpfnWndProc, cbClsExtra: Int = this.cbClsExtra, cbWndExtra: Int = this.cbWndExtra, hInstance: Hinstance = this.hInstance, hIcon: Hicon = this.hIcon, hCursor: Hcursor = this.hCursor, hbrBackground: Hbrush = this.hbrBackground, lpszMenuName: Pcstr = this.lpszMenuName, lpszClassName: Pcstr = this.lpszClassName, hIconSm: Hicon = this.hIconSm): Wndclassexa = Wndclassexa(cbSize = cbSize, style = style, lpfnWndProc = lpfnWndProc, cbClsExtra = cbClsExtra, cbWndExtra = cbWndExtra, hInstanceCtorArg = hInstance, hIconCtorArg = hIcon, hCursorCtorArg = hCursor, hbrBackgroundCtorArg = hbrBackground, lpszMenuNameCtorArg = lpszMenuName, lpszClassNameCtorArg = lpszClassName, hIconSmCtorArg = hIconSm)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wndclassexa) return false
        if (this.cbSize != other.cbSize) return false
        if (this.style != other.style) return false
        if (this.lpfnWndProc != other.lpfnWndProc) return false
        if (this.cbClsExtra != other.cbClsExtra) return false
        if (this.cbWndExtra != other.cbWndExtra) return false
        if (this.hInstance != other.hInstance) return false
        if (this.hIcon != other.hIcon) return false
        if (this.hCursor != other.hCursor) return false
        if (this.hbrBackground != other.hbrBackground) return false
        if (this.lpszMenuName != other.lpszMenuName) return false
        if (this.lpszClassName != other.lpszClassName) return false
        if (this.hIconSm != other.hIconSm) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.style.hashCode()
        result = 31 * result + this.lpfnWndProc.hashCode()
        result = 31 * result + this.cbClsExtra.hashCode()
        result = 31 * result + this.cbWndExtra.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.hIcon.hashCode()
        result = 31 * result + this.hCursor.hashCode()
        result = 31 * result + this.hbrBackground.hashCode()
        result = 31 * result + this.lpszMenuName.hashCode()
        result = 31 * result + this.lpszClassName.hashCode()
        result = 31 * result + this.hIconSm.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            style: WndclassStyles = 0u,
            lpfnWndProc: Wndproc = null,
            cbClsExtra: Int = 0,
            cbWndExtra: Int = 0,
            hInstance: Hinstance = MutPtr(0L),
            hIcon: Hicon = MutPtr(0L),
            hCursor: Hcursor = MutPtr(0L),
            hbrBackground: Hbrush = MutPtr(0L),
            lpszMenuName: Pcstr = ConstPtr(0L),
            lpszClassName: Pcstr = ConstPtr(0L),
            hIconSm: Hicon = MutPtr(0L),
        ): Wndclassexa =
            Wndclassexa(
                cbSize = cbSize,
                style = style,
                lpfnWndProc = lpfnWndProc,
                cbClsExtra = cbClsExtra,
                cbWndExtra = cbWndExtra,
                hInstanceCtorArg = hInstance,
                hIconCtorArg = hIcon,
                hCursorCtorArg = hCursor,
                hbrBackgroundCtorArg = hbrBackground,
                lpszMenuNameCtorArg = lpszMenuName,
                lpszClassNameCtorArg = lpszClassName,
                hIconSmCtorArg = hIconSm,
            )
    }
}

public class Wndclassexw internal constructor(
    public var cbSize: UInt,
    public var style: WndclassStyles,
    public var lpfnWndProc: Wndproc,
    public var cbClsExtra: Int,
    public var cbWndExtra: Int,
    hInstanceCtorArg: Hinstance,
    hIconCtorArg: Hicon,
    hCursorCtorArg: Hcursor,
    hbrBackgroundCtorArg: Hbrush,
    lpszMenuNameCtorArg: Pcwstr,
    lpszClassNameCtorArg: Pcwstr,
    hIconSmCtorArg: Hicon,
) {
    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var hIcon: Hicon = hIconCtorArg
        internal set

    public var hCursor: Hcursor = hCursorCtorArg
        internal set

    public var hbrBackground: Hbrush = hbrBackgroundCtorArg
        internal set

    public var lpszMenuName: Pcwstr = lpszMenuNameCtorArg
        internal set

    public var lpszClassName: Pcwstr = lpszClassNameCtorArg
        internal set

    public var hIconSm: Hicon = hIconSmCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        style = 0u,
        lpfnWndProc = null,
        cbClsExtra = 0,
        cbWndExtra = 0,
        hInstanceCtorArg = MutPtr(0L),
        hIconCtorArg = MutPtr(0L),
        hCursorCtorArg = MutPtr(0L),
        hbrBackgroundCtorArg = MutPtr(0L),
        lpszMenuNameCtorArg = ConstPtr(0L),
        lpszClassNameCtorArg = ConstPtr(0L),
        hIconSmCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): WndclassStyles = this.style

    public operator fun component3(): Wndproc = this.lpfnWndProc

    public operator fun component4(): Int = this.cbClsExtra

    public operator fun component5(): Int = this.cbWndExtra

    public operator fun component6(): Hinstance = this.hInstance

    public operator fun component7(): Hicon = this.hIcon

    public operator fun component8(): Hcursor = this.hCursor

    public operator fun component9(): Hbrush = this.hbrBackground

    public operator fun component10(): Pcwstr = this.lpszMenuName

    public operator fun component11(): Pcwstr = this.lpszClassName

    public operator fun component12(): Hicon = this.hIconSm

    public fun copy(cbSize: UInt = this.cbSize, style: WndclassStyles = this.style, lpfnWndProc: Wndproc = this.lpfnWndProc, cbClsExtra: Int = this.cbClsExtra, cbWndExtra: Int = this.cbWndExtra, hInstance: Hinstance = this.hInstance, hIcon: Hicon = this.hIcon, hCursor: Hcursor = this.hCursor, hbrBackground: Hbrush = this.hbrBackground, lpszMenuName: Pcwstr = this.lpszMenuName, lpszClassName: Pcwstr = this.lpszClassName, hIconSm: Hicon = this.hIconSm): Wndclassexw = Wndclassexw(cbSize = cbSize, style = style, lpfnWndProc = lpfnWndProc, cbClsExtra = cbClsExtra, cbWndExtra = cbWndExtra, hInstanceCtorArg = hInstance, hIconCtorArg = hIcon, hCursorCtorArg = hCursor, hbrBackgroundCtorArg = hbrBackground, lpszMenuNameCtorArg = lpszMenuName, lpszClassNameCtorArg = lpszClassName, hIconSmCtorArg = hIconSm)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wndclassexw) return false
        if (this.cbSize != other.cbSize) return false
        if (this.style != other.style) return false
        if (this.lpfnWndProc != other.lpfnWndProc) return false
        if (this.cbClsExtra != other.cbClsExtra) return false
        if (this.cbWndExtra != other.cbWndExtra) return false
        if (this.hInstance != other.hInstance) return false
        if (this.hIcon != other.hIcon) return false
        if (this.hCursor != other.hCursor) return false
        if (this.hbrBackground != other.hbrBackground) return false
        if (this.lpszMenuName != other.lpszMenuName) return false
        if (this.lpszClassName != other.lpszClassName) return false
        if (this.hIconSm != other.hIconSm) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.style.hashCode()
        result = 31 * result + this.lpfnWndProc.hashCode()
        result = 31 * result + this.cbClsExtra.hashCode()
        result = 31 * result + this.cbWndExtra.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.hIcon.hashCode()
        result = 31 * result + this.hCursor.hashCode()
        result = 31 * result + this.hbrBackground.hashCode()
        result = 31 * result + this.lpszMenuName.hashCode()
        result = 31 * result + this.lpszClassName.hashCode()
        result = 31 * result + this.hIconSm.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            style: WndclassStyles = 0u,
            lpfnWndProc: Wndproc = null,
            cbClsExtra: Int = 0,
            cbWndExtra: Int = 0,
            hInstance: Hinstance = MutPtr(0L),
            hIcon: Hicon = MutPtr(0L),
            hCursor: Hcursor = MutPtr(0L),
            hbrBackground: Hbrush = MutPtr(0L),
            lpszMenuName: Pcwstr = ConstPtr(0L),
            lpszClassName: Pcwstr = ConstPtr(0L),
            hIconSm: Hicon = MutPtr(0L),
        ): Wndclassexw =
            Wndclassexw(
                cbSize = cbSize,
                style = style,
                lpfnWndProc = lpfnWndProc,
                cbClsExtra = cbClsExtra,
                cbWndExtra = cbWndExtra,
                hInstanceCtorArg = hInstance,
                hIconCtorArg = hIcon,
                hCursorCtorArg = hCursor,
                hbrBackgroundCtorArg = hbrBackground,
                lpszMenuNameCtorArg = lpszMenuName,
                lpszClassNameCtorArg = lpszClassName,
                hIconSmCtorArg = hIconSm,
            )
    }
}

public class Wndclassw internal constructor(
    public var style: WndclassStyles,
    public var lpfnWndProc: Wndproc,
    public var cbClsExtra: Int,
    public var cbWndExtra: Int,
    hInstanceCtorArg: Hinstance,
    hIconCtorArg: Hicon,
    hCursorCtorArg: Hcursor,
    hbrBackgroundCtorArg: Hbrush,
    lpszMenuNameCtorArg: Pcwstr,
    lpszClassNameCtorArg: Pcwstr,
) {
    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var hIcon: Hicon = hIconCtorArg
        internal set

    public var hCursor: Hcursor = hCursorCtorArg
        internal set

    public var hbrBackground: Hbrush = hbrBackgroundCtorArg
        internal set

    public var lpszMenuName: Pcwstr = lpszMenuNameCtorArg
        internal set

    public var lpszClassName: Pcwstr = lpszClassNameCtorArg
        internal set

    public constructor() : this(
        style = 0u,
        lpfnWndProc = null,
        cbClsExtra = 0,
        cbWndExtra = 0,
        hInstanceCtorArg = MutPtr(0L),
        hIconCtorArg = MutPtr(0L),
        hCursorCtorArg = MutPtr(0L),
        hbrBackgroundCtorArg = MutPtr(0L),
        lpszMenuNameCtorArg = ConstPtr(0L),
        lpszClassNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): WndclassStyles = this.style

    public operator fun component2(): Wndproc = this.lpfnWndProc

    public operator fun component3(): Int = this.cbClsExtra

    public operator fun component4(): Int = this.cbWndExtra

    public operator fun component5(): Hinstance = this.hInstance

    public operator fun component6(): Hicon = this.hIcon

    public operator fun component7(): Hcursor = this.hCursor

    public operator fun component8(): Hbrush = this.hbrBackground

    public operator fun component9(): Pcwstr = this.lpszMenuName

    public operator fun component10(): Pcwstr = this.lpszClassName

    public fun copy(style: WndclassStyles = this.style, lpfnWndProc: Wndproc = this.lpfnWndProc, cbClsExtra: Int = this.cbClsExtra, cbWndExtra: Int = this.cbWndExtra, hInstance: Hinstance = this.hInstance, hIcon: Hicon = this.hIcon, hCursor: Hcursor = this.hCursor, hbrBackground: Hbrush = this.hbrBackground, lpszMenuName: Pcwstr = this.lpszMenuName, lpszClassName: Pcwstr = this.lpszClassName): Wndclassw = Wndclassw(style = style, lpfnWndProc = lpfnWndProc, cbClsExtra = cbClsExtra, cbWndExtra = cbWndExtra, hInstanceCtorArg = hInstance, hIconCtorArg = hIcon, hCursorCtorArg = hCursor, hbrBackgroundCtorArg = hbrBackground, lpszMenuNameCtorArg = lpszMenuName, lpszClassNameCtorArg = lpszClassName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wndclassw) return false
        if (this.style != other.style) return false
        if (this.lpfnWndProc != other.lpfnWndProc) return false
        if (this.cbClsExtra != other.cbClsExtra) return false
        if (this.cbWndExtra != other.cbWndExtra) return false
        if (this.hInstance != other.hInstance) return false
        if (this.hIcon != other.hIcon) return false
        if (this.hCursor != other.hCursor) return false
        if (this.hbrBackground != other.hbrBackground) return false
        if (this.lpszMenuName != other.lpszMenuName) return false
        if (this.lpszClassName != other.lpszClassName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.style.hashCode()
        result = 31 * result + this.lpfnWndProc.hashCode()
        result = 31 * result + this.cbClsExtra.hashCode()
        result = 31 * result + this.cbWndExtra.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.hIcon.hashCode()
        result = 31 * result + this.hCursor.hashCode()
        result = 31 * result + this.hbrBackground.hashCode()
        result = 31 * result + this.lpszMenuName.hashCode()
        result = 31 * result + this.lpszClassName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            style: WndclassStyles = 0u,
            lpfnWndProc: Wndproc = null,
            cbClsExtra: Int = 0,
            cbWndExtra: Int = 0,
            hInstance: Hinstance = MutPtr(0L),
            hIcon: Hicon = MutPtr(0L),
            hCursor: Hcursor = MutPtr(0L),
            hbrBackground: Hbrush = MutPtr(0L),
            lpszMenuName: Pcwstr = ConstPtr(0L),
            lpszClassName: Pcwstr = ConstPtr(0L),
        ): Wndclassw =
            Wndclassw(
                style = style,
                lpfnWndProc = lpfnWndProc,
                cbClsExtra = cbClsExtra,
                cbWndExtra = cbWndExtra,
                hInstanceCtorArg = hInstance,
                hIconCtorArg = hIcon,
                hCursorCtorArg = hCursor,
                hbrBackgroundCtorArg = hbrBackground,
                lpszMenuNameCtorArg = lpszMenuName,
                lpszClassNameCtorArg = lpszClassName,
            )
    }
}

public data class DevBroadcastHeader(
    public var dbcdSize: UInt = 0u,
    public var dbcdDevicetype: UInt = 0u,
    public var dbcdReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevBroadcastHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevBroadcastHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): DevBroadcastHeader =
                    DevBroadcastHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DevBroadcastHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dbcdSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dbcdDevicetype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dbcdReserved)
                }
            }
    }
}

public data class DevBroadcastUserdefined(
    public var dbudDbh: DevBroadcastHdr = DevBroadcastHdr(),
    public var dbudSzName: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevBroadcastUserdefined) return false
        if (this.dbudDbh != other.dbudDbh) return false
        if (!this.dbudSzName.contentEquals(other.dbudSzName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dbudDbh.hashCode()
        result = 31 * result + this.dbudSzName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevBroadcastUserdefined> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevBroadcastUserdefined> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DevBroadcastUserdefined =
                    DevBroadcastUserdefined(
                        (DevBroadcastHdr.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                        ).readNative(addr + 12L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: DevBroadcastUserdefined) {
                    (DevBroadcastHdr.typeLayout()).writeNative(addr, value.dbudDbh)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                    ).writeNative(addr + 12L, value.dbudSzName.toList())
                }
            }
    }
}
