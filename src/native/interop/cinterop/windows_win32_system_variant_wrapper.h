#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_VARIANT_WINDOWS_WIN32_SYSTEM_VARIANT_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_VARIANT_WINDOWS_WIN32_SYSTEM_VARIANT_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssys_windows_win32_system_variant_clearVariantArray(void* pvars, uint32_t cvars);
int32_t windowssys_windows_win32_system_variant_dosDateTimeToVariantTime(uint16_t wdosdate, uint16_t wdostime, void* pvtime);
int32_t windowssys_windows_win32_system_variant_initVariantFromBooleanArray(void* prgf, uint32_t celems, void* pvar);
int32_t windowssys_windows_win32_system_variant_initVariantFromBuffer(void* pv, uint32_t cb, void* pvar);
int32_t windowssys_windows_win32_system_variant_initVariantFromDoubleArray(void* prgn, uint32_t celems, void* pvar);
int32_t windowssys_windows_win32_system_variant_initVariantFromFileTime(void* pft, void* pvar);
int32_t windowssys_windows_win32_system_variant_initVariantFromFileTimeArray(void* prgft, uint32_t celems, void* pvar);
int32_t windowssys_windows_win32_system_variant_initVariantFromGUIDAsString(void* guid, void* pvar);
int32_t windowssys_windows_win32_system_variant_initVariantFromInt16Array(void* prgn, uint32_t celems, void* pvar);
int32_t windowssys_windows_win32_system_variant_initVariantFromInt32Array(void* prgn, uint32_t celems, void* pvar);
int32_t windowssys_windows_win32_system_variant_initVariantFromInt64Array(void* prgn, uint32_t celems, void* pvar);
int32_t windowssys_windows_win32_system_variant_initVariantFromResource(void* hinst, uint32_t id, void* pvar);
int32_t windowssys_windows_win32_system_variant_initVariantFromStringArray(void* prgsz, uint32_t celems, void* pvar);
int32_t windowssys_windows_win32_system_variant_initVariantFromUInt16Array(void* prgn, uint32_t celems, void* pvar);
int32_t windowssys_windows_win32_system_variant_initVariantFromUInt32Array(void* prgn, uint32_t celems, void* pvar);
int32_t windowssys_windows_win32_system_variant_initVariantFromUInt64Array(void* prgn, uint32_t celems, void* pvar);
int32_t windowssys_windows_win32_system_variant_initVariantFromVariantArrayElem(void* varin, uint32_t ielem, void* pvar);
int32_t windowssys_windows_win32_system_variant_systemTimeToVariantTime(void* lpsystemtime, void* pvtime);
void windowssys_windows_win32_system_variant_variantUserFree(void* param0, void* param1);
void windowssys_windows_win32_system_variant_variantUserFree64(void* param0, void* param1);
void* windowssys_windows_win32_system_variant_variantUserMarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_variant_variantUserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssys_windows_win32_system_variant_variantUserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssys_windows_win32_system_variant_variantUserSize64(void* param0, uint32_t param1, void* param2);
void* windowssys_windows_win32_system_variant_variantUserUnmarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_variant_variantUserUnmarshal64(void* param0, void* param1, void* param2);
int32_t windowssys_windows_win32_system_variant_variantChangeType(void* pvargdest, void* pvarsrc, uint16_t wflags, uint16_t vt);
int32_t windowssys_windows_win32_system_variant_variantChangeTypeEx(void* pvargdest, void* pvarsrc, uint32_t lcid, uint16_t wflags, uint16_t vt);
int32_t windowssys_windows_win32_system_variant_variantClear(void* pvarg);
int32_t windowssys_windows_win32_system_variant_variantCompare(void* var1, void* var2);
int32_t windowssys_windows_win32_system_variant_variantCopy(void* pvargdest, void* pvargsrc);
int32_t windowssys_windows_win32_system_variant_variantCopyInd(void* pvardest, void* pvargsrc);
int32_t windowssys_windows_win32_system_variant_variantGetBooleanElem(void* var, uint32_t ielem, void* pfval);
int32_t windowssys_windows_win32_system_variant_variantGetDoubleElem(void* var, uint32_t ielem, void* pnval);
uint32_t windowssys_windows_win32_system_variant_variantGetElementCount(void* varin);
int32_t windowssys_windows_win32_system_variant_variantGetInt16Elem(void* var, uint32_t ielem, void* pnval);
int32_t windowssys_windows_win32_system_variant_variantGetInt32Elem(void* var, uint32_t ielem, void* pnval);
int32_t windowssys_windows_win32_system_variant_variantGetInt64Elem(void* var, uint32_t ielem, void* pnval);
int32_t windowssys_windows_win32_system_variant_variantGetStringElem(void* var, uint32_t ielem, void* ppszval);
int32_t windowssys_windows_win32_system_variant_variantGetUInt16Elem(void* var, uint32_t ielem, void* pnval);
int32_t windowssys_windows_win32_system_variant_variantGetUInt32Elem(void* var, uint32_t ielem, void* pnval);
int32_t windowssys_windows_win32_system_variant_variantGetUInt64Elem(void* var, uint32_t ielem, void* pnval);
void windowssys_windows_win32_system_variant_variantInit(void* pvarg);
int32_t windowssys_windows_win32_system_variant_variantTimeToDosDateTime(double vtime, void* pwdosdate, void* pwdostime);
int32_t windowssys_windows_win32_system_variant_variantTimeToSystemTime(double vtime, void* lpsystemtime);
int32_t windowssys_windows_win32_system_variant_variantToBoolean(void* varin, void* pfret);
int32_t windowssys_windows_win32_system_variant_variantToBooleanArray(void* var, void* prgf, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_variant_variantToBooleanArrayAlloc(void* var, void* pprgf, void* pcelem);
int32_t windowssys_windows_win32_system_variant_variantToBooleanWithDefault(void* varin, int32_t fdefault);
int32_t windowssys_windows_win32_system_variant_variantToBuffer(void* varin, void* pv, uint32_t cb);
int32_t windowssys_windows_win32_system_variant_variantToDosDateTime(void* varin, void* pwdate, void* pwtime);
int32_t windowssys_windows_win32_system_variant_variantToDouble(void* varin, void* pdblret);
int32_t windowssys_windows_win32_system_variant_variantToDoubleArray(void* var, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_variant_variantToDoubleArrayAlloc(void* var, void* pprgn, void* pcelem);
double windowssys_windows_win32_system_variant_variantToDoubleWithDefault(void* varin, double dbldefault);
int32_t windowssys_windows_win32_system_variant_variantToFileTime(void* varin, int32_t stfout, void* pftout);
int32_t windowssys_windows_win32_system_variant_variantToGUID(void* varin, void* pguid);
int32_t windowssys_windows_win32_system_variant_variantToInt16(void* varin, void* piret);
int32_t windowssys_windows_win32_system_variant_variantToInt16Array(void* var, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_variant_variantToInt16ArrayAlloc(void* var, void* pprgn, void* pcelem);
int16_t windowssys_windows_win32_system_variant_variantToInt16WithDefault(void* varin, int16_t idefault);
int32_t windowssys_windows_win32_system_variant_variantToInt32(void* varin, void* plret);
int32_t windowssys_windows_win32_system_variant_variantToInt32Array(void* var, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_variant_variantToInt32ArrayAlloc(void* var, void* pprgn, void* pcelem);
int32_t windowssys_windows_win32_system_variant_variantToInt32WithDefault(void* varin, int32_t ldefault);
int32_t windowssys_windows_win32_system_variant_variantToInt64(void* varin, void* pllret);
int32_t windowssys_windows_win32_system_variant_variantToInt64Array(void* var, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_variant_variantToInt64ArrayAlloc(void* var, void* pprgn, void* pcelem);
int64_t windowssys_windows_win32_system_variant_variantToInt64WithDefault(void* varin, int64_t lldefault);
int32_t windowssys_windows_win32_system_variant_variantToString(void* varin, void* pszbuf, uint32_t cchbuf);
int32_t windowssys_windows_win32_system_variant_variantToStringAlloc(void* varin, void* ppszbuf);
int32_t windowssys_windows_win32_system_variant_variantToStringArray(void* var, void* prgsz, uint32_t crgsz, void* pcelem);
int32_t windowssys_windows_win32_system_variant_variantToStringArrayAlloc(void* var, void* pprgsz, void* pcelem);
void* windowssys_windows_win32_system_variant_variantToStringWithDefault(void* varin, void* pszdefault);
int32_t windowssys_windows_win32_system_variant_variantToUInt16(void* varin, void* puiret);
int32_t windowssys_windows_win32_system_variant_variantToUInt16Array(void* var, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_variant_variantToUInt16ArrayAlloc(void* var, void* pprgn, void* pcelem);
uint16_t windowssys_windows_win32_system_variant_variantToUInt16WithDefault(void* varin, uint16_t uidefault);
int32_t windowssys_windows_win32_system_variant_variantToUInt32(void* varin, void* pulret);
int32_t windowssys_windows_win32_system_variant_variantToUInt32Array(void* var, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_variant_variantToUInt32ArrayAlloc(void* var, void* pprgn, void* pcelem);
uint32_t windowssys_windows_win32_system_variant_variantToUInt32WithDefault(void* varin, uint32_t uldefault);
int32_t windowssys_windows_win32_system_variant_variantToUInt64(void* varin, void* pullret);
int32_t windowssys_windows_win32_system_variant_variantToUInt64Array(void* var, void* prgn, uint32_t crgn, void* pcelem);
int32_t windowssys_windows_win32_system_variant_variantToUInt64ArrayAlloc(void* var, void* pprgn, void* pcelem);
uint64_t windowssys_windows_win32_system_variant_variantToUInt64WithDefault(void* varin, uint64_t ulldefault);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_VARIANT_WINDOWS_WIN32_SYSTEM_VARIANT_WRAPPER_H */
