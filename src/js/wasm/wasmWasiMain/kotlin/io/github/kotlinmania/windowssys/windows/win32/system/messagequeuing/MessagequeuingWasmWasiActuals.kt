@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun mQADsPathToFormatName(lpwcsadspath: Pcwstr, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQADsPathToFormatName")

public actual fun mQBeginTransaction(pptransaction: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQBeginTransaction")

public actual fun mQCloseCursor(hcursor: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQCloseCursor")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemMessagequeuingMQCloseQueue")
private external fun wasiWindowssysWindowsWin32SystemMessagequeuingMQCloseQueue(hqueue: Long): Int

public actual fun mQCloseQueue(hqueue: Long): Hresult =
    wasiWindowssysWindowsWin32SystemMessagequeuingMQCloseQueue(hqueue)

public actual fun mQCreateCursor(hqueue: Long, phcursor: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQCreateCursor")

public actual fun mQCreateQueue(psecuritydescriptor: PsecurityDescriptor, pqueueprops: MutPtr, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQCreateQueue")

public actual fun mQDeleteQueue(lpwcsformatname: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQDeleteQueue")

public actual fun mQFreeMemory(pvmemory: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQFreeMemory")

public actual fun mQFreeSecurityContext(hsecuritycontext: Handle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQFreeSecurityContext")

public actual fun mQGetMachineProperties(lpwcsmachinename: Pcwstr, pguidmachineid: ConstPtr, pqmprops: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQGetMachineProperties")

public actual fun mQGetOverlappedResult(lpoverlapped: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQGetOverlappedResult")

public actual fun mQGetPrivateComputerInformation(lpwcscomputername: Pcwstr, pprivateprops: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQGetPrivateComputerInformation")

public actual fun mQGetQueueProperties(lpwcsformatname: Pcwstr, pqueueprops: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQGetQueueProperties")

public actual fun mQGetQueueSecurity(lpwcsformatname: Pcwstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQGetQueueSecurity")

public actual fun mQGetSecurityContext(lpcertbuffer: ConstPtr, dwcertbufferlength: UInt, phsecuritycontext: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQGetSecurityContext")

public actual fun mQGetSecurityContextEx(lpcertbuffer: ConstPtr, dwcertbufferlength: UInt, phsecuritycontext: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQGetSecurityContextEx")

public actual fun mQHandleToFormatName(hqueue: Long, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQHandleToFormatName")

public actual fun mQInstanceToFormatName(pguid: ConstPtr, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQInstanceToFormatName")

public actual fun mQLocateBegin(lpwcscontext: Pcwstr, prestriction: ConstPtr, pcolumns: ConstPtr, psort: ConstPtr, phenum: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQLocateBegin")

public actual fun mQLocateEnd(henum: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQLocateEnd")

public actual fun mQLocateNext(henum: Handle, pcprops: MutPtr, apropvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQLocateNext")

public actual fun mQMarkMessageRejected(hqueue: Handle, ulllookupid: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQMarkMessageRejected")

public actual fun mQMgmtAction(pcomputername: Pcwstr, pobjectname: Pcwstr, paction: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQMgmtAction")

public actual fun mQMgmtGetInfo(pcomputername: Pcwstr, pobjectname: Pcwstr, pmgmtprops: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQMgmtGetInfo")

public actual fun mQMoveMessage(hsourcequeue: Long, hdestinationqueue: Long, ulllookupid: ULong, ptransaction: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQMoveMessage")

public actual fun mQOpenQueue(lpwcsformatname: Pcwstr, dwaccess: UInt, dwsharemode: UInt, phqueue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQOpenQueue")

public actual fun mQPathNameToFormatName(lpwcspathname: Pcwstr, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQPathNameToFormatName")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemMessagequeuingMQPurgeQueue")
private external fun wasiWindowssysWindowsWin32SystemMessagequeuingMQPurgeQueue(hqueue: Long): Int

public actual fun mQPurgeQueue(hqueue: Long): Hresult =
    wasiWindowssysWindowsWin32SystemMessagequeuingMQPurgeQueue(hqueue)

public actual fun mQReceiveMessage(hsource: Long, dwtimeout: UInt, dwaction: UInt, pmessageprops: MutPtr, lpoverlapped: MutPtr, fnreceivecallback: Pmqreceivecallback, hcursor: Handle, ptransaction: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQReceiveMessage")

public actual fun mQReceiveMessageByLookupId(hsource: Long, ulllookupid: ULong, dwlookupaction: UInt, pmessageprops: MutPtr, lpoverlapped: MutPtr, fnreceivecallback: Pmqreceivecallback, ptransaction: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQReceiveMessageByLookupId")

public actual fun mQRegisterCertificate(dwflags: UInt, lpcertbuffer: ConstPtr, dwcertbufferlength: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQRegisterCertificate")

public actual fun mQSendMessage(hdestinationqueue: Long, pmessageprops: ConstPtr, ptransaction: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQSendMessage")

public actual fun mQSetQueueProperties(lpwcsformatname: Pcwstr, pqueueprops: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQSetQueueProperties")

public actual fun mQSetQueueSecurity(lpwcsformatname: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMessagequeuingMQSetQueueSecurity")
