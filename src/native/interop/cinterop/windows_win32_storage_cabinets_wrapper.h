#ifndef WINDOWSSYS_WINDOWS_WIN32_STORAGE_CABINETS_WINDOWS_WIN32_STORAGE_CABINETS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_STORAGE_CABINETS_WINDOWS_WIN32_STORAGE_CABINETS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32StorageCabinetsFCIAddFile(void* hfci, void* pszsourcefile, void* pszfilename, int32_t fexecute, void* pfnfcignc, void* pfnfcis, void* pfnfcigoi, uint16_t typecompress);
void* windowssysWindowsWin32StorageCabinetsFCICreate(void* perf, void* pfnfcifp, void* pfna, void* pfnf, void* pfnopen, void* pfnread, void* pfnwrite, void* pfnclose, void* pfnseek, void* pfndelete, void* pfnfcigtf, void* pccab, void* pv);
int32_t windowssysWindowsWin32StorageCabinetsFCIDestroy(void* hfci);
int32_t windowssysWindowsWin32StorageCabinetsFCIFlushCabinet(void* hfci, int32_t fgetnextcab, void* pfnfcignc, void* pfnfcis);
int32_t windowssysWindowsWin32StorageCabinetsFCIFlushFolder(void* hfci, void* pfnfcignc, void* pfnfcis);
int32_t windowssysWindowsWin32StorageCabinetsFDICopy(void* hfdi, void* pszcabinet, void* pszcabpath, int32_t flags, void* pfnfdin, void* pfnfdid, void* pvuser);
void* windowssysWindowsWin32StorageCabinetsFDICreate(void* pfnalloc, void* pfnfree, void* pfnopen, void* pfnread, void* pfnwrite, void* pfnclose, void* pfnseek, int32_t cputype, void* perf);
int32_t windowssysWindowsWin32StorageCabinetsFDIDestroy(void* hfdi);
int32_t windowssysWindowsWin32StorageCabinetsFDIIsCabinet(void* hfdi, int64_t hf, void* pfdici);
int32_t windowssysWindowsWin32StorageCabinetsFDITruncateCabinet(void* hfdi, void* pszcabinetname, uint16_t ifoldertodelete);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_STORAGE_CABINETS_WINDOWS_WIN32_STORAGE_CABINETS_WRAPPER_H */
