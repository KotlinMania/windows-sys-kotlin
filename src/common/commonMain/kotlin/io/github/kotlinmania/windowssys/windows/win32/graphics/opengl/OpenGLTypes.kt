package io.github.kotlinmania.windowssys.windows.win32.graphics.opengl

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
    public operator fun invoke(param0: UInt, param1: Long)
}

public typealias GLUtessBeginDataProc = GLUtessBeginDataProcFn?

public fun interface GLUtessBeginProcFn {
    public operator fun invoke(param0: UInt)
}

public typealias GLUtessBeginProc = GLUtessBeginProcFn?

public fun interface GLUtessCombineDataProcFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long)
}

public typealias GLUtessCombineDataProc = GLUtessCombineDataProcFn?

public fun interface GLUtessCombineProcFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: Long)
}

public typealias GLUtessCombineProc = GLUtessCombineProcFn?

public fun interface GLUtessEdgeFlagDataProcFn {
    public operator fun invoke(param0: UByte, param1: Long)
}

public typealias GLUtessEdgeFlagDataProc = GLUtessEdgeFlagDataProcFn?

public fun interface GLUtessEdgeFlagProcFn {
    public operator fun invoke(param0: UByte)
}

public typealias GLUtessEdgeFlagProc = GLUtessEdgeFlagProcFn?

public fun interface GLUtessEndDataProcFn {
    public operator fun invoke(param0: Long)
}

public typealias GLUtessEndDataProc = GLUtessEndDataProcFn?

public fun interface GLUtessEndProcFn {
    public operator fun invoke()
}

public typealias GLUtessEndProc = GLUtessEndProcFn?

public fun interface GLUtessErrorDataProcFn {
    public operator fun invoke(param0: UInt, param1: Long)
}

public typealias GLUtessErrorDataProc = GLUtessErrorDataProcFn?

public fun interface GLUtessErrorProcFn {
    public operator fun invoke(param0: UInt)
}

public typealias GLUtessErrorProc = GLUtessErrorProcFn?

public fun interface GLUtessVertexDataProcFn {
    public operator fun invoke(param0: Long, param1: Long)
}

public typealias GLUtessVertexDataProc = GLUtessVertexDataProcFn?

public fun interface GLUtessVertexProcFn {
    public operator fun invoke(param0: Long)
}

public typealias GLUtessVertexProc = GLUtessVertexProcFn?

public typealias GLUtesselator = Long

public typealias HGLRC = Long

public typealias PFD_FLAGS = UInt

public typealias PFD_LAYER_TYPE = Byte

public typealias PFD_PIXEL_TYPE = UByte

public fun interface PFNGLADDSWAPHINTRECTWINPROCFn {
    public operator fun invoke(x: Int, y: Int, width: Int, height: Int)
}

public typealias PFNGLADDSWAPHINTRECTWINPROC = PFNGLADDSWAPHINTRECTWINPROCFn?

public fun interface PFNGLARRAYELEMENTARRAYEXTPROCFn {
    public operator fun invoke(mode: UInt, count: Int, pi: Long)
}

public typealias PFNGLARRAYELEMENTARRAYEXTPROC = PFNGLARRAYELEMENTARRAYEXTPROCFn?

public fun interface PFNGLARRAYELEMENTEXTPROCFn {
    public operator fun invoke(i: Int)
}

public typealias PFNGLARRAYELEMENTEXTPROC = PFNGLARRAYELEMENTEXTPROCFn?

public fun interface PFNGLCOLORPOINTEREXTPROCFn {
    public operator fun invoke(size: Int, type: UInt, stride: Int, count: Int, pointer: Long)
}

public typealias PFNGLCOLORPOINTEREXTPROC = PFNGLCOLORPOINTEREXTPROCFn?

public fun interface PFNGLCOLORSUBTABLEEXTPROCFn {
    public operator fun invoke(target: UInt, start: Int, count: Int, format: UInt, type: UInt, data: Long)
}

