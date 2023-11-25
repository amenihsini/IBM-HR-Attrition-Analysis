/**
* [tMap_1 main ] start
*/
currentComponent="tMap_1";
boolean hasCasePrimitiveKeyWithNull_tMap_1 = false;

// ###############################
// # Input tables (lookups)

boolean rejectedInnerJoin_tMap_1 = false;
boolean mainRowRejected_tMap_1 = false;

///////////////////////////////////////////////
// Starting Lookup Table "row2"
///////////////////////////////////////////////
boolean forceLooprow2 = false;
row2Struct row2ObjectFromLookup = null;
if(!rejectedInnerJoin_tMap_1) { // G_TM_M_020
hasCasePrimitiveKeyWithNull_tMap_1 = false;
row2HashKey.city = row1.city ;
row2HashKey.hashCodeDirty = true
tHash_Lookup_row2.lookup( row2HashKey );
} // G_TM_M_020

if(tHash_Lookup_row2 != null &&

tHash_Lookup_row2.getCount(row2HashKey) > 1) { // G 071
//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row2' and it contains more
one result from keys : row2.city = '" + row2HashKey.city + "'");
} // G 071
row2Struct row2 = null;
row2Struct fromLookup_row2 = null;

row2 = row2Default;
if (tHash_Lookup_row2 !=null &&

tHash_Lookup_row2.hasNext()) { // G 099

fromLookup_row2 =

tHash_Lookup_row2.next();

} // G 099

if(fromLookup_row2 != null) {
row2 = fromLookup_row2;
}
// ###############################
{ // start of Var scope
// ###############################
// # Vars tables
Var__tMap_1__Struct Var = Var__tMap_1;// ###############################
// ###############################
// # Output tables
joining = null;
// # Output table : 'joining'
joining_tmp.EmployeeNumber = row1.EmployeeNumber ;
joining_tmp.Age = row1.Age ;
joining_tmp.Attrition = row1.Attrition ;
joining_tmp.BusinessTravel = row1.BusinessTravel ;
joining_tmp.Department = row1.Department ;
joining_tmp.distance = row2.distance ;
joining_tmp.Education = row1.Education ;
joining_tmp.EmployeeCount = row1.EmployeeCount ;
joining_tmp.EnvironmentSatisfaction = row1.EnvironmentSatisfaction ;
joining_tmp.Gender = row1.Gender ;
joining_tmp.JobInvolvement = row1.JobInvolvement ;
joining_tmp.JobLevel = row1.JobLevel ;
joining_tmp.JobRole = row1.JobRole ;
joining_tmp.JobSatisfaction = row1.JobSatisfaction ;
joining_tmp.MaritalStatus = row1.MaritalStatus ;
joining_tmp.MonthlyIncome = row1.MonthlyIncome ;
joining_tmp.NumCompaniesWorked = row1.NumCompaniesWorked ;
joining_tmp.OverTime = row1.OverTime ;
joining_tmp.PercentSalaryHike = row1.PercentSalaryHike ;
joining_tmp.PerformanceRating = row1.PerformanceRating ;
joining_tmp.RelationshipSatisfaction = row1.RelationshipSatisfaction ;
joining_tmp.StandardHours = row1.StandardHours ;
joining_tmp.TotalWorkingYears = row1.TotalWorkingYears ;
joining_tmp.TrainingTimesLastYear = row1.TrainingTimesLastYear ;
joining_tmp.WorkLifeBalance = row1.WorkLifeBalance ;
joining_tmp.YearsAtCompany = row1.YearsAtCompany ;
joining_tmp.YearsInCurrentRole = row1.YearsInCurrentRole ;
joining_tmp.YearsSinceLastPromotion = row1.YearsSinceLastPromotion ;
joining_tmp.YearsWithCurrManager = row1.YearsWithCurrManager ;
joining = joining_tmp;
// ###############################
} // end of Var scope
rejectedInnerJoin_tMap_1 = false;
tos_count_tMap_1++;
/**
* [tMap_1 main ] stop
*/
