package io.github.kotlinmania.windowssys.windows.win32.graphics.opengl

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias GLUnurbs = Long

public fun interface GLUnurbsErrorProcFn {
    public operator fun invoke(param0: UInt)
}

public typealias GLUnurbsErrorProc = GLUnurbsErrorProcFn?

public typealias GLUquadric = Long

public fun interface GLUquadricErrorProcFn {
    public operator fun invoke(param0: UInt)
}

public typealias GLUquadricErrorProc = GLUquadricErrorProcFn?

public fun interface GLUtessBeginDataProcFn {
    public operator fun invoke(param0: UInt, param1: MutPtr)
}

public typealias GLUtessBeginDataProc = GLUtessBeginDataProcFn?

public fun interface GLUtessBeginProcFn {
    public operator fun invoke(param0: UInt)
}

public typealias GLUtessBeginProc = GLUtessBeginProcFn?

public fun interface GLUtessCombineDataProcFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr, param2: MutPtr, param3: MutPtr, param4: MutPtr)
}

public typealias GLUtessCombineDataProc = GLUtessCombineDataProcFn?

public fun interface GLUtessCombineProcFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr, param2: MutPtr, param3: MutPtr)
}

public typealias GLUtessCombineProc = GLUtessCombineProcFn?

public fun interface GLUtessEdgeFlagDataProcFn {
    public operator fun invoke(param0: UByte, param1: MutPtr)
}

public typealias GLUtessEdgeFlagDataProc = GLUtessEdgeFlagDataProcFn?

public fun interface GLUtessEdgeFlagProcFn {
    public operator fun invoke(param0: UByte)
}

public typealias GLUtessEdgeFlagProc = GLUtessEdgeFlagProcFn?

public fun interface GLUtessEndDataProcFn {
    public operator fun invoke(param0: MutPtr)
}

public typealias GLUtessEndDataProc = GLUtessEndDataProcFn?

public fun interface GLUtessEndProcFn {
    public operator fun invoke()
}

public typealias GLUtessEndProc = GLUtessEndProcFn?

public fun interface GLUtessErrorDataProcFn {
    public operator fun invoke(param0: UInt, param1: MutPtr)
}

public typealias GLUtessErrorDataProc = GLUtessErrorDataProcFn?

public fun interface GLUtessErrorProcFn {
    public operator fun invoke(param0: UInt)
}

public typealias GLUtessErrorProc = GLUtessErrorProcFn?

public fun interface GLUtessVertexDataProcFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr)
}

public typealias GLUtessVertexDataProc = GLUtessVertexDataProcFn?

public fun interface GLUtessVertexProcFn {
    public operator fun invoke(param0: MutPtr)
}

public typealias GLUtessVertexProc = GLUtessVertexProcFn?

public typealias GLUtesselator = Long

public typealias Hglrc = MutPtr

public typealias PfdFlags = UInt

public typealias PfdLayerType = Byte

public typealias PfdPixelType = UByte

public fun interface PfngladdswaphintrectwinprocFn {
    public operator fun invoke(x: Int, y: Int, width: Int, height: Int)
}

public typealias Pfngladdswaphintrectwinproc = PfngladdswaphintrectwinprocFn?

public fun interface PfnglarrayelementarrayextprocFn {
    public operator fun invoke(mode: UInt, count: Int, pi: ConstPtr)
}

public typealias Pfnglarrayelementarrayextproc = PfnglarrayelementarrayextprocFn?

public fun interface PfnglarrayelementextprocFn {
    public operator fun invoke(i: Int)
}

public typealias Pfnglarrayelementextproc = PfnglarrayelementextprocFn?

public fun interface PfnglcolorpointerextprocFn {
    public operator fun invoke(size: Int, type: UInt, stride: Int, count: Int, pointer: ConstPtr)
}

public typealias Pfnglcolorpointerextproc = PfnglcolorpointerextprocFn?

public fun interface PfnglcolorsubtableextprocFn {
    public operator fun invoke(target: UInt, start: Int, count: Int, format: UInt, type: UInt, data: ConstPtr)
}

public typealias Pfnglcolorsubtableextproc = PfnglcolorsubtableextprocFn?

public fun interface PfnglcolortableextprocFn {
    public operator fun invoke(target: UInt, internalformat: UInt, width: Int, format: UInt, type: UInt, data: ConstPtr)
}

public typealias Pfnglcolortableextproc = PfnglcolortableextprocFn?

public fun interface PfngldrawarraysextprocFn {
    public operator fun invoke(mode: UInt, first: Int, count: Int)
}

public typealias Pfngldrawarraysextproc = PfngldrawarraysextprocFn?

public fun interface PfngldrawrangeelementswinprocFn {
    public operator fun invoke(mode: UInt, start: UInt, end: UInt, count: Int, type: UInt, indices: ConstPtr)
}

public typealias Pfngldrawrangeelementswinproc = PfngldrawrangeelementswinprocFn?

public fun interface PfngledgeflagpointerextprocFn {
    public operator fun invoke(stride: Int, count: Int, pointer: ConstPtr)
}

public typealias Pfngledgeflagpointerextproc = PfngledgeflagpointerextprocFn?

public fun interface PfnglgetcolortableextprocFn {
    public operator fun invoke(target: UInt, format: UInt, type: UInt, data: MutPtr)
}

public typealias Pfnglgetcolortableextproc = PfnglgetcolortableextprocFn?

public fun interface PfnglgetcolortableparameterfvextprocFn {
    public operator fun invoke(target: UInt, pname: UInt, params: MutPtr)
}

public typealias Pfnglgetcolortableparameterfvextproc = PfnglgetcolortableparameterfvextprocFn?

public fun interface PfnglgetcolortableparameterivextprocFn {
    public operator fun invoke(target: UInt, pname: UInt, params: MutPtr)
}

public typealias Pfnglgetcolortableparameterivextproc = PfnglgetcolortableparameterivextprocFn?

public fun interface PfnglgetpointervextprocFn {
    public operator fun invoke(pname: UInt, params: MutPtr)
}

public typealias Pfnglgetpointervextproc = PfnglgetpointervextprocFn?

public fun interface PfnglindexpointerextprocFn {
    public operator fun invoke(type: UInt, stride: Int, count: Int, pointer: ConstPtr)
}

public typealias Pfnglindexpointerextproc = PfnglindexpointerextprocFn?

public fun interface PfnglnormalpointerextprocFn {
    public operator fun invoke(type: UInt, stride: Int, count: Int, pointer: ConstPtr)
}

public typealias Pfnglnormalpointerextproc = PfnglnormalpointerextprocFn?

public fun interface PfngltexcoordpointerextprocFn {
    public operator fun invoke(size: Int, type: UInt, stride: Int, count: Int, pointer: ConstPtr)
}

public typealias Pfngltexcoordpointerextproc = PfngltexcoordpointerextprocFn?

public fun interface PfnglvertexpointerextprocFn {
    public operator fun invoke(size: Int, type: UInt, stride: Int, count: Int, pointer: ConstPtr)
}

public typealias Pfnglvertexpointerextproc = PfnglvertexpointerextprocFn?
