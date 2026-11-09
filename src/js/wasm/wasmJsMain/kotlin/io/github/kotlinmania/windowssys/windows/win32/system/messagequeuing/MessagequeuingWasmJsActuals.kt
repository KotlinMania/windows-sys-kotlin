@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.OBJECT_SECURITY_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

public actual fun MQADsPathToFormatName(lpwcsadspath: PCWSTR, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT =
    0

public actual fun MQBeginTransaction(pptransaction: Long): HRESULT =
    0

public actual fun MQCloseCursor(hcursor: HANDLE): HRESULT =
    0

public actual fun MQCloseQueue(hqueue: Long): HRESULT =
    0

public actual fun MQCreateCursor(hqueue: Long, phcursor: Long): HRESULT =
    0

public actual fun MQCreateQueue(psecuritydescriptor: PSECURITY_DESCRIPTOR, pqueueprops: Long, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT =
    0

public actual fun MQDeleteQueue(lpwcsformatname: PCWSTR): HRESULT =
    0

public actual fun MQFreeMemory(pvmemory: Long) {
}

public actual fun MQFreeSecurityContext(hsecuritycontext: HANDLE) {
}

public actual fun MQGetMachineProperties(lpwcsmachinename: PCWSTR, pguidmachineid: Long, pqmprops: Long): HRESULT =
    0

public actual fun MQGetOverlappedResult(lpoverlapped: Long): HRESULT =
    0

public actual fun MQGetPrivateComputerInformation(lpwcscomputername: PCWSTR, pprivateprops: Long): HRESULT =
    0

public actual fun MQGetQueueProperties(lpwcsformatname: PCWSTR, pqueueprops: Long): HRESULT =
    0

public actual fun MQGetQueueSecurity(lpwcsformatname: PCWSTR, requestedinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): HRESULT =
    0

public actual fun MQGetSecurityContext(lpcertbuffer: Long, dwcertbufferlength: UInt, phsecuritycontext: Long): HRESULT =
    0

public actual fun MQGetSecurityContextEx(lpcertbuffer: Long, dwcertbufferlength: UInt, phsecuritycontext: Long): HRESULT =
    0

public actual fun MQHandleToFormatName(hqueue: Long, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT =
    0

public actual fun MQInstanceToFormatName(pguid: Long, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT =
    0

public actual fun MQLocateBegin(lpwcscontext: PCWSTR, prestriction: Long, pcolumns: Long, psort: Long, phenum: Long): HRESULT =
    0

public actual fun MQLocateEnd(henum: HANDLE): HRESULT =
    0

public actual fun MQLocateNext(henum: HANDLE, pcprops: Long, apropvar: Long): HRESULT =
    0

public actual fun MQMarkMessageRejected(hqueue: HANDLE, ulllookupid: ULong): HRESULT =
    0

public actual fun MQMgmtAction(pcomputername: PCWSTR, pobjectname: PCWSTR, paction: PCWSTR): HRESULT =
    0

public actual fun MQMgmtGetInfo(pcomputername: PCWSTR, pobjectname: PCWSTR, pmgmtprops: Long): HRESULT =
    0

public actual fun MQMoveMessage(hsourcequeue: Long, hdestinationqueue: Long, ulllookupid: ULong, ptransaction: Long): HRESULT =
    0

public actual fun MQOpenQueue(lpwcsformatname: PCWSTR, dwaccess: UInt, dwsharemode: UInt, phqueue: Long): HRESULT =
    0

public actual fun MQPathNameToFormatName(lpwcspathname: PCWSTR, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT =
    0

public actual fun MQPurgeQueue(hqueue: Long): HRESULT =
    0

public actual fun MQReceiveMessage(hsource: Long, dwtimeout: UInt, dwaction: UInt, pmessageprops: Long, lpoverlapped: Long, fnreceivecallback: PMQRECEIVECALLBACK, hcursor: HANDLE, ptransaction: Long): HRESULT =
    0

public actual fun MQReceiveMessageByLookupId(hsource: Long, ulllookupid: ULong, dwlookupaction: UInt, pmessageprops: Long, lpoverlapped: Long, fnreceivecallback: PMQRECEIVECALLBACK, ptransaction: Long): HRESULT =
    0

public actual fun MQRegisterCertificate(dwflags: UInt, lpcertbuffer: Long, dwcertbufferlength: UInt): HRESULT =
    0

public actual fun MQSendMessage(hdestinationqueue: Long, pmessageprops: Long, ptransaction: Long): HRESULT =
    0

public actual fun MQSetQueueProperties(lpwcsformatname: PCWSTR, pqueueprops: Long): HRESULT =
    0

public actual fun MQSetQueueSecurity(lpwcsformatname: PCWSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): HRESULT =
    0
