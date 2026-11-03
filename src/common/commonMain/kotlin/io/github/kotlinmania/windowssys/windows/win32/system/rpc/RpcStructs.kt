@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.rpc

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class ARRAY_INFO(
    public var Dimension: Int = 0,
    public var BufferConformanceMark: Long = 0L,
    public var BufferVarianceMark: Long = 0L,
    public var MaxCountArray: Long = 0L,
    public var OffsetArray: Long = 0L,
    public var ActualCountArray: Long = 0L,
)

public data class BinaryParam(public var Buffer: Long = 0L, public var Size: Short = 0)

public data class CLIENT_CALL_RETURN(public var Pointer: Long = 0L, public var Simple: Long = 0L)

public data class COMM_FAULT_OFFSETS(public var CommOffset: Short = 0, public var FaultOffset: Short = 0)

public data class FULL_PTR_XLAT_TABLES(
    public var RefIdToPointer: Long = 0L,
    public var PointerToRefId: Long = 0L,
    public var NextRefId: UInt = 0u,
    public var XlatSide: XLAT_SIDE = 0,
)

public data class GENERIC_BINDING_INFO(
    public var pObj: Long = 0L,
    public var Size: UInt = 0u,
    public var pfnBind: GENERIC_BINDING_ROUTINE = null,
    public var pfnUnbind: GENERIC_UNBIND_ROUTINE = null,
)

public data class GENERIC_BINDING_ROUTINE_PAIR(public var pfnBind: GENERIC_BINDING_ROUTINE = null, public var pfnUnbind: GENERIC_UNBIND_ROUTINE = null)

public data class I_RpcProxyCallbackInterface(
    public var IsValidMachineFn: I_RpcProxyIsValidMachineFn = null,
    public var GetClientAddressFn: I_RpcProxyGetClientAddressFn = null,
    public var GetConnectionTimeoutFn: I_RpcProxyGetConnectionTimeoutFn = null,
    public var PerformCalloutFn: I_RpcPerformCalloutFn = null,
    public var FreeCalloutStateFn: I_RpcFreeCalloutStateFn = null,
    public var GetClientSessionAndResourceUUIDFn: I_RpcProxyGetClientSessionAndResourceUUID = null,
    public var ProxyFilterIfFn: I_RpcProxyFilterIfFn = null,
    public var RpcProxyUpdatePerfCounterFn: I_RpcProxyUpdatePerfCounterFn = null,
    public var RpcProxyUpdatePerfCounterBackendServerFn: I_RpcProxyUpdatePerfCounterBackendServerFn = null,
)

public data class MALLOC_FREE_STRUCT(public var pfnAllocate: Long = 0L, public var pfnFree: Long = 0L)

public data class MIDL_FORMAT_STRING(public var Pad: Short = 0, public var Format: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIDL_FORMAT_STRING) return false
        if (this.Pad != other.Pad) return false
        if (!this.Format.contentEquals(other.Format)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Pad.hashCode()
        result = 31 * result + this.Format.contentHashCode()
        return result
    }
}

public data class MIDL_INTERCEPTION_INFO(
    public var Version: UInt = 0u,
    public var ProcString: Long = 0L,
    public var ProcFormatOffsetTable: Long = 0L,
    public var ProcCount: UInt = 0u,
    public var TypeString: Long = 0L,
)

public data class MIDL_INTERFACE_METHOD_PROPERTIES(public var MethodCount: UShort = 0u, public var MethodProperties: Long = 0L)

public data class MIDL_METHOD_PROPERTY(public var Id: UInt = 0u, public var Value: ULong = 0uL)

public data class MIDL_METHOD_PROPERTY_MAP(public var Count: UInt = 0u, public var Properties: Long = 0L)

public data class MIDL_SERVER_INFO(
    public var pStubDesc: Long = 0L,
    public var DispatchTable: Long = 0L,
    public var ProcString: Long = 0L,
    public var FmtStringOffset: Long = 0L,
    public var ThunkTable: Long = 0L,
    public var pTransferSyntax: Long = 0L,
    public var nCount: ULong = 0uL,
    public var pSyntaxInfo: Long = 0L,
)

public data class MIDL_STUBLESS_PROXY_INFO(
    public var pStubDesc: Long = 0L,
    public var ProcFormatString: Long = 0L,
    public var FormatStringOffset: Long = 0L,
    public var pTransferSyntax: Long = 0L,
    public var nCount: ULong = 0uL,
    public var pSyntaxInfo: Long = 0L,
)

public class MIDL_STUB_DESC(
    public var RpcInterfaceInformation: Long = 0L,
    public var pfnAllocate: PFN_RPC_ALLOCATE = null,
    public var pfnFree: PFN_RPC_FREE = null,
    public var IMPLICIT_HANDLE_INFO: MIDL_STUB_DESC_0 = MIDL_STUB_DESC_0(),
    public var apfnNdrRundownRoutines: Long = 0L,
    public var aGenericBindingRoutinePairs: Long = 0L,
    public var apfnExprEval: Long = 0L,
    public var aXmitQuintuple: Long = 0L,
    public var pFormatTypes: Long = 0L,
    public var fCheckBounds: Int = 0,
    public var Version: UInt = 0u,
    public var pMallocFreeStruct: Long = 0L,
    public var MIDLVersion: Int = 0,
    public var CommFaultOffsets: Long = 0L,
    public var aUserMarshalQuadruple: Long = 0L,
    public var NotifyRoutineTable: Long = 0L,
    public var mFlags: ULong = 0uL,
    public var CsRoutineTables: Long = 0L,
    public var ProxyServerInfo: Long = 0L,
    public var pExprInfo: Long = 0L,
)

public data class MIDL_STUB_DESC_0(
    public var pAutoHandle: Long = 0L,
    public var pPrimitiveHandle: Long = 0L,
    public var pGenericBindingInfo: Long = 0L,
)

public class MIDL_STUB_MESSAGE(
    public var RpcMsg: Long = 0L,
    public var Buffer: Long = 0L,
    public var BufferStart: Long = 0L,
    public var BufferEnd: Long = 0L,
    public var BufferMark: Long = 0L,
    public var BufferLength: UInt = 0u,
    public var MemorySize: UInt = 0u,
    public var Memory: Long = 0L,
    public var IsClient: UByte = 0u,
    public var Pad: UByte = 0u,
    public var uFlags2: UShort = 0u,
    public var ReuseBuffer: Int = 0,
    public var pAllocAllNodesContext: Long = 0L,
    public var pPointerQueueState: Long = 0L,
    public var IgnoreEmbeddedPointers: Int = 0,
    public var PointerBufferMark: Long = 0L,
    public var CorrDespIncrement: UByte = 0u,
    public var uFlags: UByte = 0u,
    public var UniquePtrCount: UShort = 0u,
    public var MaxCount: ULong = 0uL,
    public var Offset: UInt = 0u,
    public var ActualCount: UInt = 0u,
    public var pfnAllocate: PFN_RPC_ALLOCATE = null,
    public var pfnFree: PFN_RPC_FREE = null,
    public var StackTop: Long = 0L,
    public var pPresentedType: Long = 0L,
    public var pTransmitType: Long = 0L,
    public var SavedHandle: Long = 0L,
    public var StubDesc: Long = 0L,
    public var FullPtrXlatTables: Long = 0L,
    public var FullPtrRefId: UInt = 0u,
    public var PointerLength: UInt = 0u,
    public var _bitfield: Int = 0,
    public var dwDestContext: UInt = 0u,
    public var pvDestContext: Long = 0L,
    public var SavedContextHandles: Long = 0L,
    public var ParamNumber: Int = 0,
    public var pRpcChannelBuffer: Long = 0L,
    public var pArrayInfo: Long = 0L,
    public var SizePtrCountArray: Long = 0L,
    public var SizePtrOffsetArray: Long = 0L,
    public var SizePtrLengthArray: Long = 0L,
    public var pArgQueue: Long = 0L,
    public var dwStubPhase: UInt = 0u,
    public var LowStackMark: Long = 0L,
    public var pAsyncMsg: PNDR_ASYNC_MESSAGE = 0L,
    public var pCorrInfo: PNDR_CORRELATION_INFO = 0L,
    public var pCorrMemory: Long = 0L,
    public var pMemoryList: Long = 0L,
    public var pCSInfo: Long = 0L,
    public var ConformanceMark: Long = 0L,
    public var VarianceMark: Long = 0L,
    public var Unused: Long = 0L,
    public var pContext: Long = 0L,
    public var ContextHandleHash: Long = 0L,
    public var pUserMarshalList: Long = 0L,
    public var Reserved51_3: Long = 0L,
    public var Reserved51_4: Long = 0L,
    public var Reserved51_5: Long = 0L,
)

