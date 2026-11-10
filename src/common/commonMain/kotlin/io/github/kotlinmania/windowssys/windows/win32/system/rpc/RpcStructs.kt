@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.rpc

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.system.com.RpcCImpLevel
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

public data class ArrayInfo(
    public var dimension: Int = 0,
    public var bufferConformanceMark: UInt? = null,
    public var bufferVarianceMark: UInt? = null,
    public var maxCountArray: UInt? = null,
    public var offsetArray: UInt? = null,
    public var actualCountArray: UInt? = null,
)

public data class BinaryParam(
    public var buffer: COpaquePointer? = null,
    public var size: Short = 0,
)

public data class ClientCallReturn(
    public var pointer: COpaquePointer? = null,
    public var simple: Int = 0,
)

public data class CommFaultOffsets(
    public var commOffset: Short = 0,
    public var faultOffset: Short = 0,
)

public data class FullPtrXlatTables(
    public var refIdToPointer: COpaquePointer? = null,
    public var pointerToRefId: COpaquePointer? = null,
    public var nextRefId: UInt = 0u,
    public var xlatSide: XlatSide = 0,
)

public data class GenericBindingInfo(
    public var pObj: COpaquePointer? = null,
    public var size: UInt = 0u,
    public var pfnBind: GenericBindingRoutine = null,
    public var pfnUnbind: GenericUnbindRoutine = null,
)

public data class GenericBindingRoutinePair(
    public var pfnBind: GenericBindingRoutine = null,
    public var pfnUnbind: GenericUnbindRoutine = null,
)

public data class IRpcProxyCallbackInterface(
    public var isValidMachineFn: IRpcProxyIsValidMachineFn = null,
    public var getClientAddressFn: IRpcProxyGetClientAddressFn = null,
    public var getConnectionTimeoutFn: IRpcProxyGetConnectionTimeoutFn = null,
    public var performCalloutFn: IRpcPerformCalloutFn = null,
    public var freeCalloutStateFn: IRpcFreeCalloutStateFn = null,
    public var getClientSessionAndResourceUUIDFn: IRpcProxyGetClientSessionAndResourceUuid = null,
    public var proxyFilterIfFn: IRpcProxyFilterIfFn = null,
    public var rpcProxyUpdatePerfCounterFn: IRpcProxyUpdatePerfCounterFn = null,
    public var rpcProxyUpdatePerfCounterBackendServerFn: IRpcProxyUpdatePerfCounterBackendServerFn = null,
)

public data class MallocFreeStruct(
    public var pfnAllocate: Int = 0,
    public var pfnFree: Int = 0,
)

public data class MidlFormatString(
    public var pad: Short = 0,
    public var format: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MidlFormatString) return false
        if (this.pad != other.pad) return false
        if (!this.format.contentEquals(other.format)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pad.hashCode()
        result = 31 * result + this.format.contentHashCode()
        return result
    }
}

public data class MidlInterceptionInfo(
    public var version: UInt = 0u,
    public var procString: COpaquePointer? = null,
    public var procFormatOffsetTable: UShort? = null,
    public var procCount: UInt = 0u,
    public var typeString: COpaquePointer? = null,
)

public data class MidlInterfaceMethodProperties(
    public var methodCount: UShort = 0u,
    public var methodProperties: COpaquePointer? = null,
)

public data class MidlMethodProperty(
    public var id: UInt = 0u,
    public var value: Int = 0,
)

public data class MidlMethodPropertyMap(
    public var count: UInt = 0u,
    public var properties: MidlMethodProperty? = null,
)

public data class MidlServerInfo(
    public var pStubDesc: MidlStubDesc? = null,
    public var dispatchTable: ServerRoutineFn? = null,
    public var procString: COpaquePointer? = null,
    public var fmtStringOffset: UShort? = null,
    public var thunkTable: ExprEvalFn? = null,
    public var pTransferSyntax: RpcSyntaxIdentifier? = null,
    public var nCount: Int = 0,
    public var pSyntaxInfo: MidlSyntaxInfo? = null,
)

public data class MidlStublessProxyInfo(
    public var pStubDesc: MidlStubDesc? = null,
    public var procFormatString: COpaquePointer? = null,
    public var formatStringOffset: UShort? = null,
    public var pTransferSyntax: RpcSyntaxIdentifier? = null,
    public var nCount: Int = 0,
    public var pSyntaxInfo: MidlSyntaxInfo? = null,
)

public class MidlStubDesc(
    public var rpcInterfaceInformation: COpaquePointer? = null,
    public var pfnAllocate: PfnRpcAllocate = null,
    public var pfnFree: PfnRpcFree = null,
    public var implicitHandleInfo: MidlStubDesc0 = MidlStubDesc0(),
    public var apfnNdrRundownRoutines: ExprEvalFn? = null,
    public var aGenericBindingRoutinePairs: GenericBindingRoutinePair? = null,
    public var apfnExprEval: ExprEvalFn? = null,
    public var aXmitQuintuple: XmitRoutineQuintuple? = null,
    public var pFormatTypes: COpaquePointer? = null,
    public var fCheckBounds: Int = 0,
    public var version: UInt = 0u,
    public var pMallocFreeStruct: MallocFreeStruct? = null,
    public var mIDLVersion: Int = 0,
    public var commFaultOffsets: CommFaultOffsets? = null,
    public var aUserMarshalQuadruple: UserMarshalRoutineQuadruple? = null,
    public var notifyRoutineTable: NdrNotifyRoutineFn? = null,
    public var mFlags: Int = 0,
    public var csRoutineTables: NdrCsRoutines? = null,
    public var proxyServerInfo: COpaquePointer? = null,
    public var pExprInfo: NdrExprDesc? = null,
)

public data class MidlStubDesc0(
    public var pAutoHandle: COpaquePointer? = null,
    public var pPrimitiveHandle: COpaquePointer? = null,
    public var pGenericBindingInfo: GenericBindingInfo? = null,
)

