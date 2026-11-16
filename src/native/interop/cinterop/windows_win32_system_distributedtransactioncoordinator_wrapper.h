#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DISTRIBUTEDTRANSACTIONCOORDINATOR_WINDOWS_WIN32_SYSTEM_DISTRIBUTEDTRANSACTIONCOORDINATOR_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DISTRIBUTEDTRANSACTIONCOORDINATOR_WINDOWS_WIN32_SYSTEM_DISTRIBUTEDTRANSACTIONCOORDINATOR_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManager(void* iPszhost, void* iPsztmname, void* iRiid, uint32_t iDwreserved1, uint16_t iWcbreserved2, void* iPvreserved2, void* oPpvobject);
int32_t windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerC(void* iPszhost, void* iPsztmname, void* iRiid, uint32_t iDwreserved1, uint16_t iWcbreserved2, void* iPvreserved2, void* oPpvobject);
int32_t windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerExA(void* iPszhost, void* iPsztmname, void* iRiid, uint32_t iGrfoptions, void* iPvconfigparams, void* oPpvobject);
int32_t windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerExW(void* iPwszhost, void* iPwsztmname, void* iRiid, uint32_t iGrfoptions, void* iPvconfigparams, void* oPpvobject);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DISTRIBUTEDTRANSACTIONCOORDINATOR_WINDOWS_WIN32_SYSTEM_DISTRIBUTEDTRANSACTIONCOORDINATOR_WRAPPER_H */