public data class MIDL_SYNTAX_INFO(
    public var TransferSyntax: RPC_SYNTAX_IDENTIFIER = RPC_SYNTAX_IDENTIFIER(),
    public var DispatchTable: Long = 0L,
    public var ProcString: Long = 0L,
    public var FmtStringOffset: Long = 0L,
    public var TypeString: Long = 0L,
    public var aUserMarshalQuadruple: Long = 0L,
    public var pMethodProperties: Long = 0L,
    public var pReserved2: ULong = 0uL,
)

public data class MIDL_TYPE_PICKLING_INFO(
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Reserved: ULongArray = ULongArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIDL_TYPE_PICKLING_INFO) return false
        if (this.Version != other.Version) return false
        if (this.Flags != other.Flags) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class MIDL_WINRT_TYPE_SERIALIZATION_INFO(
    public var Version: UInt = 0u,
    public var TypeFormatString: Long = 0L,
    public var FormatStringSize: UShort = 0u,
    public var TypeOffset: UShort = 0u,
    public var StubDesc: Long = 0L,
)

public data class NDR64_ARRAY_ELEMENT_INFO(public var ElementMemSize: UInt = 0u, public var Element: Long = 0L)

public data class NDR64_ARRAY_FLAGS(public var _bitfield: UByte = 0u)

public data class NDR64_BINDINGS(
    public var Primitive: NDR64_BIND_PRIMITIVE = NDR64_BIND_PRIMITIVE(),
    public var Generic: NDR64_BIND_GENERIC = NDR64_BIND_GENERIC(),
    public var Context: NDR64_BIND_CONTEXT = NDR64_BIND_CONTEXT(),
)

public data class NDR64_BIND_AND_NOTIFY_EXTENSION(public var Binding: NDR64_BIND_CONTEXT = NDR64_BIND_CONTEXT(), public var NotifyIndex: UShort = 0u)

public data class NDR64_BIND_CONTEXT(
    public var HandleType: UByte = 0u,
    public var Flags: UByte = 0u,
    public var StackOffset: UShort = 0u,
    public var RoutineIndex: UByte = 0u,
    public var Ordinal: UByte = 0u,
)

public data class NDR64_BIND_GENERIC(
    public var HandleType: UByte = 0u,
    public var Flags: UByte = 0u,
    public var StackOffset: UShort = 0u,
    public var RoutineIndex: UByte = 0u,
    public var Size: UByte = 0u,
)

public data class NDR64_BIND_PRIMITIVE(
    public var HandleType: UByte = 0u,
    public var Flags: UByte = 0u,
    public var StackOffset: UShort = 0u,
    public var Reserved: UShort = 0u,
)

public data class NDR64_BOGUS_ARRAY_HEADER_FORMAT(
    public var FormatCode: UByte = 0u,
    public var Alignment: UByte = 0u,
    public var Flags: NDR64_ARRAY_FLAGS = NDR64_ARRAY_FLAGS(),
    public var NumberDims: UByte = 0u,
    public var NumberElements: UInt = 0u,
    public var Element: Long = 0L,
)

public data class NDR64_BOGUS_STRUCTURE_HEADER_FORMAT(
    public var FormatCode: UByte = 0u,
    public var Alignment: UByte = 0u,
    public var Flags: NDR64_STRUCTURE_FLAGS = NDR64_STRUCTURE_FLAGS(),
    public var Reserve: UByte = 0u,
    public var MemorySize: UInt = 0u,
    public var OriginalMemberLayout: Long = 0L,
    public var OriginalPointerLayout: Long = 0L,
    public var PointerLayout: Long = 0L,
)

public data class NDR64_BUFFER_ALIGN_FORMAT(
    public var FormatCode: UByte = 0u,
    public var Alignment: UByte = 0u,
    public var Reserved: UShort = 0u,
    public var Reserved2: UInt = 0u,
)

public data class NDR64_CONFORMANT_STRING_FORMAT(public var Header: NDR64_STRING_HEADER_FORMAT = NDR64_STRING_HEADER_FORMAT())

public data class NDR64_CONF_ARRAY_HEADER_FORMAT(
    public var FormatCode: UByte = 0u,
    public var Alignment: UByte = 0u,
    public var Flags: NDR64_ARRAY_FLAGS = NDR64_ARRAY_FLAGS(),
    public var Reserved: UByte = 0u,
    public var ElementSize: UInt = 0u,
    public var ConfDescriptor: Long = 0L,
)

public data class NDR64_CONF_BOGUS_STRUCTURE_HEADER_FORMAT(
    public var FormatCode: UByte = 0u,
    public var Alignment: UByte = 0u,
    public var Flags: NDR64_STRUCTURE_FLAGS = NDR64_STRUCTURE_FLAGS(),
    public var Dimensions: UByte = 0u,
    public var MemorySize: UInt = 0u,
    public var OriginalMemberLayout: Long = 0L,
    public var OriginalPointerLayout: Long = 0L,
    public var PointerLayout: Long = 0L,
    public var ConfArrayDescription: Long = 0L,
)

public data class NDR64_CONF_STRUCTURE_HEADER_FORMAT(
    public var FormatCode: UByte = 0u,
    public var Alignment: UByte = 0u,
    public var Flags: NDR64_STRUCTURE_FLAGS = NDR64_STRUCTURE_FLAGS(),
    public var Reserve: UByte = 0u,
    public var MemorySize: UInt = 0u,
    public var ArrayDescription: Long = 0L,
)

public data class NDR64_CONF_VAR_ARRAY_HEADER_FORMAT(
    public var FormatCode: UByte = 0u,
    public var Alignment: UByte = 0u,
    public var Flags: NDR64_ARRAY_FLAGS = NDR64_ARRAY_FLAGS(),
    public var Reserved: UByte = 0u,
    public var ElementSize: UInt = 0u,
    public var ConfDescriptor: Long = 0L,
    public var VarDescriptor: Long = 0L,
)

public data class NDR64_CONF_VAR_BOGUS_ARRAY_HEADER_FORMAT(
    public var FixedArrayFormat: NDR64_BOGUS_ARRAY_HEADER_FORMAT = NDR64_BOGUS_ARRAY_HEADER_FORMAT(),
    public var ConfDescription: Long = 0L,
    public var VarDescription: Long = 0L,
    public var OffsetDescription: Long = 0L,
)

public data class NDR64_CONSTANT_IID_FORMAT(
    public var FormatCode: UByte = 0u,
    public var Flags: UByte = 0u,
    public var Reserved: UShort = 0u,
    public var Guid: GUID = GUID(),
)

public data class NDR64_CONTEXT_HANDLE_FLAGS(public var _bitfield: UByte = 0u)

public data class NDR64_CONTEXT_HANDLE_FORMAT(
    public var FormatCode: UByte = 0u,
    public var ContextFlags: UByte = 0u,
    public var RundownRoutineIndex: UByte = 0u,
    public var Ordinal: UByte = 0u,
)

