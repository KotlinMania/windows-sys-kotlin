#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_COLORSYSTEM_WINDOWS_WIN32_UI_COLORSYSTEM_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_COLORSYSTEM_WINDOWS_WIN32_UI_COLORSYSTEM_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_ui_colorsystem_associateColorProfileWithDeviceA(void* pmachinename, void* pprofilename, void* pdevicename);
int32_t windowssys_windows_win32_ui_colorsystem_associateColorProfileWithDeviceW(void* pmachinename, void* pprofilename, void* pdevicename);
int32_t windowssys_windows_win32_ui_colorsystem_cMCheckColors(int64_t hcmtransform, void* lpainputcolors, uint32_t ncolors, int32_t ctinput, void* lparesult);
int32_t windowssys_windows_win32_ui_colorsystem_cMCheckColorsInGamut(int64_t hcmtransform, void* lpargbtriple, void* lparesult, uint32_t ncount);
int32_t windowssys_windows_win32_ui_colorsystem_cMCheckRGBs(int64_t hcmtransform, void* lpsrcbits, int32_t bminput, uint32_t dwwidth, uint32_t dwheight, uint32_t dwstride, void* lparesult, void* pfncallback, int64_t ulcallbackdata);
int32_t windowssys_windows_win32_ui_colorsystem_cMConvertColorNameToIndex(int64_t hprofile, void* pacolorname, void* paindex, uint32_t dwcount);
int32_t windowssys_windows_win32_ui_colorsystem_cMConvertIndexToColorName(int64_t hprofile, void* paindex, void* pacolorname, uint32_t dwcount);
int32_t windowssys_windows_win32_ui_colorsystem_cMCreateDeviceLinkProfile(void* pahprofiles, uint32_t nprofiles, void* padwintents, uint32_t nintents, uint32_t dwflags, void* lpprofiledata);
int64_t windowssys_windows_win32_ui_colorsystem_cMCreateMultiProfileTransform(void* pahprofiles, uint32_t nprofiles, void* padwintents, uint32_t nintents, uint32_t dwflags);
int32_t windowssys_windows_win32_ui_colorsystem_cMCreateProfile(void* lpcolorspace, void* lpprofiledata);
int32_t windowssys_windows_win32_ui_colorsystem_cMCreateProfileW(void* lpcolorspace, void* lpprofiledata);
int64_t windowssys_windows_win32_ui_colorsystem_cMCreateTransform(void* lpcolorspace, void* lpdevcharacter, void* lptargetdevcharacter);
int64_t windowssys_windows_win32_ui_colorsystem_cMCreateTransformExt(void* lpcolorspace, void* lpdevcharacter, void* lptargetdevcharacter, uint32_t dwflags);
int64_t windowssys_windows_win32_ui_colorsystem_cMCreateTransformExtW(void* lpcolorspace, void* lpdevcharacter, void* lptargetdevcharacter, uint32_t dwflags);
int64_t windowssys_windows_win32_ui_colorsystem_cMCreateTransformW(void* lpcolorspace, void* lpdevcharacter, void* lptargetdevcharacter);
int32_t windowssys_windows_win32_ui_colorsystem_cMDeleteTransform(int64_t hcmtransform);
uint32_t windowssys_windows_win32_ui_colorsystem_cMGetInfo(uint32_t dwinfo);
int32_t windowssys_windows_win32_ui_colorsystem_cMGetNamedProfileInfo(int64_t hprofile, void* pnamedprofileinfo);
int32_t windowssys_windows_win32_ui_colorsystem_cMIsProfileValid(int64_t hprofile, void* lpbvalid);
int32_t windowssys_windows_win32_ui_colorsystem_cMTranslateColors(int64_t hcmtransform, void* lpainputcolors, uint32_t ncolors, int32_t ctinput, void* lpaoutputcolors, int32_t ctoutput);
int32_t windowssys_windows_win32_ui_colorsystem_cMTranslateRGB(int64_t hcmtransform, uint32_t colorref, void* lpcolorref, uint32_t dwflags);
int32_t windowssys_windows_win32_ui_colorsystem_cMTranslateRGBs(int64_t hcmtransform, void* lpsrcbits, int32_t bminput, uint32_t dwwidth, uint32_t dwheight, uint32_t dwstride, void* lpdestbits, int32_t bmoutput, uint32_t dwtranslatedirection);
int32_t windowssys_windows_win32_ui_colorsystem_cMTranslateRGBsExt(int64_t hcmtransform, void* lpsrcbits, int32_t bminput, uint32_t dwwidth, uint32_t dwheight, uint32_t dwinputstride, void* lpdestbits, int32_t bmoutput, uint32_t dwoutputstride, void* lpfncallback, int64_t ulcallbackdata);
int32_t windowssys_windows_win32_ui_colorsystem_checkBitmapBits(int64_t hcolortransform, void* psrcbits, int32_t bminput, uint32_t dwwidth, uint32_t dwheight, uint32_t dwstride, void* paresult, void* pfncallback, int64_t lpcallbackdata);
int32_t windowssys_windows_win32_ui_colorsystem_checkColors(int64_t hcolortransform, void* painputcolors, uint32_t ncolors, int32_t ctinput, void* paresult);
int32_t windowssys_windows_win32_ui_colorsystem_checkColorsInGamut(void* hdc, void* lprgbtriple, void* dlpbuffer, uint32_t ncount);
int32_t windowssys_windows_win32_ui_colorsystem_closeColorProfile(int64_t hprofile);
int32_t windowssys_windows_win32_ui_colorsystem_colorCorrectPalette(void* hdc, void* hpal, uint32_t defirst, uint32_t num);
int32_t windowssys_windows_win32_ui_colorsystem_colorMatchToTarget(void* hdc, void* hdctarget, uint32_t action);
int32_t windowssys_windows_win32_ui_colorsystem_convertColorNameToIndex(int64_t hprofile, void* pacolorname, void* paindex, uint32_t dwcount);
int32_t windowssys_windows_win32_ui_colorsystem_convertIndexToColorName(int64_t hprofile, void* paindex, void* pacolorname, uint32_t dwcount);
void* windowssys_windows_win32_ui_colorsystem_createColorSpaceA(void* lplcs);
void* windowssys_windows_win32_ui_colorsystem_createColorSpaceW(void* lplcs);
int64_t windowssys_windows_win32_ui_colorsystem_createColorTransformA(void* plogcolorspace, int64_t hdestprofile, int64_t htargetprofile, uint32_t dwflags);
int64_t windowssys_windows_win32_ui_colorsystem_createColorTransformW(void* plogcolorspace, int64_t hdestprofile, int64_t htargetprofile, uint32_t dwflags);
int32_t windowssys_windows_win32_ui_colorsystem_createDeviceLinkProfile(void* hprofile, uint32_t nprofiles, void* padwintent, uint32_t nintents, uint32_t dwflags, void* pprofiledata, uint32_t indexpreferredcmm);
int64_t windowssys_windows_win32_ui_colorsystem_createMultiProfileTransform(void* pahprofiles, uint32_t nprofiles, void* padwintent, uint32_t nintents, uint32_t dwflags, uint32_t indexpreferredcmm);
int32_t windowssys_windows_win32_ui_colorsystem_createProfileFromLogColorSpaceA(void* plogcolorspace, void* pprofile);
int32_t windowssys_windows_win32_ui_colorsystem_createProfileFromLogColorSpaceW(void* plogcolorspace, void* pprofile);
int32_t windowssys_windows_win32_ui_colorsystem_deleteColorSpace(void* hcs);
int32_t windowssys_windows_win32_ui_colorsystem_deleteColorTransform(int64_t hxform);
int32_t windowssys_windows_win32_ui_colorsystem_disassociateColorProfileFromDeviceA(void* pmachinename, void* pprofilename, void* pdevicename);
int32_t windowssys_windows_win32_ui_colorsystem_disassociateColorProfileFromDeviceW(void* pmachinename, void* pprofilename, void* pdevicename);
int32_t windowssys_windows_win32_ui_colorsystem_enumColorProfilesA(void* pmachinename, void* penumrecord, void* penumerationbuffer, void* pdwsizeofenumerationbuffer, void* pnprofiles);
int32_t windowssys_windows_win32_ui_colorsystem_enumColorProfilesW(void* pmachinename, void* penumrecord, void* penumerationbuffer, void* pdwsizeofenumerationbuffer, void* pnprofiles);
int32_t windowssys_windows_win32_ui_colorsystem_enumICMProfilesA(void* hdc, void* proc, int64_t param2);
int32_t windowssys_windows_win32_ui_colorsystem_enumICMProfilesW(void* hdc, void* proc, int64_t param2);
uint32_t windowssys_windows_win32_ui_colorsystem_getCMMInfo(int64_t hcolortransform, uint32_t param1);
int32_t windowssys_windows_win32_ui_colorsystem_getColorDirectoryA(void* pmachinename, void* pbuffer, void* pdwsize);
int32_t windowssys_windows_win32_ui_colorsystem_getColorDirectoryW(void* pmachinename, void* pbuffer, void* pdwsize);
int32_t windowssys_windows_win32_ui_colorsystem_getColorProfileElement(int64_t hprofile, uint32_t tag, uint32_t dwoffset, void* pcbelement, void* pelement, void* pbreference);
int32_t windowssys_windows_win32_ui_colorsystem_getColorProfileElementTag(int64_t hprofile, uint32_t dwindex, void* ptag);
int32_t windowssys_windows_win32_ui_colorsystem_getColorProfileFromHandle(int64_t hprofile, void* pprofile, void* pcbprofile);
int32_t windowssys_windows_win32_ui_colorsystem_getColorProfileHeader(int64_t hprofile, void* pheader);
void* windowssys_windows_win32_ui_colorsystem_getColorSpace(void* hdc);
int32_t windowssys_windows_win32_ui_colorsystem_getCountColorProfileElements(int64_t hprofile, void* pnelementcount);
int32_t windowssys_windows_win32_ui_colorsystem_getDeviceGammaRamp(void* hdc, void* lpramp);
int32_t windowssys_windows_win32_ui_colorsystem_getICMProfileA(void* hdc, void* pbufsize, void* pszfilename);
int32_t windowssys_windows_win32_ui_colorsystem_getICMProfileW(void* hdc, void* pbufsize, void* pszfilename);
int32_t windowssys_windows_win32_ui_colorsystem_getLogColorSpaceA(void* hcolorspace, void* lpbuffer, uint32_t nsize);
int32_t windowssys_windows_win32_ui_colorsystem_getLogColorSpaceW(void* hcolorspace, void* lpbuffer, uint32_t nsize);
int32_t windowssys_windows_win32_ui_colorsystem_getNamedProfileInfo(int64_t hprofile, void* pnamedprofileinfo);
int32_t windowssys_windows_win32_ui_colorsystem_getPS2ColorRenderingDictionary(int64_t hprofile, uint32_t dwintent, void* pps2colorrenderingdictionary, void* pcbps2colorrenderingdictionary, void* pbbinary);
int32_t windowssys_windows_win32_ui_colorsystem_getPS2ColorRenderingIntent(int64_t hprofile, uint32_t dwintent, void* pbuffer, void* pcbps2colorrenderingintent);
int32_t windowssys_windows_win32_ui_colorsystem_getPS2ColorSpaceArray(int64_t hprofile, uint32_t dwintent, uint32_t dwcsatype, void* pps2colorspacearray, void* pcbps2colorspacearray, void* pbbinary);
int32_t windowssys_windows_win32_ui_colorsystem_getStandardColorSpaceProfileA(void* pmachinename, uint32_t dwscs, void* pbuffer, void* pcbsize);
int32_t windowssys_windows_win32_ui_colorsystem_getStandardColorSpaceProfileW(void* pmachinename, uint32_t dwscs, void* pbuffer, void* pcbsize);
int32_t windowssys_windows_win32_ui_colorsystem_installColorProfileA(void* pmachinename, void* pprofilename);
int32_t windowssys_windows_win32_ui_colorsystem_installColorProfileW(void* pmachinename, void* pprofilename);
int32_t windowssys_windows_win32_ui_colorsystem_isColorProfileTagPresent(int64_t hprofile, uint32_t tag, void* pbpresent);
int32_t windowssys_windows_win32_ui_colorsystem_isColorProfileValid(int64_t hprofile, void* pbvalid);
int64_t windowssys_windows_win32_ui_colorsystem_openColorProfileA(void* pprofile, uint32_t dwdesiredaccess, uint32_t dwsharemode, uint32_t dwcreationmode);
int64_t windowssys_windows_win32_ui_colorsystem_openColorProfileW(void* pprofile, uint32_t dwdesiredaccess, uint32_t dwsharemode, uint32_t dwcreationmode);
int32_t windowssys_windows_win32_ui_colorsystem_registerCMMA(void* pmachinename, uint32_t cmmid, void* pcmmdll);
int32_t windowssys_windows_win32_ui_colorsystem_registerCMMW(void* pmachinename, uint32_t cmmid, void* pcmmdll);
int32_t windowssys_windows_win32_ui_colorsystem_selectCMM(uint32_t dwcmmtype);
int32_t windowssys_windows_win32_ui_colorsystem_setColorProfileElement(int64_t hprofile, uint32_t tag, uint32_t dwoffset, void* pcbelement, void* pelement);
int32_t windowssys_windows_win32_ui_colorsystem_setColorProfileElementReference(int64_t hprofile, uint32_t newtag, uint32_t reftag);
int32_t windowssys_windows_win32_ui_colorsystem_setColorProfileElementSize(int64_t hprofile, uint32_t tagtype, uint32_t pcbelement);
int32_t windowssys_windows_win32_ui_colorsystem_setColorProfileHeader(int64_t hprofile, void* pheader);
void* windowssys_windows_win32_ui_colorsystem_setColorSpace(void* hdc, void* hcs);
int32_t windowssys_windows_win32_ui_colorsystem_setDeviceGammaRamp(void* hdc, void* lpramp);
int32_t windowssys_windows_win32_ui_colorsystem_setICMMode(void* hdc, int32_t mode);
int32_t windowssys_windows_win32_ui_colorsystem_setICMProfileA(void* hdc, void* lpfilename);
int32_t windowssys_windows_win32_ui_colorsystem_setICMProfileW(void* hdc, void* lpfilename);
int32_t windowssys_windows_win32_ui_colorsystem_setStandardColorSpaceProfileA(void* pmachinename, uint32_t dwprofileid, void* pprofilename);
int32_t windowssys_windows_win32_ui_colorsystem_setStandardColorSpaceProfileW(void* pmachinename, uint32_t dwprofileid, void* pprofilename);
int32_t windowssys_windows_win32_ui_colorsystem_setupColorMatchingA(void* pcms);
int32_t windowssys_windows_win32_ui_colorsystem_setupColorMatchingW(void* pcms);
int32_t windowssys_windows_win32_ui_colorsystem_translateBitmapBits(int64_t hcolortransform, void* psrcbits, int32_t bminput, uint32_t dwwidth, uint32_t dwheight, uint32_t dwinputstride, void* pdestbits, int32_t bmoutput, uint32_t dwoutputstride, void* pfncallback, int64_t ulcallbackdata);
int32_t windowssys_windows_win32_ui_colorsystem_translateColors(int64_t hcolortransform, void* painputcolors, uint32_t ncolors, int32_t ctinput, void* paoutputcolors, int32_t ctoutput);
int32_t windowssys_windows_win32_ui_colorsystem_uninstallColorProfileA(void* pmachinename, void* pprofilename, int32_t bdelete);
int32_t windowssys_windows_win32_ui_colorsystem_uninstallColorProfileW(void* pmachinename, void* pprofilename, int32_t bdelete);
int32_t windowssys_windows_win32_ui_colorsystem_unregisterCMMA(void* pmachinename, uint32_t cmmid);
int32_t windowssys_windows_win32_ui_colorsystem_unregisterCMMW(void* pmachinename, uint32_t cmmid);
int32_t windowssys_windows_win32_ui_colorsystem_updateICMRegKeyA(uint32_t reserved, void* lpszcmid, void* lpszfilename, uint32_t command);
int32_t windowssys_windows_win32_ui_colorsystem_updateICMRegKeyW(uint32_t reserved, void* lpszcmid, void* lpszfilename, uint32_t command);
int32_t windowssys_windows_win32_ui_colorsystem_wcsAssociateColorProfileWithDevice(int32_t scope, void* pprofilename, void* pdevicename);
int32_t windowssys_windows_win32_ui_colorsystem_wcsCheckColors(int64_t hcolortransform, uint32_t ncolors, uint32_t ninputchannels, int32_t cdtinput, uint32_t cbinput, void* pinputdata, void* paresult);
int64_t windowssys_windows_win32_ui_colorsystem_wcsCreateIccProfile(int64_t hwcsprofile, uint32_t dwoptions);
int32_t windowssys_windows_win32_ui_colorsystem_wcsDisassociateColorProfileFromDevice(int32_t scope, void* pprofilename, void* pdevicename);
int32_t windowssys_windows_win32_ui_colorsystem_wcsEnumColorProfiles(int32_t scope, void* penumrecord, void* pbuffer, uint32_t dwsize, void* pnprofiles);
int32_t windowssys_windows_win32_ui_colorsystem_wcsEnumColorProfilesSize(int32_t scope, void* penumrecord, void* pdwsize);
int32_t windowssys_windows_win32_ui_colorsystem_wcsGetCalibrationManagementState(void* pbisenabled);
int32_t windowssys_windows_win32_ui_colorsystem_wcsGetDefaultColorProfile(int32_t scope, void* pdevicename, int32_t cptcolorprofiletype, int32_t cpstcolorprofilesubtype, uint32_t dwprofileid, uint32_t cbprofilename, void* pprofilename);
int32_t windowssys_windows_win32_ui_colorsystem_wcsGetDefaultColorProfileSize(int32_t scope, void* pdevicename, int32_t cptcolorprofiletype, int32_t cpstcolorprofilesubtype, uint32_t dwprofileid, void* pcbprofilename);
int32_t windowssys_windows_win32_ui_colorsystem_wcsGetDefaultRenderingIntent(int32_t scope, void* pdwrenderingintent);
int32_t windowssys_windows_win32_ui_colorsystem_wcsGetUsePerUserProfiles(void* pdevicename, uint32_t dwdeviceclass, void* puseperuserprofiles);
int64_t windowssys_windows_win32_ui_colorsystem_wcsOpenColorProfileA(void* pcdmpprofile, void* pcampprofile, void* pgmmpprofile, uint32_t dwdesireaccess, uint32_t dwsharemode, uint32_t dwcreationmode, uint32_t dwflags);
int64_t windowssys_windows_win32_ui_colorsystem_wcsOpenColorProfileW(void* pcdmpprofile, void* pcampprofile, void* pgmmpprofile, uint32_t dwdesireaccess, uint32_t dwsharemode, uint32_t dwcreationmode, uint32_t dwflags);
int32_t windowssys_windows_win32_ui_colorsystem_wcsSetCalibrationManagementState(int32_t bisenabled);
int32_t windowssys_windows_win32_ui_colorsystem_wcsSetDefaultColorProfile(int32_t scope, void* pdevicename, int32_t cptcolorprofiletype, int32_t cpstcolorprofilesubtype, uint32_t dwprofileid, void* pprofilename);
int32_t windowssys_windows_win32_ui_colorsystem_wcsSetDefaultRenderingIntent(int32_t scope, uint32_t dwrenderingintent);
int32_t windowssys_windows_win32_ui_colorsystem_wcsSetUsePerUserProfiles(void* pdevicename, uint32_t dwdeviceclass, int32_t useperuserprofiles);
int32_t windowssys_windows_win32_ui_colorsystem_wcsTranslateColors(int64_t hcolortransform, uint32_t ncolors, uint32_t ninputchannels, int32_t cdtinput, uint32_t cbinput, void* pinputdata, uint32_t noutputchannels, int32_t cdtoutput, uint32_t cboutput, void* poutputdata);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_COLORSYSTEM_WINDOWS_WIN32_UI_COLORSYSTEM_WRAPPER_H */
