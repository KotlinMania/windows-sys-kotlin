#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_VARIANT_WINDOWS_WIN32_SYSTEM_VARIANT_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_VARIANT_WINDOWS_WIN32_SYSTEM_VARIANT_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssysWindowsWin32SystemVariantClearVariantArray(void* pvars, uint32_t cvars);
int32_t windowssysWindowsWin32SystemVariantDosDateTimeToVariantTime(uint16_t wdosdate, uint16_t wdostime, void* pvtime);
int32_t windowssysWindowsWin32SystemVariantInitVariantFromBooleanArray(void* prgf, uint32_t celems, void* pvar);
int32_t windowssysWindowsWin32SystemVariantInitVariantFromBuffer(void* pv, uint32_t cb, void* pvar);
int32_t windowssysWindowsWin32SystemVariantInitVariantFromDoubleArray(void* prgn, uint32_t celems, void* pvar);
int32_t windowssysWindowsWin32SystemVariantInitVariantFromFileTime(void* pft, void* pvar);
int32_t windowssysWindowsWin32SystemVariantInitVariantFromFileTimeArray(void* prgft, uint32_t celems, void* pvar);
int32_t windowssysWindowsWin32SystemVariantInitVariantFromGUIDAsString(void* guid, void* pvar);
int32_t windowssysWindowsWin32SystemVariantInitVariantFromInt16Array(void* prgn, uint32_t celems, void* pvar);
int32_t windowssysWindowsWin32SystemVariantInitVariantFromInt32Array(void* prgn, uint32_t celems, void* pvar);
int32_t windowssysWindowsWin32SystemVariantInitVariantFromInt64Array(void* prgn, uint32_t celems, void* pvar);
int32_t windowssysWindowsWin32SystemVariantInitVariantFromResource(void* hinst, uint32_t id, void* pvar);
int32_t windowssysWindowsWin32SystemVariantInitVariantFromStringArray(void* prgsz, uint32_t celems, void* pvar);
int32_t windowssysWindowsWin32SystemVariantInitVariantFromUInt16Array(void* prgn, uint32_t celems, void* pvar);
int32_t windowssysWindowsWin32SystemVariantInitVariantFromUInt32Array(void* prgn, uint32_t celems, void* pvar);
int32_t windowssysWindowsWin32SystemVariantInitVariantFromUInt64Array(void* prgn, uint32_t celems, void* pvar);
int32_t windowssysWindowsWin32SystemVariantInitVariantFromVariantArrayElem(void* varin, uint32_t ielem, void* pvar);
int32_t windowssysWindowsWin32SystemVariantSystemTimeToVariantTime(void* lpsystemtime, void* pvtime);
void windowssysWindowsWin32SystemVariantVariantUserFree(void* param0, void* param1);
void windowssysWindowsWin32SystemVariantVariantUserFree64(void* param0, void* param1);
void* windowssysWindowsWin32SystemVariantVariantUserMarshal(void* param0, void* param1, void* param2);
void* windowssysWindowsWin32SystemVariantVariantUserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssysWindowsWin32SystemVariantVariantUserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssysWindowsWin32SystemVariantVariantUserSize64(void* param0, uint32_t param1, void* param2);
void* windowssysWindowsWin32SystemVariantVariantUserUnmarshal(void* param0, void* param1, void* param2);
void* windowssysWindowsWin32SystemVariantVariantUserUnmarshal64(void* param0, void* param1, void* param2);
int32_t windowssysWindowsWin32SystemVariantVariantChangeType(void* pvargdest, void* pvarsrc, uint16_t wflags, uint16_t vt);
int32_t windowssysWindowsWin32SystemVariantVariantChangeTypeEx(void* pvargdest, void* pvarsrc, uint32_t lcid, uint16_t wflags, uint16_t vt);
int32_t windowssysWindowsWin32SystemVariantVariantClear(void* pvarg);
int32_t windowssysWindowsWin32SystemVariantVariantCompare(void* var1, void* var2);
int32_t windowssysWindowsWin32SystemVariantVariantCopy(void* pvargdest, void* pvargsrc);
int32_t windowssysWindowsWin32SystemVariantVariantCopyInd(void* pvardest, void* pvargsrc);
int32_t windowssysWindowsWin32SystemVariantVariantGetBooleanElem(void* var, uint32_t ielem, void* pfval);
int32_t windowssysWindowsWin32SystemVariantVariantGetDoubleElem(void* var, uint32_t ielem, void* pnval);
uint32_t windowssysWindowsWin32SystemVariantVariantGetElementCount(void* varin);
int32_t windowssysWindowsWin32SystemVariantVariantGetInt16Elem(void* var, uint32_t ielem, void* pnval);
int32_t windowssysWindowsWin32SystemVariantVariantGetInt32Elem(void* var, uint32_t ielem, void* pnval);
int32_t windowssysWindowsWin32SystemVariantVariantGetInt64Elem(void* var, uint32_t ielem, void* pnval);
int32_t windowssysWindowsWin32SystemVariantVariantGetStringElem(void* var, uint32_t ielem, void* ppszval);
int32_t windowssysWindowsWin32SystemVariantVariantGetUInt16Elem(void* var, uint32_t ielem, void* pnval);
int32_t windowssysWindowsWin32SystemVariantVariantGetUInt32Elem(void* var, uint32_t ielem, void* pnval);
int32_t windowssysWindowsWin32SystemVariantVariantGetUInt64Elem(void* var, uint32_t ielem, void* pnval);
void windowssysWindowsWin32SystemVariantVariantInit(void* pvarg);
int32_t windowssysWindowsWin32SystemVariantVariantTimeToDosDateTime(double vtime, void* pwdosdate, void* pwdostime);
int32_t windowssysWindowsWin32SystemVariantVariantTimeToSystemTime(double vtime, void* lpsystemtime);
int32_t windowssysWindowsWin32SystemVariantVariantToBoolean(void* varin, void* pfret);
int32_t windowssysWindowsWin32SystemVariantVariantToBooleanArray(void* var, void* prgf, uint32_t crgn, void* pcelem);
int32_t windowssysWindowsWin32SystemVariantVariantToBooleanArrayAlloc(void* var, void* pprgf, void* pcelem);
int32_t windowssysWindowsWin32SystemVariantVariantToBooleanWithDefault(void* varin, int32_t fdefault);
int32_t windowssysWindowsWin32SystemVariantVariantToBuffer(void* varin, void* pv, uint32_t cb);
int32_t windowssysWindowsWin32SystemVariantVariantToDosDateTime(void* varin, void* pwdate, void* pwtime);
int32_t windowssysWindowsWin32SystemVariantVariantToDouble(void* varin, void* pdblret);
int32_t windowssysWindowsWin32SystemVariantVariantToDoubleArray(void* var, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssysWindowsWin32SystemVariantVariantToDoubleArrayAlloc(void* var, void* pprgn, void* pcelem);
double windowssysWindowsWin32SystemVariantVariantToDoubleWithDefault(void* varin, double dbldefault);
int32_t windowssysWindowsWin32SystemVariantVariantToFileTime(void* varin, int32_t stfout, void* pftout);
int32_t windowssysWindowsWin32SystemVariantVariantToGUID(void* varin, void* pguid);
int32_t windowssysWindowsWin32SystemVariantVariantToInt16(void* varin, void* piret);
int32_t windowssysWindowsWin32SystemVariantVariantToInt16Array(void* var, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssysWindowsWin32SystemVariantVariantToInt16ArrayAlloc(void* var, void* pprgn, void* pcelem);
int16_t windowssysWindowsWin32SystemVariantVariantToInt16WithDefault(void* varin, int16_t idefault);
int32_t windowssysWindowsWin32SystemVariantVariantToInt32(void* varin, void* plret);
int32_t windowssysWindowsWin32SystemVariantVariantToInt32Array(void* var, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssysWindowsWin32SystemVariantVariantToInt32ArrayAlloc(void* var, void* pprgn, void* pcelem);
int32_t windowssysWindowsWin32SystemVariantVariantToInt32WithDefault(void* varin, int32_t ldefault);
int32_t windowssysWindowsWin32SystemVariantVariantToInt64(void* varin, void* pllret);
int32_t windowssysWindowsWin32SystemVariantVariantToInt64Array(void* var, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssysWindowsWin32SystemVariantVariantToInt64ArrayAlloc(void* var, void* pprgn, void* pcelem);
int64_t windowssysWindowsWin32SystemVariantVariantToInt64WithDefault(void* varin, int64_t lldefault);
int32_t windowssysWindowsWin32SystemVariantVariantToString(void* varin, void* pszbuf, uint32_t cchbuf);
int32_t windowssysWindowsWin32SystemVariantVariantToStringAlloc(void* varin, void* ppszbuf);
int32_t windowssysWindowsWin32SystemVariantVariantToStringArray(void* var, void* prgsz, uint32_t crgsz, void* pcelem);
int32_t windowssysWindowsWin32SystemVariantVariantToStringArrayAlloc(void* var, void* pprgsz, void* pcelem);
void* windowssysWindowsWin32SystemVariantVariantToStringWithDefault(void* varin, void* pszdefault);
int32_t windowssysWindowsWin32SystemVariantVariantToUInt16(void* varin, void* puiret);
int32_t windowssysWindowsWin32SystemVariantVariantToUInt16Array(void* var, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssysWindowsWin32SystemVariantVariantToUInt16ArrayAlloc(void* var, void* pprgn, void* pcelem);
uint16_t windowssysWindowsWin32SystemVariantVariantToUInt16WithDefault(void* varin, uint16_t uidefault);
int32_t windowssysWindowsWin32SystemVariantVariantToUInt32(void* varin, void* pulret);
int32_t windowssysWindowsWin32SystemVariantVariantToUInt32Array(void* var, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssysWindowsWin32SystemVariantVariantToUInt32ArrayAlloc(void* var, void* pprgn, void* pcelem);
uint32_t windowssysWindowsWin32SystemVariantVariantToUInt32WithDefault(void* varin, uint32_t uldefault);
int32_t windowssysWindowsWin32SystemVariantVariantToUInt64(void* varin, void* pullret);
int32_t windowssysWindowsWin32SystemVariantVariantToUInt64Array(void* var, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssysWindowsWin32SystemVariantVariantToUInt64ArrayAlloc(void* var, void* pprgn, void* pcelem);
uint64_t windowssysWindowsWin32SystemVariantVariantToUInt64WithDefault(void* varin, uint64_t ulldefault);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_VARIANT_WINDOWS_WIN32_SYSTEM_VARIANT_WRAPPER_H */
