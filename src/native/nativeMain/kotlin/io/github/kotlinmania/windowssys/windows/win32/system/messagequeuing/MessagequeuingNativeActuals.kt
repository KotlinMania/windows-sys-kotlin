@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.OBJECT_SECURITY_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun MQADsPathToFormatName(lpwcsadspath: PCWSTR, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQADsPathToFormatName(lpwcsadspath.toCPointer<ByteVar>(), lpwcsformatname.toCPointer<ByteVar>(), lpdwformatnamelength.toCPointer<ByteVar>())

public actual fun MQBeginTransaction(pptransaction: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQBeginTransaction(pptransaction.toCPointer<ByteVar>())

public actual fun MQCloseCursor(hcursor: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQCloseCursor(hcursor.toCPointer<ByteVar>())

public actual fun MQCloseQueue(hqueue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQCloseQueue(hqueue)

public actual fun MQCreateCursor(hqueue: Long, phcursor: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQCreateCursor(hqueue, phcursor.toCPointer<ByteVar>())

public actual fun MQCreateQueue(psecuritydescriptor: PSECURITY_DESCRIPTOR, pqueueprops: Long, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQCreateQueue(psecuritydescriptor.toCPointer<ByteVar>(), pqueueprops.toCPointer<ByteVar>(), lpwcsformatname.toCPointer<ByteVar>(), lpdwformatnamelength.toCPointer<ByteVar>())

public actual fun MQDeleteQueue(lpwcsformatname: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQDeleteQueue(lpwcsformatname.toCPointer<ByteVar>())

public actual fun MQFreeMemory(pvmemory: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQFreeMemory(pvmemory.toCPointer<ByteVar>())
}

public actual fun MQFreeSecurityContext(hsecuritycontext: HANDLE) {
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQFreeSecurityContext(hsecuritycontext.toCPointer<ByteVar>())
}

public actual fun MQGetMachineProperties(lpwcsmachinename: PCWSTR, pguidmachineid: Long, pqmprops: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQGetMachineProperties(lpwcsmachinename.toCPointer<ByteVar>(), pguidmachineid.toCPointer<ByteVar>(), pqmprops.toCPointer<ByteVar>())

public actual fun MQGetOverlappedResult(lpoverlapped: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQGetOverlappedResult(lpoverlapped.toCPointer<ByteVar>())

public actual fun MQGetPrivateComputerInformation(lpwcscomputername: PCWSTR, pprivateprops: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQGetPrivateComputerInformation(lpwcscomputername.toCPointer<ByteVar>(), pprivateprops.toCPointer<ByteVar>())

public actual fun MQGetQueueProperties(lpwcsformatname: PCWSTR, pqueueprops: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQGetQueueProperties(lpwcsformatname.toCPointer<ByteVar>(), pqueueprops.toCPointer<ByteVar>())

public actual fun MQGetQueueSecurity(lpwcsformatname: PCWSTR, requestedinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQGetQueueSecurity(lpwcsformatname.toCPointer<ByteVar>(), requestedinformation, psecuritydescriptor.toCPointer<ByteVar>(), nlength, lpnlengthneeded.toCPointer<ByteVar>())

public actual fun MQGetSecurityContext(lpcertbuffer: Long, dwcertbufferlength: UInt, phsecuritycontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQGetSecurityContext(lpcertbuffer.toCPointer<ByteVar>(), dwcertbufferlength, phsecuritycontext.toCPointer<ByteVar>())

public actual fun MQGetSecurityContextEx(lpcertbuffer: Long, dwcertbufferlength: UInt, phsecuritycontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQGetSecurityContextEx(lpcertbuffer.toCPointer<ByteVar>(), dwcertbufferlength, phsecuritycontext.toCPointer<ByteVar>())

public actual fun MQHandleToFormatName(hqueue: Long, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQHandleToFormatName(hqueue, lpwcsformatname.toCPointer<ByteVar>(), lpdwformatnamelength.toCPointer<ByteVar>())

public actual fun MQInstanceToFormatName(pguid: Long, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQInstanceToFormatName(pguid.toCPointer<ByteVar>(), lpwcsformatname.toCPointer<ByteVar>(), lpdwformatnamelength.toCPointer<ByteVar>())

public actual fun MQLocateBegin(lpwcscontext: PCWSTR, prestriction: Long, pcolumns: Long, psort: Long, phenum: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQLocateBegin(lpwcscontext.toCPointer<ByteVar>(), prestriction.toCPointer<ByteVar>(), pcolumns.toCPointer<ByteVar>(), psort.toCPointer<ByteVar>(), phenum.toCPointer<ByteVar>())

public actual fun MQLocateEnd(henum: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQLocateEnd(henum.toCPointer<ByteVar>())

public actual fun MQLocateNext(henum: HANDLE, pcprops: Long, apropvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQLocateNext(henum.toCPointer<ByteVar>(), pcprops.toCPointer<ByteVar>(), apropvar.toCPointer<ByteVar>())

public actual fun MQMarkMessageRejected(hqueue: HANDLE, ulllookupid: ULong): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQMarkMessageRejected(hqueue.toCPointer<ByteVar>(), ulllookupid)

public actual fun MQMgmtAction(pcomputername: PCWSTR, pobjectname: PCWSTR, paction: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQMgmtAction(pcomputername.toCPointer<ByteVar>(), pobjectname.toCPointer<ByteVar>(), paction.toCPointer<ByteVar>())

public actual fun MQMgmtGetInfo(pcomputername: PCWSTR, pobjectname: PCWSTR, pmgmtprops: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQMgmtGetInfo(pcomputername.toCPointer<ByteVar>(), pobjectname.toCPointer<ByteVar>(), pmgmtprops.toCPointer<ByteVar>())

public actual fun MQMoveMessage(hsourcequeue: Long, hdestinationqueue: Long, ulllookupid: ULong, ptransaction: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQMoveMessage(hsourcequeue, hdestinationqueue, ulllookupid, ptransaction.toCPointer<ByteVar>())

public actual fun MQOpenQueue(lpwcsformatname: PCWSTR, dwaccess: UInt, dwsharemode: UInt, phqueue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQOpenQueue(lpwcsformatname.toCPointer<ByteVar>(), dwaccess, dwsharemode, phqueue.toCPointer<ByteVar>())

public actual fun MQPathNameToFormatName(lpwcspathname: PCWSTR, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQPathNameToFormatName(lpwcspathname.toCPointer<ByteVar>(), lpwcsformatname.toCPointer<ByteVar>(), lpdwformatnamelength.toCPointer<ByteVar>())

public actual fun MQPurgeQueue(hqueue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQPurgeQueue(hqueue)

public actual fun MQReceiveMessage(hsource: Long, dwtimeout: UInt, dwaction: UInt, pmessageprops: Long, lpoverlapped: Long, fnreceivecallback: PMQRECEIVECALLBACK, hcursor: HANDLE, ptransaction: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQReceiveMessage(hsource, dwtimeout, dwaction, pmessageprops.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>(), fnreceivecallback.toLong().toCPointer<ByteVar>(), hcursor.toCPointer<ByteVar>(), ptransaction.toCPointer<ByteVar>())

public actual fun MQReceiveMessageByLookupId(hsource: Long, ulllookupid: ULong, dwlookupaction: UInt, pmessageprops: Long, lpoverlapped: Long, fnreceivecallback: PMQRECEIVECALLBACK, ptransaction: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQReceiveMessageByLookupId(hsource, ulllookupid, dwlookupaction, pmessageprops.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>(), fnreceivecallback.toLong().toCPointer<ByteVar>(), ptransaction.toCPointer<ByteVar>())

public actual fun MQRegisterCertificate(dwflags: UInt, lpcertbuffer: Long, dwcertbufferlength: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQRegisterCertificate(dwflags, lpcertbuffer.toCPointer<ByteVar>(), dwcertbufferlength)

public actual fun MQSendMessage(hdestinationqueue: Long, pmessageprops: Long, ptransaction: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQSendMessage(hdestinationqueue, pmessageprops.toCPointer<ByteVar>(), ptransaction.toCPointer<ByteVar>())

public actual fun MQSetQueueProperties(lpwcsformatname: PCWSTR, pqueueprops: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQSetQueueProperties(lpwcsformatname.toCPointer<ByteVar>(), pqueueprops.toCPointer<ByteVar>())

public actual fun MQSetQueueSecurity(lpwcsformatname: PCWSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing.cinterop.windowssys_windows_win32_system_messagequeuing_MQSetQueueSecurity(lpwcsformatname.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.toCPointer<ByteVar>())