public data class NDR64_EMBEDDED_COMPLEX_FORMAT(
    public var FormatCode: UByte = 0u,
    public var Reserve1: UByte = 0u,
    public var Reserve2: UShort = 0u,
    public var Type: Long = 0L,
)

public data class NDR64_ENCAPSULATED_UNION(
    public var FormatCode: UByte = 0u,
    public var Alignment: UByte = 0u,
    public var Flags: UByte = 0u,
    public var SwitchType: UByte = 0u,
    public var MemoryOffset: UInt = 0u,
    public var MemorySize: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class NDR64_EXPR_CONST32(
    public var ExprType: UByte = 0u,
    public var Reserved: UByte = 0u,
    public var Reserved1: UShort = 0u,
    public var ConstValue: UInt = 0u,
)

public data class NDR64_EXPR_CONST64(
    public var ExprType: UByte = 0u,
    public var Reserved: UByte = 0u,
    public var Reserved1: UShort = 0u,
    public var ConstValue: Long = 0L,
)

public data class NDR64_EXPR_NOOP(
    public var ExprType: UByte = 0u,
    public var Size: UByte = 0u,
    public var Reserved: UShort = 0u,
)

public data class NDR64_EXPR_OPERATOR(
    public var ExprType: UByte = 0u,
    public var Operator: UByte = 0u,
    public var CastType: UByte = 0u,
    public var Reserved: UByte = 0u,
)

public data class NDR64_EXPR_VAR(
    public var ExprType: UByte = 0u,
    public var VarType: UByte = 0u,
    public var Reserved: UShort = 0u,
    public var Offset: UInt = 0u,
)

public data class NDR64_FIXED_REPEAT_FORMAT(
    public var RepeatFormat: NDR64_REPEAT_FORMAT = NDR64_REPEAT_FORMAT(),
    public var Iterations: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class NDR64_FIX_ARRAY_HEADER_FORMAT(
    public var FormatCode: UByte = 0u,
    public var Alignment: UByte = 0u,
    public var Flags: NDR64_ARRAY_FLAGS = NDR64_ARRAY_FLAGS(),
    public var Reserved: UByte = 0u,
    public var TotalSize: UInt = 0u,
)

public data class NDR64_IID_FLAGS(public var _bitfield: UByte = 0u)

public data class NDR64_IID_FORMAT(
    public var FormatCode: UByte = 0u,
    public var Flags: UByte = 0u,
    public var Reserved: UShort = 0u,
    public var IIDDescriptor: Long = 0L,
)

public data class NDR64_MEMPAD_FORMAT(
    public var FormatCode: UByte = 0u,
    public var Reserve1: UByte = 0u,
    public var MemPad: UShort = 0u,
    public var Reserved2: UInt = 0u,
)

public data class NDR64_NON_CONFORMANT_STRING_FORMAT(public var Header: NDR64_STRING_HEADER_FORMAT = NDR64_STRING_HEADER_FORMAT(), public var TotalSize: UInt = 0u)

public data class NDR64_NON_ENCAPSULATED_UNION(
    public var FormatCode: UByte = 0u,
    public var Alignment: UByte = 0u,
    public var Flags: UByte = 0u,
    public var SwitchType: UByte = 0u,
    public var MemorySize: UInt = 0u,
    public var Switch: Long = 0L,
    public var Reserved: UInt = 0u,
)

public data class NDR64_NO_REPEAT_FORMAT(
    public var FormatCode: UByte = 0u,
    public var Flags: UByte = 0u,
    public var Reserved1: UShort = 0u,
    public var Reserved2: UInt = 0u,
)

public data class NDR64_PARAM_FLAGS(public var _bitfield: UShort = 0u)

public data class NDR64_PARAM_FORMAT(
    public var Type: Long = 0L,
    public var Attributes: NDR64_PARAM_FLAGS = NDR64_PARAM_FLAGS(),
    public var Reserved: UShort = 0u,
    public var StackOffset: UInt = 0u,
)

public data class NDR64_PIPE_FLAGS(public var _bitfield: UByte = 0u)

public data class NDR64_PIPE_FORMAT(
    public var FormatCode: UByte = 0u,
    public var Flags: UByte = 0u,
    public var Alignment: UByte = 0u,
    public var Reserved: UByte = 0u,
    public var Type: Long = 0L,
    public var MemorySize: UInt = 0u,
    public var BufferSize: UInt = 0u,
)

public data class NDR64_POINTER_FORMAT(
    public var FormatCode: UByte = 0u,
    public var Flags: UByte = 0u,
    public var Reserved: UShort = 0u,
    public var Pointee: Long = 0L,
)

public data class NDR64_POINTER_INSTANCE_HEADER_FORMAT(public var Offset: UInt = 0u, public var Reserved: UInt = 0u)

public data class NDR64_POINTER_REPEAT_FLAGS(public var _bitfield: UByte = 0u)

public data class NDR64_PROC_FLAGS(public var _bitfield: UInt = 0u)

public data class NDR64_PROC_FORMAT(
    public var Flags: UInt = 0u,
    public var StackSize: UInt = 0u,
    public var ConstantClientBufferSize: UInt = 0u,
    public var ConstantServerBufferSize: UInt = 0u,
    public var RpcFlags: UShort = 0u,
    public var FloatDoubleMask: UShort = 0u,
    public var NumberOfParams: UShort = 0u,
    public var ExtensionSize: UShort = 0u,
)

public data class NDR64_RANGED_STRING_FORMAT(
    public var Header: NDR64_STRING_HEADER_FORMAT = NDR64_STRING_HEADER_FORMAT(),
    public var Reserved: UInt = 0u,
    public var Min: ULong = 0uL,
    public var Max: ULong = 0uL,
)

public data class NDR64_RANGE_FORMAT(
    public var FormatCode: UByte = 0u,
    public var RangeType: UByte = 0u,
    public var Reserved: UShort = 0u,
    public var MinValue: Long = 0L,
    public var MaxValue: Long = 0L,
)

public data class NDR64_RANGE_PIPE_FORMAT(
    public var FormatCode: UByte = 0u,
    public var Flags: UByte = 0u,
    public var Alignment: UByte = 0u,
    public var Reserved: UByte = 0u,
    public var Type: Long = 0L,
    public var MemorySize: UInt = 0u,
    public var BufferSize: UInt = 0u,
    public var MinValue: UInt = 0u,
    public var MaxValue: UInt = 0u,
)

public data class NDR64_REPEAT_FORMAT(
    public var FormatCode: UByte = 0u,
    public var Flags: NDR64_POINTER_REPEAT_FLAGS = NDR64_POINTER_REPEAT_FLAGS(),
    public var Reserved: UShort = 0u,
    public var Increment: UInt = 0u,
    public var OffsetToArray: UInt = 0u,
    public var NumberOfPointers: UInt = 0u,
)

public data class NDR64_RPC_FLAGS(public var _bitfield: UShort = 0u)

public data class NDR64_SIMPLE_MEMBER_FORMAT(
    public var FormatCode: UByte = 0u,
    public var Reserved1: UByte = 0u,
    public var Reserved2: UShort = 0u,
    public var Reserved3: UInt = 0u,
)

public data class NDR64_SIMPLE_REGION_FORMAT(
    public var FormatCode: UByte = 0u,
    public var Alignment: UByte = 0u,
    public var RegionSize: UShort = 0u,
    public var Reserved: UInt = 0u,
)

public data class NDR64_SIZED_CONFORMANT_STRING_FORMAT(public var Header: NDR64_STRING_HEADER_FORMAT = NDR64_STRING_HEADER_FORMAT(), public var SizeDescription: Long = 0L)

public data class NDR64_STRING_FLAGS(public var _bitfield: UByte = 0u)

public data class NDR64_STRING_HEADER_FORMAT(
    public var FormatCode: UByte = 0u,
    public var Flags: NDR64_STRING_FLAGS = NDR64_STRING_FLAGS(),
    public var ElementSize: UShort = 0u,
)

public data class NDR64_STRUCTURE_FLAGS(public var _bitfield: UByte = 0u)

public data class NDR64_STRUCTURE_HEADER_FORMAT(
    public var FormatCode: UByte = 0u,
    public var Alignment: UByte = 0u,
    public var Flags: NDR64_STRUCTURE_FLAGS = NDR64_STRUCTURE_FLAGS(),
    public var Reserve: UByte = 0u,
    public var MemorySize: UInt = 0u,
)

public data class NDR64_SYSTEM_HANDLE_FORMAT(
    public var FormatCode: UByte = 0u,
    public var HandleType: UByte = 0u,
    public var DesiredAccess: UInt = 0u,
)

public data class NDR64_TRANSMIT_AS_FLAGS(public var _bitfield: UByte = 0u)

public data class NDR64_TRANSMIT_AS_FORMAT(
    public var FormatCode: UByte = 0u,
    public var Flags: UByte = 0u,
    public var RoutineIndex: UShort = 0u,
    public var TransmittedTypeWireAlignment: UShort = 0u,
    public var MemoryAlignment: UShort = 0u,
    public var PresentedTypeMemorySize: UInt = 0u,
    public var TransmittedTypeBufferSize: UInt = 0u,
    public var TransmittedType: Long = 0L,
)

public data class NDR64_TYPE_STRICT_CONTEXT_HANDLE(
    public var FormatCode: UByte = 0u,
    public var RealFormatCode: UByte = 0u,
    public var Reserved: UShort = 0u,
    public var Type: Long = 0L,
    public var CtxtFlags: UInt = 0u,
    public var CtxtID: UInt = 0u,
)

public data class NDR64_UNION_ARM(
    public var CaseValue: Long = 0L,
    public var Type: Long = 0L,
    public var Reserved: UInt = 0u,
)

public data class NDR64_UNION_ARM_SELECTOR(
    public var Reserved1: UByte = 0u,
    public var Alignment: UByte = 0u,
    public var Reserved2: UShort = 0u,
    public var Arms: UInt = 0u,
)

public data class NDR64_USER_MARSHAL_FLAGS(public var _bitfield: UByte = 0u)

public data class NDR64_USER_MARSHAL_FORMAT(
    public var FormatCode: UByte = 0u,
    public var Flags: UByte = 0u,
    public var RoutineIndex: UShort = 0u,
    public var TransmittedTypeWireAlignment: UShort = 0u,
    public var MemoryAlignment: UShort = 0u,
    public var UserTypeMemorySize: UInt = 0u,
    public var TransmittedTypeBufferSize: UInt = 0u,
    public var TransmittedType: Long = 0L,
)

public data class NDR64_VAR_ARRAY_HEADER_FORMAT(
    public var FormatCode: UByte = 0u,
    public var Alignment: UByte = 0u,
    public var Flags: NDR64_ARRAY_FLAGS = NDR64_ARRAY_FLAGS(),
    public var Reserved: UByte = 0u,
    public var TotalSize: UInt = 0u,
    public var ElementSize: UInt = 0u,
    public var VarDescriptor: Long = 0L,
)

public data class NDR_CS_ROUTINES(public var pSizeConvertRoutines: Long = 0L, public var pTagGettingRoutines: Long = 0L)

public data class NDR_CS_SIZE_CONVERT_ROUTINES(
    public var pfnNetSize: CS_TYPE_NET_SIZE_ROUTINE = null,
    public var pfnToNetCs: CS_TYPE_TO_NETCS_ROUTINE = null,
    public var pfnLocalSize: CS_TYPE_LOCAL_SIZE_ROUTINE = null,
    public var pfnFromNetCs: CS_TYPE_FROM_NETCS_ROUTINE = null,
)

public data class NDR_EXPR_DESC(public var pOffset: Long = 0L, public var pFormatExpr: Long = 0L)

public data class NDR_SCONTEXT(public var pad: LongArray = LongArray(2), public var userContext: Long = 0L) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NDR_SCONTEXT) return false
        if (!this.pad.contentEquals(other.pad)) return false
        if (this.userContext != other.userContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pad.contentHashCode()
        result = 31 * result + this.userContext.hashCode()
        return result
    }
}

