#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_VARIANT_WINDOWS_WIN32_SYSTEM_VARIANT_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_VARIANT_WINDOWS_WIN32_SYSTEM_VARIANT_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssys_windows_win32_system_variant_ClearVariantArray(void* pvars, uint32_t cvars);
int32_t windowssys_windows_win32_system_variant_DosDateTimeToVariantTime(uint16_t wdosdate, uint16_t wdostime, void* pvtime);
int32_t windowssys_windows_win32_system_variant_InitVariantFromBooleanArray(void* prgf, uint32_t celems, void* pvar);
int32_t windowssys_windows_win32_system_variant_InitVariantFromBuffer(void* pv, uint32_t cb, void* pvar);
int32_t windowssys_windows_win32_system_variant_InitVariantFromDoubleArray(void* prgn, uint32_t celems, void* pvar);
int32_t windowssys_windows_win32_system_variant_InitVariantFromFileTime(void* pft, void* pvar);
int32_t windowssys_windows_win32_system_variant_InitVariantFromFileTimeArray(void* prgft, uint32_t celems, void* pvar);
int32_t windowssys_windows_win32_system_variant_InitVariantFromGUIDAsString(void* guid, void* pvar);
int32_t windowssys_windows_win32_system_variant_InitVariantFromInt16Array(void* prgn, uint32_t celems, void* pvar);
int32_t windowssys_windows_win32_system_variant_InitVariantFromInt32Array(void* prgn, uint32_t celems, void* pvar);
int32_t windowssys_windows_win32_system_variant_InitVariantFromInt64Array(void* prgn, uint32_t celems, void* pvar);
int32_t windowssys_windows_win32_system_variant_InitVariantFromResource(void* hinst, uint32_t id, void* pvar);
int32_t windowssys_windows_win32_system_variant_InitVariantFromStringArray(void* prgsz, uint32_t celems, void* pvar);
int32_t windowssys_windows_win32_system_variant_InitVariantFromUInt16Array(void* prgn, uint32_t celems, void* pvar);
int32_t windowssys_windows_win32_system_variant_InitVariantFromUInt32Array(void* prgn, uint32_t celems, void* pvar);
int32_t windowssys_windows_win32_system_variant_InitVariantFromUInt64Array(void* prgn, uint32_t celems, void* pvar);
int32_t windowssys_windows_win32_system_variant_InitVariantFromVariantArrayElem(void* varin, uint32_t ielem, void* pvar);
int32_t windowssys_windows_win32_system_variant_SystemTimeToVariantTime(void* lpsystemtime, void* pvtime);
void windowssys_windows_win32_system_variant_VARIANT_UserFree(void* param0, void* param1);
void windowssys_windows_win32_system_variant_VARIANT_UserFree64(void* param0, void* param1);
void* windowssys_windows_win32_system_variant_VARIANT_UserMarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_variant_VARIANT_UserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssys_windows_win32_system_variant_VARIANT_UserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssys_windows_win32_system_variant_VARIANT_UserSize64(void* param0, uint32_t param1, void* param2);
void* windowssys_windows_win32_system_variant_VARIANT_UserUnmarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_variant_VARIANT_UserUnmarshal64(void* param0, void* param1, void* param2);
int32_t windowssys_windows_win32_system_variant_VariantChangeType(void* pvargdest, void* pvarsrc, uint16_t wflags, uint16_t vt);
int32_t windowssys_windows_win32_system_variant_VariantChangeTypeEx(void* pvargdest, void* pvarsrc, uint32_t lcid, uint16_t wflags, uint16_t vt);
int32_t windowssys_windows_win32_system_variant_VariantClear(void* pvarg);
int32_t windowssys_windows_win32_system_variant_VariantCompare(void* var1, void* var2);
int32_t windowssys_windows_win32_system_variant_VariantCopy(void* pvargdest, void* pvargsrc);
int32_t windowssys_windows_win32_system_variant_VariantCopyInd(void* pvardest, void* pvargsrc);
int32_t windowssys_windows_win32_system_variant_VariantGetBooleanElem(void* var, uint32_t ielem, void* pfval);
int32_t windowssys_windows_win32_system_variant_VariantGetDoubleElem(void* var, uint32_t ielem, void* pnval);
uint32_t windowssys_windows_win32_system_variant_VariantGetElementCount(void* varin);
int32_t windowssys_windows_win32_system_variant_VariantGetInt16Elem(void* var, uint32_t ielem, void* pnval);
int32_t windowssys_windows_win32_system_variant_VariantGetInt32Elem(void* var, uint32_t ielem, void* pnval);
int32_t windowssys_windows_win32_system_variant_VariantGetInt64Elem(void* var, uint32_t ielem, void* pnval);
int32_t windowssys_windows_win32_system_variant_VariantGetStringElem(void* var, uint32_t ielem, void* ppszval);
int32_t windowssys_windows_win32_system_variant_VariantGetUInt16Elem(void* var, uint32_t ielem, void* pnval);
int32_t windowssys_windows_win32_system_variant_VariantGetUInt32Elem(void* var, uint32_t ielem, void* pnval);
int32_t windowssys_windows_win32_system_variant_VariantGetUInt64Elem(void* var, uint32_t ielem, void* pnval);
void windowssys_windows_win32_system_variant_VariantInit(void* pvarg);
int32_t windowssys_windows_win32_system_variant_VariantTimeToDosDateTime(double vtime, void* pwdosdate, void* pwdostime);
int32_t windowssys_windows_win32_system_variant_VariantTimeToSystemTime(double vtime, void* lpsystemtime);
int32_t windowssys_windows_win32_system_variant_VariantToBoolean(void* varin, void* pfret);
int32_t windowssys_windows_win32_system_variant_VariantToBooleanArray(void* var, void* prgf, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_variant_VariantToBooleanArrayAlloc(void* var, void* pprgf, void* pcelem);
int32_t windowssys_windows_win32_system_variant_VariantToBooleanWithDefault(void* varin, int32_t fdefault);
int32_t windowssys_windows_win32_system_variant_VariantToBuffer(void* varin, void* pv, uint32_t cb);
int32_t windowssys_windows_win32_system_variant_VariantToDosDateTime(void* varin, void* pwdate, void* pwtime);
int32_t windowssys_windows_win32_system_variant_VariantToDouble(void* varin, void* pdblret);
int32_t windowssys_windows_win32_system_variant_VariantToDoubleArray(void* var, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_variant_VariantToDoubleArrayAlloc(void* var, void* pprgn, void* pcelem);
double windowssys_windows_win32_system_variant_VariantToDoubleWithDefault(void* varin, double dbldefault);
int32_t windowssys_windows_win32_system_variant_VariantToFileTime(void* varin, int32_t stfout, void* pftout);
int32_t windowssys_windows_win32_system_variant_VariantToGUID(void* varin, void* pguid);
int32_t windowssys_windows_win32_system_variant_VariantToInt16(void* varin, void* piret);
int32_t windowssys_windows_win32_system_variant_VariantToInt16Array(void* var, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_variant_VariantToInt16ArrayAlloc(void* var, void* pprgn, void* pcelem);
int16_t windowssys_windows_win32_system_variant_VariantToInt16WithDefault(void* varin, int16_t idefault);
int32_t windowssys_windows_win32_system_variant_VariantToInt32(void* varin, void* plret);
int32_t windowssys_windows_win32_system_variant_VariantToInt32Array(void* var, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_variant_VariantToInt32ArrayAlloc(void* var, void* pprgn, void* pcelem);
int32_t windowssys_windows_win32_system_variant_VariantToInt32WithDefault(void* varin, int32_t ldefault);
int32_t windowssys_windows_win32_system_variant_VariantToInt64(void* varin, void* pllret);
int32_t windowssys_windows_win32_system_variant_VariantToInt64Array(void* var, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_variant_VariantToInt64ArrayAlloc(void* var, void* pprgn, void* pcelem);
int64_t windowssys_windows_win32_system_variant_VariantToInt64WithDefault(void* varin, int64_t lldefault);
int32_t windowssys_windows_win32_system_variant_VariantToString(void* varin, void* pszbuf, uint32_t cchbuf);
int32_t windowssys_windows_win32_system_variant_VariantToStringAlloc(void* varin, void* ppszbuf);
int32_t windowssys_windows_win32_system_variant_VariantToStringArray(void* var, void* prgsz, uint32_t crgsz, void* pcelem);
int32_t windowssys_windows_win32_system_variant_VariantToStringArrayAlloc(void* var, void* pprgsz, void* pcelem);
void* windowssys_windows_win32_system_variant_VariantToStringWithDefault(void* varin, void* pszdefault);
int32_t windowssys_windows_win32_system_variant_VariantToUInt16(void* varin, void* puiret);
int32_t windowssys_windows_win32_system_variant_VariantToUInt16Array(void* var, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_variant_VariantToUInt16ArrayAlloc(void* var, void* pprgn, void* pcelem);
uint16_t windowssys_windows_win32_system_variant_VariantToUInt16WithDefault(void* varin, uint16_t uidefault);
int32_t windowssys_windows_win32_system_variant_VariantToUInt32(void* varin, void* pulret);
int32_t windowssys_windows_win32_system_variant_VariantToUInt32Array(void* var, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_variant_VariantToUInt32ArrayAlloc(void* var, void* pprgn, void* pcelem);
uint32_t windowssys_windows_win32_system_variant_VariantToUInt32WithDefault(void* varin, uint32_t uldefault);
int32_t windowssys_windows_win32_system_variant_VariantToUInt64(void* varin, void* pullret);
int32_t windowssys_windows_win32_system_variant_VariantToUInt64Array(void* var, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_variant_VariantToUInt64ArrayAlloc(void* var, void* pprgn, void* pcelem);
uint64_t windowssys_windows_win32_system_variant_VariantToUInt64WithDefault(void* varin, uint64_t ulldefault);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_VARIANT_WINDOWS_WIN32_SYSTEM_VARIANT_WRAPPER_H */
