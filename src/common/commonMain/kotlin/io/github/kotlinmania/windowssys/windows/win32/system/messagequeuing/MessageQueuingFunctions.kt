package io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.OBJECT_SECURITY_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

public expect fun MQADsPathToFormatName(lpwcsadspath: PCWSTR, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT

public expect fun MQBeginTransaction(pptransaction: Long): HRESULT

public expect fun MQCloseCursor(hcursor: HANDLE): HRESULT

public expect fun MQCloseQueue(hqueue: Long): HRESULT

public expect fun MQCreateCursor(hqueue: Long, phcursor: Long): HRESULT

public expect fun MQCreateQueue(psecuritydescriptor: PSECURITY_DESCRIPTOR, pqueueprops: Long, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT

public expect fun MQDeleteQueue(lpwcsformatname: PCWSTR): HRESULT

public expect fun MQFreeMemory(pvmemory: Long)

public expect fun MQFreeSecurityContext(hsecuritycontext: HANDLE)

public expect fun MQGetMachineProperties(lpwcsmachinename: PCWSTR, pguidmachineid: Long, pqmprops: Long): HRESULT

public expect fun MQGetOverlappedResult(lpoverlapped: Long): HRESULT

public expect fun MQGetPrivateComputerInformation(lpwcscomputername: PCWSTR, pprivateprops: Long): HRESULT

public expect fun MQGetQueueProperties(lpwcsformatname: PCWSTR, pqueueprops: Long): HRESULT

public expect fun MQGetQueueSecurity(lpwcsformatname: PCWSTR, requestedinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): HRESULT

public expect fun MQGetSecurityContext(lpcertbuffer: Long, dwcertbufferlength: UInt, phsecuritycontext: Long): HRESULT

public expect fun MQGetSecurityContextEx(lpcertbuffer: Long, dwcertbufferlength: UInt, phsecuritycontext: Long): HRESULT

public expect fun MQHandleToFormatName(hqueue: Long, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT

public expect fun MQInstanceToFormatName(pguid: Long, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT

public expect fun MQLocateBegin(lpwcscontext: PCWSTR, prestriction: Long, pcolumns: Long, psort: Long, phenum: Long): HRESULT

public expect fun MQLocateEnd(henum: HANDLE): HRESULT

public expect fun MQLocateNext(henum: HANDLE, pcprops: Long, apropvar: Long): HRESULT

public expect fun MQMarkMessageRejected(hqueue: HANDLE, ulllookupid: ULong): HRESULT

public expect fun MQMgmtAction(pcomputername: PCWSTR, pobjectname: PCWSTR, paction: PCWSTR): HRESULT

public expect fun MQMgmtGetInfo(pcomputername: PCWSTR, pobjectname: PCWSTR, pmgmtprops: Long): HRESULT

public expect fun MQMoveMessage(hsourcequeue: Long, hdestinationqueue: Long, ulllookupid: ULong, ptransaction: Long): HRESULT

public expect fun MQOpenQueue(lpwcsformatname: PCWSTR, dwaccess: UInt, dwsharemode: UInt, phqueue: Long): HRESULT

public expect fun MQPathNameToFormatName(lpwcspathname: PCWSTR, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT

public expect fun MQPurgeQueue(hqueue: Long): HRESULT

public expect fun MQReceiveMessage(hsource: Long, dwtimeout: UInt, dwaction: UInt, pmessageprops: Long, lpoverlapped: Long, fnreceivecallback: PMQRECEIVECALLBACK, hcursor: HANDLE, ptransaction: Long): HRESULT

public expect fun MQReceiveMessageByLookupId(hsource: Long, ulllookupid: ULong, dwlookupaction: UInt, pmessageprops: Long, lpoverlapped: Long, fnreceivecallback: PMQRECEIVECALLBACK, ptransaction: Long): HRESULT

public expect fun MQRegisterCertificate(dwflags: UInt, lpcertbuffer: Long, dwcertbufferlength: UInt): HRESULT

public expect fun MQSendMessage(hdestinationqueue: Long, pmessageprops: Long, ptransaction: Long): HRESULT

public expect fun MQSetQueueProperties(lpwcsformatname: PCWSTR, pqueueprops: Long): HRESULT

public expect fun MQSetQueueSecurity(lpwcsformatname: PCWSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): HRESULT