public data class NDR_USER_MARSHAL_INFO(public var InformationLevel: UInt = 0u, public var Anonymous: NDR_USER_MARSHAL_INFO_0 = NDR_USER_MARSHAL_INFO_0())

public data class NDR_USER_MARSHAL_INFO_0(public var Level1: NDR_USER_MARSHAL_INFO_LEVEL1 = NDR_USER_MARSHAL_INFO_LEVEL1())

public data class NDR_USER_MARSHAL_INFO_LEVEL1(
    public var Buffer: Long = 0L,
    public var BufferSize: UInt = 0u,
    public var pfnAllocate: Long = 0L,
    public var pfnFree: Long = 0L,
    public var pRpcChannelBuffer: Long = 0L,
    public var Reserved: ULongArray = ULongArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NDR_USER_MARSHAL_INFO_LEVEL1) return false
        if (this.Buffer != other.Buffer) return false
        if (this.BufferSize != other.BufferSize) return false
        if (this.pfnAllocate != other.pfnAllocate) return false
        if (this.pfnFree != other.pfnFree) return false
        if (this.pRpcChannelBuffer != other.pRpcChannelBuffer) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Buffer.hashCode()
        result = 31 * result + this.BufferSize.hashCode()
        result = 31 * result + this.pfnAllocate.hashCode()
        result = 31 * result + this.pfnFree.hashCode()
        result = 31 * result + this.pRpcChannelBuffer.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class RDR_CALLOUT_STATE(
    public var LastError: RPC_STATUS = 0,
    public var LastEEInfo: Long = 0L,
    public var LastCalledStage: RPC_HTTP_REDIRECTOR_STAGE = 0,
    public var ServerName: Long = 0L,
    public var ServerPort: Long = 0L,
    public var RemoteUser: Long = 0L,
    public var AuthType: Long = 0L,
    public var ResourceTypePresent: UByte = 0u,
    public var SessionIdPresent: UByte = 0u,
    public var InterfacePresent: UByte = 0u,
    public var ResourceType: GUID = GUID(),
    public var SessionId: GUID = GUID(),
    public var Interface: RPC_SYNTAX_IDENTIFIER = RPC_SYNTAX_IDENTIFIER(),
    public var CertContext: Long = 0L,
)

public data class RPC_ASYNC_NOTIFICATION_INFO(
    public var APC: RPC_ASYNC_NOTIFICATION_INFO_0 = RPC_ASYNC_NOTIFICATION_INFO_0(),
    public var IOC: RPC_ASYNC_NOTIFICATION_INFO_1 = RPC_ASYNC_NOTIFICATION_INFO_1(),
    public var IntPtr: RPC_ASYNC_NOTIFICATION_INFO_2 = RPC_ASYNC_NOTIFICATION_INFO_2(),
    public var hEvent: Foundation.HANDLE = Foundation.HANDLE(),
    public var NotificationRoutine: PFN_RPCNOTIFICATION_ROUTINE = null,
)

public data class RPC_ASYNC_NOTIFICATION_INFO_0(public var NotificationRoutine: PFN_RPCNOTIFICATION_ROUTINE = null, public var hThread: Foundation.HANDLE = Foundation.HANDLE())

public data class RPC_ASYNC_NOTIFICATION_INFO_1(
    public var hIOPort: Foundation.HANDLE = Foundation.HANDLE(),
    public var dwNumberOfBytesTransferred: UInt = 0u,
    public var dwCompletionKey: ULong = 0uL,
    public var lpOverlapped: Long = 0L,
)

