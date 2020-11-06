project "Techval",{
  pipeline "Master Template",{
    stage "Gather evidence", 
      { task "Get build data" }
    stage "QA"
    stage "Preprod"
    stage "Prod"
  }
}
// some comment


