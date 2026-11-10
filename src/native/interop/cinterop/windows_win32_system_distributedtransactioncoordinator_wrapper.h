#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DISTRIBUTEDTRANSACTIONCOORDINATOR_WINDOWS_WIN32_SYSTEM_DISTRIBUTEDTRANSACTIONCOORDINATOR_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DISTRIBUTEDTRANSACTIONCOORDINATOR_WINDOWS_WIN32_SYSTEM_DISTRIBUTEDTRANSACTIONCOORDINATOR_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_distributedtransactioncoordinator_dtcGetTransactionManager(void* i_pszhost, void* i_psztmname, void* i_riid, uint32_t i_dwreserved1, uint16_t i_wcbreserved2, void* i_pvreserved2, void* o_ppvobject);
int32_t windowssys_windows_win32_system_distributedtransactioncoordinator_dtcGetTransactionManagerC(void* i_pszhost, void* i_psztmname, void* i_riid, uint32_t i_dwreserved1, uint16_t i_wcbreserved2, void* i_pvreserved2, void* o_ppvobject);
int32_t windowssys_windows_win32_system_distributedtransactioncoordinator_dtcGetTransactionManagerExA(void* i_pszhost, void* i_psztmname, void* i_riid, uint32_t i_grfoptions, void* i_pvconfigparams, void* o_ppvobject);
int32_t windowssys_windows_win32_system_distributedtransactioncoordinator_dtcGetTransactionManagerExW(void* i_pwszhost, void* i_pwsztmname, void* i_riid, uint32_t i_grfoptions, void* i_pvconfigparams, void* o_ppvobject);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DISTRIBUTEDTRANSACTIONCOORDINATOR_WINDOWS_WIN32_SYSTEM_DISTRIBUTEDTRANSACTIONCOORDINATOR_WRAPPER_H */