public data class RPC_ASYNC_NOTIFICATION_INFO_2(public var hWnd: Foundation.HWND = Foundation.HWND(), public var Msg: UInt = 0u)

public data class RPC_ASYNC_STATE(
    public var Size: UInt = 0u,
    public var Signature: UInt = 0u,
    public var Lock: Int = 0,
    public var Flags: UInt = 0u,
    public var StubInfo: Long = 0L,
    public var UserInfo: Long = 0L,
    public var RuntimeInfo: Long = 0L,
    public var Event: RPC_ASYNC_EVENT = 0,
    public var NotificationType: RPC_NOTIFICATION_TYPES = 0,
    public var u: RPC_ASYNC_NOTIFICATION_INFO = RPC_ASYNC_NOTIFICATION_INFO(),
    public var Reserved: LongArray = LongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RPC_ASYNC_STATE) return false
        if (this.Size != other.Size) return false
        if (this.Signature != other.Signature) return false
        if (this.Lock != other.Lock) return false
        if (this.Flags != other.Flags) return false
        if (this.StubInfo != other.StubInfo) return false
        if (this.UserInfo != other.UserInfo) return false
        if (this.RuntimeInfo != other.RuntimeInfo) return false
        if (this.Event != other.Event) return false
        if (this.NotificationType != other.NotificationType) return false
        if (this.u != other.u) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Size.hashCode()
        result = 31 * result + this.Signature.hashCode()
        result = 31 * result + this.Lock.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.StubInfo.hashCode()
        result = 31 * result + this.UserInfo.hashCode()
        result = 31 * result + this.RuntimeInfo.hashCode()
        result = 31 * result + this.Event.hashCode()
        result = 31 * result + this.NotificationType.hashCode()
        result = 31 * result + this.u.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class RPC_BINDING_HANDLE_OPTIONS_V1(
    public var Version: UInt = 0u,
    public var Flags: RPC_BINDING_HANDLE_OPTIONS_FLAGS = 0u,
    public var ComTimeout: UInt = 0u,
    public var CallTimeout: UInt = 0u,
)

public data class RPC_BINDING_HANDLE_SECURITY_V1_A(
    public var Version: UInt = 0u,
    public var ServerPrincName: Long = 0L,
    public var AuthnLevel: UInt = 0u,
    public var AuthnSvc: UInt = 0u,
    public var AuthIdentity: Long = 0L,
    public var SecurityQos: Long = 0L,
)

public data class RPC_BINDING_HANDLE_SECURITY_V1_W(
    public var Version: UInt = 0u,
    public var ServerPrincName: Long = 0L,
    public var AuthnLevel: UInt = 0u,
    public var AuthnSvc: UInt = 0u,
    public var AuthIdentity: Long = 0L,
    public var SecurityQos: Long = 0L,
)

public data class RPC_BINDING_HANDLE_TEMPLATE_V1_A(
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
    public var ProtocolSequence: UInt = 0u,
    public var NetworkAddress: Long = 0L,
    public var StringEndpoint: Long = 0L,
    public var u1: RPC_BINDING_HANDLE_TEMPLATE_V1_A_0 = RPC_BINDING_HANDLE_TEMPLATE_V1_A_0(),
    public var ObjectUuid: GUID = GUID(),
)

public data class RPC_BINDING_HANDLE_TEMPLATE_V1_A_0(public var Reserved: Long = 0L)

public data class RPC_BINDING_HANDLE_TEMPLATE_V1_W(
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
    public var ProtocolSequence: UInt = 0u,
    public var NetworkAddress: Long = 0L,
    public var StringEndpoint: Long = 0L,
    public var u1: RPC_BINDING_HANDLE_TEMPLATE_V1_W_0 = RPC_BINDING_HANDLE_TEMPLATE_V1_W_0(),
    public var ObjectUuid: GUID = GUID(),
)

public data class RPC_BINDING_HANDLE_TEMPLATE_V1_W_0(public var Reserved: Long = 0L)

public data class RPC_BINDING_VECTOR(public var Count: UInt = 0u, public var BindingH: LongArray = LongArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RPC_BINDING_VECTOR) return false
        if (this.Count != other.Count) return false
        if (!this.BindingH.contentEquals(other.BindingH)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Count.hashCode()
        result = 31 * result + this.BindingH.contentHashCode()
        return result
    }
}

public data class RPC_CALL_ATTRIBUTES_V1_A(
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
    public var ServerPrincipalNameBufferLength: UInt = 0u,
    public var ServerPrincipalName: Long = 0L,
    public var ClientPrincipalNameBufferLength: UInt = 0u,
    public var ClientPrincipalName: Long = 0L,
    public var AuthenticationLevel: UInt = 0u,
    public var AuthenticationService: UInt = 0u,
    public var NullSession: BOOL = 0,
)

public data class RPC_CALL_ATTRIBUTES_V1_W(
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
    public var ServerPrincipalNameBufferLength: UInt = 0u,
    public var ServerPrincipalName: Long = 0L,
    public var ClientPrincipalNameBufferLength: UInt = 0u,
    public var ClientPrincipalName: Long = 0L,
    public var AuthenticationLevel: UInt = 0u,
    public var AuthenticationService: UInt = 0u,
    public var NullSession: BOOL = 0,
)

public class RPC_CALL_ATTRIBUTES_V2_A(
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
    public var ServerPrincipalNameBufferLength: UInt = 0u,
    public var ServerPrincipalName: Long = 0L,
    public var ClientPrincipalNameBufferLength: UInt = 0u,
    public var ClientPrincipalName: Long = 0L,
    public var AuthenticationLevel: UInt = 0u,
    public var AuthenticationService: UInt = 0u,
    public var NullSession: BOOL = 0,
    public var KernelModeCaller: BOOL = 0,
    public var ProtocolSequence: UInt = 0u,
    public var IsClientLocal: UInt = 0u,
    public var ClientPID: Foundation.HANDLE = Foundation.HANDLE(),
    public var CallStatus: UInt = 0u,
    public var CallType: RpcCallType = 0,
    public var CallLocalAddress: Long = 0L,
    public var OpNum: UShort = 0u,
    public var InterfaceUuid: GUID = GUID(),
)

public class RPC_CALL_ATTRIBUTES_V2_W(
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
    public var ServerPrincipalNameBufferLength: UInt = 0u,
    public var ServerPrincipalName: Long = 0L,
    public var ClientPrincipalNameBufferLength: UInt = 0u,
    public var ClientPrincipalName: Long = 0L,
    public var AuthenticationLevel: UInt = 0u,
    public var AuthenticationService: UInt = 0u,
    public var NullSession: BOOL = 0,
    public var KernelModeCaller: BOOL = 0,
    public var ProtocolSequence: UInt = 0u,
    public var IsClientLocal: RpcCallClientLocality = 0,
    public var ClientPID: Foundation.HANDLE = Foundation.HANDLE(),
    public var CallStatus: UInt = 0u,
    public var CallType: RpcCallType = 0,
    public var CallLocalAddress: Long = 0L,
    public var OpNum: UShort = 0u,
    public var InterfaceUuid: GUID = GUID(),
)

public class RPC_CALL_ATTRIBUTES_V3_A(
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
    public var ServerPrincipalNameBufferLength: UInt = 0u,
    public var ServerPrincipalName: Long = 0L,
    public var ClientPrincipalNameBufferLength: UInt = 0u,
    public var ClientPrincipalName: Long = 0L,
    public var AuthenticationLevel: UInt = 0u,
    public var AuthenticationService: UInt = 0u,
    public var NullSession: BOOL = 0,
    public var KernelModeCaller: BOOL = 0,
    public var ProtocolSequence: UInt = 0u,
    public var IsClientLocal: UInt = 0u,
    public var ClientPID: Foundation.HANDLE = Foundation.HANDLE(),
    public var CallStatus: UInt = 0u,
    public var CallType: RpcCallType = 0,
    public var CallLocalAddress: Long = 0L,
    public var OpNum: UShort = 0u,
    public var InterfaceUuid: GUID = GUID(),
    public var ClientIdentifierBufferLength: UInt = 0u,
    public var ClientIdentifier: Long = 0L,
)