public class MidlStubMessage(
    public var rpcMsg: RpcMessage? = null,
    public var buffer: COpaquePointer? = null,
    public var bufferStart: COpaquePointer? = null,
    public var bufferEnd: COpaquePointer? = null,
    public var bufferMark: COpaquePointer? = null,
    public var bufferLength: UInt = 0u,
    public var memorySize: UInt = 0u,
    public var memory: COpaquePointer? = null,
    public var isClient: UByte = 0u,
    public var pad: UByte = 0u,
    public var uFlags2: UShort = 0u,
    public var reuseBuffer: Int = 0,
    public var pAllocAllNodesContext: Int? = null,
    public var pPointerQueueState: Int? = null,
    public var ignoreEmbeddedPointers: Int = 0,
    public var pointerBufferMark: COpaquePointer? = null,
    public var corrDespIncrement: UByte = 0u,
    public var uFlags: UByte = 0u,
    public var uniquePtrCount: UShort = 0u,
    public var maxCount: Int = 0,
    public var offset: UInt = 0u,
    public var actualCount: UInt = 0u,
    public var pfnAllocate: PfnRpcAllocate = null,
    public var pfnFree: PfnRpcFree = null,
    public var stackTop: COpaquePointer? = null,
    public var pPresentedType: COpaquePointer? = null,
    public var pTransmitType: COpaquePointer? = null,
    public var savedHandle: COpaquePointer? = null,
    public var stubDesc: MidlStubDesc? = null,
    public var fullPtrXlatTables: FullPtrXlatTables? = null,
    public var fullPtrRefId: UInt = 0u,
    public var pointerLength: UInt = 0u,
    public var bitfield: Int = 0,
    public var dwDestContext: UInt = 0u,
    public var pvDestContext: COpaquePointer? = null,
    public var savedContextHandles: COpaquePointer? = null,
    public var paramNumber: Int = 0,
    public var pRpcChannelBuffer: COpaquePointer? = null,
    public var pArrayInfo: ArrayInfo? = null,
    public var sizePtrCountArray: UInt? = null,
    public var sizePtrOffsetArray: UInt? = null,
    public var sizePtrLengthArray: UInt? = null,
    public var pArgQueue: COpaquePointer? = null,
    public var dwStubPhase: UInt = 0u,
    public var lowStackMark: COpaquePointer? = null,
    public var pAsyncMsg: PndrAsyncMessage = 0,
    public var pCorrInfo: PndrCorrelationInfo = 0,
    public var pCorrMemory: COpaquePointer? = null,
    public var pMemoryList: COpaquePointer? = null,
    public var pCSInfo: Int = 0,
    public var conformanceMark: COpaquePointer? = null,
    public var varianceMark: COpaquePointer? = null,
    public var unused: Int = 0,
    public var pContext: Int? = null,
    public var contextHandleHash: COpaquePointer? = null,
    public var pUserMarshalList: COpaquePointer? = null,
    public var reserved513: Int = 0,
    public var reserved514: Int = 0,
    public var reserved515: Int = 0,
)

public data class MidlSyntaxInfo(
    public var transferSyntax: RpcSyntaxIdentifier = RpcSyntaxIdentifier(),
    public var dispatchTable: RpcDispatchTable? = null,
    public var procString: COpaquePointer? = null,
    public var fmtStringOffset: UShort? = null,
    public var typeString: COpaquePointer? = null,
    public var aUserMarshalQuadruple: COpaquePointer? = null,
    public var pMethodProperties: MidlInterfaceMethodProperties? = null,
    public var pReserved2: Int = 0,
)

public data class MidlTypePicklingInfo(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var reserved: IntArray = IntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MidlTypePicklingInfo) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class MidlWinrtTypeSerializationInfo(
    public var version: UInt = 0u,
    public var typeFormatString: COpaquePointer? = null,
    public var formatStringSize: UShort = 0u,
    public var typeOffset: UShort = 0u,
    public var stubDesc: MidlStubDesc? = null,
)

public data class Ndr64ArrayElementInfo(
    public var elementMemSize: UInt = 0u,
    public var element: COpaquePointer? = null,
)

public data class Ndr64ArrayFlags(
    public var bitfield: UByte = 0u,
)

public data class Ndr64Bindings(
    public var primitive: Ndr64BindPrimitive = Ndr64BindPrimitive(),
    public var generic: Ndr64BindGeneric = Ndr64BindGeneric(),
    public var context: Ndr64BindContext = Ndr64BindContext(),
)

public data class Ndr64BindAndNotifyExtension(
    public var binding: Ndr64BindContext = Ndr64BindContext(),
    public var notifyIndex: UShort = 0u,
)

public data class Ndr64BindContext(
    public var handleType: UByte = 0u,
    public var flags: UByte = 0u,
    public var stackOffset: UShort = 0u,
    public var routineIndex: UByte = 0u,
    public var ordinal: UByte = 0u,
)

public data class Ndr64BindGeneric(
    public var handleType: UByte = 0u,
    public var flags: UByte = 0u,
    public var stackOffset: UShort = 0u,
    public var routineIndex: UByte = 0u,
    public var size: UByte = 0u,
)

public data class Ndr64BindPrimitive(
    public var handleType: UByte = 0u,
    public var flags: UByte = 0u,
    public var stackOffset: UShort = 0u,
    public var reserved: UShort = 0u,
)

public data class Ndr64BogusArrayHeaderFormat(
    public var formatCode: UByte = 0u,
    public var alignment: UByte = 0u,
    public var flags: Ndr64ArrayFlags = Ndr64ArrayFlags(),
    public var numberDims: UByte = 0u,
    public var numberElements: UInt = 0u,
    public var element: COpaquePointer? = null,
)

public data class Ndr64BogusStructureHeaderFormat(
    public var formatCode: UByte = 0u,
    public var alignment: UByte = 0u,
    public var flags: Ndr64StructureFlags = Ndr64StructureFlags(),
    public var reserve: UByte = 0u,
    public var memorySize: UInt = 0u,
    public var originalMemberLayout: COpaquePointer? = null,
    public var originalPointerLayout: COpaquePointer? = null,
    public var pointerLayout: COpaquePointer? = null,
)

public data class Ndr64BufferAlignFormat(
    public var formatCode: UByte = 0u,
    public var alignment: UByte = 0u,
    public var reserved: UShort = 0u,
    public var reserved2: UInt = 0u,
)

public data class Ndr64ConformantStringFormat(
    public var header: Ndr64StringHeaderFormat = Ndr64StringHeaderFormat(),
)

public data class Ndr64ConfArrayHeaderFormat(
    public var formatCode: UByte = 0u,
    public var alignment: UByte = 0u,
    public var flags: Ndr64ArrayFlags = Ndr64ArrayFlags(),
    public var reserved: UByte = 0u,
    public var elementSize: UInt = 0u,
    public var confDescriptor: COpaquePointer? = null,
)

public data class Ndr64ConfBogusStructureHeaderFormat(
    public var formatCode: UByte = 0u,
    public var alignment: UByte = 0u,
    public var flags: Ndr64StructureFlags = Ndr64StructureFlags(),
    public var dimensions: UByte = 0u,
    public var memorySize: UInt = 0u,
    public var originalMemberLayout: COpaquePointer? = null,
    public var originalPointerLayout: COpaquePointer? = null,
    public var pointerLayout: COpaquePointer? = null,
    public var confArrayDescription: COpaquePointer? = null,
)

public data class Ndr64ConfStructureHeaderFormat(
    public var formatCode: UByte = 0u,
    public var alignment: UByte = 0u,
    public var flags: Ndr64StructureFlags = Ndr64StructureFlags(),
    public var reserve: UByte = 0u,
    public var memorySize: UInt = 0u,
    public var arrayDescription: COpaquePointer? = null,
)

