#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_SNMP_WINDOWS_WIN32_NETWORKMANAGEMENT_SNMP_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_SNMP_WINDOWS_WIN32_NETWORKMANAGEMENT_SNMP_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpCancelMsg(int64_t session, int32_t reqid);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpCleanup(void);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpCleanupEx(void);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpClose(int64_t session);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpContextToStr(int64_t context, void* string);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpCountVbl(int64_t vbl);
int64_t windowssysWindowsWin32NetworkmanagementSnmpSnmpCreatePdu(int64_t session, uint32_t pduType, int32_t requestId, int32_t errorStatus, int32_t errorIndex, int64_t varbindlist);
int64_t windowssysWindowsWin32NetworkmanagementSnmpSnmpCreateSession(void* hwnd, uint32_t wmsg, void* fcallback, void* lpclientdata);
int64_t windowssysWindowsWin32NetworkmanagementSnmpSnmpCreateVbl(int64_t session, void* name, void* value);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpDecodeMsg(int64_t session, void* srcentity, void* dstentity, void* context, void* pdu, void* msgbufdesc);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpDeleteVb(int64_t vbl, uint32_t arg1Index);
int64_t windowssysWindowsWin32NetworkmanagementSnmpSnmpDuplicatePdu(int64_t session, int64_t pdu);
int64_t windowssysWindowsWin32NetworkmanagementSnmpSnmpDuplicateVbl(int64_t session, int64_t vbl);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpEncodeMsg(int64_t session, int64_t srcentity, int64_t dstentity, int64_t context, int64_t pdu, void* msgbufdesc);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpEntityToStr(int64_t entity, uint32_t size, void* string);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeContext(int64_t context);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeDescriptor(uint32_t syntax, void* descriptor);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeEntity(int64_t entity);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpFreePdu(int64_t pdu);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeVbl(int64_t vbl);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpGetLastError(int64_t session);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpGetPduData(int64_t pdu, void* pduType, void* requestId, void* errorStatus, void* errorIndex, void* varbindlist);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpGetRetransmitMode(void* nretransmitmode);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpGetRetry(int64_t hentity, void* npolicyretry, void* nactualretry);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpGetTimeout(int64_t hentity, void* npolicytimeout, void* nactualtimeout);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpGetTranslateMode(void* ntranslatemode);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpGetVb(int64_t vbl, uint32_t arg1Index, void* name, void* value);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpGetVendorInfo(void* vendorinfo);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpListen(int64_t hentity, uint32_t lstatus);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpListenEx(int64_t hentity, uint32_t lstatus, uint32_t nuseentityaddr);
int32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrClose(void* session);
int32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrCtl(void* session, uint32_t dwctlcode, void* lpvinbuffer, uint32_t cbinbuffer, void* lpvoutbuffer, uint32_t cboutbuffer, void* lpcbbytesreturned);
int32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrGetTrap(void* enterprise, void* ipaddress, void* generictrap, void* specifictrap, void* timestamp, void* variablebindings);
int32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrGetTrapEx(void* enterprise, void* agentaddress, void* sourceaddress, void* generictrap, void* specifictrap, void* community, void* timestamp, void* variablebindings);
int32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrOidToStr(void* oid, void* string);
void* windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrOpen(void* lpagentaddress, void* lpagentcommunity, int32_t ntimeout, int32_t nretries);
int32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrRequest(void* session, uint8_t requesttype, void* variablebindings, void* errorstatus, void* errorindex);
int32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrStrToOid(void* string, void* oid);
int32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrTrapListen(void* phtrapavailable);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpOidCompare(void* xoid, void* yoid, uint32_t maxlen, void* result);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpOidCopy(void* srcoid, void* dstoid);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpOidToStr(void* srcoid, uint32_t size, void* string);
int64_t windowssysWindowsWin32NetworkmanagementSnmpSnmpOpen(void* hwnd, uint32_t wmsg);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpRecvMsg(int64_t session, void* srcentity, void* dstentity, void* context, void* pdu);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpRegister(int64_t session, int64_t srcentity, int64_t dstentity, int64_t context, void* notification, uint32_t state);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpSendMsg(int64_t session, int64_t srcentity, int64_t dstentity, int64_t context, int64_t pdu);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpSetPduData(int64_t pdu, void* pduType, void* requestId, void* nonRepeaters, void* maxRepetitions, void* varbindlist);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpSetPort(int64_t hentity, uint32_t nport);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpSetRetransmitMode(uint32_t nretransmitmode);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpSetRetry(int64_t hentity, uint32_t npolicyretry);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpSetTimeout(int64_t hentity, uint32_t npolicytimeout);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpSetTranslateMode(uint32_t ntranslatemode);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpSetVb(int64_t vbl, uint32_t arg1Index, void* name, void* value);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpStartup(void* nmajorversion, void* nminorversion, void* nlevel, void* ntranslatemode, void* nretransmitmode);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpStartupEx(void* nmajorversion, void* nminorversion, void* nlevel, void* ntranslatemode, void* nretransmitmode);
int64_t windowssysWindowsWin32NetworkmanagementSnmpSnmpStrToContext(int64_t session, void* string);
int64_t windowssysWindowsWin32NetworkmanagementSnmpSnmpStrToEntity(int64_t session, void* string);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpStrToOid(void* string, void* dstoid);
uint32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpSvcGetUptime(void);
void windowssysWindowsWin32NetworkmanagementSnmpSnmpSvcSetLogLevel(int32_t nloglevel);
void windowssysWindowsWin32NetworkmanagementSnmpSnmpSvcSetLogType(int32_t nlogtype);
int32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilAsnAnyCpy(void* panydst, void* panysrc);
void windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilAsnAnyFree(void* pany);
void windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilDbgPrint(int32_t nloglevel, void* szformat, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
void* windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilIdsToA(void* ids, uint32_t idlength);
void* windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemAlloc(uint32_t nbytes);
void windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemFree(void* pmem);
void* windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemReAlloc(void* pmem, uint32_t nbytes);
int32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsCmp(void* poctets1, void* poctets2);
int32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsCpy(void* poctetsdst, void* poctetssrc);
void windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsFree(void* poctets);
int32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsNCmp(void* poctets1, void* poctets2, uint32_t nchars);
int32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidAppend(void* poiddst, void* poidsrc);
int32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidCmp(void* poid1, void* poid2);
int32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidCpy(void* poiddst, void* poidsrc);
void windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidFree(void* poid);
int32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidNCmp(void* poid1, void* poid2, uint32_t nsubids);
void* windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidToA(void* oid);
void windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilPrintAsnAny(void* pany);
void windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilPrintOid(void* oid);
int32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindCpy(void* pvbdst, void* pvbsrc);
void windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindFree(void* pvb);
int32_t windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindListCpy(void* pvbldst, void* pvblsrc);
void windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindListFree(void* pvbl);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_SNMP_WINDOWS_WIN32_NETWORKMANAGEMENT_SNMP_WRAPPER_H */