public class RPC_CALL_ATTRIBUTES_V3_W(
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
    public var ServerPrincipalNameBufferLength: UInt = 0u,
    public var ServerPrincipalName: Long = 0L,
    public var ClientPrincipalNameBufferLength: UInt = 0u,
    public var ClientPrincipalName: Long = 0L,
    public var AuthenticationLevel: UInt = 0u,
    public var AuthenticationService: UInt = 0u,
    public var NullSession: BOOL = 0,
    public var KernelModeCaller: BOOL = 0,
    public var ProtocolSequence: UInt = 0u,
    public var IsClientLocal: RpcCallClientLocality = 0,
    public var ClientPID: Foundation.HANDLE = Foundation.HANDLE(),
    public var CallStatus: UInt = 0u,
    public var CallType: RpcCallType = 0,
    public var CallLocalAddress: Long = 0L,
    public var OpNum: UShort = 0u,
    public var InterfaceUuid: GUID = GUID(),
    public var ClientIdentifierBufferLength: UInt = 0u,
    public var ClientIdentifier: Long = 0L,
)

public data class RPC_CALL_LOCAL_ADDRESS_V1(
    public var Version: UInt = 0u,
    public var Buffer: Long = 0L,
    public var BufferSize: UInt = 0u,
    public var AddressFormat: RpcLocalAddressFormat = 0,
)

public data class RPC_CLIENT_INFORMATION1(
    public var UserName: Long = 0L,
    public var ComputerName: Long = 0L,
    public var Privilege: UShort = 0u,
    public var AuthFlags: UInt = 0u,
)

public data class RPC_CLIENT_INTERFACE(
    public var Length: UInt = 0u,
    public var InterfaceId: RPC_SYNTAX_IDENTIFIER = RPC_SYNTAX_IDENTIFIER(),
    public var TransferSyntax: RPC_SYNTAX_IDENTIFIER = RPC_SYNTAX_IDENTIFIER(),
    public var DispatchTable: Long = 0L,
    public var RpcProtseqEndpointCount: UInt = 0u,
    public var RpcProtseqEndpoint: Long = 0L,
    public var Reserved: ULong = 0uL,
    public var InterpreterInfo: Long = 0L,
    public var Flags: UInt = 0u,
)

public data class RPC_C_OPT_COOKIE_AUTH_DESCRIPTOR(public var BufferSize: UInt = 0u, public var Buffer: PSTR = 0L)

public data class RPC_DISPATCH_TABLE(
    public var DispatchTableCount: UInt = 0u,
    public var DispatchTable: RPC_DISPATCH_FUNCTION = null,
    public var Reserved: Long = 0L,
)

public data class RPC_EE_INFO_PARAM(public var ParameterType: ExtendedErrorParamTypes = 0, public var u: RPC_EE_INFO_PARAM_0 = RPC_EE_INFO_PARAM_0())

public data class RPC_EE_INFO_PARAM_0(
    public var AnsiString: PSTR = 0L,
    public var UnicodeString: PWSTR = 0L,
    public var LVal: Int = 0,
    public var SVal: Short = 0,
    public var PVal: ULong = 0uL,
    public var BVal: BinaryParam = BinaryParam(),
)

public data class RPC_ENDPOINT_TEMPLATEA(
    public var Version: UInt = 0u,
    public var ProtSeq: PSTR = 0L,
    public var Endpoint: PSTR = 0L,
    public var SecurityDescriptor: Long = 0L,
    public var Backlog: UInt = 0u,
)

public data class RPC_ENDPOINT_TEMPLATEW(
    public var Version: UInt = 0u,
    public var ProtSeq: PWSTR = 0L,
    public var Endpoint: PWSTR = 0L,
    public var SecurityDescriptor: Long = 0L,
    public var Backlog: UInt = 0u,
)

public data class RPC_ERROR_ENUM_HANDLE(
    public var Signature: UInt = 0u,
    public var CurrentPos: Long = 0L,
    public var Head: Long = 0L,
)

public data class RPC_EXTENDED_ERROR_INFO(
    public var Version: UInt = 0u,
    public var ComputerName: PWSTR = 0L,
    public var ProcessID: UInt = 0u,
    public var u: RPC_EXTENDED_ERROR_INFO_0 = RPC_EXTENDED_ERROR_INFO_0(),
    public var GeneratingComponent: UInt = 0u,
    public var Status: UInt = 0u,
    public var DetectionLocation: UShort = 0u,
    public var Flags: UShort = 0u,
    public var NumberOfParameters: Int = 0,
    public var Parameters: List<RPC_EE_INFO_PARAM> = List(4) { RPC_EE_INFO_PARAM() },
)

public data class RPC_EXTENDED_ERROR_INFO_0(public var SystemTime: Foundation.SYSTEMTIME = Foundation.SYSTEMTIME(), public var FileTime: Foundation.FILETIME = Foundation.FILETIME())

public data class RPC_HTTP_TRANSPORT_CREDENTIALS_A(
    public var TransportCredentials: Long = 0L,
    public var Flags: RPC_C_HTTP_FLAGS = 0u,
    public var AuthenticationTarget: RPC_C_HTTP_AUTHN_TARGET = 0u,
    public var NumberOfAuthnSchemes: UInt = 0u,
    public var AuthnSchemes: Long = 0L,
    public var ServerCertificateSubject: Long = 0L,
)

public data class RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A(
    public var TransportCredentials: Long = 0L,
    public var Flags: RPC_C_HTTP_FLAGS = 0u,
    public var AuthenticationTarget: RPC_C_HTTP_AUTHN_TARGET = 0u,
    public var NumberOfAuthnSchemes: UInt = 0u,
    public var AuthnSchemes: Long = 0L,
    public var ServerCertificateSubject: Long = 0L,
    public var ProxyCredentials: Long = 0L,
    public var NumberOfProxyAuthnSchemes: UInt = 0u,
    public var ProxyAuthnSchemes: Long = 0L,
)

public data class RPC_HTTP_TRANSPORT_CREDENTIALS_V2_W(
    public var TransportCredentials: Long = 0L,
    public var Flags: RPC_C_HTTP_FLAGS = 0u,
    public var AuthenticationTarget: RPC_C_HTTP_AUTHN_TARGET = 0u,
    public var NumberOfAuthnSchemes: UInt = 0u,
    public var AuthnSchemes: Long = 0L,
    public var ServerCertificateSubject: Long = 0L,
    public var ProxyCredentials: Long = 0L,
    public var NumberOfProxyAuthnSchemes: UInt = 0u,
    public var ProxyAuthnSchemes: Long = 0L,
)

public data class RPC_HTTP_TRANSPORT_CREDENTIALS_V3_A(
    public var TransportCredentials: Long = 0L,
    public var Flags: RPC_C_HTTP_FLAGS = 0u,
    public var AuthenticationTarget: RPC_C_HTTP_AUTHN_TARGET = 0u,
    public var NumberOfAuthnSchemes: UInt = 0u,
    public var AuthnSchemes: Long = 0L,
    public var ServerCertificateSubject: Long = 0L,
    public var ProxyCredentials: Long = 0L,
    public var NumberOfProxyAuthnSchemes: UInt = 0u,
    public var ProxyAuthnSchemes: Long = 0L,
)

