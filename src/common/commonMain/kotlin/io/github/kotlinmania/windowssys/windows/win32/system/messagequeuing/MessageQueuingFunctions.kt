package io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

public expect fun mQADsPathToFormatName(lpwcsadspath: Pcwstr, lpwcsformatname: Pwstr, lpdwformatnamelength: COpaquePointer?): Hresult

public expect fun mQBeginTransaction(pptransaction: COpaquePointer?): Hresult

public expect fun mQCloseCursor(hcursor: Handle): Hresult

public expect fun mQCloseQueue(hqueue: Long): Hresult

public expect fun mQCreateCursor(hqueue: Long, phcursor: COpaquePointer?): Hresult

public expect fun mQCreateQueue(psecuritydescriptor: PsecurityDescriptor, pqueueprops: COpaquePointer?, lpwcsformatname: Pwstr, lpdwformatnamelength: COpaquePointer?): Hresult

public expect fun mQDeleteQueue(lpwcsformatname: Pcwstr): Hresult

public expect fun mQFreeMemory(pvmemory: COpaquePointer?)

public expect fun mQFreeSecurityContext(hsecuritycontext: Handle)

public expect fun mQGetMachineProperties(lpwcsmachinename: Pcwstr, pguidmachineid: COpaquePointer?, pqmprops: COpaquePointer?): Hresult

public expect fun mQGetOverlappedResult(lpoverlapped: COpaquePointer?): Hresult

public expect fun mQGetPrivateComputerInformation(lpwcscomputername: Pcwstr, pprivateprops: COpaquePointer?): Hresult

public expect fun mQGetQueueProperties(lpwcsformatname: Pcwstr, pqueueprops: COpaquePointer?): Hresult

public expect fun mQGetQueueSecurity(lpwcsformatname: Pcwstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: COpaquePointer?): Hresult

public expect fun mQGetSecurityContext(lpcertbuffer: COpaquePointer?, dwcertbufferlength: UInt, phsecuritycontext: COpaquePointer?): Hresult

public expect fun mQGetSecurityContextEx(lpcertbuffer: COpaquePointer?, dwcertbufferlength: UInt, phsecuritycontext: COpaquePointer?): Hresult

public expect fun mQHandleToFormatName(hqueue: Long, lpwcsformatname: Pwstr, lpdwformatnamelength: COpaquePointer?): Hresult

public expect fun mQInstanceToFormatName(pguid: COpaquePointer?, lpwcsformatname: Pwstr, lpdwformatnamelength: COpaquePointer?): Hresult

public expect fun mQLocateBegin(lpwcscontext: Pcwstr, prestriction: COpaquePointer?, pcolumns: COpaquePointer?, psort: COpaquePointer?, phenum: COpaquePointer?): Hresult

public expect fun mQLocateEnd(henum: Handle): Hresult

public expect fun mQLocateNext(henum: Handle, pcprops: COpaquePointer?, apropvar: COpaquePointer?): Hresult

public expect fun mQMarkMessageRejected(hqueue: Handle, ulllookupid: ULong): Hresult

public expect fun mQMgmtAction(pcomputername: Pcwstr, pobjectname: Pcwstr, paction: Pcwstr): Hresult

public expect fun mQMgmtGetInfo(pcomputername: Pcwstr, pobjectname: Pcwstr, pmgmtprops: COpaquePointer?): Hresult

public expect fun mQMoveMessage(hsourcequeue: Long, hdestinationqueue: Long, ulllookupid: ULong, ptransaction: COpaquePointer?): Hresult

public expect fun mQOpenQueue(lpwcsformatname: Pcwstr, dwaccess: UInt, dwsharemode: UInt, phqueue: COpaquePointer?): Hresult

public expect fun mQPathNameToFormatName(lpwcspathname: Pcwstr, lpwcsformatname: Pwstr, lpdwformatnamelength: COpaquePointer?): Hresult

public expect fun mQPurgeQueue(hqueue: Long): Hresult

public expect fun mQReceiveMessage(hsource: Long, dwtimeout: UInt, dwaction: UInt, pmessageprops: COpaquePointer?, lpoverlapped: COpaquePointer?, fnreceivecallback: Pmqreceivecallback, hcursor: Handle, ptransaction: COpaquePointer?): Hresult

public expect fun mQReceiveMessageByLookupId(hsource: Long, ulllookupid: ULong, dwlookupaction: UInt, pmessageprops: COpaquePointer?, lpoverlapped: COpaquePointer?, fnreceivecallback: Pmqreceivecallback, ptransaction: COpaquePointer?): Hresult

public expect fun mQRegisterCertificate(dwflags: UInt, lpcertbuffer: COpaquePointer?, dwcertbufferlength: UInt): Hresult

public expect fun mQSendMessage(hdestinationqueue: Long, pmessageprops: COpaquePointer?, ptransaction: COpaquePointer?): Hresult

public expect fun mQSetQueueProperties(lpwcsformatname: Pcwstr, pqueueprops: COpaquePointer?): Hresult

public expect fun mQSetQueueSecurity(lpwcsformatname: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Hresult
