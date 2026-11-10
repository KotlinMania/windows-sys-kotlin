@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun mQADsPathToFormatName(lpwcsadspath: Pcwstr, lpwcsformatname: Pwstr, lpdwformatnamelength: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQADsPathToFormatName(lpwcsadspath?.value?.toCPointer<ByteVar>(), lpwcsformatname?.value?.toCPointer<ByteVar>(), lpdwformatnamelength?.value?.toCPointer<ByteVar>())

public actual fun mQBeginTransaction(pptransaction: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQBeginTransaction(pptransaction?.value?.toCPointer<ByteVar>())

public actual fun mQCloseCursor(hcursor: Handle): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQCloseCursor(hcursor?.value?.toCPointer<ByteVar>())

public actual fun mQCloseQueue(hqueue: Long): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQCloseQueue(hqueue)

public actual fun mQCreateCursor(hqueue: Long, phcursor: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQCreateCursor(hqueue, phcursor?.value?.toCPointer<ByteVar>())

public actual fun mQCreateQueue(psecuritydescriptor: PsecurityDescriptor, pqueueprops: COpaquePointer?, lpwcsformatname: Pwstr, lpdwformatnamelength: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQCreateQueue(psecuritydescriptor?.value?.toCPointer<ByteVar>(), pqueueprops?.value?.toCPointer<ByteVar>(), lpwcsformatname?.value?.toCPointer<ByteVar>(), lpdwformatnamelength?.value?.toCPointer<ByteVar>())

public actual fun mQDeleteQueue(lpwcsformatname: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQDeleteQueue(lpwcsformatname?.value?.toCPointer<ByteVar>())

public actual fun mQFreeMemory(pvmemory: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQFreeMemory(pvmemory?.value?.toCPointer<ByteVar>())
}

public actual fun mQFreeSecurityContext(hsecuritycontext: Handle) {
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQFreeSecurityContext(hsecuritycontext?.value?.toCPointer<ByteVar>())
}

public actual fun mQGetMachineProperties(lpwcsmachinename: Pcwstr, pguidmachineid: COpaquePointer?, pqmprops: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQGetMachineProperties(lpwcsmachinename?.value?.toCPointer<ByteVar>(), pguidmachineid?.value?.toCPointer<ByteVar>(), pqmprops?.value?.toCPointer<ByteVar>())

public actual fun mQGetOverlappedResult(lpoverlapped: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQGetOverlappedResult(lpoverlapped?.value?.toCPointer<ByteVar>())

public actual fun mQGetPrivateComputerInformation(lpwcscomputername: Pcwstr, pprivateprops: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQGetPrivateComputerInformation(lpwcscomputername?.value?.toCPointer<ByteVar>(), pprivateprops?.value?.toCPointer<ByteVar>())

public actual fun mQGetQueueProperties(lpwcsformatname: Pcwstr, pqueueprops: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQGetQueueProperties(lpwcsformatname?.value?.toCPointer<ByteVar>(), pqueueprops?.value?.toCPointer<ByteVar>())

public actual fun mQGetQueueSecurity(lpwcsformatname: Pcwstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQGetQueueSecurity(lpwcsformatname?.value?.toCPointer<ByteVar>(), requestedinformation, psecuritydescriptor?.value?.toCPointer<ByteVar>(), nlength, lpnlengthneeded?.value?.toCPointer<ByteVar>())

public actual fun mQGetSecurityContext(lpcertbuffer: COpaquePointer?, dwcertbufferlength: UInt, phsecuritycontext: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQGetSecurityContext(lpcertbuffer?.value?.toCPointer<ByteVar>(), dwcertbufferlength, phsecuritycontext?.value?.toCPointer<ByteVar>())

public actual fun mQGetSecurityContextEx(lpcertbuffer: COpaquePointer?, dwcertbufferlength: UInt, phsecuritycontext: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQGetSecurityContextEx(lpcertbuffer?.value?.toCPointer<ByteVar>(), dwcertbufferlength, phsecuritycontext?.value?.toCPointer<ByteVar>())

public actual fun mQHandleToFormatName(hqueue: Long, lpwcsformatname: Pwstr, lpdwformatnamelength: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQHandleToFormatName(hqueue, lpwcsformatname?.value?.toCPointer<ByteVar>(), lpdwformatnamelength?.value?.toCPointer<ByteVar>())

public actual fun mQInstanceToFormatName(pguid: COpaquePointer?, lpwcsformatname: Pwstr, lpdwformatnamelength: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQInstanceToFormatName(pguid?.value?.toCPointer<ByteVar>(), lpwcsformatname?.value?.toCPointer<ByteVar>(), lpdwformatnamelength?.value?.toCPointer<ByteVar>())

public actual fun mQLocateBegin(lpwcscontext: Pcwstr, prestriction: COpaquePointer?, pcolumns: COpaquePointer?, psort: COpaquePointer?, phenum: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQLocateBegin(lpwcscontext?.value?.toCPointer<ByteVar>(), prestriction?.value?.toCPointer<ByteVar>(), pcolumns?.value?.toCPointer<ByteVar>(), psort?.value?.toCPointer<ByteVar>(), phenum?.value?.toCPointer<ByteVar>())

public actual fun mQLocateEnd(henum: Handle): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQLocateEnd(henum?.value?.toCPointer<ByteVar>())

public actual fun mQLocateNext(henum: Handle, pcprops: COpaquePointer?, apropvar: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQLocateNext(henum?.value?.toCPointer<ByteVar>(), pcprops?.value?.toCPointer<ByteVar>(), apropvar?.value?.toCPointer<ByteVar>())

public actual fun mQMarkMessageRejected(hqueue: Handle, ulllookupid: ULong): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQMarkMessageRejected(hqueue?.value?.toCPointer<ByteVar>(), ulllookupid)

public actual fun mQMgmtAction(pcomputername: Pcwstr, pobjectname: Pcwstr, paction: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQMgmtAction(pcomputername?.value?.toCPointer<ByteVar>(), pobjectname?.value?.toCPointer<ByteVar>(), paction?.value?.toCPointer<ByteVar>())

public actual fun mQMgmtGetInfo(pcomputername: Pcwstr, pobjectname: Pcwstr, pmgmtprops: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQMgmtGetInfo(pcomputername?.value?.toCPointer<ByteVar>(), pobjectname?.value?.toCPointer<ByteVar>(), pmgmtprops?.value?.toCPointer<ByteVar>())

public actual fun mQMoveMessage(hsourcequeue: Long, hdestinationqueue: Long, ulllookupid: ULong, ptransaction: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQMoveMessage(hsourcequeue, hdestinationqueue, ulllookupid, ptransaction?.value?.toCPointer<ByteVar>())

public actual fun mQOpenQueue(lpwcsformatname: Pcwstr, dwaccess: UInt, dwsharemode: UInt, phqueue: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQOpenQueue(lpwcsformatname?.value?.toCPointer<ByteVar>(), dwaccess, dwsharemode, phqueue?.value?.toCPointer<ByteVar>())

public actual fun mQPathNameToFormatName(lpwcspathname: Pcwstr, lpwcsformatname: Pwstr, lpdwformatnamelength: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQPathNameToFormatName(lpwcspathname?.value?.toCPointer<ByteVar>(), lpwcsformatname?.value?.toCPointer<ByteVar>(), lpdwformatnamelength?.value?.toCPointer<ByteVar>())

public actual fun mQPurgeQueue(hqueue: Long): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQPurgeQueue(hqueue)

public actual fun mQReceiveMessage(hsource: Long, dwtimeout: UInt, dwaction: UInt, pmessageprops: COpaquePointer?, lpoverlapped: COpaquePointer?, fnreceivecallback: Pmqreceivecallback, hcursor: Handle, ptransaction: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQReceiveMessage(hsource, dwtimeout, dwaction, pmessageprops?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), hcursor?.value?.toCPointer<ByteVar>(), ptransaction?.value?.toCPointer<ByteVar>())

public actual fun mQReceiveMessageByLookupId(hsource: Long, ulllookupid: ULong, dwlookupaction: UInt, pmessageprops: COpaquePointer?, lpoverlapped: COpaquePointer?, fnreceivecallback: Pmqreceivecallback, ptransaction: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQReceiveMessageByLookupId(hsource, ulllookupid, dwlookupaction, pmessageprops?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), ptransaction?.value?.toCPointer<ByteVar>())

public actual fun mQRegisterCertificate(dwflags: UInt, lpcertbuffer: COpaquePointer?, dwcertbufferlength: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQRegisterCertificate(dwflags, lpcertbuffer?.value?.toCPointer<ByteVar>(), dwcertbufferlength)

public actual fun mQSendMessage(hdestinationqueue: Long, pmessageprops: COpaquePointer?, ptransaction: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQSendMessage(hdestinationqueue, pmessageprops?.value?.toCPointer<ByteVar>(), ptransaction?.value?.toCPointer<ByteVar>())

public actual fun mQSetQueueProperties(lpwcsformatname: Pcwstr, pqueueprops: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQSetQueueProperties(lpwcsformatname?.value?.toCPointer<ByteVar>(), pqueueprops?.value?.toCPointer<ByteVar>())

public actual fun mQSetQueueSecurity(lpwcsformatname: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_mQSetQueueSecurity(lpwcsformatname?.value?.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor?.value?.toCPointer<ByteVar>())