public data class RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W(
    public var TransportCredentials: Long = 0L,
    public var Flags: RPC_C_HTTP_FLAGS = 0u,
    public var AuthenticationTarget: RPC_C_HTTP_AUTHN_TARGET = 0u,
    public var NumberOfAuthnSchemes: UInt = 0u,
    public var AuthnSchemes: Long = 0L,
    public var ServerCertificateSubject: Long = 0L,
    public var ProxyCredentials: Long = 0L,
    public var NumberOfProxyAuthnSchemes: UInt = 0u,
    public var ProxyAuthnSchemes: Long = 0L,
)

public data class RPC_HTTP_TRANSPORT_CREDENTIALS_W(
    public var TransportCredentials: Long = 0L,
    public var Flags: RPC_C_HTTP_FLAGS = 0u,
    public var AuthenticationTarget: RPC_C_HTTP_AUTHN_TARGET = 0u,
    public var NumberOfAuthnSchemes: UInt = 0u,
    public var AuthnSchemes: Long = 0L,
    public var ServerCertificateSubject: Long = 0L,
)

public data class RPC_IF_ID(
    public var Uuid: GUID = GUID(),
    public var VersMajor: UShort = 0u,
    public var VersMinor: UShort = 0u,
)

public data class RPC_IF_ID_VECTOR(public var Count: UInt = 0u, public var IfId: LongArray = LongArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RPC_IF_ID_VECTOR) return false
        if (this.Count != other.Count) return false
        if (!this.IfId.contentEquals(other.IfId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Count.hashCode()
        result = 31 * result + this.IfId.contentHashCode()
        return result
    }
}

public data class RPC_IMPORT_CONTEXT_P(
    public var LookupContext: Long = 0L,
    public var ProposedHandle: Long = 0L,
    public var Bindings: Long = 0L,
)

public data class RPC_INTERFACE_TEMPLATEA(
    public var Version: UInt = 0u,
    public var IfSpec: Long = 0L,
    public var MgrTypeUuid: Long = 0L,
    public var MgrEpv: Long = 0L,
    public var Flags: UInt = 0u,
    public var MaxCalls: UInt = 0u,
    public var MaxRpcSize: UInt = 0u,
    public var IfCallback: RPC_IF_CALLBACK_FN = null,
    public var UuidVector: Long = 0L,
    public var Annotation: PSTR = 0L,
    public var SecurityDescriptor: Long = 0L,
)

public data class RPC_INTERFACE_TEMPLATEW(
    public var Version: UInt = 0u,
    public var IfSpec: Long = 0L,
    public var MgrTypeUuid: Long = 0L,
    public var MgrEpv: Long = 0L,
    public var Flags: UInt = 0u,
    public var MaxCalls: UInt = 0u,
    public var MaxRpcSize: UInt = 0u,
    public var IfCallback: RPC_IF_CALLBACK_FN = null,
    public var UuidVector: Long = 0L,
    public var Annotation: PWSTR = 0L,
    public var SecurityDescriptor: Long = 0L,
)

public data class RPC_MESSAGE(
    public var Handle: Long = 0L,
    public var DataRepresentation: UInt = 0u,
    public var Buffer: Long = 0L,
    public var BufferLength: UInt = 0u,
    public var ProcNum: UInt = 0u,
    public var TransferSyntax: Long = 0L,
    public var RpcInterfaceInformation: Long = 0L,
    public var ReservedForRuntime: Long = 0L,
    public var ManagerEpv: Long = 0L,
    public var ImportContext: Long = 0L,
    public var RpcFlags: UInt = 0u,
)

public data class RPC_POLICY(
    public var Length: UInt = 0u,
    public var EndpointFlags: UInt = 0u,
    public var NICFlags: UInt = 0u,
)

public data class RPC_PROTSEQ_ENDPOINT(public var RpcProtocolSequence: Long = 0L, public var Endpoint: Long = 0L)

public data class RPC_PROTSEQ_VECTORA(public var Count: UInt = 0u, public var Protseq: LongArray = LongArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RPC_PROTSEQ_VECTORA) return false
        if (this.Count != other.Count) return false
        if (!this.Protseq.contentEquals(other.Protseq)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Count.hashCode()
        result = 31 * result + this.Protseq.contentHashCode()
        return result
    }
}

public data class RPC_PROTSEQ_VECTORW(public var Count: UInt = 0u, public var Protseq: LongArray = LongArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RPC_PROTSEQ_VECTORW) return false
        if (this.Count != other.Count) return false
        if (!this.Protseq.contentEquals(other.Protseq)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Count.hashCode()
        result = 31 * result + this.Protseq.contentHashCode()
        return result
    }
}

public data class RPC_SECURITY_QOS(
    public var Version: UInt = 0u,
    public var Capabilities: RPC_C_QOS_CAPABILITIES = 0u,
    public var IdentityTracking: RPC_C_QOS_IDENTITY = 0u,
    public var ImpersonationType: Com.RPC_C_IMP_LEVEL = Com.RPC_C_IMP_LEVEL(),
)

public data class RPC_SECURITY_QOS_V2_A(
    public var Version: UInt = 0u,
    public var Capabilities: RPC_C_QOS_CAPABILITIES = 0u,
    public var IdentityTracking: RPC_C_QOS_IDENTITY = 0u,
    public var ImpersonationType: Com.RPC_C_IMP_LEVEL = Com.RPC_C_IMP_LEVEL(),
    public var AdditionalSecurityInfoType: RPC_C_AUTHN_INFO_TYPE = 0u,
    public var u: RPC_SECURITY_QOS_V2_A_0 = RPC_SECURITY_QOS_V2_A_0(),
)

public data class RPC_SECURITY_QOS_V2_A_0(public var HttpCredentials: Long = 0L)

public data class RPC_SECURITY_QOS_V2_W(
    public var Version: UInt = 0u,
    public var Capabilities: RPC_C_QOS_CAPABILITIES = 0u,
    public var IdentityTracking: RPC_C_QOS_IDENTITY = 0u,
    public var ImpersonationType: Com.RPC_C_IMP_LEVEL = Com.RPC_C_IMP_LEVEL(),
    public var AdditionalSecurityInfoType: RPC_C_AUTHN_INFO_TYPE = 0u,
    public var u: RPC_SECURITY_QOS_V2_W_0 = RPC_SECURITY_QOS_V2_W_0(),
)

public data class RPC_SECURITY_QOS_V2_W_0(public var HttpCredentials: Long = 0L)

public data class RPC_SECURITY_QOS_V3_A(
    public var Version: UInt = 0u,
    public var Capabilities: RPC_C_QOS_CAPABILITIES = 0u,
    public var IdentityTracking: RPC_C_QOS_IDENTITY = 0u,
    public var ImpersonationType: Com.RPC_C_IMP_LEVEL = Com.RPC_C_IMP_LEVEL(),
    public var AdditionalSecurityInfoType: RPC_C_AUTHN_INFO_TYPE = 0u,
    public var u: RPC_SECURITY_QOS_V3_A_0 = RPC_SECURITY_QOS_V3_A_0(),
    public var Sid: Long = 0L,
)

public data class RPC_SECURITY_QOS_V3_A_0(public var HttpCredentials: Long = 0L)

public data class RPC_SECURITY_QOS_V3_W(
    public var Version: UInt = 0u,
    public var Capabilities: RPC_C_QOS_CAPABILITIES = 0u,
    public var IdentityTracking: RPC_C_QOS_IDENTITY = 0u,
    public var ImpersonationType: Com.RPC_C_IMP_LEVEL = Com.RPC_C_IMP_LEVEL(),
    public var AdditionalSecurityInfoType: RPC_C_AUTHN_INFO_TYPE = 0u,
    public var u: RPC_SECURITY_QOS_V3_W_0 = RPC_SECURITY_QOS_V3_W_0(),
    public var Sid: Long = 0L,
)