public data class Ndr64ConfVarArrayHeaderFormat(
    public var formatCode: UByte = 0u,
    public var alignment: UByte = 0u,
    public var flags: Ndr64ArrayFlags = Ndr64ArrayFlags(),
    public var reserved: UByte = 0u,
    public var elementSize: UInt = 0u,
    public var confDescriptor: COpaquePointer? = null,
    public var varDescriptor: COpaquePointer? = null,
)

public data class Ndr64ConfVarBogusArrayHeaderFormat(
    public var fixedArrayFormat: Ndr64BogusArrayHeaderFormat = Ndr64BogusArrayHeaderFormat(),
    public var confDescription: COpaquePointer? = null,
    public var varDescription: COpaquePointer? = null,
    public var offsetDescription: COpaquePointer? = null,
)

public data class Ndr64ConstantIidFormat(
    public var formatCode: UByte = 0u,
    public var flags: UByte = 0u,
    public var reserved: UShort = 0u,
    public var guid: Guid = Guid(),
)

public data class Ndr64ContextHandleFlags(
    public var bitfield: UByte = 0u,
)

public data class Ndr64ContextHandleFormat(
    public var formatCode: UByte = 0u,
    public var contextFlags: UByte = 0u,
    public var rundownRoutineIndex: UByte = 0u,
    public var ordinal: UByte = 0u,
)

public data class Ndr64EmbeddedComplexFormat(
    public var formatCode: UByte = 0u,
    public var reserve1: UByte = 0u,
    public var reserve2: UShort = 0u,
    public var type: COpaquePointer? = null,
)

public data class Ndr64EncapsulatedUnion(
    public var formatCode: UByte = 0u,
    public var alignment: UByte = 0u,
    public var flags: UByte = 0u,
    public var switchType: UByte = 0u,
    public var memoryOffset: UInt = 0u,
    public var memorySize: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class Ndr64ExprConst32(
    public var exprType: UByte = 0u,
    public var reserved: UByte = 0u,
    public var reserved1: UShort = 0u,
    public var constValue: UInt = 0u,
)

public data class Ndr64ExprConst64(
    public var exprType: UByte = 0u,
    public var reserved: UByte = 0u,
    public var reserved1: UShort = 0u,
    public var constValue: Long = 0L,
)

public data class Ndr64ExprNoop(
    public var exprType: UByte = 0u,
    public var size: UByte = 0u,
    public var reserved: UShort = 0u,
)

public data class Ndr64ExprOperator(
    public var exprType: UByte = 0u,
    public var operator: UByte = 0u,
    public var castType: UByte = 0u,
    public var reserved: UByte = 0u,
)

public data class Ndr64ExprVar(
    public var exprType: UByte = 0u,
    public var varType: UByte = 0u,
    public var reserved: UShort = 0u,
    public var offset: UInt = 0u,
)

public data class Ndr64FixedRepeatFormat(
    public var repeatFormat: Ndr64RepeatFormat = Ndr64RepeatFormat(),
    public var iterations: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class Ndr64FixArrayHeaderFormat(
    public var formatCode: UByte = 0u,
    public var alignment: UByte = 0u,
    public var flags: Ndr64ArrayFlags = Ndr64ArrayFlags(),
    public var reserved: UByte = 0u,
    public var totalSize: UInt = 0u,
)

public data class Ndr64IidFlags(
    public var bitfield: UByte = 0u,
)

public data class Ndr64IidFormat(
    public var formatCode: UByte = 0u,
    public var flags: UByte = 0u,
    public var reserved: UShort = 0u,
    public var iIDDescriptor: COpaquePointer? = null,
)

public data class Ndr64MempadFormat(
    public var formatCode: UByte = 0u,
    public var reserve1: UByte = 0u,
    public var memPad: UShort = 0u,
    public var reserved2: UInt = 0u,
)

public data class Ndr64NonConformantStringFormat(
    public var header: Ndr64StringHeaderFormat = Ndr64StringHeaderFormat(),
    public var totalSize: UInt = 0u,
)

public data class Ndr64NonEncapsulatedUnion(
    public var formatCode: UByte = 0u,
    public var alignment: UByte = 0u,
    public var flags: UByte = 0u,
    public var switchType: UByte = 0u,
    public var memorySize: UInt = 0u,
    public var switch: COpaquePointer? = null,
    public var reserved: UInt = 0u,
)

public data class Ndr64NoRepeatFormat(
    public var formatCode: UByte = 0u,
    public var flags: UByte = 0u,
    public var reserved1: UShort = 0u,
    public var reserved2: UInt = 0u,
)

public data class Ndr64ParamFlags(
    public var bitfield: UShort = 0u,
)

public data class Ndr64ParamFormat(
    public var type: COpaquePointer? = null,
    public var attributes: Ndr64ParamFlags = Ndr64ParamFlags(),
    public var reserved: UShort = 0u,
    public var stackOffset: UInt = 0u,
)

public data class Ndr64PipeFlags(
    public var bitfield: UByte = 0u,
)

public data class Ndr64PipeFormat(
    public var formatCode: UByte = 0u,
    public var flags: UByte = 0u,
    public var alignment: UByte = 0u,
    public var reserved: UByte = 0u,
    public var type: COpaquePointer? = null,
    public var memorySize: UInt = 0u,
    public var bufferSize: UInt = 0u,
)

public data class Ndr64PointerFormat(
    public var formatCode: UByte = 0u,
    public var flags: UByte = 0u,
    public var reserved: UShort = 0u,
    public var pointee: COpaquePointer? = null,
)

public data class Ndr64PointerInstanceHeaderFormat(
    public var offset: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class Ndr64PointerRepeatFlags(
    public var bitfield: UByte = 0u,
)

public data class Ndr64ProcFlags(
    public var bitfield: UInt = 0u,
)

public data class Ndr64ProcFormat(
    public var flags: UInt = 0u,
    public var stackSize: UInt = 0u,
    public var constantClientBufferSize: UInt = 0u,
    public var constantServerBufferSize: UInt = 0u,
    public var rpcFlags: UShort = 0u,
    public var floatDoubleMask: UShort = 0u,
    public var numberOfParams: UShort = 0u,
    public var extensionSize: UShort = 0u,
)

public data class Ndr64RangedStringFormat(
    public var header: Ndr64StringHeaderFormat = Ndr64StringHeaderFormat(),
    public var reserved: UInt = 0u,
    public var min: ULong = 0uL,
    public var max: ULong = 0uL,
)

public data class Ndr64RangeFormat(
    public var formatCode: UByte = 0u,
    public var rangeType: UByte = 0u,
    public var reserved: UShort = 0u,
    public var minValue: Long = 0L,
    public var maxValue: Long = 0L,
)

public data class Ndr64RangePipeFormat(
    public var formatCode: UByte = 0u,
    public var flags: UByte = 0u,
    public var alignment: UByte = 0u,
    public var reserved: UByte = 0u,
    public var type: COpaquePointer? = null,
    public var memorySize: UInt = 0u,
    public var bufferSize: UInt = 0u,
    public var minValue: UInt = 0u,
    public var maxValue: UInt = 0u,
)

public data class Ndr64RepeatFormat(
    public var formatCode: UByte = 0u,
    public var flags: Ndr64PointerRepeatFlags = Ndr64PointerRepeatFlags(),
    public var reserved: UShort = 0u,
    public var increment: UInt = 0u,
    public var offsetToArray: UInt = 0u,
    public var numberOfPointers: UInt = 0u,
)

public data class Ndr64RpcFlags(
    public var bitfield: UShort = 0u,
)

public data class Ndr64SimpleMemberFormat(
    public var formatCode: UByte = 0u,
    public var reserved1: UByte = 0u,
    public var reserved2: UShort = 0u,
    public var reserved3: UInt = 0u,
)

public data class Ndr64SimpleRegionFormat(
    public var formatCode: UByte = 0u,
    public var alignment: UByte = 0u,
    public var regionSize: UShort = 0u,
    public var reserved: UInt = 0u,
)

public data class Ndr64SizedConformantStringFormat(
    public var header: Ndr64StringHeaderFormat = Ndr64StringHeaderFormat(),
    public var sizeDescription: COpaquePointer? = null,
)

public data class Ndr64StringFlags(
    public var bitfield: UByte = 0u,
)

public data class Ndr64StringHeaderFormat(
    public var formatCode: UByte = 0u,
    public var flags: Ndr64StringFlags = Ndr64StringFlags(),
    public var elementSize: UShort = 0u,
)

public data class Ndr64StructureFlags(
    public var bitfield: UByte = 0u,
)

public data class Ndr64StructureHeaderFormat(
    public var formatCode: UByte = 0u,
    public var alignment: UByte = 0u,
    public var flags: Ndr64StructureFlags = Ndr64StructureFlags(),
    public var reserve: UByte = 0u,
    public var memorySize: UInt = 0u,
)

public data class Ndr64SystemHandleFormat(
    public var formatCode: UByte = 0u,
    public var handleType: UByte = 0u,
    public var desiredAccess: UInt = 0u,
)

public data class Ndr64TransmitAsFlags(
    public var bitfield: UByte = 0u,
)

public data class Ndr64TransmitAsFormat(
    public var formatCode: UByte = 0u,
    public var flags: UByte = 0u,
    public var routineIndex: UShort = 0u,
    public var transmittedTypeWireAlignment: UShort = 0u,
    public var memoryAlignment: UShort = 0u,
    public var presentedTypeMemorySize: UInt = 0u,
    public var transmittedTypeBufferSize: UInt = 0u,
    public var transmittedType: COpaquePointer? = null,
)

public data class Ndr64TypeStrictContextHandle(
    public var formatCode: UByte = 0u,
    public var realFormatCode: UByte = 0u,
    public var reserved: UShort = 0u,
    public var type: COpaquePointer? = null,
    public var ctxtFlags: UInt = 0u,
    public var ctxtID: UInt = 0u,
)

public data class Ndr64UnionArm(
    public var caseValue: Long = 0L,
    public var type: COpaquePointer? = null,
    public var reserved: UInt = 0u,
)

public data class Ndr64UnionArmSelector(
    public var reserved1: UByte = 0u,
    public var alignment: UByte = 0u,
    public var reserved2: UShort = 0u,
    public var arms: UInt = 0u,
)

public data class Ndr64UserMarshalFlags(
    public var bitfield: UByte = 0u,
)

public data class Ndr64UserMarshalFormat(
    public var formatCode: UByte = 0u,
    public var flags: UByte = 0u,
    public var routineIndex: UShort = 0u,
    public var transmittedTypeWireAlignment: UShort = 0u,
    public var memoryAlignment: UShort = 0u,
    public var userTypeMemorySize: UInt = 0u,
    public var transmittedTypeBufferSize: UInt = 0u,
    public var transmittedType: COpaquePointer? = null,
)

public data class Ndr64VarArrayHeaderFormat(
    public var formatCode: UByte = 0u,
    public var alignment: UByte = 0u,
    public var flags: Ndr64ArrayFlags = Ndr64ArrayFlags(),
    public var reserved: UByte = 0u,
    public var totalSize: UInt = 0u,
    public var elementSize: UInt = 0u,
    public var varDescriptor: COpaquePointer? = null,
)

public data class NdrCsRoutines(
    public var pSizeConvertRoutines: NdrCsSizeConvertRoutines? = null,
    public var pTagGettingRoutines: CsTagGettingRoutineFn? = null,
)

public data class NdrCsSizeConvertRoutines(
    public var pfnNetSize: CsTypeNetSizeRoutine = null,
    public var pfnToNetCs: CsTypeToNetcsRoutine = null,
    public var pfnLocalSize: CsTypeLocalSizeRoutine = null,
    public var pfnFromNetCs: CsTypeFromNetcsRoutine = null,
)

public data class NdrExprDesc(
    public var pOffset: UShort? = null,
    public var pFormatExpr: COpaquePointer? = null,
)

public data class NdrScontext(
    public var pad: List<COpaquePointer> = List(2) { COpaquePointer(0L) },
    public var userContext: COpaquePointer? = null,
)

public data class NdrUserMarshalInfo(
    public var informationLevel: UInt = 0u,
    public var anonymous: NdrUserMarshalInfo0 = NdrUserMarshalInfo0(),
)

public data class NdrUserMarshalInfo0(
    public var level1: NdrUserMarshalInfoLevel1 = NdrUserMarshalInfoLevel1(),
)

public data class NdrUserMarshalInfoLevel1(
    public var buffer: COpaquePointer? = null,
    public var bufferSize: UInt = 0u,
    public var pfnAllocate: Int = 0,
    public var pfnFree: Int = 0,
    public var pRpcChannelBuffer: COpaquePointer? = null,
    public var reserved: IntArray = IntArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdrUserMarshalInfoLevel1) return false
        if (this.buffer != other.buffer) return false
        if (this.bufferSize != other.bufferSize) return false
        if (this.pfnAllocate != other.pfnAllocate) return false
        if (this.pfnFree != other.pfnFree) return false
        if (this.pRpcChannelBuffer != other.pRpcChannelBuffer) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.buffer.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.pfnAllocate.hashCode()
        result = 31 * result + this.pfnFree.hashCode()
        result = 31 * result + this.pRpcChannelBuffer.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class RdrCalloutState(
    public var lastError: RpcStatus = 0,
    public var lastEEInfo: COpaquePointer? = null,
    public var lastCalledStage: RpcHttpRedirectorStage = 0,
    public var serverName: UShort? = null,
    public var serverPort: UShort? = null,
    public var remoteUser: UShort? = null,
    public var authType: UShort? = null,
    public var resourceTypePresent: UByte = 0u,
    public var sessionIdPresent: UByte = 0u,
    public var interfacePresent: UByte = 0u,
    public var resourceType: Guid = Guid(),
    public var sessionId: Guid = Guid(),
    public var iface: RpcSyntaxIdentifier = RpcSyntaxIdentifier(),
    public var certContext: COpaquePointer? = null,
)

public data class RpcAsyncNotificationInfo(
    public var apc: RpcAsyncNotificationInfo0 = RpcAsyncNotificationInfo0(),
    public var ioc: RpcAsyncNotificationInfo1 = RpcAsyncNotificationInfo1(),
    public var intPtr: RpcAsyncNotificationInfo2 = RpcAsyncNotificationInfo2(),
    public var hEvent: Handle = null,
    public var notificationRoutine: PfnRpcnotificationRoutine = null,
)

public data class RpcAsyncNotificationInfo0(
    public var notificationRoutine: PfnRpcnotificationRoutine = null,
    public var hThread: Handle = null,
)

public data class RpcAsyncNotificationInfo1(
    public var hIOPort: Handle = null,
    public var dwNumberOfBytesTransferred: UInt = 0u,
    public var dwCompletionKey: Int = 0,
    public var lpOverlapped: Overlapped? = null,
)

public data class RpcAsyncNotificationInfo2(
    public var hWnd: Hwnd = null,
    public var msg: UInt = 0u,
)

public data class RpcAsyncState(
    public var size: UInt = 0u,
    public var signature: UInt = 0u,
    public var lock: Int = 0,
    public var flags: UInt = 0u,
    public var stubInfo: COpaquePointer? = null,
    public var userInfo: COpaquePointer? = null,
    public var runtimeInfo: COpaquePointer? = null,
    public var event: RpcAsyncEvent = 0,
    public var notificationType: RpcNotificationTypes = 0,
    public var u: RpcAsyncNotificationInfo = RpcAsyncNotificationInfo(),
    public var reserved: IntArray = IntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcAsyncState) return false
        if (this.size != other.size) return false
        if (this.signature != other.signature) return false
        if (this.lock != other.lock) return false
        if (this.flags != other.flags) return false
        if (this.stubInfo != other.stubInfo) return false
        if (this.userInfo != other.userInfo) return false
        if (this.runtimeInfo != other.runtimeInfo) return false
        if (this.event != other.event) return false
        if (this.notificationType != other.notificationType) return false
        if (this.u != other.u) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.signature.hashCode()
        result = 31 * result + this.lock.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.stubInfo.hashCode()
        result = 31 * result + this.userInfo.hashCode()
        result = 31 * result + this.runtimeInfo.hashCode()
        result = 31 * result + this.event.hashCode()
        result = 31 * result + this.notificationType.hashCode()
        result = 31 * result + this.u.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class RpcBindingHandleOptionsV1(
    public var version: UInt = 0u,
    public var flags: RpcBindingHandleOptionsFlags = 0u,
    public var comTimeout: UInt = 0u,
    public var callTimeout: UInt = 0u,
)

public data class RpcBindingHandleSecurityV1A(
    public var version: UInt = 0u,
    public var serverPrincName: COpaquePointer? = null,
    public var authnLevel: UInt = 0u,
    public var authnSvc: UInt = 0u,
    public var authIdentity: SecWinntAuthIdentityA? = null,
    public var securityQos: RpcSecurityQos? = null,
)

public data class RpcBindingHandleSecurityV1W(
    public var version: UInt = 0u,
    public var serverPrincName: UShort? = null,
    public var authnLevel: UInt = 0u,
    public var authnSvc: UInt = 0u,
    public var authIdentity: SecWinntAuthIdentityW? = null,
    public var securityQos: RpcSecurityQos? = null,
)

public data class RpcBindingHandleTemplateV1A(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var protocolSequence: UInt = 0u,
    public var networkAddress: COpaquePointer? = null,
    public var stringEndpoint: COpaquePointer? = null,
    public var u1: RpcBindingHandleTemplateV1A0 = RpcBindingHandleTemplateV1A0(),
    public var objectUuid: Guid = Guid(),
)

public data class RpcBindingHandleTemplateV1A0(
    public var reserved: COpaquePointer? = null,
)

public data class RpcBindingHandleTemplateV1W(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var protocolSequence: UInt = 0u,
    public var networkAddress: UShort? = null,
    public var stringEndpoint: UShort? = null,
    public var u1: RpcBindingHandleTemplateV1W0 = RpcBindingHandleTemplateV1W0(),
    public var objectUuid: Guid = Guid(),
)

public data class RpcBindingHandleTemplateV1W0(
    public var reserved: UShort? = null,
)

public data class RpcBindingVector(
    public var count: UInt = 0u,
    public var bindingH: List<COpaquePointer> = List(1) { COpaquePointer(0L) },
)

public data class RpcCallAttributesV1A(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var serverPrincipalNameBufferLength: UInt = 0u,
    public var serverPrincipalName: COpaquePointer? = null,
    public var clientPrincipalNameBufferLength: UInt = 0u,
    public var clientPrincipalName: COpaquePointer? = null,
    public var authenticationLevel: UInt = 0u,
    public var authenticationService: UInt = 0u,
    public var nullSession: Bool = 0,
)

public data class RpcCallAttributesV1W(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var serverPrincipalNameBufferLength: UInt = 0u,
    public var serverPrincipalName: UShort? = null,
    public var clientPrincipalNameBufferLength: UInt = 0u,
    public var clientPrincipalName: UShort? = null,
    public var authenticationLevel: UInt = 0u,
    public var authenticationService: UInt = 0u,
    public var nullSession: Bool = 0,
)

public class RpcCallAttributesV2A(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var serverPrincipalNameBufferLength: UInt = 0u,
    public var serverPrincipalName: COpaquePointer? = null,
    public var clientPrincipalNameBufferLength: UInt = 0u,
    public var clientPrincipalName: COpaquePointer? = null,
    public var authenticationLevel: UInt = 0u,
    public var authenticationService: UInt = 0u,
    public var nullSession: Bool = 0,
    public var kernelModeCaller: Bool = 0,
    public var protocolSequence: UInt = 0u,
    public var isClientLocal: UInt = 0u,
    public var clientPID: Handle = null,
    public var callStatus: UInt = 0u,
    public var callType: RpcCallType = 0,
    public var callLocalAddress: RpcCallLocalAddressV1? = null,
    public var opNum: UShort = 0u,
    public var interfaceUuid: Guid = Guid(),
)

public class RpcCallAttributesV2W(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var serverPrincipalNameBufferLength: UInt = 0u,
    public var serverPrincipalName: UShort? = null,
    public var clientPrincipalNameBufferLength: UInt = 0u,
    public var clientPrincipalName: UShort? = null,
    public var authenticationLevel: UInt = 0u,
    public var authenticationService: UInt = 0u,
    public var nullSession: Bool = 0,
    public var kernelModeCaller: Bool = 0,
    public var protocolSequence: UInt = 0u,
    public var isClientLocal: RpcCallClientLocality = 0,
    public var clientPID: Handle = null,
    public var callStatus: UInt = 0u,
    public var callType: RpcCallType = 0,
    public var callLocalAddress: RpcCallLocalAddressV1? = null,
    public var opNum: UShort = 0u,
    public var interfaceUuid: Guid = Guid(),
)

public class RpcCallAttributesV3A(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var serverPrincipalNameBufferLength: UInt = 0u,
    public var serverPrincipalName: COpaquePointer? = null,
    public var clientPrincipalNameBufferLength: UInt = 0u,
    public var clientPrincipalName: COpaquePointer? = null,
    public var authenticationLevel: UInt = 0u,
    public var authenticationService: UInt = 0u,
    public var nullSession: Bool = 0,
    public var kernelModeCaller: Bool = 0,
    public var protocolSequence: UInt = 0u,
    public var isClientLocal: UInt = 0u,
    public var clientPID: Handle = null,
    public var callStatus: UInt = 0u,
    public var callType: RpcCallType = 0,
    public var callLocalAddress: RpcCallLocalAddressV1? = null,
    public var opNum: UShort = 0u,
    public var interfaceUuid: Guid = Guid(),
    public var clientIdentifierBufferLength: UInt = 0u,
    public var clientIdentifier: COpaquePointer? = null,
)

public class RpcCallAttributesV3W(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var serverPrincipalNameBufferLength: UInt = 0u,
    public var serverPrincipalName: UShort? = null,
    public var clientPrincipalNameBufferLength: UInt = 0u,
    public var clientPrincipalName: UShort? = null,
    public var authenticationLevel: UInt = 0u,
    public var authenticationService: UInt = 0u,
    public var nullSession: Bool = 0,
    public var kernelModeCaller: Bool = 0,
    public var protocolSequence: UInt = 0u,
    public var isClientLocal: RpcCallClientLocality = 0,
    public var clientPID: Handle = null,
    public var callStatus: UInt = 0u,
    public var callType: RpcCallType = 0,
    public var callLocalAddress: RpcCallLocalAddressV1? = null,
    public var opNum: UShort = 0u,
    public var interfaceUuid: Guid = Guid(),
    public var clientIdentifierBufferLength: UInt = 0u,
    public var clientIdentifier: COpaquePointer? = null,
)

public data class RpcCallLocalAddressV1(
    public var version: UInt = 0u,
    public var buffer: COpaquePointer? = null,
    public var bufferSize: UInt = 0u,
    public var addressFormat: RpcLocalAddressFormat = 0,
)

public data class RpcClientInformation1(
    public var userName: COpaquePointer? = null,
    public var computerName: COpaquePointer? = null,
    public var privilege: UShort = 0u,
    public var authFlags: UInt = 0u,
)

public data class RpcClientInterface(
    public var length: UInt = 0u,
    public var interfaceId: RpcSyntaxIdentifier = RpcSyntaxIdentifier(),
    public var transferSyntax: RpcSyntaxIdentifier = RpcSyntaxIdentifier(),
    public var dispatchTable: RpcDispatchTable? = null,
    public var rpcProtseqEndpointCount: UInt = 0u,
    public var rpcProtseqEndpoint: RpcProtseqEndpoint? = null,
    public var reserved: Int = 0,
    public var interpreterInfo: COpaquePointer? = null,
    public var flags: UInt = 0u,
)

public data class RpcCOptCookieAuthDescriptor(
    public var bufferSize: UInt = 0u,
    public var buffer: Pstr = null,
)

public data class RpcDispatchTable(
    public var dispatchTableCount: UInt = 0u,
    public var dispatchTable: RpcDispatchFunction = null,
    public var reserved: Int = 0,
)

public data class RpcEeInfoParam(
    public var parameterType: ExtendedErrorParamTypes = 0,
    public var u: RpcEeInfoParam0 = RpcEeInfoParam0(),
)

public data class RpcEeInfoParam0(
    public var ansiString: Pstr = null,
    public var unicodeString: Pwstr = null,
    public var lVal: Int = 0,
    public var sVal: Short = 0,
    public var pVal: ULong = 0uL,
    public var bVal: BinaryParam = BinaryParam(),
)

public data class RpcEndpointTemplatea(
    public var version: UInt = 0u,
    public var protSeq: Pstr = null,
    public var endpoint: Pstr = null,
    public var securityDescriptor: COpaquePointer? = null,
    public var backlog: UInt = 0u,
)

public data class RpcEndpointTemplatew(
    public var version: UInt = 0u,
    public var protSeq: Pwstr = null,
    public var endpoint: Pwstr = null,
    public var securityDescriptor: COpaquePointer? = null,
    public var backlog: UInt = 0u,
)

public data class RpcErrorEnumHandle(
    public var signature: UInt = 0u,
    public var currentPos: COpaquePointer? = null,
    public var head: COpaquePointer? = null,
)

public data class RpcExtendedErrorInfo(
    public var version: UInt = 0u,
    public var computerName: Pwstr = null,
    public var processID: UInt = 0u,
    public var u: RpcExtendedErrorInfo0 = RpcExtendedErrorInfo0(),
    public var generatingComponent: UInt = 0u,
    public var status: UInt = 0u,
    public var detectionLocation: UShort = 0u,
    public var flags: UShort = 0u,
    public var numberOfParameters: Int = 0,
    public var parameters: List<RpcEeInfoParam> = List(4) { RpcEeInfoParam() },
)

public data class RpcExtendedErrorInfo0(
    public var systemTime: Systemtime = Systemtime(),
    public var fileTime: Filetime = Filetime(),
)

public data class RpcHttpTransportCredentialsA(
    public var transportCredentials: SecWinntAuthIdentityA? = null,
    public var flags: RpcCHttpFlags = 0u,
    public var authenticationTarget: RpcCHttpAuthnTarget = 0u,
    public var numberOfAuthnSchemes: UInt = 0u,
    public var authnSchemes: UInt? = null,
    public var serverCertificateSubject: COpaquePointer? = null,
)

public data class RpcHttpTransportCredentialsV2A(
    public var transportCredentials: SecWinntAuthIdentityA? = null,
    public var flags: RpcCHttpFlags = 0u,
    public var authenticationTarget: RpcCHttpAuthnTarget = 0u,
    public var numberOfAuthnSchemes: UInt = 0u,
    public var authnSchemes: UInt? = null,
    public var serverCertificateSubject: COpaquePointer? = null,
    public var proxyCredentials: SecWinntAuthIdentityA? = null,
    public var numberOfProxyAuthnSchemes: UInt = 0u,
    public var proxyAuthnSchemes: UInt? = null,
)

public data class RpcHttpTransportCredentialsV2W(
    public var transportCredentials: SecWinntAuthIdentityW? = null,
    public var flags: RpcCHttpFlags = 0u,
    public var authenticationTarget: RpcCHttpAuthnTarget = 0u,
    public var numberOfAuthnSchemes: UInt = 0u,
    public var authnSchemes: UInt? = null,
    public var serverCertificateSubject: UShort? = null,
    public var proxyCredentials: SecWinntAuthIdentityW? = null,
    public var numberOfProxyAuthnSchemes: UInt = 0u,
    public var proxyAuthnSchemes: UInt? = null,
)

public data class RpcHttpTransportCredentialsV3A(
    public var transportCredentials: COpaquePointer? = null,
    public var flags: RpcCHttpFlags = 0u,
    public var authenticationTarget: RpcCHttpAuthnTarget = 0u,
    public var numberOfAuthnSchemes: UInt = 0u,
    public var authnSchemes: UInt? = null,
    public var serverCertificateSubject: COpaquePointer? = null,
    public var proxyCredentials: COpaquePointer? = null,
    public var numberOfProxyAuthnSchemes: UInt = 0u,
    public var proxyAuthnSchemes: UInt? = null,
)

public data class RpcHttpTransportCredentialsV3W(
    public var transportCredentials: COpaquePointer? = null,
    public var flags: RpcCHttpFlags = 0u,
    public var authenticationTarget: RpcCHttpAuthnTarget = 0u,
    public var numberOfAuthnSchemes: UInt = 0u,
    public var authnSchemes: UInt? = null,
    public var serverCertificateSubject: UShort? = null,
    public var proxyCredentials: COpaquePointer? = null,
    public var numberOfProxyAuthnSchemes: UInt = 0u,
    public var proxyAuthnSchemes: UInt? = null,
)

public data class RpcHttpTransportCredentialsW(
    public var transportCredentials: SecWinntAuthIdentityW? = null,
    public var flags: RpcCHttpFlags = 0u,
    public var authenticationTarget: RpcCHttpAuthnTarget = 0u,
    public var numberOfAuthnSchemes: UInt = 0u,
    public var authnSchemes: UInt? = null,
    public var serverCertificateSubject: UShort? = null,
)

public data class RpcIfId(
    public var uuid: Guid = Guid(),
    public var versMajor: UShort = 0u,
    public var versMinor: UShort = 0u,
)

public data class RpcIfIdVector(
    public var count: UInt = 0u,
    public var ifId: List<RpcIfId> = List(1) { RpcIfId() },
)

public data class RpcImportContextP(
    public var lookupContext: COpaquePointer? = null,
    public var proposedHandle: COpaquePointer? = null,
    public var bindings: RpcBindingVector? = null,
)

public data class RpcInterfaceTemplatea(
    public var version: UInt = 0u,
    public var ifSpec: COpaquePointer? = null,
    public var mgrTypeUuid: Guid? = null,
    public var mgrEpv: COpaquePointer? = null,
    public var flags: UInt = 0u,
    public var maxCalls: UInt = 0u,
    public var maxRpcSize: UInt = 0u,
    public var ifCallback: RpcIfCallbackFn = null,
    public var uuidVector: UuidVector? = null,
    public var annotation: Pstr = null,
    public var securityDescriptor: COpaquePointer? = null,
)

public data class RpcInterfaceTemplatew(
    public var version: UInt = 0u,
    public var ifSpec: COpaquePointer? = null,
    public var mgrTypeUuid: Guid? = null,
    public var mgrEpv: COpaquePointer? = null,
    public var flags: UInt = 0u,
    public var maxCalls: UInt = 0u,
    public var maxRpcSize: UInt = 0u,
    public var ifCallback: RpcIfCallbackFn = null,
    public var uuidVector: UuidVector? = null,
    public var annotation: Pwstr = null,
    public var securityDescriptor: COpaquePointer? = null,
)

public data class RpcMessage(
    public var handle: COpaquePointer? = null,
    public var dataRepresentation: UInt = 0u,
    public var buffer: COpaquePointer? = null,
    public var bufferLength: UInt = 0u,
    public var procNum: UInt = 0u,
    public var transferSyntax: RpcSyntaxIdentifier? = null,
    public var rpcInterfaceInformation: COpaquePointer? = null,
    public var reservedForRuntime: COpaquePointer? = null,
    public var managerEpv: COpaquePointer? = null,
    public var importContext: COpaquePointer? = null,
    public var rpcFlags: UInt = 0u,
)

public data class RpcPolicy(
    public var length: UInt = 0u,
    public var endpointFlags: UInt = 0u,
    public var nICFlags: UInt = 0u,
)

public data class RpcProtseqEndpoint(
    public var rpcProtocolSequence: COpaquePointer? = null,
    public var endpoint: COpaquePointer? = null,
)

public data class RpcProtseqVectora(
    public var count: UInt = 0u,
    public var protseq: List<COpaquePointer> = List(1) { COpaquePointer(0L) },
)

public data class RpcProtseqVectorw(
    public var count: UInt = 0u,
    public var protseq: List<UShort> = List(1) { 0u },
)

public data class RpcSecurityQos(
    public var version: UInt = 0u,
    public var capabilities: RpcCQosCapabilities = 0u,
    public var identityTracking: RpcCQosIdentity = 0u,
    public var impersonationType: RpcCImpLevel = 0u,
)

public data class RpcSecurityQosV2A(
    public var version: UInt = 0u,
    public var capabilities: RpcCQosCapabilities = 0u,
    public var identityTracking: RpcCQosIdentity = 0u,
    public var impersonationType: RpcCImpLevel = 0u,
    public var additionalSecurityInfoType: RpcCAuthnInfoType = 0u,
    public var u: RpcSecurityQosV2A0 = RpcSecurityQosV2A0(),
)

public data class RpcSecurityQosV2A0(
    public var httpCredentials: RpcHttpTransportCredentialsA? = null,
)

public data class RpcSecurityQosV2W(
    public var version: UInt = 0u,
    public var capabilities: RpcCQosCapabilities = 0u,
    public var identityTracking: RpcCQosIdentity = 0u,
    public var impersonationType: RpcCImpLevel = 0u,
    public var additionalSecurityInfoType: RpcCAuthnInfoType = 0u,
    public var u: RpcSecurityQosV2W0 = RpcSecurityQosV2W0(),
)

public data class RpcSecurityQosV2W0(
    public var httpCredentials: RpcHttpTransportCredentialsW? = null,
)

public data class RpcSecurityQosV3A(
    public var version: UInt = 0u,
    public var capabilities: RpcCQosCapabilities = 0u,
    public var identityTracking: RpcCQosIdentity = 0u,
    public var impersonationType: RpcCImpLevel = 0u,
    public var additionalSecurityInfoType: RpcCAuthnInfoType = 0u,
    public var u: RpcSecurityQosV3A0 = RpcSecurityQosV3A0(),
    public var sid: COpaquePointer? = null,
)

public data class RpcSecurityQosV3A0(
    public var httpCredentials: RpcHttpTransportCredentialsA? = null,
)

public data class RpcSecurityQosV3W(
    public var version: UInt = 0u,
    public var capabilities: RpcCQosCapabilities = 0u,
    public var identityTracking: RpcCQosIdentity = 0u,
    public var impersonationType: RpcCImpLevel = 0u,
    public var additionalSecurityInfoType: RpcCAuthnInfoType = 0u,
    public var u: RpcSecurityQosV3W0 = RpcSecurityQosV3W0(),
    public var sid: COpaquePointer? = null,
)

public data class RpcSecurityQosV3W0(
    public var httpCredentials: RpcHttpTransportCredentialsW? = null,
)

public data class RpcSecurityQosV4A(
    public var version: UInt = 0u,
    public var capabilities: RpcCQosCapabilities = 0u,
    public var identityTracking: RpcCQosIdentity = 0u,
    public var impersonationType: RpcCImpLevel = 0u,
    public var additionalSecurityInfoType: RpcCAuthnInfoType = 0u,
    public var u: RpcSecurityQosV4A0 = RpcSecurityQosV4A0(),
    public var sid: COpaquePointer? = null,
    public var effectiveOnly: UInt = 0u,
)

public data class RpcSecurityQosV4A0(
    public var httpCredentials: RpcHttpTransportCredentialsA? = null,
)

public data class RpcSecurityQosV4W(
    public var version: UInt = 0u,
    public var capabilities: RpcCQosCapabilities = 0u,
    public var identityTracking: RpcCQosIdentity = 0u,
    public var impersonationType: RpcCImpLevel = 0u,
    public var additionalSecurityInfoType: RpcCAuthnInfoType = 0u,
    public var u: RpcSecurityQosV4W0 = RpcSecurityQosV4W0(),
    public var sid: COpaquePointer? = null,
    public var effectiveOnly: UInt = 0u,
)

public data class RpcSecurityQosV4W0(
    public var httpCredentials: RpcHttpTransportCredentialsW? = null,
)

public data class RpcSecurityQosV5A(
    public var version: UInt = 0u,
    public var capabilities: RpcCQosCapabilities = 0u,
    public var identityTracking: RpcCQosIdentity = 0u,
    public var impersonationType: RpcCImpLevel = 0u,
    public var additionalSecurityInfoType: RpcCAuthnInfoType = 0u,
    public var u: RpcSecurityQosV5A0 = RpcSecurityQosV5A0(),
    public var sid: COpaquePointer? = null,
    public var effectiveOnly: UInt = 0u,
    public var serverSecurityDescriptor: COpaquePointer? = null,
)

public data class RpcSecurityQosV5A0(
    public var httpCredentials: RpcHttpTransportCredentialsA? = null,
)

public data class RpcSecurityQosV5W(
    public var version: UInt = 0u,
    public var capabilities: RpcCQosCapabilities = 0u,
    public var identityTracking: RpcCQosIdentity = 0u,
    public var impersonationType: RpcCImpLevel = 0u,
    public var additionalSecurityInfoType: RpcCAuthnInfoType = 0u,
    public var u: RpcSecurityQosV5W0 = RpcSecurityQosV5W0(),
    public var sid: COpaquePointer? = null,
    public var effectiveOnly: UInt = 0u,
    public var serverSecurityDescriptor: COpaquePointer? = null,
)

public data class RpcSecurityQosV5W0(
    public var httpCredentials: RpcHttpTransportCredentialsW? = null,
)

public data class RpcSecContextKeyInfo(
    public var encryptAlgorithm: UInt = 0u,
    public var keySize: UInt = 0u,
    public var signatureAlgorithm: UInt = 0u,
)

public data class RpcServerInterface(
    public var length: UInt = 0u,
    public var interfaceId: RpcSyntaxIdentifier = RpcSyntaxIdentifier(),
    public var transferSyntax: RpcSyntaxIdentifier = RpcSyntaxIdentifier(),
    public var dispatchTable: RpcDispatchTable? = null,
    public var rpcProtseqEndpointCount: UInt = 0u,
    public var rpcProtseqEndpoint: RpcProtseqEndpoint? = null,
    public var defaultManagerEpv: COpaquePointer? = null,
    public var interpreterInfo: COpaquePointer? = null,
    public var flags: UInt = 0u,
)

public data class RpcStatsVector(
    public var count: UInt = 0u,
    public var stats: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcStatsVector) return false
        if (this.count != other.count) return false
        if (!this.stats.contentEquals(other.stats)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.stats.contentHashCode()
        return result
    }
}

public data class RpcSyntaxIdentifier(
    public var syntaxGUID: Guid = Guid(),
    public var syntaxVersion: RpcVersion = RpcVersion(),
)

public data class RpcTransferSyntax(
    public var uuid: Guid = Guid(),
    public var versMajor: UShort = 0u,
    public var versMinor: UShort = 0u,
)

public data class RpcVersion(
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
)

public data class ScontextQueue(
    public var numberOfObjects: UInt = 0u,
    public var arrayOfObjects: COpaquePointer? = null,
)

public data class SecWinntAuthIdentityA(
    public var user: COpaquePointer? = null,
    public var userLength: UInt = 0u,
    public var domain: COpaquePointer? = null,
    public var domainLength: UInt = 0u,
    public var password: COpaquePointer? = null,
    public var passwordLength: UInt = 0u,
    public var flags: SecWinntAuthIdentity = 0u,
)

public data class SecWinntAuthIdentityW(
    public var user: UShort? = null,
    public var userLength: UInt = 0u,
    public var domain: UShort? = null,
    public var domainLength: UInt = 0u,
    public var password: UShort? = null,
    public var passwordLength: UInt = 0u,
    public var flags: SecWinntAuthIdentity = 0u,
)

public data class UserMarshalCb(
    public var flags: UInt = 0u,
    public var pStubMsg: MidlStubMessage? = null,
    public var pReserve: COpaquePointer? = null,
    public var signature: UInt = 0u,
    public var cBType: UserMarshalCbType = 0,
    public var pFormat: COpaquePointer? = null,
    public var pTypeFormat: COpaquePointer? = null,
)

public data class UserMarshalRoutineQuadruple(
    public var pfnBufferSize: UserMarshalSizingRoutine = null,
    public var pfnMarshall: UserMarshalMarshallingRoutine = null,
    public var pfnUnmarshall: UserMarshalUnmarshallingRoutine = null,
    public var pfnFree: UserMarshalFreeingRoutine = null,
)

public data class UuidVector(
    public var count: UInt = 0u,
    public var uuid: List<Guid> = List(1) { Guid() },
)

public data class XmitRoutineQuintuple(
    public var pfnTranslateToXmit: XmitHelperRoutine = null,
    public var pfnTranslateFromXmit: XmitHelperRoutine = null,
    public var pfnFreeXmit: XmitHelperRoutine = null,
    public var pfnFreeInst: XmitHelperRoutine = null,
)
