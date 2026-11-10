#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_SNMP_WINDOWS_WIN32_NETWORKMANAGEMENT_SNMP_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_SNMP_WINDOWS_WIN32_NETWORKMANAGEMENT_SNMP_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpCancelMsg(int64_t session, int32_t reqid);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpCleanup(void);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpCleanupEx(void);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpClose(int64_t session);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpContextToStr(int64_t context, void* string);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpCountVbl(int64_t vbl);
int64_t windowssys_windows_win32_networkmanagement_snmp_snmpCreatePdu(int64_t session, uint32_t pdu_type, int32_t request_id, int32_t error_status, int32_t error_index, int64_t varbindlist);
int64_t windowssys_windows_win32_networkmanagement_snmp_snmpCreateSession(void* hwnd, uint32_t wmsg, void* fcallback, void* lpclientdata);
int64_t windowssys_windows_win32_networkmanagement_snmp_snmpCreateVbl(int64_t session, void* name, void* value);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpDecodeMsg(int64_t session, void* srcentity, void* dstentity, void* context, void* pdu, void* msgbufdesc);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpDeleteVb(int64_t vbl, uint32_t arg_1_index);
int64_t windowssys_windows_win32_networkmanagement_snmp_snmpDuplicatePdu(int64_t session, int64_t pdu);
int64_t windowssys_windows_win32_networkmanagement_snmp_snmpDuplicateVbl(int64_t session, int64_t vbl);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpEncodeMsg(int64_t session, int64_t srcentity, int64_t dstentity, int64_t context, int64_t pdu, void* msgbufdesc);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpEntityToStr(int64_t entity, uint32_t size, void* string);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpFreeContext(int64_t context);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpFreeDescriptor(uint32_t syntax, void* descriptor);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpFreeEntity(int64_t entity);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpFreePdu(int64_t pdu);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpFreeVbl(int64_t vbl);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpGetLastError(int64_t session);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpGetPduData(int64_t pdu, void* pdu_type, void* request_id, void* error_status, void* error_index, void* varbindlist);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpGetRetransmitMode(void* nretransmitmode);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpGetRetry(int64_t hentity, void* npolicyretry, void* nactualretry);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpGetTimeout(int64_t hentity, void* npolicytimeout, void* nactualtimeout);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpGetTranslateMode(void* ntranslatemode);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpGetVb(int64_t vbl, uint32_t arg_1_index, void* name, void* value);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpGetVendorInfo(void* vendorinfo);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpListen(int64_t hentity, uint32_t lstatus);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpListenEx(int64_t hentity, uint32_t lstatus, uint32_t nuseentityaddr);
int32_t windowssys_windows_win32_networkmanagement_snmp_snmpMgrClose(void* session);
int32_t windowssys_windows_win32_networkmanagement_snmp_snmpMgrCtl(void* session, uint32_t dwctlcode, void* lpvinbuffer, uint32_t cbinbuffer, void* lpvoutbuffer, uint32_t cboutbuffer, void* lpcbbytesreturned);
int32_t windowssys_windows_win32_networkmanagement_snmp_snmpMgrGetTrap(void* enterprise, void* ipaddress, void* generictrap, void* specifictrap, void* timestamp, void* variablebindings);
int32_t windowssys_windows_win32_networkmanagement_snmp_snmpMgrGetTrapEx(void* enterprise, void* agentaddress, void* sourceaddress, void* generictrap, void* specifictrap, void* community, void* timestamp, void* variablebindings);
int32_t windowssys_windows_win32_networkmanagement_snmp_snmpMgrOidToStr(void* oid, void* string);
void* windowssys_windows_win32_networkmanagement_snmp_snmpMgrOpen(void* lpagentaddress, void* lpagentcommunity, int32_t ntimeout, int32_t nretries);
int32_t windowssys_windows_win32_networkmanagement_snmp_snmpMgrRequest(void* session, uint8_t requesttype, void* variablebindings, void* errorstatus, void* errorindex);
int32_t windowssys_windows_win32_networkmanagement_snmp_snmpMgrStrToOid(void* string, void* oid);
int32_t windowssys_windows_win32_networkmanagement_snmp_snmpMgrTrapListen(void* phtrapavailable);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpOidCompare(void* xoid, void* yoid, uint32_t maxlen, void* result);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpOidCopy(void* srcoid, void* dstoid);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpOidToStr(void* srcoid, uint32_t size, void* string);
int64_t windowssys_windows_win32_networkmanagement_snmp_snmpOpen(void* hwnd, uint32_t wmsg);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpRecvMsg(int64_t session, void* srcentity, void* dstentity, void* context, void* pdu);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpRegister(int64_t session, int64_t srcentity, int64_t dstentity, int64_t context, void* notification, uint32_t state);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpSendMsg(int64_t session, int64_t srcentity, int64_t dstentity, int64_t context, int64_t pdu);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpSetPduData(int64_t pdu, void* pdu_type, void* request_id, void* non_repeaters, void* max_repetitions, void* varbindlist);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpSetPort(int64_t hentity, uint32_t nport);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpSetRetransmitMode(uint32_t nretransmitmode);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpSetRetry(int64_t hentity, uint32_t npolicyretry);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpSetTimeout(int64_t hentity, uint32_t npolicytimeout);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpSetTranslateMode(uint32_t ntranslatemode);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpSetVb(int64_t vbl, uint32_t arg_1_index, void* name, void* value);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpStartup(void* nmajorversion, void* nminorversion, void* nlevel, void* ntranslatemode, void* nretransmitmode);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpStartupEx(void* nmajorversion, void* nminorversion, void* nlevel, void* ntranslatemode, void* nretransmitmode);
int64_t windowssys_windows_win32_networkmanagement_snmp_snmpStrToContext(int64_t session, void* string);
int64_t windowssys_windows_win32_networkmanagement_snmp_snmpStrToEntity(int64_t session, void* string);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpStrToOid(void* string, void* dstoid);
uint32_t windowssys_windows_win32_networkmanagement_snmp_snmpSvcGetUptime(void);
void windowssys_windows_win32_networkmanagement_snmp_snmpSvcSetLogLevel(int32_t nloglevel);
void windowssys_windows_win32_networkmanagement_snmp_snmpSvcSetLogType(int32_t nlogtype);
int32_t windowssys_windows_win32_networkmanagement_snmp_snmpUtilAsnAnyCpy(void* panydst, void* panysrc);
void windowssys_windows_win32_networkmanagement_snmp_snmpUtilAsnAnyFree(void* pany);
void windowssys_windows_win32_networkmanagement_snmp_snmpUtilDbgPrint(int32_t nloglevel, void* szformat, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
void* windowssys_windows_win32_networkmanagement_snmp_snmpUtilIdsToA(void* ids, uint32_t idlength);
void* windowssys_windows_win32_networkmanagement_snmp_snmpUtilMemAlloc(uint32_t nbytes);
void windowssys_windows_win32_networkmanagement_snmp_snmpUtilMemFree(void* pmem);
void* windowssys_windows_win32_networkmanagement_snmp_snmpUtilMemReAlloc(void* pmem, uint32_t nbytes);
int32_t windowssys_windows_win32_networkmanagement_snmp_snmpUtilOctetsCmp(void* poctets1, void* poctets2);
int32_t windowssys_windows_win32_networkmanagement_snmp_snmpUtilOctetsCpy(void* poctetsdst, void* poctetssrc);
void windowssys_windows_win32_networkmanagement_snmp_snmpUtilOctetsFree(void* poctets);
int32_t windowssys_windows_win32_networkmanagement_snmp_snmpUtilOctetsNCmp(void* poctets1, void* poctets2, uint32_t nchars);
int32_t windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidAppend(void* poiddst, void* poidsrc);
int32_t windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidCmp(void* poid1, void* poid2);
int32_t windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidCpy(void* poiddst, void* poidsrc);
void windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidFree(void* poid);
int32_t windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidNCmp(void* poid1, void* poid2, uint32_t nsubids);
void* windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidToA(void* oid);
void windowssys_windows_win32_networkmanagement_snmp_snmpUtilPrintAsnAny(void* pany);
void windowssys_windows_win32_networkmanagement_snmp_snmpUtilPrintOid(void* oid);
int32_t windowssys_windows_win32_networkmanagement_snmp_snmpUtilVarBindCpy(void* pvbdst, void* pvbsrc);
void windowssys_windows_win32_networkmanagement_snmp_snmpUtilVarBindFree(void* pvb);
int32_t windowssys_windows_win32_networkmanagement_snmp_snmpUtilVarBindListCpy(void* pvbldst, void* pvblsrc);
void windowssys_windows_win32_networkmanagement_snmp_snmpUtilVarBindListFree(void* pvbl);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_SNMP_WINDOWS_WIN32_NETWORKMANAGEMENT_SNMP_WRAPPER_H */