public data class RPC_SECURITY_QOS_V3_W_0(public var HttpCredentials: Long = 0L)

public data class RPC_SECURITY_QOS_V4_A(
    public var Version: UInt = 0u,
    public var Capabilities: RPC_C_QOS_CAPABILITIES = 0u,
    public var IdentityTracking: RPC_C_QOS_IDENTITY = 0u,
    public var ImpersonationType: Com.RPC_C_IMP_LEVEL = Com.RPC_C_IMP_LEVEL(),
    public var AdditionalSecurityInfoType: RPC_C_AUTHN_INFO_TYPE = 0u,
    public var u: RPC_SECURITY_QOS_V4_A_0 = RPC_SECURITY_QOS_V4_A_0(),
    public var Sid: Long = 0L,
    public var EffectiveOnly: UInt = 0u,
)

public data class RPC_SECURITY_QOS_V4_A_0(public var HttpCredentials: Long = 0L)

public data class RPC_SECURITY_QOS_V4_W(
    public var Version: UInt = 0u,
    public var Capabilities: RPC_C_QOS_CAPABILITIES = 0u,
    public var IdentityTracking: RPC_C_QOS_IDENTITY = 0u,
    public var ImpersonationType: Com.RPC_C_IMP_LEVEL = Com.RPC_C_IMP_LEVEL(),
    public var AdditionalSecurityInfoType: RPC_C_AUTHN_INFO_TYPE = 0u,
    public var u: RPC_SECURITY_QOS_V4_W_0 = RPC_SECURITY_QOS_V4_W_0(),
    public var Sid: Long = 0L,
    public var EffectiveOnly: UInt = 0u,
)

public data class RPC_SECURITY_QOS_V4_W_0(public var HttpCredentials: Long = 0L)

public data class RPC_SECURITY_QOS_V5_A(
    public var Version: UInt = 0u,
    public var Capabilities: RPC_C_QOS_CAPABILITIES = 0u,
    public var IdentityTracking: RPC_C_QOS_IDENTITY = 0u,
    public var ImpersonationType: Com.RPC_C_IMP_LEVEL = Com.RPC_C_IMP_LEVEL(),
    public var AdditionalSecurityInfoType: RPC_C_AUTHN_INFO_TYPE = 0u,
    public var u: RPC_SECURITY_QOS_V5_A_0 = RPC_SECURITY_QOS_V5_A_0(),
    public var Sid: Long = 0L,
    public var EffectiveOnly: UInt = 0u,
    public var ServerSecurityDescriptor: Long = 0L,
)

public data class RPC_SECURITY_QOS_V5_A_0(public var HttpCredentials: Long = 0L)

public data class RPC_SECURITY_QOS_V5_W(
    public var Version: UInt = 0u,
    public var Capabilities: RPC_C_QOS_CAPABILITIES = 0u,
    public var IdentityTracking: RPC_C_QOS_IDENTITY = 0u,
    public var ImpersonationType: Com.RPC_C_IMP_LEVEL = Com.RPC_C_IMP_LEVEL(),
    public var AdditionalSecurityInfoType: RPC_C_AUTHN_INFO_TYPE = 0u,
    public var u: RPC_SECURITY_QOS_V5_W_0 = RPC_SECURITY_QOS_V5_W_0(),
    public var Sid: Long = 0L,
    public var EffectiveOnly: UInt = 0u,
    public var ServerSecurityDescriptor: Long = 0L,
)

public data class RPC_SECURITY_QOS_V5_W_0(public var HttpCredentials: Long = 0L)

public data class RPC_SEC_CONTEXT_KEY_INFO(
    public var EncryptAlgorithm: UInt = 0u,
    public var KeySize: UInt = 0u,
    public var SignatureAlgorithm: UInt = 0u,
)

public data class RPC_SERVER_INTERFACE(
    public var Length: UInt = 0u,
    public var InterfaceId: RPC_SYNTAX_IDENTIFIER = RPC_SYNTAX_IDENTIFIER(),
    public var TransferSyntax: RPC_SYNTAX_IDENTIFIER = RPC_SYNTAX_IDENTIFIER(),
    public var DispatchTable: Long = 0L,
    public var RpcProtseqEndpointCount: UInt = 0u,
    public var RpcProtseqEndpoint: Long = 0L,
    public var DefaultManagerEpv: Long = 0L,
    public var InterpreterInfo: Long = 0L,
    public var Flags: UInt = 0u,
)

public data class RPC_STATS_VECTOR(public var Count: UInt = 0u, public var Stats: UIntArray = UIntArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RPC_STATS_VECTOR) return false
        if (this.Count != other.Count) return false
        if (!this.Stats.contentEquals(other.Stats)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Count.hashCode()
        result = 31 * result + this.Stats.contentHashCode()
        return result
    }
}

public data class RPC_SYNTAX_IDENTIFIER(public var SyntaxGUID: GUID = GUID(), public var SyntaxVersion: RPC_VERSION = RPC_VERSION())

public data class RPC_TRANSFER_SYNTAX(
    public var Uuid: GUID = GUID(),
    public var VersMajor: UShort = 0u,
    public var VersMinor: UShort = 0u,
)

public data class RPC_VERSION(public var MajorVersion: UShort = 0u, public var MinorVersion: UShort = 0u)

public data class SCONTEXT_QUEUE(public var NumberOfObjects: UInt = 0u, public var ArrayOfObjects: Long = 0L)

public data class SEC_WINNT_AUTH_IDENTITY_A(
    public var User: Long = 0L,
    public var UserLength: UInt = 0u,
    public var Domain: Long = 0L,
    public var DomainLength: UInt = 0u,
    public var Password: Long = 0L,
    public var PasswordLength: UInt = 0u,
    public var Flags: SEC_WINNT_AUTH_IDENTITY = 0u,
)

public data class SEC_WINNT_AUTH_IDENTITY_W(
    public var User: Long = 0L,
    public var UserLength: UInt = 0u,
    public var Domain: Long = 0L,
    public var DomainLength: UInt = 0u,
    public var Password: Long = 0L,
    public var PasswordLength: UInt = 0u,
    public var Flags: SEC_WINNT_AUTH_IDENTITY = 0u,
)

public data class USER_MARSHAL_CB(
    public var Flags: UInt = 0u,
    public var pStubMsg: Long = 0L,
    public var pReserve: Long = 0L,
    public var Signature: UInt = 0u,
    public var CBType: USER_MARSHAL_CB_TYPE = 0,
    public var pFormat: Long = 0L,
    public var pTypeFormat: Long = 0L,
)

public data class USER_MARSHAL_ROUTINE_QUADRUPLE(
    public var pfnBufferSize: USER_MARSHAL_SIZING_ROUTINE = null,
    public var pfnMarshall: USER_MARSHAL_MARSHALLING_ROUTINE = null,
    public var pfnUnmarshall: USER_MARSHAL_UNMARSHALLING_ROUTINE = null,
    public var pfnFree: USER_MARSHAL_FREEING_ROUTINE = null,
)

public data class UUID_VECTOR(public var Count: UInt = 0u, public var Uuid: LongArray = LongArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UUID_VECTOR) return false
        if (this.Count != other.Count) return false
        if (!this.Uuid.contentEquals(other.Uuid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Count.hashCode()
        result = 31 * result + this.Uuid.contentHashCode()
        return result
    }
}

public data class XMIT_ROUTINE_QUINTUPLE(
    public var pfnTranslateToXmit: XMIT_HELPER_ROUTINE = null,
    public var pfnTranslateFromXmit: XMIT_HELPER_ROUTINE = null,
    public var pfnFreeXmit: XMIT_HELPER_ROUTINE = null,
    public var pfnFreeInst: XMIT_HELPER_ROUTINE = null,
)