public typealias PFNGLCOLORSUBTABLEEXTPROC = PFNGLCOLORSUBTABLEEXTPROCFn?

public fun interface PFNGLCOLORTABLEEXTPROCFn {
    public operator fun invoke(target: UInt, internalformat: UInt, width: Int, format: UInt, type: UInt, data: Long)
}

public typealias PFNGLCOLORTABLEEXTPROC = PFNGLCOLORTABLEEXTPROCFn?

public fun interface PFNGLDRAWARRAYSEXTPROCFn {
    public operator fun invoke(mode: UInt, first: Int, count: Int)
}

public typealias PFNGLDRAWARRAYSEXTPROC = PFNGLDRAWARRAYSEXTPROCFn?

public fun interface PFNGLDRAWRANGEELEMENTSWINPROCFn {
    public operator fun invoke(mode: UInt, start: UInt, end: UInt, count: Int, type: UInt, indices: Long)
}

public typealias PFNGLDRAWRANGEELEMENTSWINPROC = PFNGLDRAWRANGEELEMENTSWINPROCFn?

public fun interface PFNGLEDGEFLAGPOINTEREXTPROCFn {
    public operator fun invoke(stride: Int, count: Int, pointer: Long)
}

public typealias PFNGLEDGEFLAGPOINTEREXTPROC = PFNGLEDGEFLAGPOINTEREXTPROCFn?

public fun interface PFNGLGETCOLORTABLEEXTPROCFn {
    public operator fun invoke(target: UInt, format: UInt, type: UInt, data: Long)
}

public typealias PFNGLGETCOLORTABLEEXTPROC = PFNGLGETCOLORTABLEEXTPROCFn?

public fun interface PFNGLGETCOLORTABLEPARAMETERFVEXTPROCFn {
    public operator fun invoke(target: UInt, pname: UInt, params: Long)
}

public typealias PFNGLGETCOLORTABLEPARAMETERFVEXTPROC = PFNGLGETCOLORTABLEPARAMETERFVEXTPROCFn?

public fun interface PFNGLGETCOLORTABLEPARAMETERIVEXTPROCFn {
    public operator fun invoke(target: UInt, pname: UInt, params: Long)
}

public typealias PFNGLGETCOLORTABLEPARAMETERIVEXTPROC = PFNGLGETCOLORTABLEPARAMETERIVEXTPROCFn?

public fun interface PFNGLGETPOINTERVEXTPROCFn {
    public operator fun invoke(pname: UInt, params: Long)
}

public typealias PFNGLGETPOINTERVEXTPROC = PFNGLGETPOINTERVEXTPROCFn?

public fun interface PFNGLINDEXPOINTEREXTPROCFn {
    public operator fun invoke(type: UInt, stride: Int, count: Int, pointer: Long)
}

public typealias PFNGLINDEXPOINTEREXTPROC = PFNGLINDEXPOINTEREXTPROCFn?

public fun interface PFNGLNORMALPOINTEREXTPROCFn {
    public operator fun invoke(type: UInt, stride: Int, count: Int, pointer: Long)
}

public typealias PFNGLNORMALPOINTEREXTPROC = PFNGLNORMALPOINTEREXTPROCFn?

public fun interface PFNGLTEXCOORDPOINTEREXTPROCFn {
    public operator fun invoke(size: Int, type: UInt, stride: Int, count: Int, pointer: Long)
}

public typealias PFNGLTEXCOORDPOINTEREXTPROC = PFNGLTEXCOORDPOINTEREXTPROCFn?

public fun interface PFNGLVERTEXPOINTEREXTPROCFn {
    public operator fun invoke(size: Int, type: UInt, stride: Int, count: Int, pointer: Long)
}

public typealias PFNGLVERTEXPOINTEREXTPROC = PFNGLVERTEXPOINTEREXTPROCFn?
