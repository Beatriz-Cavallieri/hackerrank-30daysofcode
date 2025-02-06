
    
    // Declare second integer, double, and String variables.
    int num;
    double dnum;
    string str;
    
    // Read and save an integer, double, and String to your variables.
    cin >> num >> ws >> dnum >> ws;
    getline(cin, str);
    // Note: If you have trouble reading the entire string, please go back and review the Tutorial closely.
    
    // Print the sum of both integer variables on a new line.
    i += num;
    cout << i << endl;
    
    // Print the sum of the double variables on a new line.
    d += dnum;
    cout << fixed << setprecision(1) << d << endl;
    
    // Concatenate and print the String variables on a new line
    cout << s << str << endl;
    // The 's' variable above should be printed first.
