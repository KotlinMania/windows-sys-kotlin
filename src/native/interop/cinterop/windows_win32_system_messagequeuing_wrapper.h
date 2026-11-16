#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MESSAGEQUEUING_WINDOWS_WIN32_SYSTEM_MESSAGEQUEUING_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MESSAGEQUEUING_WINDOWS_WIN32_SYSTEM_MESSAGEQUEUING_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemMessagequeuingMQADsPathToFormatName(void* lpwcsadspath, void* lpwcsformatname, void* lpdwformatnamelength);
int32_t windowssysWindowsWin32SystemMessagequeuingMQBeginTransaction(void* pptransaction);
int32_t windowssysWindowsWin32SystemMessagequeuingMQCloseCursor(void* hcursor);
int32_t windowssysWindowsWin32SystemMessagequeuingMQCloseQueue(int64_t hqueue);
int32_t windowssysWindowsWin32SystemMessagequeuingMQCreateCursor(int64_t hqueue, void* phcursor);
int32_t windowssysWindowsWin32SystemMessagequeuingMQCreateQueue(void* psecuritydescriptor, void* pqueueprops, void* lpwcsformatname, void* lpdwformatnamelength);
int32_t windowssysWindowsWin32SystemMessagequeuingMQDeleteQueue(void* lpwcsformatname);
void windowssysWindowsWin32SystemMessagequeuingMQFreeMemory(void* pvmemory);
void windowssysWindowsWin32SystemMessagequeuingMQFreeSecurityContext(void* hsecuritycontext);
int32_t windowssysWindowsWin32SystemMessagequeuingMQGetMachineProperties(void* lpwcsmachinename, void* pguidmachineid, void* pqmprops);
int32_t windowssysWindowsWin32SystemMessagequeuingMQGetOverlappedResult(void* lpoverlapped);
int32_t windowssysWindowsWin32SystemMessagequeuingMQGetPrivateComputerInformation(void* lpwcscomputername, void* pprivateprops);
int32_t windowssysWindowsWin32SystemMessagequeuingMQGetQueueProperties(void* lpwcsformatname, void* pqueueprops);
int32_t windowssysWindowsWin32SystemMessagequeuingMQGetQueueSecurity(void* lpwcsformatname, uint32_t requestedinformation, void* psecuritydescriptor, uint32_t nlength, void* lpnlengthneeded);
int32_t windowssysWindowsWin32SystemMessagequeuingMQGetSecurityContext(void* lpcertbuffer, uint32_t dwcertbufferlength, void* phsecuritycontext);
int32_t windowssysWindowsWin32SystemMessagequeuingMQGetSecurityContextEx(void* lpcertbuffer, uint32_t dwcertbufferlength, void* phsecuritycontext);
int32_t windowssysWindowsWin32SystemMessagequeuingMQHandleToFormatName(int64_t hqueue, void* lpwcsformatname, void* lpdwformatnamelength);
int32_t windowssysWindowsWin32SystemMessagequeuingMQInstanceToFormatName(void* pguid, void* lpwcsformatname, void* lpdwformatnamelength);
int32_t windowssysWindowsWin32SystemMessagequeuingMQLocateBegin(void* lpwcscontext, void* prestriction, void* pcolumns, void* psort, void* phenum);
int32_t windowssysWindowsWin32SystemMessagequeuingMQLocateEnd(void* henum);
int32_t windowssysWindowsWin32SystemMessagequeuingMQLocateNext(void* henum, void* pcprops, void* apropvar);
int32_t windowssysWindowsWin32SystemMessagequeuingMQMarkMessageRejected(void* hqueue, uint64_t ulllookupid);
int32_t windowssysWindowsWin32SystemMessagequeuingMQMgmtAction(void* pcomputername, void* pobjectname, void* paction);
int32_t windowssysWindowsWin32SystemMessagequeuingMQMgmtGetInfo(void* pcomputername, void* pobjectname, void* pmgmtprops);
int32_t windowssysWindowsWin32SystemMessagequeuingMQMoveMessage(int64_t hsourcequeue, int64_t hdestinationqueue, uint64_t ulllookupid, void* ptransaction);
int32_t windowssysWindowsWin32SystemMessagequeuingMQOpenQueue(void* lpwcsformatname, uint32_t dwaccess, uint32_t dwsharemode, void* phqueue);
int32_t windowssysWindowsWin32SystemMessagequeuingMQPathNameToFormatName(void* lpwcspathname, void* lpwcsformatname, void* lpdwformatnamelength);
int32_t windowssysWindowsWin32SystemMessagequeuingMQPurgeQueue(int64_t hqueue);
int32_t windowssysWindowsWin32SystemMessagequeuingMQReceiveMessage(int64_t hsource, uint32_t dwtimeout, uint32_t dwaction, void* pmessageprops, void* lpoverlapped, void* fnreceivecallback, void* hcursor, void* ptransaction);
int32_t windowssysWindowsWin32SystemMessagequeuingMQReceiveMessageByLookupId(int64_t hsource, uint64_t ulllookupid, uint32_t dwlookupaction, void* pmessageprops, void* lpoverlapped, void* fnreceivecallback, void* ptransaction);
int32_t windowssysWindowsWin32SystemMessagequeuingMQRegisterCertificate(uint32_t dwflags, void* lpcertbuffer, uint32_t dwcertbufferlength);
int32_t windowssysWindowsWin32SystemMessagequeuingMQSendMessage(int64_t hdestinationqueue, void* pmessageprops, void* ptransaction);
int32_t windowssysWindowsWin32SystemMessagequeuingMQSetQueueProperties(void* lpwcsformatname, void* pqueueprops);
int32_t windowssysWindowsWin32SystemMessagequeuingMQSetQueueSecurity(void* lpwcsformatname, uint32_t securityinformation, void* psecuritydescriptor);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MESSAGEQUEUING_WINDOWS_WIN32_SYSTEM_MESSAGEQUEUING_WRAPPER_H */
